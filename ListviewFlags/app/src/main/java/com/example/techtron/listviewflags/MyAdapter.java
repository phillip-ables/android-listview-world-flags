package com.example.techtron.listviewflags;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.widget.TextViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by philables on 2/9/2018.
 */
//error no default adapter availible -> click arrow and creat adapter -> choose the one that has the value of context and resource int

public class MyAdapter extends ArrayAdapter<String> {
    //source id is basically the custome id that will hold the image and the title

    String [] names;
    int [] flags;
    String [] capitols;
    int [] population;
    Context mContext;
    //initialize them inside the constructor
    public MyAdapter(@NonNull Context context, String[] stateNames, int[] stateFlags, String[] stateCapitols, int[] statePopulations) {
        //for the super method inside the constructor we will change source to the layout we jsut created
        super(context, R.layout.listview_item);
        //next we need to define the a value to hold our strings and we can pass it through the constructor and set it immediatly in the listview here

        this.names = stateNames;
        this.flags = stateFlags;
        this.capitols = stateCapitols;
        this.population = statePopulations;
        this.mContext = context;

        //we have the adapter, we set the layout and we initialized its values to instances here
        //next, we need to override a method of getCount
    }
    //returns size of item inside the list
    @Override
    public int getCount() {
        return names.length;
    }
    //method we will be working with in order to set the method to its oppropriate views
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(converView == null) {
            //the first state the convert view is null, so if the layout view we want ot inflate isnt inflated then inflate

            //position reference that we use to access the value for the view, this view represents the specific row of the list, the viewgroup is the parent we have right here
            //first, inflate the layout we just created
            LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            //highlighted? Unconditional layout inflation from view adapter. Should use view holder pattern for smoother scrolling
            //error one of the things to make your list view scoll easily is make a view holder
            convertView = mInflater.inflate(R.layout.listview_item, parent, false);
            //we need to access the views inside the layout, were using the convert view because this image view is in the layout we just inflated
            ImageView mFlag = (ImageView) convertView.findViewById(R.id.imageView);
            TextView mName = (TextView) convertView.findViewById(R.id.textView);
            //start to set the value of the image view and the text view
            mFlag.setImageResource(flags[position]);
            mName.setText(names[position]);
        }
        return super.getView(position, convertView, parent);
    }

}
