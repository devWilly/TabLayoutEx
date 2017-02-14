package com.devwilly.tutorial.tablayoutex.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;


/**
 * Created by Willy on 2017/2/14.
 */

public abstract class MovieViewHolder<T> extends RecyclerView.ViewHolder {

    public MovieViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bindView(T t);
}
