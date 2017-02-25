package com.devwilly.tutorial.tablayoutex.widget;

import com.devwilly.tutorial.tablayoutex.R;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViews;


/**
 * Created by Willy on 2017/2/25.
 */

public class MovieAppWidget extends AppWidgetProvider {

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        super.onUpdate(context, appWidgetManager, appWidgetIds);

        for (int i = 0; i < appWidgetIds.length; i++) {
            Intent intent = new Intent(context, MovieAppWidgetService.class);
            intent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, appWidgetIds[i]);
            intent.setData(Uri.parse(intent.toUri(Intent.URI_INTENT_SCHEME)));

            RemoteViews rv = new RemoteViews(context.getPackageName(), R.layout.app_widget);
            rv.setRemoteAdapter(appWidgetIds[i], R.id.widget_stack_view, intent);
            rv.setEmptyView(R.id.widget_stack_view, R.id.widget_empty_view);
            appWidgetManager.updateAppWidget(appWidgetIds[i], rv);
        }
    }
}
