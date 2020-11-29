package cl.alc.myappalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.util.UUID;
import cl.alc.myappalc.Modelo.CaliHtlLosCardenales;

public class MainActivity14 extends AppCompatActivity {

    private Button btnRegresarComenHtel2,BtnEnviarComen;
    private EditText TxtEdNombre,TxtEdCorreo,TxtEdComentario;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        btnRegresarComenHtel2 = (Button) findViewById(R.id.btnRegresarComenHtel2);
        BtnEnviarComen = (Button) findViewById(R.id.BtnEnviarComen);
        TxtEdNombre = findViewById(R.id.TxtEdNombre);
        TxtEdCorreo = findViewById(R.id.TxtEdCorreo);
        TxtEdComentario = findViewById(R.id.TxtEdComentario);
        inicializarFireBase();

        btnRegresarComenHtel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent18 = new Intent(MainActivity14.this,MainActivity10.class);
                startActivity(Intent18);
            }
        });
        BtnEnviarComen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaliHtlLosCardenales lc = new CaliHtlLosCardenales(UUID.randomUUID().toString(),TxtEdNombre.getText().toString(),
                        TxtEdCorreo.getText().toString(),TxtEdComentario.getText().toString());
                databaseReference.child("CaliHtlLosCardenales").child(lc.getIdUsuario()).setValue(lc);
                //CODIGO BOTON ENVIAR
                Intent Intent18 = new Intent(MainActivity14.this,MainActivity10.class);
                startActivity(Intent18);
            }
        });
    }
    private void inicializarFireBase(){
        FirebaseApp.initializeApp(this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }
}