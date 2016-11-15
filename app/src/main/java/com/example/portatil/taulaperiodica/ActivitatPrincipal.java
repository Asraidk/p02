package com.example.portatil.taulaperiodica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivitatPrincipal extends AppCompatActivity implements View.OnClickListener{



    //Clase para construir los botonos, es una clase generica que escucha que se ha
    //echo un click i luego pregunta quien es el responsable
    //implements View.OnClickListener

        @Override
        //Clase donde instanciamos los botones
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_activitat_principal);

            //instanciamos los 12 bottones con imagen
            ImageButton ibRouge = (ImageButton) findViewById(R.id.imageRouge);
            ibRouge.setOnClickListener(this);
            ImageButton ibDeathKnight = (ImageButton) findViewById(R.id.imageDeathKnight);
            ibDeathKnight.setOnClickListener(this);
            ImageButton ibDemonHunter = (ImageButton) findViewById(R.id.imageDemonHunter);
            ibDemonHunter.setOnClickListener(this);
            ImageButton ibDruid = (ImageButton) findViewById(R.id.imageDruid);
            ibDruid.setOnClickListener(this);
            ImageButton ibHunter = (ImageButton) findViewById(R.id.imageHunter);
            ibHunter.setOnClickListener(this);
            ImageButton ibMage = (ImageButton) findViewById(R.id.imageMage);
            ibMage.setOnClickListener(this);
            ImageButton ibMonk = (ImageButton) findViewById(R.id.imageMonk);
            ibMonk.setOnClickListener(this);
            ImageButton ibPaladin = (ImageButton) findViewById(R.id.imagePaladin);
            ibPaladin.setOnClickListener(this);
            ImageButton ibPriest = (ImageButton) findViewById(R.id.imagePriest);
            ibPriest.setOnClickListener(this);
            ImageButton ibShaman = (ImageButton) findViewById(R.id.imageShaman);
            ibShaman.setOnClickListener(this);
            ImageButton ibWarlock = (ImageButton) findViewById(R.id.imageWarlock);
            ibWarlock.setOnClickListener(this);
            ImageButton ibWarriror = (ImageButton) findViewById(R.id.imageWarrior);
            ibWarriror.setOnClickListener(this);
        }



        //Clase donde atraves de la id vemos quien ha llamado
        public void onClick(View v) {

            Bundle portadorInformacio = new Bundle();

            switch (v.getId()) {

                case R.id.imageRouge:
                    portadorInformacio.putString("claseTriada","picaro");
                    portadorInformacio.putString("rol","DPS");
                    portadorInformacio.putString("races","DPS");
                    portadorInformacio.putString("descripcio","DPS");
                    portadorInformacio.putString("link","http://www.google.com");
                    break;
                case R.id.imageDeathKnight:
                    portadorInformacio.putString("claseTriada","hola");

                    portadorInformacio.putString("rol","DPS");
                    portadorInformacio.putString("races","DPS");
                    portadorInformacio.putString("descripcio","DPS");
                    portadorInformacio.putString("link","DPS");
                    break;
                case R.id.imageDemonHunter:
                    portadorInformacio.putString("claseTriada","hola");
                    portadorInformacio.putString("rol","DPS");
                    portadorInformacio.putString("races","DPS");
                    portadorInformacio.putString("descripcio","DPS");
                    portadorInformacio.putString("link","DPS");
                    break;
                case R.id.imageDruid:
                    portadorInformacio.putString("claseTriada","hola");
                    portadorInformacio.putString("rol","DPS");
                    portadorInformacio.putString("races","DPS");
                    portadorInformacio.putString("descripcio","DPS");
                    portadorInformacio.putString("link","DPS");
                    break;
                case R.id.imageHunter:
                    portadorInformacio.putString("claseTriada","hola");
                    portadorInformacio.putString("rol","DPS");
                    portadorInformacio.putString("races","DPS");
                    portadorInformacio.putString("descripcio","DPS");
                    portadorInformacio.putString("link","DPS");
                    break;
                case R.id.imageMage:
                    portadorInformacio.putString("claseTriada","hola");
                    portadorInformacio.putString("rol","DPS");
                    portadorInformacio.putString("races","DPS");
                    portadorInformacio.putString("descripcio","DPS");
                    portadorInformacio.putString("link","DPS");
                    break;
                case R.id.imageMonk:
                    portadorInformacio.putString("claseTriada","hola");
                    portadorInformacio.putString("rol","DPS");
                    portadorInformacio.putString("races","DPS");
                    portadorInformacio.putString("descripcio","DPS");
                    portadorInformacio.putString("link","DPS");
                    break;
                case R.id.imagePaladin:
                    portadorInformacio.putString("claseTriada","hola");
                    portadorInformacio.putString("rol","DPS");
                    portadorInformacio.putString("races","DPS");
                    portadorInformacio.putString("descripcio","DPS");
                    portadorInformacio.putString("link","DPS");
                    break;
                case R.id.imagePriest:
                    portadorInformacio.putString("claseTriada","hola");
                    portadorInformacio.putString("rol","DPS");
                    portadorInformacio.putString("races","DPS");
                    portadorInformacio.putString("descripcio","DPS");
                    portadorInformacio.putString("link","DPS");
                    break;
                case R.id.imageShaman:
                    portadorInformacio.putString("claseTriada","hola");
                    portadorInformacio.putString("rol","DPS");
                    portadorInformacio.putString("races","DPS");
                    portadorInformacio.putString("descripcio","DPS");
                    portadorInformacio.putString("link","DPS");
                    break;
                case R.id.imageWarlock:
                    portadorInformacio.putString("claseTriada","hola");
                    portadorInformacio.putString("rol","DPS");
                    portadorInformacio.putString("races","DPS");
                    portadorInformacio.putString("descripcio","DPS");
                    portadorInformacio.putString("link","DPS");
                    break;
                case R.id.imageWarrior:
                    portadorInformacio.putString("claseTriada","hola");
                    portadorInformacio.putString("rol","DPS");
                    portadorInformacio.putString("races","DPS");
                    portadorInformacio.putString("descripcio","DPS");
                    portadorInformacio.putString("link","DPS");
                    break;
            }
            Intent enviament = new Intent (ActivitatPrincipal.this,ActivitatSecundaria.class);
            enviament.putExtras(portadorInformacio);
            startActivity(enviament);
        }

}
