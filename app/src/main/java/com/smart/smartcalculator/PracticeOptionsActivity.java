package com.smart.smartcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by Shan on 2015-02-02.
 */
public class PracticeOptionsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_practiceoptions);
    }

    public void practiceAddition(View view){
        Intent intent = new Intent(this, PracticeActivity.class);
        this.startActivity(intent);
    }

    public void practiceSubtraction(View view){

    }
}
