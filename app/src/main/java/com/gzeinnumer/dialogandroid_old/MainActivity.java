package com.gzeinnumer.dialogandroid_old;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_example_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                example2();
            }
        });
    }

    private void example2() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setMessage("Are you sure, You wanted to make decision");
        alertDialogBuilder.setPositiveButton("yes", (arg0, arg1) -> {
            Toast.makeText(MainActivity.this,"You clicked yes  button",Toast.LENGTH_LONG).show();
            Toast.makeText(MainActivity.this,"You clicked yes  button",Toast.LENGTH_LONG).show();
        });

        alertDialogBuilder.setNegativeButton("No", (dialog, which) -> {
            finish();
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
