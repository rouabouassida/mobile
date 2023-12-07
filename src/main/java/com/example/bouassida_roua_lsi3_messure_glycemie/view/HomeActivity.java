package com.example.bouassida_roua_lsi3_messure_glycemie.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.bouassida_roua_lsi3_messure_glycemie.R;
import com.example.bouassida_roua_lsi3_messure_glycemie.controller.LoginController;

public class HomeActivity extends AppCompatActivity {

    private Button btnConsulter;
    private EditText etUserName;
    private  EditText etPassword;
    private LoginController loginController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
        etUserName.setText(loginController.getUserNom());
        etPassword.setText(loginController.getPassword());
        btnConsulter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
private void init(){
        loginController =loginController.getInstance(HomeActivity.this);
        btnConsulter =(Button) findViewById(R.id.btnConsulter);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etUserName = (EditText) findViewById(R.id.etUserName);
}
}