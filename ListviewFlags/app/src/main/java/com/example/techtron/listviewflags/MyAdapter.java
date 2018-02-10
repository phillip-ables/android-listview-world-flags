package com.example.techtron.listviewflags;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

/**
 * Created by philables on 2/9/2018.
 */
//error no default adapter availible -> click arrow and creat adapter -> choose the one that has the value of context and resource int

public class MyAdapter extends ArrayAdapter<String> {
    //source id is basically the custome id that will hold the image and the title
    public MyAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }
}
