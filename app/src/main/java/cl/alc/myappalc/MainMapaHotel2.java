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

public class MainMapaHotel2 extends FragmentActivity implements OnMapReadyCallback {

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
        LatLng LosCardenales = new LatLng(-36.602985,  -72.110436);
        mMap.addMarker(new MarkerOptions().position(LosCardenales).title("Hotel Los Cardenales").snippet("Descripcion: ***AGREGAR DESCRIPCION***"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LosCardenales,17));
    }
}