package cl.alc.myappalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {

    private Button BtnRegresarHostales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        BtnRegresarHostales = (Button) findViewById(R.id.BtnRegresarHostales);

        BtnRegresarHostales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON INICIO HOTELES
                Intent Intent12 = new Intent(MainActivity7.this,MainActivity5.class);
                startActivity(Intent12);
            }
        });
    }
}