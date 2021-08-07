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

public class moActivity extends AppCompatActivity implements View.OnClickListener{


    EditText mfname , mlname , mmail , mphone , mpass ;
     Button mlogin , mblogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mo);
            mfname=findViewById(R.id.fname);
            mlname=findViewById(R.id.lname);
            mmail=findViewById(R.id.mail);
            mphone=findViewById(R.id.phone);
            mpass=findViewById(R.id.pass);
            mblogin =findViewById(R.id.blogin);
        mlogin =(Button) findViewById(R.id.login);
        mblogin.setOnClickListener(this);
        mlogin.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login:
                // validation
                if(!(mfname.getText().toString().equalsIgnoreCase("محمد"))){
                    Toast.makeText(moActivity.this , "Please Enter Your First Name" , Toast.LENGTH_LONG).show();
                }else if (!(mlname.getText().toString().equalsIgnoreCase("علي "))) {
                    Toast.makeText(moActivity.this, "Please Enter Your Last Name", Toast.LENGTH_LONG).show();
                }else if (!(mmail.getText().toString().equalsIgnoreCase(" gjgdhh106@gmail.com"))) {
                    Toast.makeText(moActivity.this, "Please Enter Your Mail", Toast.LENGTH_LONG).show();
                }else if (!(mphone.getText().toString().equalsIgnoreCase("01145832886"))) {
                    Toast.makeText(moActivity.this, "Please Enter Your Phone", Toast.LENGTH_LONG).show();
                }else if (!(mpass.getText().toString().equalsIgnoreCase("135790"))) {
                    Toast.makeText(moActivity.this, "Please Enter Your Password", Toast.LENGTH_LONG).show();
                }else {
                    // go to Home Activity
                    Intent i = new Intent(moActivity.this , MainActivity.class );

                    startActivity(i);

                }
                break;
            case R.id.blogin:
                     Intent intent=new Intent(moActivity.this,log_inActivity.class);
                     startActivity(intent);
                     break;

        }
    }
}