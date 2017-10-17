package com.example.fcm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

		TextView txt = findViewById(R.id.textView);

		Bundle bundle = getIntent().getExtras();
		if (bundle != null) {
			for (String key : bundle.keySet()) {
				Object value = bundle.get(key);
				txt.append(key + ": " + value + "\n\n");
			}
		}
	}
}