package com.devwilly.tutorial.tablayoutex.callback;

import com.devwilly.tutorial.tablayoutex.MovieListAdapter;
import com.devwilly.tutorial.tablayoutex.viewholders.WeekViewHolder;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;


/**
 * Created by Willy on 2017/4/4.
 */

public class SimpleItemTouchHelperCallback extends ItemTouchHelper.Callback {

    @Override
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        int dragFlags = 0;
        int swipeFlags = 0;

        if (viewHolder instanceof WeekViewHolder) {
            int itemPosition = viewHolder.getAdapterPosition();

            // first and second item don't use ItemTouchHelper.UP flag
            if (itemPosition == 1 || itemPosition == 2) {
                dragFlags = ItemTouchHelper.DOWN | ItemTouchHelper.RIGHT | ItemTouchHelper.LEFT;
            } else {
                dragFlags = ItemTouchHelper.UP | ItemTouchHelper.DOWN | ItemTouchHelper.RIGHT | ItemTouchHelper.LEFT;
            }
            swipeFlags = ItemTouchHelper.START;
        }
        return makeMovementFlags(dragFlags, swipeFlags);
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder,
            RecyclerView.ViewHolder target) {
        return false;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {

    }
}
