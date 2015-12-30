package com.example.xuzhang.killer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "main_activity";
    private TextView killerTextView;
    private TextView policerTextView;
    private TextView villigerTextView;

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

        killerTextView = (TextView) findViewById(R.id.killerNum);
        policerTextView = (TextView) findViewById(R.id.policerNum);
        villigerTextView = (TextView) findViewById(R.id.villigerNum);
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
        addNum(villigerTextView);
    }

    public void handleMinusVillagerNum(View view) {
        minusNum(villigerTextView);
    }

    public void handleAddPolicerNum(View view) {
        addNum(policerTextView);
    }

    public void handleMinusPolicerNum(View view) {
        minusNum(policerTextView);
    }

    public void handleAddKillerNum(View view) {
        addNum(killerTextView);
    }

    public void handleMinusKillerNum(View view) {
        minusNum(killerTextView);
    }

    private void addNum(TextView view) {
        int villigerNum = Integer.parseInt(view.getText().toString());
        if(villigerNum < 8) {
            view.setText(String.valueOf(villigerNum + 1));
        }
    }

    private void minusNum(TextView view) {
        int villigerNum = Integer.parseInt(view.getText().toString());
        if(villigerNum > 0) {
            view.setText(String.valueOf(villigerNum - 1));
        }
    }
}
