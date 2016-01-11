package com.example.xuzhang.killer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
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

        int killerNum = getIntent().getIntExtra("killerNum", 0);
        int policerNum = getIntent().getIntExtra("policerNum", 0);
        int villigerNum = getIntent().getIntExtra("villigerNum", 0);
        int judgeNum = getIntent().getIntExtra("judgeNum", 1);
        displayRolesState(killerNum, policerNum, villigerNum, judgeNum);
    }

    private void displayRolesState(int killerNum, int policerNum, int villigerNum, int judgeNum) {
        TextView killerView = (TextView) findViewById(R.id.killerNumTextView);
        TextView policerView = (TextView) findViewById(R.id.policerNumTextView);
        TextView villigerView = (TextView) findViewById(R.id.villigerNumTextView);
        TextView judgeView = (TextView) findViewById(R.id.judgeNumTextView);
        killerView.setText("杀手数量: " + killerNum);
        policerView.setText("警察数量: " + policerNum);
        judgeView.setText("法官数量: " + judgeNum);
        villigerView.setText("杀手数量: " + villigerNum);
    }
}
