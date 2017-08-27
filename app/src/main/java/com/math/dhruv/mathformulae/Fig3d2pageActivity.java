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



public class Fig3d2pageActivity extends Activity {

	private TextView textview1;
	private Button cube;
	private Button cuboid;
	private Button sphere;
	private Button cone;
	private Button cylinder;
	private Button pyramids;



	private Intent page_intent = new Intent();


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fig3d2page);
		initialize();
		initializeLogic();
	}

	private void  initialize() {
		textview1 = (TextView) findViewById(R.id.textview1);
		cube = (Button) findViewById(R.id.cube);
		cuboid = (Button) findViewById(R.id.cuboid);
		sphere = (Button) findViewById(R.id.sphere);
		cone = (Button) findViewById(R.id.cone);
		cylinder = (Button) findViewById(R.id.cylinder);
		pyramids = (Button) findViewById(R.id.pyramids);



		sphere.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _v) { 
				page_intent.setClass(getApplicationContext(), SphereActivity.class);
				startActivity(page_intent);
			}
		});
		cone.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _v) { 
				page_intent.setClass(getApplicationContext(), ConeActivity.class);
				startActivity(page_intent);
			}
		});
		cylinder.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _v) { 
				page_intent.setClass(getApplicationContext(), CylinderActivity.class);
				startActivity(page_intent);
			}
		});
		pyramids.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _v) { 
				page_intent.setClass(getApplicationContext(), PyramidActivity.class);
				startActivity(page_intent);
			}
		});
		cube.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _v) { 
				page_intent.setClass(getApplicationContext(), CubeActivity.class);
				startActivity(page_intent);
			}
		});
		cuboid.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _v) { 
				page_intent.setClass(getApplicationContext(), CuboidActivity.class);
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
