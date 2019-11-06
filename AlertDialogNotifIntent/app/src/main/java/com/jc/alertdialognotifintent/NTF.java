package com.jc.alertdialognotifintent;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.INotificationSideChannel;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NTF extends AppCompatActivity {

    private Button mBackntf;

    public static final int notifikasi=1;

    Button btnkirim;

    EditText txtjudul,txtpesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_notifikasi);

        btnkirim = (Button)findViewById(R.id.btnKirim);
        txtjudul = (EditText)findViewById(R.id.txtJudul);
        txtpesan = (EditText)findViewById(R.id.txtpesan);

        btnkirim.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),NTF.class);

                tampilNotifikasi(txtjudul.getText().toString(),txtpesan.getText().toString(),intent);
            }
        });

        mBackntf = (Button) findViewById(R.id.bt_backntf);
        mBackntf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iBack = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(iBack);
                finish();
            }
        });
    }

    private void tampilNotifikasi(String s, String s1, Intent intent){
        PendingIntent pendingIntent = PendingIntent.getActivity(NTF.this
                , notifikasi, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder builder = new NotificationCompat.Builder((NTF.this));
        Notification notification;
        notification = builder.setSmallIcon(R.mipmap.ic_launcher).setAutoCancel(true).setContentIntent(pendingIntent).setContentTitle(s).setSmallIcon(R.mipmap.ic_launcher).setLargeIcon(BitmapFactory.decodeResource(NTF.this.getResources(),R.mipmap.ic_launcher)).setContentText(s1).build();

        notification.flags |= Notification.FLAG_AUTO_CANCEL;
        NotificationManager notificationManager = (NotificationManager) NTF.this.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(notifikasi, notification);
    }
}
