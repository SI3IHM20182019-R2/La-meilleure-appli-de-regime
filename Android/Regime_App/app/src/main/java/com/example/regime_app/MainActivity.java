package com.example.regime_app;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.regime_app.Models.Mocks;
import com.example.regime_app.Models.Utilisateur;
import com.example.regime_app.WelcomeView.InscriptionPart.InscriptionActivity;
import com.example.regime_app.WelcomeView.InscriptionPart.InscriptionActivityPartOne;

public class MainActivity extends AppCompatActivity {

    private static final String CHANNEL_TEST_ID = "chanel_test";
    private static final int NOTIFICATION_ID = 000000;

    private Button buttonConnexion;
    private Button buttonSlider;
    private Button buttonNotification;

    private NotificationManagerCompat notificationManagerCompat;

    @Override
    protected void onStart() {
        super.onStart();
        createNotificationChannelTest();
    }

    private void createNotificationChannelTest() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = getString(R.string.channel_test);
            String description = getString(R.string.channel_test_description);
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(CHANNEL_TEST_ID, name, importance);
            channel.setDescription(description);
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }

    public void showNotificationTest(String title, String content) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder( this, CHANNEL_TEST_ID)
                .setSmallIcon(R.drawable.calendar_icon)
                .setContentTitle(title)
                .setContentText(content)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);
        Log.d("Main Activity:", "test notification pushed");
        notificationManagerCompat.notify(NOTIFICATION_ID, builder.build());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Mocks.init();
        notificationManagerCompat = NotificationManagerCompat.from(this);
        createNotificationChannelTest();
        setContentView(R.layout.activity_main);

        buttonSlider = findViewById(R.id.slider);
        buttonSlider.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), InscriptionActivityPartOne.class);
            startActivity(intent);
        });

        buttonConnexion = findViewById(R.id.connexion);
        buttonConnexion.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MenuManagmentActivity.class);
            startActivity(intent);
        });

        buttonNotification = this.findViewById(R.id.notification);
        buttonNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNotificationTest("Title of this notification", "Notification's content here");
            }
        });
    }
}
