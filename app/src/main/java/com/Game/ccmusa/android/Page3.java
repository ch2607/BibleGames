package com.Game.ccmusa.android;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

public class Page3 extends Fragment {

    public Page3() {
        // required empty public constructor.
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v;
        ImageView biblegif;
        v =  inflater.inflate(R.layout.fragment_page3, container,
                false);
        biblegif = (ImageView) v.findViewById(R.id.imageView);
        Glide.with(this).load(R.drawable.page5).into(biblegif);
        return v;
    }
}

