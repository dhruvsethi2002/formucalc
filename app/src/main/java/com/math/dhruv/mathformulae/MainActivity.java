package com.math.dhruv.mathformulae;

import android.app.*;
import android.content.res.Configuration;
import android.os.*;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
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

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.*;
import java.text.*;




public class MainActivity extends Activity {

	private TextView textview1;
	private Button polygons;
	private Button trig;
	private Button fig3d;
	private Button sets;
	private Button algebra;
	private Button differential;
	private Button probability;
	private Button button1;
	private Button stat;

	private Intent page_intent = new Intent();
	private InterstitialAd mInterstitialAd;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		MobileAds.initialize(this, "ca-app-pub-7892936734712444~9081106036");
		mInterstitialAd = new InterstitialAd(this);
		mInterstitialAd.setAdUnitId("ca-app-pub-7892936734712444/8892693331");
		mInterstitialAd.loadAd(new AdRequest.Builder().build());
		initialize();
        initializeLogic();
		/*AdRequest request = new AdRequest.Builder()
				.addTestDevice("33BE2250B43518CCDA7DE426D04EE232")
				.build();*/

    }

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			MenuInflater inflater = getMenuInflater();
			inflater.inflate(R.menu.main, menu);
			return super.onCreateOptionsMenu(menu);
		}

        @Override
        protected void onStart() {
            super.onStart();
			mInterstitialAd.loadAd(new AdRequest.Builder().build());
			mInterstitialAd.setAdListener(new AdListener() {
				@Override public void onAdLoaded() {
					Log.d("TAG", "Dhruv: Interstitial event onAdLoaded");
					mInterstitialAd.show();
				}
			});
			/*
			if (mInterstitialAd.isLoaded()) {
                Log.d("TAG", "The interstitial was loaded on start");
                mInterstitialAd.show();
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet on start.");
            }
            */
        }


	private void  initialize() {
		textview1 = (TextView) findViewById(R.id.textview1);
		polygons = (Button) findViewById(R.id.polygons);
		trig = (Button) findViewById(R.id.trig);
		fig3d = (Button) findViewById(R.id.fig3d);
		sets = (Button) findViewById(R.id.sets);
		algebra = (Button) findViewById(R.id.algebra);
		differential = (Button) findViewById(R.id.differential);
		probability = (Button) findViewById(R.id.probability);
		button1 = (Button) findViewById(R.id.button1);
		stat = (Button) findViewById(R.id.stat);


		polygons.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _v) { 
				page_intent.setClass(getApplicationContext(), Poly2pageActivity.class);
				startActivity(page_intent);
				if (mInterstitialAd.isLoaded()) {
					Log.d("TAG", "The interstitial was loaded ");
					mInterstitialAd.show();
				} else {
					Log.d("TAG", "The interstitial wasn't loaded yet.");
				}
			}
		});
		trig.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _v) { 
				page_intent.setClass(getApplicationContext(), Trig2pageActivity.class);
				startActivity(page_intent);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
            }
		});
		fig3d.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _v) { 
				page_intent.setClass(getApplicationContext(), Fig3d2pageActivity.class);
				startActivity(page_intent);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
			}
		});
		sets.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _v) { 
				page_intent.setClass(getApplicationContext(), SetsActivity.class);
				startActivity(page_intent);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
			}
		});
		algebra.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _v) { 
				page_intent.setClass(getApplicationContext(), AlgebraActivity.class);
				startActivity(page_intent);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
			}
		});
		differential.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _v) { 
				page_intent.setClass(getApplicationContext(), DifferentialActivity.class);
				startActivity(page_intent);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
			}
		});
		probability.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _v) { 
				page_intent.setClass(getApplicationContext(), ProbabilityActivity.class);
				startActivity(page_intent);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
			}
		});
		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _v) { 
				page_intent.setClass(getApplicationContext(), Circ2pageActivity.class);
				startActivity(page_intent);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
			}
		});


		stat.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View _v) {
				page_intent.setClass(getApplicationContext(), Statistics.class);
				startActivity(page_intent);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
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
