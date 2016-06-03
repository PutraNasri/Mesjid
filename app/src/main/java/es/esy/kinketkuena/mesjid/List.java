package es.esy.kinketkuena.mesjid;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class List extends AppCompatActivity {
    String nama;
    String[] Banda = {"mesjid raya","mesjid oman","mesjid jamik","mesjid"};
    String[] Pidie = {"mesjid 1","mesjid 2","mesjid 3","mesjid 4"};
    String[] Aceh_besar = {"mesjid 1","mesjid 2","mesjid 3","mesjid 4","mesjid 5"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Intent intent = getIntent();
        nama = intent.getStringExtra("nama");
        setInfo(nama);
    }
    public void setInfo(String place) {

        if (place.equalsIgnoreCase("banda")) {
            ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list, Banda);
            ListView listView = (ListView) findViewById(R.id.listView);
            listView.setAdapter(adapter);
        }
        else if (place.equalsIgnoreCase("pidie")) {
            ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list, Pidie);
            ListView listView = (ListView) findViewById(R.id.listView);
            listView.setAdapter(adapter);
        } else {
        }
        if (place.equalsIgnoreCase("aceh besar")) {
            ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list, Aceh_besar);
            ListView listView = (ListView) findViewById(R.id.listView);
            listView.setAdapter(adapter);
        }
        else if (place.equalsIgnoreCase("")) {

        } else {
        }
        if (place.equalsIgnoreCase("")) {

        }
        else if (place.equalsIgnoreCase("")) {

        } else {
        }

    }

}
