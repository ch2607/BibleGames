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

public class Page4 extends Fragment
{
    public Page4() {
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
        v =  inflater.inflate(R.layout.fragment_page4, container,
                false);
        biblegif = (ImageView) v.findViewById(R.id.imageView);
        Glide.with(this).load(R.drawable.page6).into(biblegif);
        return v;
    }
}
