package cl.alc.myappalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity13 extends AppCompatActivity {

    private Button btnRegresarHtel2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        btnRegresarHtel2 = (Button) findViewById(R.id.btnRegresarHtel2);

        btnRegresarHtel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent16 = new Intent(MainActivity13.this,MainActivity12.class);
                startActivity(Intent16);
            }
        });
    }
}