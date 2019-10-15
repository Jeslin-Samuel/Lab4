package edu.temple.lab4;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {
    String colorNames[];
    Context context;

    public ColorAdapter(Context context, String[] colorNames)
    {
        this.context = context;
        this.colorNames = colorNames;
    }

    @Override
    public int getCount()
    {
        return colorNames.length;
    }

    @Override
    public Object getItem(int i)
    {
        return colorNames[i];
    }

    @Override
    public long getItemId(int i)
    {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        TextView textView;

        if(view != null && view instanceof TextView)
            textView = (TextView) view;
        else
            textView = new TextView(context);

        final String colorName = colorNames[i];

        textView.setText(colorName);

        if (i > 0)
            textView.setBackgroundColor(Color.parseColor(colorName));
        else
            textView.setBackgroundColor(Color.WHITE);

        return textView;
    }
}
