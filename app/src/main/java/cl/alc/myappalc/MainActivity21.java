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

import cl.alc.myappalc.Modelo.CaliHtlHostalOhiggins;
import cl.alc.myappalc.Modelo.CaliHtlLosCardenales;

public class MainActivity21 extends AppCompatActivity {

    private Button btnRegresarComenHtal2,BtnEnviarComen;
    private EditText TxtEdNombre,TxtEdCorreo,TxtEdComentario;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);

        btnRegresarComenHtal2 = (Button) findViewById(R.id.btnRegresarComenHtal2);
        BtnEnviarComen = (Button) findViewById(R.id.BtnEnviarComen);
        TxtEdNombre = findViewById(R.id.TxtEdNombre);
        TxtEdCorreo = findViewById(R.id.TxtEdCorreo);
        TxtEdComentario = findViewById(R.id.TxtEdComentario);
        inicializarFireBase();

        btnRegresarComenHtal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON INICIO HOSTALES
                Intent Intent39 = new Intent(MainActivity21.this,MainActivity18.class);
                startActivity(Intent39);
            }
        });
        BtnEnviarComen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaliHtlHostalOhiggins ho = new CaliHtlHostalOhiggins(UUID.randomUUID().toString(),TxtEdNombre.getText().toString(),
                        TxtEdCorreo.getText().toString(),TxtEdComentario.getText().toString());
                databaseReference.child("CaliHtlHostalOhiggins").child(ho.getIdUsuario()).setValue(ho);
                //CODIGO BOTON ENVIAR
                Intent Intent18 = new Intent(MainActivity21.this,MainActivity18.class);
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