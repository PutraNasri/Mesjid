package es.esy.kinketkuena.mesjid;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.model.*;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Maps extends ActionBarActivity implements OnMapReadyCallback{
    GoogleMap gMaps;
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        Intent intent = getIntent();
        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.mapslbs);
        mapFragment.getMapAsync(this);
        try {
            initializeMaps();
            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(5.570813, 95.371471))
                    .visible(true)
                    .title("masjid jamik unsyiah"));

            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(5.576526, 95.347824))
                    .visible(true)
                    .title("masjid polda"));
            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(5.567396, 95.338656))
                    .visible(true)
                    .title("masjid oman"));
            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(5.553695, 95.317064))
                    .visible(true)
                    .title("masjid raya"));
            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(5.572934, 95.362081))
                    .visible(true)
                    .title("masjid putih"));
            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(5.568376, 95.381538))
                    .visible(true)
                    .title("masjid baitul halim (tungkop)"));
            gMaps.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic))
                    .position(new LatLng(5.568490, 95.382830))
                    .visible(true)
                    .title("mesjid tungkop"));




            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }

            gMaps.setMyLocationEnabled(true);
            CameraPosition cameraPosition = new CameraPosition.Builder().target(new LatLng(5.570813, 95.371471)).zoom(11).build();

            gMaps.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition), 500, null);
        } catch (Exception e) {
        }
    }
    public void rood(View view)
    {
        gMaps.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }
    public void sat(View view)
    {
        gMaps.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
    }
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private void initializeMaps() {
        if (gMaps == null) {
            gMaps = ((MapFragment) getFragmentManager().findFragmentById(R.id.mapslbs)).getMap();

            if(gMaps == null) {
                Toast.makeText(getApplicationContext(), "Unable to create maps", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        gMaps.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }
}
