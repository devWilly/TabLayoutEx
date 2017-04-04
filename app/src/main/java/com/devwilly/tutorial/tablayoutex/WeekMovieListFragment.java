package com.devwilly.tutorial.tablayoutex;

import com.devwilly.tutorial.tablayoutex.data.MovieData;
import com.devwilly.tutorial.tablayoutex.callback.SimpleItemTouchHelperCallback;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Willy on 2017/2/14.
 */

public class WeekMovieListFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rv_layout, container, false);

        // mock data, can change to api data
        MovieData data = new MovieData(getContext());

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new WeekMovieItemDecoration(getContext()));
        final MovieListAdapter adapter = new MovieListAdapter(data.getWeekMovieItemList());
        recyclerView.setAdapter(adapter);

        GridLayoutManager manager = new GridLayoutManager(getContext(), 2);
        WeekMovieSpanSizeLookup spanSizeLookup = new WeekMovieSpanSizeLookup(adapter);
        spanSizeLookup.setSpanIndexCacheEnabled(true);
        manager.setSpanSizeLookup(spanSizeLookup);
        recyclerView.setLayoutManager(manager);

        ItemTouchHelper.Callback callback = new SimpleItemTouchHelperCallback();
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(callback);
        itemTouchHelper.attachToRecyclerView(recyclerView);

        return view;
    }
}
