package cl.alc.myappalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView TxtVwTitulo;
    private Button BtnIniciar,BtnCrearCuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnIniciar =(Button)findViewById(R.id.BtnIniciar);
        BtnCrearCuenta =(Button)findViewById(R.id.BtnCrearCuenta);

        BtnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON INICIAR SESION
                Intent Intent1 = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(Intent1);
            }
        });
        BtnCrearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON CREAR CUENTA
                Intent Intent2 = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(Intent2);
            }
        });
    }
}