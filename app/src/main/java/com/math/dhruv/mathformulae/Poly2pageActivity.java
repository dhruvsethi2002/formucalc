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



public class Poly2pageActivity extends Activity {

	private TextView textview1;
	private Button triangles;
	private Button square;
	private Button rect;
	private Button pgram;
	private Button pent;
	private Button rhomb;
	private Button regular;



	private Intent page_intent = new Intent();


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.poly2page);
		initialize();
		initializeLogic();
	}

	private void  initialize() {
		textview1 = (TextView) findViewById(R.id.textview1);
		triangles = (Button) findViewById(R.id.triangles);
		square = (Button) findViewById(R.id.square);
		rect = (Button) findViewById(R.id.rect);
		pgram = (Button) findViewById(R.id.pgram);
		pent = (Button) findViewById(R.id.pent);
		rhomb = (Button) findViewById(R.id.rhomb);
		regular = (Button) findViewById(R.id.regular);



		triangles.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _v) { 
				page_intent.setClass(getApplicationContext(), TrianglesActivity.class);
				startActivity(page_intent);
			}
		});
		square.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _v) { 
				page_intent.setClass(getApplicationContext(), SquareActivity.class);
				startActivity(page_intent);
			}
		});
		rect.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _v) { 
				page_intent.setClass(getApplicationContext(), RectangleActivity.class);
				startActivity(page_intent);
			}
		});
		pgram.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _v) { 
				page_intent.setClass(getApplicationContext(), PgramActivity.class);
				startActivity(page_intent);
			}
		});
		regular.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _v) { 
				page_intent.setClass(getApplicationContext(), RegularActivity.class);
				startActivity(page_intent);
			}
		});
		pent.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _v) { 
				page_intent.setClass(getApplicationContext(), PentagonActivity.class);
				startActivity(page_intent);
			}
		});
		rhomb.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _v) { 
				page_intent.setClass(getApplicationContext(), RhombusActivity.class);
				startActivity(page_intent);
			}
		});

	}

	private void  initializeLogic() {

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
