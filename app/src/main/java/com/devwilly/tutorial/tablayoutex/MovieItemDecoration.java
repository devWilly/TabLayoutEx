package com.devwilly.tutorial.tablayoutex;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;


/**
 * Created by Willy on 2017/2/14.
 */

public class MovieItemDecoration extends RecyclerView.ItemDecoration {

    private Context mContext;
    private static final int RV_FIRST_ITEM = 0;
    private static final int RV_SECOND_ITEM = 1;

    public MovieItemDecoration(Context context) {
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


        if (position == RV_FIRST_ITEM || position == RV_SECOND_ITEM) {
            outRect.top = topMargin;
        }

        if (position % 2 == 0) {
            outRect.left = leftMargin;
            outRect.right = middleMargin / 2;
            outRect.bottom = bottomMargin;
        } else {
            outRect.left = middleMargin / 2;
            outRect.right = rightMargin;
            outRect.bottom = bottomMargin;
        }
    }

    private int getDimensionPixelSize(int resId) {
        return mContext.getResources().getDimensionPixelSize(resId);
    }
}
