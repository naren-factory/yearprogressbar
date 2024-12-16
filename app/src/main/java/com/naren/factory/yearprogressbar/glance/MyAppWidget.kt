package com.naren.factory.yearprogressbar.glance

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.glance.Button
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.action.actionStartActivity
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.layout.Alignment
import androidx.glance.layout.Column
import androidx.glance.layout.Row
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.padding
import androidx.glance.text.Text
import com.naren.factory.yearprogressbar.MainActivity

class MyAppWidget : GlanceAppWidget() {
    // In this method, load data needed to render the AppWidget.
    // Use `withContext` to switch to another thread for long running
    // operations.
    override suspend fun provideGlance(context: Context, id: GlanceId) {
        // create your AppWidget here
        provideContent {
            WidgetContent()
        }
    }
}

@Composable
private fun WidgetContent() {
    Column(
        modifier = GlanceModifier.fillMaxSize(),
        verticalAlignment = Alignment.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Where to?", modifier = GlanceModifier.padding(12.dp))
        Row(horizontalAlignment = Alignment.CenterHorizontally) {
            Button(
                text = "Home",
                onClick = actionStartActivity<MainActivity>()
            )
            Button(
                text = "Work",
                onClick = actionStartActivity<MainActivity>()
            )
        }
    }
}
