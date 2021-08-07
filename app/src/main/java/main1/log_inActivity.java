package main1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;

import main.MainActivity;

public class log_inActivity extends AppCompatActivity implements View.OnClickListener{
Button mLoginLI ,mSignLI;
EditText mPassLI,mEmailLI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        intent1();


    }
    void intent1(){
        mLoginLI =findViewById(R.id.log_in);
        mSignLI =findViewById(R.id.sign_li);
        mPassLI=findViewById(R.id.pass_li);
        mEmailLI =findViewById(R.id.email_li);
mLoginLI.setOnClickListener(this);
mSignLI.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.log_in:
                // validation
                 if (!(mEmailLI.getText().toString().equalsIgnoreCase("gjgdhh106@gmail.com"))) {
                    Toast.makeText(log_inActivity.this, "Please Enter Your Mail", Toast.LENGTH_LONG).show();

                }else if (!(mPassLI.getText().toString().equalsIgnoreCase("135790"))) {
                    Toast.makeText(log_inActivity.this, "Please Enter Your Password", Toast.LENGTH_LONG).show();
                }else {
                    // go to Home Activity
                    Intent i = new Intent(log_inActivity.this , MainActivity.class );

                    i.putExtra("mail" , mEmailLI.getText().toString());
                    i.putExtra("pass" , mPassLI.getText().toString());
                    startActivity(i);

                }
                break;

            case R.id.sign_li:
                Intent intent=new Intent(log_inActivity.this,moActivity.class);
                startActivity(intent);
                break;
    }
}}