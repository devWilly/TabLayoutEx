package com.devwilly.tutorial.tablayoutex;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;


/**
 * Created by Willy on 2017/4/3.
 */

public class WeekMovieItemDecoration extends RecyclerView.ItemDecoration {

    private Context mContext;
    private static final int RV_FIRST_ITEM_POSITION = 1;
    private static final int RV_SECOND_ITEM_POSITION = 2;

    public WeekMovieItemDecoration(Context context) {
        this.mContext = context;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int leftMargin = getDimensionPixelSize(R.dimen.movie_rv_left_margin);
        int topMargin = getDimensionPixelSize(R.dimen.movie_rv_top_margin);
        int rightMargin = getDimensionPixelSize(R.dimen.movie_rv_right_margin);
        int bottomMargin = getDimensionPixelSize(R.dimen.movie_rv_bottom_margin);
        int middleMargin = getDimensionPixelSize(R.dimen.movie_rv_middle_margin);

        int position = parent.getChildPosition(view);

        if (position != 0) {

            if (position == RV_FIRST_ITEM_POSITION || position == RV_SECOND_ITEM_POSITION) {
                outRect.top = topMargin;
            }

            if (position % 2 == 0) { // right item
                outRect.left = middleMargin / 2;
                outRect.right = rightMargin;
                outRect.bottom = bottomMargin;
            } else { // left item
                outRect.left = leftMargin;
                outRect.right = middleMargin / 2;
                outRect.bottom = bottomMargin;
            }

        }
    }

    private int getDimensionPixelSize(int resId) {
        return mContext.getResources().getDimensionPixelSize(resId);
    }
}
