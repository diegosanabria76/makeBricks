package com.example.diegosanabriabecerra.codingbatdoubling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView edit;
        edit = (TextView) findViewById(R.id.textView);
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

int num = doubling(2,3);


        boolean bricks = makeBricks(3,1,9);
        edit.append("respuesta bricks : " + bricks);

    }

       public int doubling(int a, int b)
       {
           return 2*(a+b);

       }
    public boolean makeBricks(int small, int big, int goal) {

        int maxBig = goal/5;
        if(maxBig <= big)
            goal -= maxBig*5;
        else
            goal -= big*5;
        if(goal <= small)
            return true;
        return false;


    }



}
