package com.xxxy.lihang.lihang2114127032;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EnrollActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enroll);

        Button btn_enroll2 =findViewById(R.id.btn_enroll2);
        btn_enroll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EnrollActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        Button btn_cancel =findViewById(R.id.btn_cancel);
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EnrollActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}