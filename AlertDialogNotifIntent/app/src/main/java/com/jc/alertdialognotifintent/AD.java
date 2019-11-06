package com.jc.alertdialognotifintent;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;


public class AD extends AppCompatActivity implements OnClickListener {
    Button btnAlertTwoBtns, btnCustomAlert, btnAlertWithTreeBtns, btnAlert;
    private Button mBackad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_alert_dialog);
        btnAlertTwoBtns = (Button)findViewById(R.id.bbtnAllertWidthTowBtns);
        btnCustomAlert = (Button)findViewById(R.id.btnCustomAlert);
        btnAlertWithTreeBtns = (Button)findViewById(R.id.btnAlertWithThreeBtns);
        btnAlert = (Button)findViewById(R.id.btnAlert);
        btnAlertTwoBtns.setOnClickListener(this);
        btnCustomAlert.setOnClickListener(this);
        btnAlertWithTreeBtns.setOnClickListener(this);
        btnAlert.setOnClickListener(this);

        mBackad = (Button) findViewById(R.id.bt_backad);
        mBackad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iBack = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(iBack);
                finish();
            }
        });
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bbtnAllertWidthTowBtns:
                AlertDialog.Builder alertDialog2 = new AlertDialog.Builder(this);
                alertDialog2.setTitle("Konfirmsi Hapus...?");
                alertDialog2.setMessage("Yakin Data Dihapus?");
                alertDialog2.setIcon(R.drawable.delete);
                alertDialog2.setPositiveButton("YES",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int which){
                                Toast.makeText(getApplicationContext(),"Tombol Yes Ditekan", Toast.LENGTH_SHORT).show();
                            }
                        });
                alertDialog2.setNegativeButton("NO",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int which){
                                Toast.makeText(getApplicationContext(),"Tombol No Ditekan", Toast.LENGTH_SHORT).show();
                            }
                        });
                alertDialog2.show();
                break;
            case R.id.btnAlert:
                AlertDialog.Builder alertDialog1 = new AlertDialog.Builder(this);

                alertDialog1.setTitle("Alert Dialog");
                alertDialog1.setMessage("Materi Dialog Mobile Programming");
                alertDialog1.setIcon(R.drawable.tick);
                alertDialog1.setNeutralButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int which){
                                Toast.makeText(getApplicationContext(),"Tombol OK Ditekan", Toast.LENGTH_SHORT).show();
                            }
                        });
                alertDialog1.show();
                break;

            case R.id.btnAlertWithThreeBtns:
                AlertDialog.Builder alertDialog3 = new AlertDialog.Builder(this);

                alertDialog3.setTitle("Simpan File");
                alertDialog3.setMessage("Simpan File Pekerjaan Anda");
                alertDialog3.setIcon(R.drawable.save);
                alertDialog3.setPositiveButton("YES",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int which){
                                Toast.makeText(getApplicationContext(),"Tombol Yes Ditekan", Toast.LENGTH_SHORT).show();
                            }
                        });

                alertDialog3.setNegativeButton("No",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int which){
                                Toast.makeText(getApplicationContext(),"Tombol No Ditekan", Toast.LENGTH_SHORT).show();
                            }
                        });
                alertDialog3.setNegativeButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int which){
                                Toast.makeText(getApplicationContext(),"Tombol Cancel Ditekan", Toast.LENGTH_SHORT).show();
                            }
                        });

                alertDialog3.show();
                break;

            case R.id.btnCustomAlert:
                final Dialog dialog = new Dialog(this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.detail);
                Button dialogButton = (Button) dialog.findViewById(R.id.btn_custom_alert_ok);
                dialogButton.setOnClickListener(new OnClickListener() {
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                break;
        }
    }
    public boolean onCreateOptionMenu(Menu menu){
        return true;
    }
}
