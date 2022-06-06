package com.example.mobileproject527;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText EditId,EditPassword;
    Button btnlogin,btnsignup;
    String id,pass;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("게임 친구 구하기");

        EditId = findViewById(R.id.edittextId);
        EditPassword = findViewById(R.id.edittextPass);

        btnsignup = findViewById(R.id.signup);
        btnlogin = findViewById(R.id.login);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(EditId.length() != 0 || EditPassword.length() != 0){
                    id = EditId.getText().toString();
                    pass = EditPassword.getText().toString();
                    Intent intent = new Intent(MainActivity.this,MainPage.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(),"로그인에 성공했습니다.!",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"아이디와 패스워드를 입력해주세요!",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Singup.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"회원가입 페이지로 이동합니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}