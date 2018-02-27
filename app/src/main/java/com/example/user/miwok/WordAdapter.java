package com.example.user.miwok;

import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by user on 17-01-2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int bg_res;
    private int miwTextColor;
    private int engTextColor;
    private Context Acontext;
    private MediaPlayer mediaPlayer;

     WordAdapter(Context context, ArrayList<Word> wordArrayList, int res, int miwCol, int engCol)
     {
        super(context,0,wordArrayList);
        Acontext = context;
        bg_res = res;
        miwTextColor = miwCol;
        engTextColor = engCol;
     }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.numbers_list,parent,false);

        final Word currentWord = getItem(position);

        RelativeLayout listBg = (RelativeLayout) listItemView.findViewById(R.id.list);
        listBg.setBackgroundResource(bg_res);

        TextView miwText = (TextView) listItemView.findViewById(R.id.miwok);
        miwText.setText(currentWord.getMiwok());
        miwText.setTextColor(miwTextColor);

        TextView engText = (TextView) listItemView.findViewById(R.id.english);
        engText.setText(currentWord.getEnglish());
        engText.setTextColor(engTextColor);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentWord.getResource());
        imageView.setBackgroundColor(miwTextColor);


        if(currentWord.getResource() == 0)
            imageView.setVisibility(View.GONE);

        return listItemView;
    }
}
