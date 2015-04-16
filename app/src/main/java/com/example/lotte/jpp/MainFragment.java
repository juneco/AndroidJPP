package com.example.lotte.jpp;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.lotte.jpp.menu.menu5_Fragment;

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

    /**
     * Created by Vicky on 14/04/2015.
     */
    public static class ProfielActivity extends FragmentActivity {

        private Button btnwijzigen;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.menu5_layout);

            btnwijzigen = (Button) findViewById(R.id.wijzigingen);

            btnwijzigen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setContentView(R.layout.wijzigprofiel_layout);

                }
            });
        }
    }
}
