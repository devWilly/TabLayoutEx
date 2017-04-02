package com.devwilly.tutorial.tablayoutex;

import com.devwilly.tutorial.tablayoutex.viewholders.ComingSoonViewHolder;
import com.devwilly.tutorial.tablayoutex.viewholders.EmptyViewHolder;
import com.devwilly.tutorial.tablayoutex.viewholders.MovieViewHolder;
import com.devwilly.tutorial.tablayoutex.viewholders.SectionHeaderViewHolder;
import com.devwilly.tutorial.tablayoutex.viewholders.TopViewHolder;
import com.devwilly.tutorial.tablayoutex.viewholders.WeekViewHolder;
import com.devwilly.tutorial.tablayoutex.wrapper.IMovieWrapper;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * Created by Willy on 2017/2/14.
 */

public class MovieListAdapter extends RecyclerView.Adapter<MovieViewHolder>{

    private ArrayList<IMovieWrapper> mDataList = new ArrayList<>();

    public MovieListAdapter(ArrayList<IMovieWrapper> dataList) {
        this.mDataList = dataList;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        switch (viewType) {
            case R.layout.vh_section_header:
                view = inflater.inflate(R.layout.vh_section_header, parent, false);
                return new SectionHeaderViewHolder(view);
            case R.layout.vh_item_week:
                view = inflater.inflate(R.layout.vh_item_week, parent, false);
                return new WeekViewHolder(view);
            case R.layout.vh_item_coming_soon:
                view = inflater.inflate(R.layout.vh_item_coming_soon, parent, false);
                return new ComingSoonViewHolder(view);
            case R.layout.vh_item_top:
                view = inflater.inflate(R.layout.vh_item_top, parent, false);
                return new TopViewHolder(view);
            default:
                view = inflater.inflate(R.layout.vh_empty_view, parent, false);
                return new EmptyViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        holder.bindView(mDataList.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        return mDataList.get(position).getType();
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }
}
