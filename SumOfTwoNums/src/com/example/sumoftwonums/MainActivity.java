package com.example.sumoftwonums;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText et1, et2;
	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		et1 = (EditText)findViewById(R.id.no1);
		et2 = (EditText)findViewById(R.id.no2);
		tv = (TextView)findViewById(R.id.calcsum);
	}
	public void sum(View v){
		int a = Integer.parseInt(et1.getText().toString());
		int b = Integer.parseInt(et2.getText().toString());
		int s = a+b;
		tv.setText("Result="+s);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
