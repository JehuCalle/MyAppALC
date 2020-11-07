package cl.alc.myappalc;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.webkit.WebSettings;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainMapaHostal1 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng HostalChillan = new LatLng(-36.608708,  -72.104945);
        mMap.addMarker(new MarkerOptions().position(HostalChillan).title("Hostal Chillan").snippet("Descripcion: ***AGREGAR DESCRIPCION***"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(HostalChillan,17));
    }
}