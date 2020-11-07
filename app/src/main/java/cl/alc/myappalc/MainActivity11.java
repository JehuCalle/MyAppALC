package cl.alc.myappalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity11 extends AppCompatActivity {

    private Button BtnRegresarComenHtel1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        BtnRegresarComenHtel1 = (Button) findViewById(R.id.BtnRegresarComenHtel1);

        BtnRegresarComenHtel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent18 = new Intent(MainActivity11.this,MainActivity10.class);
                startActivity(Intent18);
            }
        });
    }
}