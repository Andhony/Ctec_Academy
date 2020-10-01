package com.uso.ctecacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    public EditText txtUsuario;
    public EditText txtContrasenia;
    public TextView lblError;
    public boolean bandera = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.txtUsuario = findViewById(R.id.txtNombre);
        this.txtContrasenia = findViewById(R.id.txtPassword);
        this.lblError = findViewById(R.id.lblError);
    }

    public void login_onClick(View v){
        if (validar()) {
            Intent i = new Intent(this, MenuActivity.class);
            startActivity(i);
        }
    }
    private boolean validar() {
        bandera = false;
        if (txtUsuario.getText().toString().trim().isEmpty()) {
            txtUsuario.setError("¡Este campo no puede quedar vacío!");
        } else if (txtContrasenia.getText().toString().trim().isEmpty()) {
            txtContrasenia.setError("¡Este campo no puede quedar vacío!");
        } else {
            if (txtUsuario.getText().toString().equals("PG17-I04-001") && txtContrasenia.getText().toString().equals("12345")) {
                bandera = true;
            } else {
                lblError.setText("¡Usuario o Contraseña Incorrectos!");
            }
        }
        return bandera;
    }
}