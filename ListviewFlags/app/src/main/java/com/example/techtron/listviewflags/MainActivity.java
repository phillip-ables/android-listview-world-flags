package com.example.techtron.listviewflags;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    //initalize these views
    android.support.v7.widget.Toolbar mToolbar;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find your stuff R.id.stuff
        mToolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        mListView = (ListView) findViewById(R.id.listview);
        //we have the toolbar and the listview
        //next, we set the value for the items
    }
}
