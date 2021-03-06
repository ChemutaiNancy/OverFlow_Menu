package com.example.overflowmenu;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        RelativeLayout main_view = findViewById(R.id.main_view);

        switch (item.getItemId()){
            case R.id.menu_red:
                if (item.isChecked()){
                    item.setChecked(false);
                } else{
                    item.setChecked(true);
                    main_view.setBackgroundColor(Color.RED);
                    return true;
                }
        }

        switch (item.getItemId()){
            case R.id.menu_blue:
                if (item.isChecked()){
                    item.setChecked(false);
                } else{
                    item.setChecked(true);
                    main_view.setBackgroundColor(Color.BLUE);
                    return true;
                }
        }

        switch (item.getItemId()){
            case R.id.menu_green:
                if (item.isChecked()){
                    item.setChecked(false);
                } else{
                    item.setChecked(true);
                    main_view.setBackgroundColor(Color.GREEN);
                    return true;
                }
        }
        switch (item.getItemId()){
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
