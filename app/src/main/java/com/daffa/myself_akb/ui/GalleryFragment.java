package com.daffa.myself_akb.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daffa.myself_akb.GalleryAdapter;
import com.daffa.myself_akb.R;

import java.util.ArrayList;

public class GalleryFragment extends Fragment {
    private ArrayList<Integer> list;
    RecyclerView recyclerView;
    GalleryAdapter galleryAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        list = new ArrayList<Integer>();
        list.add(R.drawable.me);
        list.add(R.drawable.me2);
        list.add(R.drawable.me3);
        list.add(R.drawable.me4);
        list.add(R.drawable.me5);
        list.add(R.drawable.me6);
        list.add(R.drawable.me7);
        list.add(R.drawable.me8);

        recyclerView = view.findViewById(R.id.recycler_gallery);
        galleryAdapter = new GalleryAdapter(getActivity(), list);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(galleryAdapter);
        return view;
    }
}