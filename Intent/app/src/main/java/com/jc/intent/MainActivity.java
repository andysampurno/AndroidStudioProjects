package com.jc.intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mBtn_menu1, mBtn_menu2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtn_menu1 = (Button)findViewById(R.id.btn_menu1);
        mBtn_menu2 = (Button)findViewById(R.id.btn_menu2);

        mBtn_menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iMenu1 = new Intent(getApplicationContext(),Menu1.class);
                startActivity(iMenu1);
            }
        });

        mBtn_menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iMenu2 = new Intent(getApplicationContext(),Menu2.class);
                startActivity(iMenu2);
            }
        });
    }
}
