package com.math.dhruv.mathformulae;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.ClipboardManager;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;

import java.util.*;
import java.text.*;

public class CalActivity extends Activity {

    Button b1,bp,be,b2,b3,b4,b5,b6,b7,b8,b9,b0,bs,bpr,bpd;
    Integer fn = 0, sn=0, ans;
    String op = "";
    String num ="";
    EditText tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cal);
        tv = (EditText) findViewById(R.id.ansUI);

        b1 = (Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                num = num + "1";
            }
        });
        b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                num = num + "2";
            }
        });
        b3 = (Button)findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                num = num + "3";
            }
        });
        b4 = (Button)findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                num = num + "4";
            }
        });
        b5 = (Button)findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                num = num + "5";
            }
        });
        b6 = (Button)findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                num = num + "6";
            }
        });
        b7 = (Button)findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                num = num + "7";
            }
        });
        b8 = (Button)findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                num = num + "8";
            }
        });
        b9 = (Button)findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                num = num + "9";
            }
        });
        b0 = (Button)findViewById(R.id.button10);
        b0.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                num = num + "0";
            }
        });


        bp = (Button)findViewById(R.id.buttonp);
        bp.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                op = "+";
                fn = Integer.parseInt(num);
                num="";
                System.out.println("First Num: " + fn);
            }
        });
        bs = (Button)findViewById(R.id.buttons);
        bs.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                op = "-";
                fn = Integer.parseInt(num);
                num="";
                System.out.println("First Num: " + fn);
            }
        });
        bpr = (Button)findViewById(R.id.buttonpr);
        bpr.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                op = "*";
                fn = Integer.parseInt(num);
                num="";
                System.out.println("First Num: " + fn);
            }
        });
        bpd = (Button)findViewById(R.id.buttond);
        bpd.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                op = "/";
                fn = Integer.parseInt(num);
                num="";
                System.out.println("First Num: " + fn);
            }
        });
        be = (Button)findViewById(R.id.buttone);
        be.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                sn = Integer.parseInt(num);
                num="";
                System.out.println("2nd Num: " + fn);
                switch(op) {
                    case "+": ans = fn+sn; break;
                    case "-": ans = fn-sn; break;
                    case "*": ans = fn*sn; break;
                    case "/": ans = fn/sn; break;
                    default: tv.setText("Invalid operator"); break;
                }
                tv.setText(Integer.toString(ans));
            }
        });
    }
    // created automatically
    private void showMessage(String _s) {
        Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
    }

    private int getRandom(int _minValue ,int _maxValue){
        Random random = new Random();
        return random.nextInt(_maxValue - _minValue + 1) + _minValue;
    }

    public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
        ArrayList<Double> _result = new ArrayList<Double>();
        SparseBooleanArray _arr = _list.getCheckedItemPositions();
        for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
            if (_arr.valueAt(_iIdx))
                _result.add((double)_arr.keyAt(_iIdx));
        }
        return _result;
    }

}
