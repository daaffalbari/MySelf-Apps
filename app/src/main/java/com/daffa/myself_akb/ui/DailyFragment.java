package com.daffa.myself_akb.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.daffa.myself_akb.DailyAdapter;
import com.daffa.myself_akb.DailyData;
import com.daffa.myself_akb.FriendAdapter;
import com.daffa.myself_akb.R;

import java.util.ArrayList;
import java.util.List;

public class DailyFragment extends Fragment {

    RecyclerView recyclerFriend;
    FriendAdapter friendAdapter;

    RecyclerView recyclerDaily;
    DailyAdapter dailyAdapter;

    List<Integer> imageList;
    List<String> nameList;

    List<DailyData> dailyList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_daily, container, false);

        imageList = new ArrayList<Integer>();
        imageList.add(R.drawable.friend);
        imageList.add(R.drawable.friend1);
        imageList.add(R.drawable.friend2);
        imageList.add(R.drawable.friend3);
        imageList.add(R.drawable.friend4);
        imageList.add(R.drawable.friend5);
        imageList.add(R.drawable.friend6);

        nameList = new ArrayList<String>();
        nameList.add("Kumil");
        nameList.add("Dewita");
        nameList.add("Adnan");
        nameList.add("Reymunda");
        nameList.add("Rizki");
        nameList.add("Danil Apek");
        nameList.add("Pispoe");

        dailyList = new ArrayList<DailyData>();
        dailyList.add(new DailyData(R.drawable.ic_baseline_school_24, "Kuliah", "Berkuliah 40 SKS"));
        dailyList.add(new DailyData(R.drawable.ic_baseline_code_24, "Ngoding", "Ngerjain capstone bangkit dan lulus inkubasi"));
        dailyList.add(new DailyData(R.drawable.ic_baseline_local_movies_24, "Nonton", "Nonton anime one piece, demon slayer"));
        dailyList.add(new DailyData(R.drawable.ic_baseline_queue_music_24, "Dengerin Musik", "Untuk perjalanan pulang Unikom - Katapang"));
        dailyList.add(new DailyData(R.drawable.ic_baseline_article_24, "Membaca Novel", "Menamakatkann series Bumi - Tere Liye"));

        recyclerFriend = (RecyclerView) view.findViewById(R.id.recycler_friend);
        friendAdapter = new FriendAdapter(getActivity(), nameList, imageList);

        recyclerDaily = (RecyclerView) view.findViewById(R.id.recycler_daily);
        dailyAdapter = new DailyAdapter(dailyList);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        recyclerFriend.setLayoutManager(layoutManager);
        recyclerFriend.setAdapter(friendAdapter);

        LinearLayoutManager layoutManager2 = new LinearLayoutManager(getActivity());
        recyclerDaily.setLayoutManager(layoutManager2);
        recyclerDaily.setAdapter(dailyAdapter);

        return view;
    }
}