package com.example.fcm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {
	private static final String TAG = "SecondActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

		Bundle bundle = getIntent().getExtras();

		if (bundle != null) {
			for (String key : bundle.keySet()) {
				Object value = bundle.get(key);
				Log.d(TAG, "Key: " + key + " Value: " + value.toString());
			}
		}
	}
}
