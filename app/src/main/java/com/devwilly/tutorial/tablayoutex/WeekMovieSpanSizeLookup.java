package com.devwilly.tutorial.tablayoutex;

import android.support.v7.widget.GridLayoutManager;


/**
 * Created by Willy on 2017/4/3.
 */

public class WeekMovieSpanSizeLookup extends GridLayoutManager.SpanSizeLookup {

    private MovieListAdapter mAdapter;

    public WeekMovieSpanSizeLookup(MovieListAdapter adapter) {
        this.mAdapter = adapter;
    }

    @Override
    public int getSpanSize(int position) {
        if (mAdapter.getItemCount() == 0) {
            return 1;
        }

        int viewType = mAdapter.getItemViewType(position);

        if (viewType == R.layout.vh_section_header) {
            return 2;
        } else {
            return 1;
        }
    }
}
