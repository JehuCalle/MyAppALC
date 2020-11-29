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
import cl.alc.myappalc.Modelo.CaliHtlDiegoAlmagro;
import cl.alc.myappalc.Modelo.Usuarios;

public class MainActivity11 extends AppCompatActivity {

    private Button BtnRegresarComenHtel1,BtnEnviarComen;
    private EditText TxtEdNombre,TxtEdCorreo,TxtEdComentario;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        BtnRegresarComenHtel1 = (Button) findViewById(R.id.BtnRegresarComenHtel1);
        BtnEnviarComen = (Button) findViewById(R.id.BtnEnviarComen);
        TxtEdNombre = findViewById(R.id.TxtEdNombre);
        TxtEdCorreo = findViewById(R.id.TxtEdCorreo);
        TxtEdComentario = findViewById(R.id.TxtEdComentario);
        inicializarFireBase();

        BtnRegresarComenHtel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent18 = new Intent(MainActivity11.this,MainActivity6.class);
                startActivity(Intent18);
            }
        });
        BtnEnviarComen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaliHtlDiegoAlmagro da = new CaliHtlDiegoAlmagro(UUID.randomUUID().toString(),TxtEdNombre.getText().toString(),
                        TxtEdCorreo.getText().toString(),TxtEdComentario.getText().toString());
                databaseReference.child("CaliHtlDiegoAlmagro").child(da.getIdUsuario()).setValue(da);
                //CODIGO BOTON ENVIAR
                Intent Intent18 = new Intent(MainActivity11.this,MainActivity6.class);
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