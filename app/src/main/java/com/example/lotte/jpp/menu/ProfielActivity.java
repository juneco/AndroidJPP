package com.example.lotte.jpp.menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

import com.example.lotte.jpp.R;

/**
 * Created by Vicky on 14/04/2015.
 */
public class ProfielActivity extends FragmentActivity{

    private Button btnwijzigen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu5_layout);

        btnwijzigen = (Button) findViewById(R.id.wijzigingen);

        btnwijzigen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId() == R.id.wijzigingen){

                }
            }
        });
    }
}
