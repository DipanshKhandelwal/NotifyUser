package com.example.dipanshkhandelwal.NotifyUser;

        import android.app.NotificationManager;
        import android.content.Context;
        import android.os.Vibrator;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.app.NotificationCompat;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Toast;

        import com.example.dipanshkhandelwal.NotifyUser.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Vibrate = (Button) findViewById(R.id.Vibrate) ;
        Button Notification = (Button) findViewById(R.id.Notification) ;
        Button ToastMessage = (Button) findViewById(R.id.Toast) ;

        Vibrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                v.vibrate(500);
            }
        });

        Notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v22) {
                NotificationCompat.Builder mBuilder =
                        (NotificationCompat.Builder) new NotificationCompat.Builder(MainActivity.this)
                                .setSmallIcon(R.mipmap.ic_launcher)
                                .setContentTitle("Your App Name")
                                .setContentText("Your Message");

                int mNotificationId = 001;
                NotificationManager mNotifyMgr =
                        (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                mNotifyMgr.notify(mNotificationId, mBuilder.build());
            }
        });

        ToastMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Your Toast Message", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
