package com.devwilly.tutorial.tablayoutex.widget;

import android.content.Intent;
import android.widget.RemoteViewsService;


/**
 * Created by Willy on 2017/2/25.
 */

public class MovieAppWidgetService extends RemoteViewsService {

    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new MovieAppWidgetFactory(getApplicationContext());
    }
}
