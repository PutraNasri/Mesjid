package es.esy.kinketkuena.mesjid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class list_pillih extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pillih);
    }
    public void banda(View view){
        String name = "banda";
        Intent intent = new Intent(this, List.class);
        intent.putExtra("nama",name);
        startActivity(intent);
    }
    public void pidie(View view){

        String name = "pidie";
        Intent intent = new Intent(this, List.class);
        intent.putExtra("nama",name);
        startActivity(intent);
    }
    public void acehbesar(View view){

        String name = "aceh besar";
        Intent intent = new Intent(this, List.class);
        intent.putExtra("nama",name);
        startActivity(intent);
    }
}
