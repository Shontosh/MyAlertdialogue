package com.example.myalertdialogue;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button button;
private AlertDialog.Builder alertdialogbuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.buttonid);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        alertdialogbuilder=new AlertDialog.Builder(MainActivity.this);
        alertdialogbuilder.setTitle(R.string.title_name);
        alertdialogbuilder.setMessage(R.string.message_name);
        alertdialogbuilder.setIcon(R.drawable.ic_launcher_background);
        alertdialogbuilder.setCancelable(false);
        alertdialogbuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
              finish();
            }
        });
        alertdialogbuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
              dialogInterface.cancel();
            }
        });
        alertdialogbuilder.setNeutralButton("Cancle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Staed", Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alertDialog=alertdialogbuilder.create();
        alertDialog.show();
    }
}
