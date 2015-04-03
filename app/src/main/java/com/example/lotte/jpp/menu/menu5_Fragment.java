package com.example.lotte.jpp.menu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lotte.jpp.R;

/**
 * Created by lotte on 31/03/2015.
 */
public class menu5_Fragment extends Fragment
{
    View rootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState)
    {
        rootView = inflater.inflate(R.layout.menu5_layout, container, false);

        return rootView;

    }
}
