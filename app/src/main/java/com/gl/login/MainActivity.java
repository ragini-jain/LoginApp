package com.gl.login;

import android.graphics.Color;
import android.net.nsd.NsdManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mForgotPasswordLink;
    Button mButtonLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mForgotPasswordLink.setOnClickListener(this);
        mButtonLogin.setOnClickListener(this);
    }

    private void initView() {
        mForgotPasswordLink= findViewById(R.id.forgotPasswordLink);
        mButtonLogin = findViewById(R.id.loginButton);
    }


    @Override
    public void onClick(View v) {
       if(v == mForgotPasswordLink){
           mForgotPasswordLink.setTextColor(Color.RED);
           Toast.makeText(getApplicationContext(),"Forgot Password Click",Toast.LENGTH_LONG).show();
       }else{
           mButtonLogin.setTextColor(Color.BLUE);
           Toast.makeText(getApplicationContext(),"Login Click",Toast.LENGTH_LONG).show();
       }
    }
}
