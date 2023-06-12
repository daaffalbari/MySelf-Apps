package com.daffa.myself_akb.ui;

// 1 Juni 2023
// 10120212
// Daffa Albari
// IF-6

import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import com.daffa.myself_akb.MusicData;
import com.daffa.myself_akb.MusicVideoAdapter;
import com.daffa.myself_akb.R;

import java.util.ArrayList;
import java.util.List;


public class MusicVideoFragment extends Fragment {
    RecyclerView recyclerMusic;
    MusicVideoAdapter musicVideoAdapter;

    List<MusicData> musicList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_video_music, container, false);

        musicList = new ArrayList<MusicData>();
        musicList.add(new MusicData("About You", "The 1975"));
        musicList.add(new MusicData("Nobody Gets Me", "SZA"));
        musicList.add(new MusicData("Open Arms (Feat. Travis Scout", "SZA, Travis Scout"));
        musicList.add(new MusicData("Snooze", "SZA"));
        musicList.add(new MusicData("Anything You Want", "Reality Club"));
        musicList.add(new MusicData("All to Well (10 Minutes Version)", "Taylor Swift"));
        musicList.add(new MusicData("Baby I'm Yours", "Arctic Monkeys"));
        musicList.add(new MusicData("505", "Arctic Monkeys"));
        musicList.add(new MusicData("Always", "Daniel Caesar"));
        musicList.add(new MusicData("Kill Bill", "SZA"));

        recyclerMusic = (RecyclerView) view.findViewById(R.id.recycler_music);
        musicVideoAdapter = new MusicVideoAdapter(musicList);

        // video
        VideoView vvVideo = view.findViewById(R.id.vv_video);
        String videoPath = "android.resource://" + getContext().getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(videoPath);
        vvVideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(getContext());
        vvVideo.setMediaController(mediaController);
        mediaController.setAnchorView(vvVideo);

        LinearLayoutManager layoutManager2 = new LinearLayoutManager(getActivity());
        recyclerMusic.setLayoutManager(layoutManager2);
        recyclerMusic.setAdapter(musicVideoAdapter);

        return view;
    }
}