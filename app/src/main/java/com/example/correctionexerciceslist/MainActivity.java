package com.example.correctionexerciceslist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Pays> list_pays = new ArrayList<>();
    Spinner sp;
    ImageView im;
    TextView t1, t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_pays.add(new Pays("Argentine","Buenos aeres","Amerique",766786,R.drawable.ar));
        list_pays.add(new Pays("Maroc","Rabat","Afrique",215454,R.drawable.ma));
        list_pays.add(new Pays("Bresil","Rio","Amerique",23434,R.drawable.br));
        list_pays.add(new Pays("Alemagne","Berlin","Europe",909090,R.drawable.de));
        list_pays.add(new Pays("Espagne","Madrid","Europe",21212,R.drawable.es));

        sp = findViewById(R.id.sp);
        im = findViewById(R.id.img);
        t1 = findViewById(R.id.tcapitale);
        t2 = findViewById(R.id.tcontinent);
        t3 = findViewById(R.id.tpopulation);

        ArrayList<String> nomspays = new ArrayList<>();
        for(Pays p : list_pays)
            nomspays.add(p.getNom());

        ArrayAdapter<String> ad = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,nomspays);
        sp.setAdapter(ad);

    }
}