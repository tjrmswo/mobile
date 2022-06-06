package com.example.mobileproject527;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Singup extends AppCompatActivity {
    EditText editId, editPassword, editnickname, editpasscheck;
    Button btncheck, btncancel, btndoublecheck,passdoublecheck;
    TextView tvpasscheck;
    String Id, pass, passcheck, nickname;
    String [] idcheck = new String[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);

        editId = findViewById(R.id.editIdsingup);
        editPassword = findViewById(R.id.editpasssingup);
        editpasscheck = findViewById(R.id.editpasscheck);
        tvpasscheck = findViewById(R.id.tvpasscheck);
        editnickname = findViewById(R.id.editnicknamesingup);

        btndoublecheck = findViewById(R.id.singupdoublecheck);
        btncheck = findViewById(R.id.signupcheck);
        btncancel = findViewById(R.id.signupcancel);
        passdoublecheck = findViewById(R.id.passdoublecheck);

        btncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 빈칸이 있으면 넘어갈 수 없게 하는 코드
                if (editId.length() != 0 || editPassword.length() != 0 || editpasscheck.length() != 0 || editnickname.length() != 0) {
                    Id = editId.getText().toString();
                    pass = editPassword.getText().toString();
                    passcheck = editpasscheck.getText().toString();
                    nickname = editnickname.getText().toString();
                    // 메인 화면으로 이동
                    Intent intent = new Intent(Singup.this, MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "회원가입에 성공하였습니다!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "빈 칸없이 모두 작성해주세요!", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btndoublecheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(idcheck[0].isEmpty()){
                    Toast.makeText(getApplicationContext(),"사용 가능한 아이디입니다!",Toast.LENGTH_SHORT).show();
                }else{
                    for(int i=1;i<idcheck.length;i++){
                        idcheck[i].split(editId.getText().toString());
                        if(editId.getText().toString().equals(idcheck[i])){
                            Toast.makeText(getApplicationContext(),"동일한 아이디가 있습니다!",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });
        passdoublecheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //비밀번호가 일치하는지 확인하는 코드
                pass = editPassword.getText().toString();
                passcheck = editpasscheck.getText().toString();
                if(pass.equals(passcheck)){
                    tvpasscheck.setText("비밀번호가 일치합니다!");
                }else{
                    tvpasscheck.setText("비밀번호가 일치하지 않습니다!");
                }
            }
        });
        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //하던 일을 취소하고 메인 페이지로 가는 코드
                Toast.makeText(getApplicationContext(),"취소되었습니다.",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Singup.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}