package com.example.ivos.mynotificationsapp;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by What's That Lambda on 11/6/17.
 */

public class InstanceIdService extends FirebaseInstanceIdService {

    String TAG = "MY-APP";

    public InstanceIdService() {
        super();
    }

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.w(TAG, "FCM TOKEN: " + token);
        //sends this token to the server
        sendToServer(token);
    }

    private void sendToServer(String token) {

        try {
            // todo
            URL url = new URL("http://headers.jsontest.com");
            Log.w(TAG, "sendToServer: " + url);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setDoOutput(true);
            connection.setDoInput(true);

            connection.setRequestMethod("POST");

            DataOutputStream dos = new DataOutputStream(connection.getOutputStream());
            dos.writeBytes("token=" + token);

            connection.connect();
            dos.close();

            Log.w(TAG, "ResponseCode: " + connection.getResponseCode());
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                // Do whatever you want after the
                // token is successfully stored on the server
            }

        } catch (MalformedURLException e) {
            Log.w(TAG, "err1: " + e.getMessage());
        } catch (IOException e) {
            Log.w(TAG, "err2: " + e.getMessage());
        }
    }
}