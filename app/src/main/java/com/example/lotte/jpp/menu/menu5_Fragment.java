package com.example.lotte.jpp.menu;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.lotte.jpp.R;

/**
 * Created by lotte on 31/03/2015.
 */
public class menu5_Fragment extends Fragment
{
    View rootView;
    View subView;
    Button button;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle saveInstanceState)
    {
        rootView = inflater.inflate(R.layout.menu5_layout, container, false);
        button.findViewById(R.id.wijzigingen);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subView = inflater.inflate(R.layout.wijzigprofiel_layout,container,false);
            }
        });

        return rootView;
    }

}
