package com.example.niharinfo.circlelayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {
    private char mState = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CircleLayout pie = (CircleLayout)findViewById(R.id.pie);
        View red=(View)findViewById(R.id.red);
        View green=(View)findViewById(R.id.green);
        View blue=(View)findViewById(R.id.blue);
        View yellow=(View)findViewById(R.id.yellow);
        View pink=(View)findViewById(R.id.pink);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"red",Toast.LENGTH_SHORT).show();

            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"green",Toast.LENGTH_SHORT).show();

            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"blue",Toast.LENGTH_SHORT).show();

            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"yellow",Toast.LENGTH_SHORT).show();

            }
        });
        pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"pink",Toast.LENGTH_SHORT).show();

            }
        });
       // final View normal = findViewById(R.id.normal);
       // final View normalWithRange = findViewById(R.id.normalWithRange);

//pie.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View view) {
//        Toast.makeText(getApplicationContext(),"hi",Toast.LENGTH_SHORT).show();
//    }
//});
//        final Button switchBtn = (Button) findViewById(R.id.switchBtn);
//        switchBtn.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                switch (mState) {
//                    case 0:
//                       // normalWithRange.setVisibility(View.GONE);
//                        pie.setVisibility(View.GONE);
//                        //normal.setVisibility(View.VISIBLE);
//
//                        switchBtn.setText("normalWidthRange");
//                        mState ++;
//                        break;
//                    case 1:
//                       // normalWithRange.setVisibility(View.VISIBLE);
//                        pie.setVisibility(View.GONE);
//                        //normal.setVisibility(View.GONE);
//
//                        switchBtn.setText("pie");
//                        mState++;
//                        break;
//                    case 2:
//                      //  normalWithRange.setVisibility(View.GONE);
//                        pie.setVisibility(View.VISIBLE);
//                       // normal.setVisibility(View.GONE);
//
//
//                        switchBtn.setText("normal");
//                        mState = 0;
//                        break;
//
//                    default:
//                        break;
//                }
//            }
//        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
