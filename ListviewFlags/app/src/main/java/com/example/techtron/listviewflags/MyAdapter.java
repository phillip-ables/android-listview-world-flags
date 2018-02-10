package com.example.techtron.listviewflags;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

/**
 * Created by user on 2/9/2018.
 */
//error no default adapter availible -> click arrow and creat adapter -> choose the one that has the value of context and resource int

public class MyAdapter extends ArrayAdapter<String> {
    public MyAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }
}
