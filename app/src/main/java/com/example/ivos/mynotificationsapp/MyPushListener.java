package com.example.ivos.mynotificationsapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.util.Log;
import android.widget.Toast;

import com.microsoft.appcenter.push.PushListener;
import com.microsoft.appcenter.push.PushNotification;

import java.util.Map;

// appcenter listener
public class MyPushListener implements PushListener {
    String TAG = "MY-APP";

    @Override
    public void onPushNotificationReceived(Activity activity, PushNotification pushNotification) {


        /* The following notification properties are available. */
        String title = pushNotification.getTitle();
        String message = pushNotification.getMessage();
        Map<String, String> customData = pushNotification.getCustomData();

        Log.w(TAG, ">>>>>>>> RECEIVED title: " + title + ", data: " + message);

        /*
         * Message and title cannot be read from a background notification object.
         * Message being a mandatory field, you can use that to check foreground vs background.
         */
        if (message != null) {

            /* Display an alert for foreground push. */
            AlertDialog.Builder dialog = new AlertDialog.Builder(activity);
            if (title != null) {
                dialog.setTitle(title);
            }
            dialog.setMessage(message);
            if (!customData.isEmpty()) {
                dialog.setMessage(message + "\n" + customData);
            }
            dialog.setPositiveButton(android.R.string.ok, null);
            dialog.show();
        } else {
            /* Display a toast when a background push is clicked. */
            Toast.makeText(activity, String.format(activity.getString(R.string.push_toast),
                    customData), Toast.LENGTH_LONG).show();
            // For example R.string.push_toast would be "Push clicked with data=%1s"
        }
    }
}
