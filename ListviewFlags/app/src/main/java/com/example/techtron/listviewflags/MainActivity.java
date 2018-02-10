package com.example.techtron.listviewflags;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    //initalize these views
    android.support.v7.widget.Toolbar mToolbar;
    ListView mListView;
    //create two array array string for name of country and array int for flags of countries
    String[] stateNames = {
            "Alabama", "Alaska", "Arizona", "Arkansas", "California",
            "Colorado", "Connecticut", "Delaware", "Florida", "Georgia",
            "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas",
            "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts",
            "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska",
            "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York",
            "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon",
            "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee",
            "Texas", "Utah", "Vermont", "Virginia", "Washington",
            "West Virginia", "Wisconsin", "Wyoming"};
    int[] stateFlags = {
            R.drawable.ak, R.drawable.al, R.drawable.ar, R.drawable.az, R.drawable.ca,
            R.drawable.co, R.drawable.ct, R.drawable.de, R.drawable.fl, R.drawable.ga,
            R.drawable.hi, R.drawable.id, R.drawable.il, R.drawable.in, R.drawable.ia, R.drawable.ks,
            R.drawable.ky, R.drawable.la, R.drawable.me, R.drawable.md, R.drawable.ma,
            R.drawable.mi, R.drawable.mn, R.drawable.ms, R.drawable.mo, R.drawable.mt, R.drawable.ne,
            R.drawable.nv, R.drawable.nh, R.drawable.nj, R.drawable.nm, R.drawable.ny,
            R.drawable.nc, R.drawable.nd, R.drawable.oh, R.drawable.ok, R.drawable.or,
            R.drawable.pa, R.drawable.ri, R.drawable.sc, R.drawable.sd, R.drawable.tn,
            R.drawable.tx, R.drawable.ut, R.drawable.vt, R.drawable.va, R.drawable.wa,
            R.drawable.wv, R.drawable.wi, R.drawable.wy};
    int[] statePopulations = {
            4858979, 738432, 6828065, 2978204, 39144818,
            5456574, 3590886, 945934, 20271272, 10214860,
            1431603, 1654930, 12859995, 6619680, 3123899, 2911641,
            4425092, 4670724, 1329328, 6006401, 6794422,
            9922576, 5489594, 2992333, 6083672, 1032949, 1896190,
            2890845, 1330608, 8958013, 2085109, 19795791,
            10042802, 756927, 11613423, 3911338, 4028977,
            12802503, 1056298, 4896146, 858469, 6600299,
            27469114, 2995919, 626042, 8382993, 7170351,
            1844128, 5771337, 586107};
    String[] stateCapitals = {
            "Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento",
            "Denver", "Hartford", "Dover", "Tallahassee", "Atlanta",
            "Honolulu", "Boise", "Springfield","Indianapolis", "Des Moines", "Topeka",
            "Frankfor", "Baton Rouge", "Augusta", "Annapolis", "Boston",
            "Lansing", "St. Paul", "Jackson", "Jefferson City", "Helena", "Lincoln",
            "Carson City", "Concord", "Trenton", "Santa Fe", "Albany",
            "Raleigh", "Bismarck", "Columbus", "Oklahoma City", "Salem",
            "Harrisburg", "Providence", "Columbia", "Nashville",
            "Austin", "Salt Lake City", "Montpelier", "Richmond", "Olympia",
            "Charleston", "Madison", "Cheyenne"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find your stuff R.id.stuff
        mToolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        mListView = (ListView) findViewById(R.id.listview);
        //we have the toolbar and the listview
        //next, we set the value for the items
        //next we need to create an adapter
        //adapter is the one who holds the items
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, stateNames, stateFlags);
        mListView.setAdapter(myAdapter);
    }
}
