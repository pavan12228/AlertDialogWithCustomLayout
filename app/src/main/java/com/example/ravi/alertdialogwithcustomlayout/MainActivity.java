package com.example.ravi.alertdialogwithcustomlayout;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.ravi.alertdialogwithcustomlayout.R.id.button;

public class MainActivity extends AppCompatActivity {
     Button mShowButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowButton= (Button) findViewById(button);
        mShowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                View mView=getLayoutInflater().inflate(R.layout.dialoglogin,null);
                final EditText email= (EditText) mView.findViewById(R.id.etEmail);
                final EditText passsword= (EditText) mView.findViewById(R.id.etPassword);
                Button btn= (Button) mView.findViewById(R.id.Login);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(!email.getText().toString().trim().isEmpty() && !passsword.getText().toString().trim().isEmpty()){

                            Toast.makeText(MainActivity.this, "Login Succesfull", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(MainActivity.this, "Unsuccesful", Toast.LENGTH_SHORT).show();
                        }
                    }


                });
                 builder.setView(mView);
                  AlertDialog  alertDialog=builder.create();
                  alertDialog.show();
            }
        });
    }
}
