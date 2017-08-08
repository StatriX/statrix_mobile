package com.example.statrix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText email;
    private EditText password;
    private Button enter;
    private ImageView logo;
    private TextView forgetPassword;
    private TextView registration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        initView();

        registration.setOnClickListener(this);
    }


    private void initView() {
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        enter = (Button) findViewById(R.id.enter);
        logo = (ImageView) findViewById(R.id.logo);
        forgetPassword = (TextView) findViewById(R.id.forget_password);
        registration = (TextView) findViewById(R.id.registration);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.registration:
                Intent intent = new Intent(this, RegistrationActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
