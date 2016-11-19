package com.example.portatil.taulaperiodica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.ClipData;
import android.graphics.drawable.Drawable;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.View.OnDragListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
public class ActivitatTercera extends Activity {

    //http://stackoverflow.com/questions/10441451/compare-imageview-objects comparar butons

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitat_tercera);

        //Bundle b = getIntent().getExtras();
        //Button btnatras = (Button) findViewById(R.id.button3); //butó per anar enrera



       /*if( comprovarID()==true   ){
           System.out.print("has guanyat");
       }
        btnatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle b = new Bundle();

                Intent intencio =new Intent(ActivitatTercera.this,ActivitatPrincipal.class);
                intencio.putExtras(b);
                startActivity(intencio);


              ImageView imageView0 = (ImageView) findViewById(R.id.myimage1);
                ImageView imageView1 = (ImageView) findViewById(R.id.myimage2);
            ImageView    imageView2 = (ImageView) findViewById(R.id.myimage3);

                imageView0.setTag(R.drawable.dk);
                imageView1.setTag(R.drawable.dh);
                imageView2.setTag(R.drawable.druid);

            }


        });
        */


        findViewById(R.id.myimage1).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.myimage2).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.myimage3).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.myimage4).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.myimage5).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.myimage6).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.myimage7).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.myimage8).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.topleft).setOnDragListener(new MyDragListener());
        findViewById(R.id.topright).setOnDragListener(new MyDragListener());
        findViewById(R.id.bottomleft).setOnDragListener(new MyDragListener());
        findViewById(R.id.bottomright).setOnDragListener(new MyDragListener());
        findViewById(R.id.linear1).setOnDragListener(new MyDragListener());
        findViewById(R.id.linear2).setOnDragListener(new MyDragListener());
        findViewById(R.id.linear3).setOnDragListener(new MyDragListener());
        findViewById(R.id.linear4).setOnDragListener(new MyDragListener());


    }

    private final boolean comprovarID(){
        final ImageView button01 = (ImageView) findViewById(R.id.myimage1);
        final ImageView button02 = (ImageView) findViewById(R.id.myimage2);

        button01.setImageResource(R.drawable.dk);
        button01.setTag(R.drawable.dh);
        button02.setImageResource(R.drawable.dh);
        button02.setTag(R.drawable.dh);
        if (button01.getTag().equals(button02.getTag())) {
            System.out.print("has guanyat");
            return true;
        }
        return false;
    }
    private final class MyTouchListener implements OnTouchListener {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                ClipData data = ClipData.newPlainText("", "");
                DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(
                        view);
                view.startDrag(data, shadowBuilder, view, 0);
                view.setVisibility(View.INVISIBLE);
                return true;
            } else {
                return false;
            }
        }
    }

    class MyDragListener implements OnDragListener {
        Drawable enterShape = getResources().getDrawable(
                R.drawable.cuadrados); //cuadrados es el xml drawable, el share
        Drawable normalShape = getResources().getDrawable(R.drawable.cuadrados);

        @Override
        public boolean onDrag(View v, DragEvent event) {
            int action = event.getAction();
            switch (event.getAction()) {
                case DragEvent.ACTION_DRAG_STARTED:
                    // do nothing
                    break;
                case DragEvent.ACTION_DRAG_ENTERED:
                    v.setBackgroundDrawable(enterShape);
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    v.setBackgroundDrawable(normalShape);
                    break;
                case DragEvent.ACTION_DROP:
                    // Dropped, reassign View to ViewGroup
                    View view = (View) event.getLocalState();
                    ViewGroup owner = (ViewGroup) view.getParent();
                    owner.removeView(view);
                    LinearLayout container = (LinearLayout) v;
                    container.addView(view);
                    view.setVisibility(View.VISIBLE);
                    break;
                case DragEvent.ACTION_DRAG_ENDED:
                    v.setBackgroundDrawable(normalShape);
                default:
                    break;
            }
            return true;
        }
    }



}
