package com.example.lotte.jpp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.lotte.jpp.R;

/**
 * Created by Vicky on 14/04/2015.
 */
public class ProfielActivity extends FragmentActivity{

    private Button btnwijzigen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wijzigprofiel_layout);

        btnwijzigen = (Button) findViewById(R.id.opslaan);

        btnwijzigen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(ProfielActivity.this,"Het is gelukt", Toast.LENGTH_LONG).show();
                setContentView(R.layout.menu5_layout);
            }
        });
    }
}
