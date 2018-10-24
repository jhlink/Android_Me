package com.example.android.android_me.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.List;

public class MasterListFragment extends Fragment {

    public MasterListFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // Inflate the Android-Me fragment layout
        View rootView = inflater.inflate(R.layout.fragment_master_list, container, false);

        // Get a reference to the ImageView in the fragment layout
        final GridView gridView = (GridView) rootView.findViewById(R.id.gv_fragment_master_list);

        Context context = getContext();
        List<Integer> allImageIds = AndroidImageAssets.getAll();
        MasterListAdapter masterListAdapter = new MasterListAdapter(context, allImageIds);
        gridView.setAdapter(masterListAdapter);

        return rootView;
    }
}
