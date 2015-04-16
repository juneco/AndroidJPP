package com.example.lotte.jpp.menu;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.lotte.jpp.ProfielActivity;
import com.example.lotte.jpp.R;

/**
 * Created by lotte on 31/03/2015.
 */
public class menu5_Fragment extends Fragment implements View.OnClickListener
{
    View rootView;


    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle saveInstanceState)
    {
        rootView = inflater.inflate(R.layout.menu5_layout, container, false);
        Button b = (Button) rootView.findViewById(R.id.wijzigingen);
        b.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getActivity(), ProfielActivity.class);
        startActivity(intent);
    }
}
