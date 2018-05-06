package com.example.ivos.mynotificationsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import com.microsoft.appcenter.push.Push;
import com.microsoft.appcenter.utils.async.AppCenterConsumer;

import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    String TAG = "MY-APP";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Log.w(TAG, "==== starting");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Clicked - put your action here", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // AppCenter code
        Push.setListener(new MyPushListener());
        Push.setEnabled(true);
        Push.setSenderId("606949017971");
        AppCenter.start(getApplication(), "54383cd7-30b5-456a-bd4b-4c5d22fff826", Analytics.class, Crashes.class, Push.class);
        // AppCenter code
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.w(TAG, "==== onNewIntent");
        Push.checkLaunchedFromNotification(this, intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        Log.w(TAG,"==== onCreateOptionsMenut");
        // async API - future
        AppCenter.isEnabled().thenAccept(new AppCenterConsumer<Boolean>() {
            @Override
            public void accept(Boolean enabled) {
                Log.w(TAG, "AppCenter.isEnabled=" + enabled);
            }
        });

        AppCenter.isEnabled().thenAccept(new AppCenterConsumer<Boolean>() {
            @Override
            public void accept(Boolean enabled) {
                Log.w(TAG, "AppCenter.isEnabled=" + enabled);
            }
        });

        //AppCenter.getInstallId();
        AppCenter.getInstallId().thenAccept(new AppCenterConsumer<UUID>() {
            @Override
            public void accept(UUID id) {
                Log.w(TAG, "InstallId: " + id.toString());
            }
        });



        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        Log.w(TAG, "==== onOptionsItemSelected");
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
