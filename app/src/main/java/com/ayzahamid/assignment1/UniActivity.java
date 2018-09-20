package com.ayzahamid.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UniActivity extends AppCompatActivity {

    TextView tvUniversity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni);
        tvUniversity =findViewById(R.id.tv_uni);
    }
}
