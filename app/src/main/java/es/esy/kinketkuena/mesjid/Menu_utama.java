package es.esy.kinketkuena.mesjid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu_utama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
    }
    public void maps(View view){
        Intent intent = new Intent(this, Maps.class);
        startActivity(intent);
    }
    public void list(View view){
        Intent intent = new Intent(this, List.class);
        startActivity(intent);
    }

}
