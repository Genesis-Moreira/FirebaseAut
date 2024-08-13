package com.example.firebase;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.google.firebase.messaging.FirebaseMessagingService;
public class MyServiceFirebaseNotifications
        extends FirebaseMessagingService {
    public MyServiceFirebaseNotifications() {
    }
    @Override

    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (remoteMessage.getNotification() != null) {
            if (remoteMessage.getNotification().getBody() != null) {
                sendNotification(remoteMessage.getNotification().getBody());
            }
        }
    }
    @Override
    public void onNewToken(String token) {
        Log.d(TAG, "Nuevo token: " + token);
    }




 /*   @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");*/

}