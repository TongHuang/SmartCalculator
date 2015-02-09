package com.smart.smartcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Shan on 2015-02-01.
 */
public class HistoriesActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_histories);
        Intent intent = super.getIntent();
        ArrayList<String> histories = intent.getStringArrayListExtra(MainActivity.EXTRA_HISTORIES);
        ListView listHistories = (ListView) findViewById(R.id.listViewHistories);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, histories.toArray());
        listHistories.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_histories, menu);
        return super.onCreateOptionsMenu(menu);
    }


}
