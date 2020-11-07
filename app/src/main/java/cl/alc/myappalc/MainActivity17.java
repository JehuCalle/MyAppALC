package cl.alc.myappalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity17 extends AppCompatActivity {

    private Button BtnRegresarComenHtal1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        BtnRegresarComenHtal1 = (Button) findViewById(R.id.BtnRegresarComenHtal1);

        BtnRegresarComenHtal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent18 = new Intent(MainActivity17.this,MainActivity7.class);
                startActivity(Intent18);
            }
        });
    }
}