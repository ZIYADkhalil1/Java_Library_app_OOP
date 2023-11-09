package com.example.fcdsqahub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.DownloadManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    b1 = (Button) findViewById(R.id.download);
    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            DownloadManager downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
            Uri uri =Uri.parse("https://esps.alexu.edu.eg/images/esps-en.jpg");
            DownloadManager.Request request= new DownloadManager.Request(uri);
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            Long references = downloadManager.enqueue(request);
        }
    });


    }
    public void onBrodcast(View v){
Intent intent = new Intent();
intent.setAction("Brodcasting");
intent.setFlags(Intent.FLAG_EXCLUDE_STOPPED_PACKAGES);
sendBroadcast(intent);


    }
}