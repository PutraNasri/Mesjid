package es.esy.kinketkuena.mesjid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class List extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }
    public void satu(View view){
        String name = "satu";
        Intent intent = new Intent(this, Maps_list.class);
        intent.putExtra("nama",name);
        startActivity(intent);
    }
    public void dua(View view){
        String name = "dua";
        Intent intent = new Intent(this, Maps_list.class);
        intent.putExtra("nama",name);
        startActivity(intent);
    }
    public void tiga(View view){
        String name = "tiga";
        Intent intent = new Intent(this, Maps_list.class);
        intent.putExtra("nama",name);
        startActivity(intent);
    }
    public void empat(View view){
        String name = "empat";
        Intent intent = new Intent(this, Maps_list.class);
        intent.putExtra("nama",name);
        startActivity(intent);
    }
    public void lima(View view){
        String name = "lima";
        Intent intent = new Intent(this, Maps_list.class);
        intent.putExtra("nama",name);
        startActivity(intent);
    }
    public void enam(View view){
        String name = "enam";
        Intent intent = new Intent(this, Maps_list.class);
        intent.putExtra("nama",name);
        startActivity(intent);
    }
}
