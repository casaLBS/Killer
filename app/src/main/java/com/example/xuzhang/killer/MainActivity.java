package com.example.xuzhang.killer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "main_activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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

    public void handleAddVillagerNum(View view) {
        TextView villigerTextView = (TextView) findViewById(R.id.villigerNum);
        int villigerNum = Integer.parseInt(villigerTextView.getText().toString());
        if(villigerNum < 8) {
            villigerTextView.setText(String.valueOf(villigerNum + 1));
        }

    }

    public void handleMinusVillagerNum(View view) {
        TextView villigerTextView = (TextView) findViewById(R.id.villigerNum);
        int villigerNum = Integer.parseInt(villigerTextView.getText().toString());
        if(villigerNum > 0) {
            villigerTextView.setText(String.valueOf(villigerNum - 1));
        }
    }

    public void handleMinusPolicerNum(View view) {
        TextView policerTextView = (TextView) findViewById(R.id.policerNum);
        int villigerNum = Integer.parseInt(policerTextView.getText().toString());
        if(villigerNum > 0) {
            policerTextView.setText(String.valueOf(villigerNum - 1));
        }
    }

    public void handleAddPolicerNum(View view) {
        TextView policerTextView = (TextView) findViewById(R.id.policerNum);
        int villigerNum = Integer.parseInt(policerTextView.getText().toString());
        if(villigerNum < 8) {
            policerTextView.setText(String.valueOf(villigerNum + 1));
        }
    }

    public void handleMinusKillerNum(View view) {
        TextView killerTextView = (TextView) findViewById(R.id.killerNum);
        int villigerNum = Integer.parseInt(killerTextView.getText().toString());
        if(villigerNum > 0) {
            killerTextView.setText(String.valueOf(villigerNum - 1));
        }
    }

    public void handleAddKillerNum(View view) {
        TextView killerTextView = (TextView) findViewById(R.id.killerNum);
        int villigerNum = Integer.parseInt(killerTextView.getText().toString());
        if(villigerNum < 8) {
            killerTextView.setText(String.valueOf(villigerNum + 1));
        }
    }
}
