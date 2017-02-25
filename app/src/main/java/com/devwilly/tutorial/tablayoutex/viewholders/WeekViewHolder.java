package com.devwilly.tutorial.tablayoutex.viewholders;

import com.devwilly.tutorial.tablayoutex.R;
import com.devwilly.tutorial.tablayoutex.wrapper.WeekMovieWrapper;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by Willy on 2017/2/15.
 */

public class WeekViewHolder extends MovieViewHolder<WeekMovieWrapper> {

    private ImageView mPic;
    private TextView mTitle;
    private TextView mDataRelease;
    private TextView mSubTitle;

    public WeekViewHolder(View itemView) {
        super(itemView);

        mPic = (ImageView) itemView.findViewById(R.id.item_pic);
        mTitle = (TextView) itemView.findViewById(R.id.item_title);
        mDataRelease = (TextView) itemView.findViewById(R.id.item_data_release);
        mSubTitle = (TextView) itemView.findViewById(R.id.item_sub_title);
    }

    @Override
    public void bindView(WeekMovieWrapper wrapper) {

        Resources res = itemView.getResources();
        mPic.setImageDrawable(res.getDrawable(wrapper.getImageRes()));
        mTitle.setText(wrapper.getTitle());
        mDataRelease.setText(wrapper.getDateRelease());
        mSubTitle.setText(wrapper.getSubTitle());
    }
}
