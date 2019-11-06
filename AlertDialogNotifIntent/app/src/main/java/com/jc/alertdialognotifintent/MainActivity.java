package com.jc.alertdialognotifintent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mBtn_AD, mBtn_NTF, mBtn_Int;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtn_AD = (Button)findViewById(R.id.btn_ad);
        mBtn_NTF = (Button)findViewById(R.id.btn_ntf);
        mBtn_Int = (Button)findViewById(R.id.btn_int);

        mBtn_AD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent adMenu1 = new Intent(getApplicationContext(),AD.class);
                startActivity(adMenu1);
            }
        });

        mBtn_NTF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ntfMenu2 = new Intent(getApplicationContext(),NTF.class);
                startActivity(ntfMenu2);
            }
        });

        mBtn_Int.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intMenu3 = new Intent(getApplicationContext(),INT.class);
                startActivity(intMenu3);
            }
        });
    }
}
