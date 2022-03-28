package com.example.myapplication;

/*

Author: ING. CARLOS OTERO RAMÍREZ

 */

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int num;

    private EditText editText1;
    private Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Nombre del Número");

        editText1 = findViewById(R.id.AM1_id2);
        button1 = findViewById(R.id.AM1_id3);
        button1.setOnClickListener(this);
        button2 = findViewById(R.id.AM1_id4);
        button2.setOnClickListener(this);
    }

    public void dialogoAlerta(String titulo, String mensaje){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setMessage(mensaje)
                .setTitle(titulo)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int posicion) {
                        dialog.cancel();
                    }
                });
        dialog.show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.AM1_id3:
                if(editText1.getText().toString().isEmpty()){
                    dialogoAlerta("Mensaje de Error", "El Campo de Texto esta Vacio");
                } else if(editText1.getText().toString().length() > 1) {
                    dialogoAlerta("Mensaje de Error", "Solo Puede Ingresar un Número de un Digito");
                    editText1.setText("");
                } else {
                    num = Integer.parseInt(editText1.getText().toString());
                    switch(num){
                        case 0:
                            dialogoAlerta("Mensaje de Información", "El número que ingresaste es " + num + " y su nombre es Cero");
                            break;
                        case 1:
                            dialogoAlerta("Mensaje de Información", "El número que ingresaste es " + num + " y su nombre es Uno");
                            break;
                        case 2:
                            dialogoAlerta("Mensaje de Información", "El número que ingresaste es " + num + " y su nombre es Dos");
                            break;
                        case 3:
                            dialogoAlerta("Mensaje de Información", "El número que ingresaste es " + num + " y su nombre es Tres");
                            break;
                        case 4:
                            dialogoAlerta("Mensaje de Información", "El número que ingresaste es " + num + " y su nombre es Cuatro");
                            break;
                        case 5:
                            dialogoAlerta("Mensaje de Información", "El número que ingresaste es " + num + " y su nombre es Cinco");
                            break;
                        case 6:
                            dialogoAlerta("Mensaje de Información", "El número que ingresaste es " + num + " y su nombre es Seis");
                            break;
                        case 7:
                            dialogoAlerta("Mensaje de Información", "El número que ingresaste es " + num + " y su nombre es Siete");
                            break;
                        case 8:
                            dialogoAlerta("Mensaje de Información", "El número que ingresaste es " + num + " y su nombre es Ocho");
                            break;
                        case 9:
                            dialogoAlerta("Mensaje de Información", "El número que ingresaste es " + num + " y su nombre es Nueve");
                            break;
                    }
                }
                break;
            case R.id.AM1_id4:
                System.exit(0);
                break;
        }
    }
}