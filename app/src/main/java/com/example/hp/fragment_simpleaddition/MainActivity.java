package com.example.hp.fragment_simpleaddition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_addition);

        // Interaction with fragments is done through getFragmentManager().
        getFragmentManager().findFragmentById(R.id.fragment);
    }


}
