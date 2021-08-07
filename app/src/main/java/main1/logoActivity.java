package main1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.R;

public class logoActivity extends AppCompatActivity implements View.OnClickListener{
TextView mlogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.myapplication.R.layout.activity_logo);
    mlogo =findViewById(R.id.logo);
mlogo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent lo= new Intent(logoActivity.this,moActivity.class);
        startActivity(lo);
    }
}