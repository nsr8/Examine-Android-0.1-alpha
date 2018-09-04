package com.example.nasri.examine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_cvs;
        Button btn_respi;
        Button btn_abdomen;
        Button btn_cns;
        Button btn_pns;
        Button btn_ul;
        Button btn_ll;
        Button btn_neonate;
        Button btn_obs;
        Button btn_pv;
        Button btn_pr;
        Button btn_thyroid;
        Button btn_hernia;
        Button btn_lump;
        Button btn_breast;
        Button btn_knee;
        Button btn_about;



        btn_cvs = (Button)findViewById(R.id.btn_cvs);
        btn_respi=(Button)findViewById(R.id.btn_respi);
        btn_abdomen=(Button)findViewById(R.id.btn_abdomen);
        btn_cns=(Button)findViewById(R.id.btn_cns);
        btn_pns=(Button)findViewById(R.id.btn_pns);
        btn_ul=(Button)findViewById(R.id.btn_ul);
        btn_ll=(Button)findViewById(R.id.btn_ll);
        btn_neonate=(Button) findViewById(R.id.btn_neonate);
        btn_obs=(Button)findViewById(R.id.btn_obs);
        btn_pv=(Button)findViewById(R.id.btn_pv);
        btn_pr=(Button)findViewById(R.id.btn_pr);
        btn_thyroid=(Button)findViewById(R.id.btn_thyroid);
        btn_hernia=(Button)findViewById(R.id.btn_hernia);
        btn_lump=(Button)findViewById(R.id.btn_lump);
        btn_breast=(Button)findViewById(R.id.btn_breast);
        btn_knee=(Button)findViewById(R.id.btn_knee);
        btn_about=(Button)findViewById(R.id.btn_about);


        btn_cvs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(MainActivity.this,PatientDetails.class);
                intent1.putExtra("SYSTEM","the cardiovascular system");
                startActivity(intent1);

            }
        });
        btn_respi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(MainActivity.this, PatientDetails.class);
                intent1.putExtra("SYSTEM", "the respiratory system");
                startActivity(intent1);
            }
        });
        btn_abdomen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(MainActivity.this, PatientDetails.class);
                intent1.putExtra("SYSTEM", "the abdomen");
                startActivity(intent1);
            }
        });
        btn_cns.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(MainActivity.this, PatientDetails.class);
                intent1.putExtra("SYSTEM", "the cranial nerves");
                startActivity(intent1);
            }
        });
        btn_pns.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(MainActivity.this, PatientDetails.class);
                intent1.putExtra("SYSTEM", "the peripheral nervous system");
                startActivity(intent1);
            }
        });
        btn_ul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(MainActivity.this, PatientDetails.class);
                intent1.putExtra("SYSTEM", "the upper limbs");
                startActivity(intent1);
            }
        });
        btn_ll.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(MainActivity.this, PatientDetails.class);
                intent1.putExtra("SYSTEM", "the lower limbs");
                startActivity(intent1);
            }
        });
        btn_neonate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(MainActivity.this, PatientDetails.class);
                intent1.putExtra("SYSTEM", "the neonatal examination");
                startActivity(intent1);
            }
        });
        btn_obs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(MainActivity.this, PatientDetails.class);
                intent1.putExtra("SYSTEM", "a pregnant mother");
                startActivity(intent1);
            }
        });
        btn_pv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(MainActivity.this, PatientDetails.class);
                intent1.putExtra("SYSTEM", "per vaginal examination");
                startActivity(intent1);
            }
        });
        btn_pr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(MainActivity.this, PatientDetails.class);
                intent1.putExtra("SYSTEM", "per rectal examination");
                startActivity(intent1);
            }
        });
        btn_thyroid.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(MainActivity.this, PatientDetails.class);
                intent1.putExtra("SYSTEM", "a neck lump");
                startActivity(intent1);
            }
        });
        btn_hernia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(MainActivity.this, PatientDetails.class);
                intent1.putExtra("SYSTEM", "a lump at hernial orifice");
                startActivity(intent1);
            }
        });
        btn_breast.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(MainActivity.this, PatientDetails.class);
                intent1.putExtra("SYSTEM", "the breast");
                startActivity(intent1);
            }
        });
        btn_lump.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(MainActivity.this, PatientDetails.class);
                intent1.putExtra("SYSTEM", "a lump");
                startActivity(intent1);
            }
        });
        btn_knee.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(MainActivity.this, PatientDetails.class);
                intent1.putExtra("SYSTEM", "the knee joints");
                startActivity(intent1);
            }
        });
        btn_about.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(MainActivity.this, About.class);
                startActivity(intent1);
            }
        });
    }

}
