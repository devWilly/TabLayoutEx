package com.devwilly.tutorial.tablayoutex;

import com.devwilly.tutorial.tablayoutex.data.MovieData;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Willy on 2017/2/14.
 */

public class TopMovieListFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rv_layout, container, false);

        // mock data, can change to api data
        MovieData data = new MovieData(getContext());

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.addItemDecoration(new MovieItemDecoration(getContext()));
        MovieListAdapter adapter = new MovieListAdapter(data.getTopMovieItemList());
        recyclerView.setAdapter(adapter);

        return view;
    }
}
