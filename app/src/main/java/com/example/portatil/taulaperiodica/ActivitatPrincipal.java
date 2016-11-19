package com.example.portatil.taulaperiodica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ActivitatPrincipal extends AppCompatActivity implements View.OnClickListener{

//http://www.vogella.com/tutorials/AndroidDragAndDrop/article.html

    boolean bandera=false;
    boolean informacio=false;

    //Clase para construir los botonos, es una clase generica que escucha que se ha
    //echo un click i luego pregunta quien es el responsable
    //implements View.OnClickListener

        @Override
        //Clase donde instanciamos los botones
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_activitat_principal);

            //buto canviar pantalla
            Button btncanvi = (Button) findViewById(R.id.button2);
            btncanvi.setOnClickListener(this);
            //buto inici joc preguntas
            Button jocPreguntes=(Button) findViewById(R.id.button3);
            jocPreguntes.setOnClickListener(this);

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
                    portadorInformacio.putString("claseTriada","Picaro");
                    portadorInformacio.putString("rol","DPS");
                    portadorInformacio.putString("races","Elfo de la noche,Humano,Huergen,Gnomo,Enano,Pandaren");
                    portadorInformacio.putString("descripcio","Orco,No-Muerto,Pandaren,Elfo de sangre,Troll,Goblin");
                    portadorInformacio.putString("link","https://worldofwarcraft.com/es-es/");
                    informacio=true;
                    break;
                case R.id.imageDeathKnight:
                    portadorInformacio.putString("claseTriada","Caballero de la muerte");
                    portadorInformacio.putString("rol","DPS,Tank");
                    portadorInformacio.putString("races","Elfo de la noche,Humano,Huergen,Gnomo,Enano,Draenei");
                    portadorInformacio.putString("descripcio","Orco,No-Muerto,Tauren,Elfo de sangre,Troll,Goblin");
                    portadorInformacio.putString("link","https://worldofwarcraft.com/es-es/");
                    informacio=true;
                    break;
                case R.id.imageDemonHunter:
                    portadorInformacio.putString("claseTriada","Cazador de demonios");
                    portadorInformacio.putString("rol","DPS,Tank");
                    portadorInformacio.putString("races","Elfo de la noche");
                    portadorInformacio.putString("descripcio","Elfo de la sangre");
                    portadorInformacio.putString("link","https://worldofwarcraft.com/es-es/");
                    informacio=true;
                    break;
                case R.id.imageDruid:
                    portadorInformacio.putString("claseTriada","Druida");
                    portadorInformacio.putString("rol","DPS,Tank,Heal");
                    portadorInformacio.putString("races","Elfo de la noche,Huergen");
                    portadorInformacio.putString("descripcio","Tauren,Troll");
                    portadorInformacio.putString("link","https://worldofwarcraft.com/es-es/");
                    informacio=true;
                    break;
                case R.id.imageHunter:
                    portadorInformacio.putString("claseTriada","Cazador");
                    portadorInformacio.putString("rol","DPS");
                    portadorInformacio.putString("races","Enano,Gnomo,Humano,Elfo de la noche,Pandaren,Draenei,Huargen");
                    portadorInformacio.putString("descripcio","Orco,No-Muerto,Tauren,Troll,Pandaren,Elfo de sangre,Goblin");
                    portadorInformacio.putString("link","https://worldofwarcraft.com/es-es/");
                    informacio=true;
                    break;
                case R.id.imageMage:
                    portadorInformacio.putString("claseTriada","Mago");
                    portadorInformacio.putString("rol","DPS");
                    portadorInformacio.putString("races","Humano,Enano,Gnomo,Draenei,Huargen,Elfo de la noche,Pandaren");
                    portadorInformacio.putString("descripcio","Pandaren,Goblin,Orco,No-Muerto,Troll,Elfo de sangre");
                    portadorInformacio.putString("link","https://worldofwarcraft.com/es-es/");
                    informacio=true;
                    break;
                case R.id.imageMonk:
                    portadorInformacio.putString("claseTriada","Monje");
                    portadorInformacio.putString("rol","Dps,Tank,Heal");
                    portadorInformacio.putString("races","Enano,Gnomo,Humano,Elfo de la noche,Pandaren,Draenei,Huargen");
                    portadorInformacio.putString("descripcio","Orco,No-Muerto,Tauren,Troll,Pandaren,Elfo de sangre,Goblin");
                    portadorInformacio.putString("link","https://worldofwarcraft.com/es-es/");
                    informacio=true;
                    break;
                case R.id.imagePaladin:
                    portadorInformacio.putString("claseTriada","Paladin");
                    portadorInformacio.putString("rol","DPS,Heal,Tank");
                    portadorInformacio.putString("races","Humano,Draenei,Enano");
                    portadorInformacio.putString("descripcio","Tauren,Elfo de sangre");
                    portadorInformacio.putString("link","https://worldofwarcraft.com/es-es/");
                    informacio=true;
                    break;
                case R.id.imagePriest:
                    portadorInformacio.putString("claseTriada","Sacerdote");
                    portadorInformacio.putString("rol","DPS,Heal");
                    portadorInformacio.putString("races","Draenei,Humano,Gnomo,Enano,Elfo de la noche,Pandaren,Huargen");
                    portadorInformacio.putString("descripcio","Tauren,Troll,Elfo de sangre,Pandaren,No-Muerto,Goblin");
                    portadorInformacio.putString("link","https://worldofwarcraft.com/es-es/");
                    informacio=true;
                    break;
                case R.id.imageShaman:
                    portadorInformacio.putString("claseTriada","Chaman");
                    portadorInformacio.putString("rol","Heal,DPS");
                    portadorInformacio.putString("races","Draenei,Pandaren,Enano");
                    portadorInformacio.putString("descripcio","Orco,Tauren,Troll,Pandaren");
                    portadorInformacio.putString("link","https://worldofwarcraft.com/es-es/");
                    informacio=true;
                    break;
                case R.id.imageWarlock:
                    portadorInformacio.putString("claseTriada","Brujo");
                    portadorInformacio.putString("rol","DPS");
                    portadorInformacio.putString("races","Gnomo,Enano,Humano,Huargen");
                    portadorInformacio.putString("descripcio","Oroc,No-Muerto,Troll,Goblin,Elfo de sangre");
                    portadorInformacio.putString("link","https://worldofwarcraft.com/es-es/");
                    informacio=true;
                    break;
                case R.id.imageWarrior:
                    portadorInformacio.putString("claseTriada","Guerrero");
                    portadorInformacio.putString("rol","DPS,Tank");
                    portadorInformacio.putString("races","Humano,Enano,Elfo de la noche,Gnomo,Draenei,Huargen,Pandaren");
                    portadorInformacio.putString("descripcio","Orco,No-Muerto,Tauren,Troll,Elfo de sangre,Goblin,Pandaren");
                    portadorInformacio.putString("link","https://worldofwarcraft.com/es-es/");
                    informacio=true;
                    break;
                case R.id.button2:
                    informacio=false;
                    Intent intencio =new Intent(ActivitatPrincipal.this,ActivitatTercera.class);
                    intencio.putExtras(portadorInformacio);
                    startActivity(intencio);
                    break;
                case R.id.button3:
                    bandera=true;
                    break;


            }
            if(informacio==true){
            Intent enviament = new Intent (ActivitatPrincipal.this,ActivitatSecundaria.class);
            enviament.putExtras(portadorInformacio);
            startActivity(enviament);}
        }

}
