package cl.alc.myappalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    private Button BtnAceptarNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        BtnAceptarNew = (Button) findViewById(R.id.BtnAceptarNew);

        BtnAceptarNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON ACEPTAR
                Intent Intent3 = new Intent(MainActivity3.this,MainActivity.class);
                startActivity(Intent3);
            }
        });
    }
}