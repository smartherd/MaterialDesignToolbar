package com.smartherdannie.mymaterialdesigntoolbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by Annie on 22-03-2016.
 */
public class   StandaloneToolbar extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

       Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("Standalone Toolbar !");
        mToolbar.setSubtitle("by Smartherd !");
        //mToolbar.setNavigationIcon(R.drawable.navigation_back);


        // Compatibility by JAVA

        //if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
          //  mToolbar.setElevation(10f);}

        mToolbar.inflateMenu(R.menu.menu_main);
        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                String title = (String) item.getTitle();
                Toast.makeText(StandaloneToolbar.this, title + " Selected !", Toast.LENGTH_SHORT).show();

                switch (item.getItemId()) {

                    case R.id.save:
                        // Perform the individual Menu Actions.
                        break;

                    case R.id.mail:
                        // Perform some Actions.
                        break;

                }

                // Similarly you can write CASES for other menu items as well.


                return true;
            }
        });


    }
}


