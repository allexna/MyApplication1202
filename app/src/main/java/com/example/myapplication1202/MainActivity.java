package com.example.myapplication1202;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;


public class MainActivity extends AppCompatActivity {
    private static final int NOTIFY_ID=101;
    private static String CHANNEL_ID="Cat channel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationCompat.Builder builder=new NotificationCompat.Builder(MainActivity.this,CHANNEL_ID).setSmallIcon(R.drawable.ic_pets_black_24dp).setContentTitle("Напоминание").setContentTitle("Пора кормить кота").setPriority(NotificationCompat.PRIORITY_DEFAULT);
                NotificationManagerCompat notificationManager=NotificationManagerCompat.from(MainActivity.this);
            notificationManager.notify(NOTIFY_ID,builder.build());}
        });
    }
}
