package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
static String MESSAGE_NOMBRE =".";
Button btnEnviar;
EditText txtNombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BtnEnviar=findViewById(R.id.BtnAceptar);
        TxtNombre=findViewById(R.id.txtNombre);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
            Persona p=new Persona(txtNombre.getText().toString(),Integer.parseInt(txtEdad.getText().toString()));
            Bundle bundle=new Bundle();
            bundle.putSerializable(MESSAGE_NOMBRE,p);
            intent.putExtras(bundle);

                startActivity(intent);
            }
        });
    }
}