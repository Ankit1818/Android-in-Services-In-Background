package com.example.sp;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Myservices extends Service {

    MediaPlayer mp;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;

    }

    @Override
    public void onCreate() {
        Toast.makeText(this, "Services Created", Toast.LENGTH_SHORT).show();
        mp=MediaPlayer.create(this,R.raw.track_01); 
        super.onCreate();
    }

    @Override
    public void onStart(Intent intent, int startId) {
        Toast.makeText(this, "Services Started", Toast.LENGTH_SHORT).show();
        mp.start();
        super.onStart(intent, startId);
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "Services Stoped", Toast.LENGTH_SHORT).show();
        mp.stop();
        super.onDestroy();
    }
}
