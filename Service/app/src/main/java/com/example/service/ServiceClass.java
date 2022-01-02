package com.example.service;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
import androidx.annotation.Nullable;
public class ServiceClass extends Service {
   private MediaPlayer m;
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        m=MediaPlayer.create(this, Settings.System.DEFAULT_NOTIFICATION_URI);
        m.setLooping(true);
        m.start();
        return START_STICKY;
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        m.stop();
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
