package cl.alc.myappalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity21 extends AppCompatActivity {

    private Button btnRegresarComenHtal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);

        btnRegresarComenHtal2 = (Button) findViewById(R.id.btnRegresarComenHtal2);

        btnRegresarComenHtal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON INICIO HOSTALES
                Intent Intent39 = new Intent(MainActivity21.this,MainActivity18.class);
                startActivity(Intent39);
            }
        });
    }
}