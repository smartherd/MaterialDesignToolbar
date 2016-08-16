package com.smartherdannie.mymaterialdesigntoolbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by Annie on 22-03-2016.
 */
public class  ActionBarToolbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        getSupportActionBar().setTitle("Action Bar Toolbar !");
        mToolbar.setSubtitle("by Smartherd !");
    }


        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {

            String msg = "";

            switch (item.getItemId()) {

                case R.id.save:
                    msg = getString(R.string.save);
                    break;

                case R.id.mail:
                    msg = getString(R.string.mail);
                    break;

                case R.id.camera:
                    msg = getString(R.string.camera);
                    break;

                case R.id.settings:
                    msg = getString(R.string.settings);
                    break;

                case R.id.web_search:
                    msg = getString(R.string.web_search);
                    break;

                case R.id.help:
                    msg = getString(R.string.help);
                    break;
            }

            Toast.makeText(this, msg + " clicked !", Toast.LENGTH_SHORT).show();

            return super.onOptionsItemSelected(item);
        }

    }

