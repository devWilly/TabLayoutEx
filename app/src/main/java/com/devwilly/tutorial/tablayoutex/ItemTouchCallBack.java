package com.devwilly.tutorial.tablayoutex;

import android.support.v7.widget.RecyclerView;


/**
 * Created by Willy on 2017/4/4.
 */

public interface ItemTouchCallBack {

    void onItemMove(int fromPosition, int toPosition);

    void onItemSwipe(RecyclerView.ViewHolder viewHolder, int direction);
}
