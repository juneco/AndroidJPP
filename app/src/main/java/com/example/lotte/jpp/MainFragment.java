package com.example.lotte.jpp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Lotte on 25/03/2015.
 */
public class MainFragment extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.menu1_layout, container, false);

        return view;
    }
}
