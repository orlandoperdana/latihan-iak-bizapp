package com.example.orlandoperdana.bizapp;

/**
 * Created by Orlando Perdana on 12/08/2017.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        Button buttonReg = (Button) findViewById(R.id.buttonReg);

        buttonReg.setOnClickListener(new View.OnClickListener(){
                                            public void onClick(View arg0){

                                                finish();
                                            }
        });
    }
}
