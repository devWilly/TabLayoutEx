package com.devwilly.tutorial.tablayoutex.viewholders;

import com.devwilly.tutorial.tablayoutex.wrapper.IMovieWrapper;

import android.view.View;


/**
 * Created by Qoo on 2017/2/15.
 */

public class EmptyViewHolder extends MovieViewHolder<IMovieWrapper> {

    public EmptyViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void bindView(IMovieWrapper iMovieWrapper) {

    }
}
