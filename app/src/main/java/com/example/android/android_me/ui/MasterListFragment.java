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

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        GridView gridView = (GridView) inflater.inflate(R.layout.fragment_master_list, container);

        Context context = container.getContext();
        List<Integer> allImageIds = AndroidImageAssets.getAll();
        MasterListAdapter masterListAdapter = new MasterListAdapter(context, allImageIds);
        gridView.setAdapter(masterListAdapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
