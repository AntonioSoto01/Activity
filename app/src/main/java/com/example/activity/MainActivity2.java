package com.example.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    EditText txtSaludo;
    @Override
    protected void OnCrete(Bundle savedInstancedState){


        super.onCreate(savedInstancedState);
        setContentView(R.layout.activity_main2);
        txtSaludo=findViewById(R.id.TxtSaludo);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        Persona p=(Persona) bundle.getSerializable(MainActivity.MESSAGE_NOMBRE);
       // String message=intent.getStringExtra(MainActivity.MESSAGE_NOMBRE);
        txtSaludo.setText(p.getNombre()+" Edad: "+p.getNombre());
    }
}
