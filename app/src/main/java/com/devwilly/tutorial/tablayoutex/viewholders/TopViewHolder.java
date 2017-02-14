package com.devwilly.tutorial.tablayoutex.viewholders;

import com.devwilly.tutorial.tablayoutex.R;
import com.devwilly.tutorial.tablayoutex.wrapper.TopMovieWrapper;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by Willy on 2017/2/15.
 */

public class TopViewHolder extends MovieViewHolder<TopMovieWrapper> {

    private ImageView mPic;
    private TextView mTitle;
    private TextView mDataRelease;
    private TextView mSubTitle;

    public TopViewHolder(View itemView) {
        super(itemView);

        mPic = (ImageView) itemView.findViewById(R.id.item_pic);
        mTitle = (TextView) itemView.findViewById(R.id.item_title);
        mDataRelease = (TextView) itemView.findViewById(R.id.item_data_release);
        mSubTitle = (TextView) itemView.findViewById(R.id.item_sub_title);
    }

    @Override
    public void bindView(TopMovieWrapper wrapper) {

        mPic.setImageDrawable(wrapper.getImage());
        mTitle.setText(wrapper.getTitle());
        mDataRelease.setText(wrapper.getDateRelease());
        mSubTitle.setText(wrapper.getSubTitle());

    }
}
