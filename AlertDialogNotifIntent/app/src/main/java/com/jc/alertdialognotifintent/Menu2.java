package com.jc.alertdialognotifintent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu2 extends AppCompatActivity {
    private Button mBack2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu2);

        mBack2 = (Button) findViewById(R.id.bt_back2);
        mBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iBack = new Intent(getApplicationContext(),INT.class);
                startActivity(iBack);
                finish();
            }
        });
    }
}