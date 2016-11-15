package com.example.portatil.taulaperiodica;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivitatSecundaria extends AppCompatActivity {

    TextView visualitzaClase,visualitzaRol,visualitzaRaza,visualitzaInfo,visualitzaLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitat_secundaria);

        final Bundle portadorInformacio = getIntent().getExtras();


        visualitzaClase=(TextView)findViewById(R.id.textClase);
        visualitzaRol=(TextView)findViewById(R.id.textRol);
        visualitzaRaza=(TextView)findViewById(R.id.textRaza);
        visualitzaInfo=(TextView)findViewById(R.id.textInfo);
        visualitzaLink=(TextView)findViewById(R.id.textLink);

        visualitzaClase.setText(portadorInformacio.getString("claseTriada"));
        visualitzaRol.setText(portadorInformacio.getString("rol"));
        visualitzaRaza.setText(portadorInformacio.getString("races"));
        visualitzaInfo.setText(portadorInformacio.getString("descripcio"));
        visualitzaLink.setText(portadorInformacio.getString("link"));

        visualitzaLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri url= Uri.parse(portadorInformacio.getString("link"));
                Intent intent = new Intent(Intent.ACTION_VIEW,url);
                startActivity(intent);
            }
        });
        /*

        visualitzaClase.setText(portadorInformacio.getString("claseEscollida"));
        visualitzaRol.setText(portadorInformacio.getString("rols"));
        visualitzaRaza.setText(portadorInformacio.getString("races"));
        visualitzaInfo.setText(portadorInformacio.getString("descripcio"));
        visualitzaLink.setText(portadorInformacio.getString("link"));*/
    }
}
