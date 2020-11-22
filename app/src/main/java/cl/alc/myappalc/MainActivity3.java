package cl.alc.myappalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import cl.alc.myappalc.Modelo.Usuarios;

public class MainActivity3 extends AppCompatActivity {

    private List<Usuarios> listUsuarios = new ArrayList<Usuarios>();
    ArrayAdapter<Usuarios> arrayAdapterUsuarios;

    Button BtnAceptarUs;
    EditText TxtEdNombreUs,TxtEdApellidoUs,TxtEdCorreoUs,TxtEdContraseñaUs;

    FirebaseDatabase  firebaseDatabase;
    DatabaseReference  databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        BtnAceptarUs = (Button) findViewById(R.id.BtnAceptarUs);
        TxtEdNombreUs = findViewById(R.id.TxtEdNombreUs);
        TxtEdApellidoUs = findViewById(R.id.TxtEdApellidoUs);
        TxtEdCorreoUs = findViewById(R.id.TxtEdCorreoUs);
        TxtEdContraseñaUs = findViewById(R.id.TxtEdContraseñaUs);
        inicializarFireBase();

        BtnAceptarUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Usuarios us = new Usuarios(UUID.randomUUID().toString(),TxtEdNombreUs.getText().toString(),TxtEdApellidoUs.getText().toString(),TxtEdCorreoUs.getText().toString(),TxtEdContraseñaUs.getText().toString());
                databaseReference.child("Usuarios").child(us.getIdUsuario()).setValue(us);
                //CODIGO BOTON ACEPTAR REGRESAR A INICIO
                Intent Intent3 = new Intent(MainActivity3.this,MainActivity.class);
                startActivity(Intent3);
            }
        });
    }

    private void inicializarFireBase(){
        FirebaseApp.initializeApp(this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }
}