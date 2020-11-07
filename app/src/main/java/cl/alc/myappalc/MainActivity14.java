package cl.alc.myappalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity14 extends AppCompatActivity {

    private Button btnRegresarComenHtel2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        btnRegresarComenHtel2 = (Button) findViewById(R.id.btnRegresarComenHtel2);

        btnRegresarComenHtel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent18 = new Intent(MainActivity14.this,MainActivity10.class);
                startActivity(Intent18);
            }
        });
    }
}