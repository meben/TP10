package com.mehdi.tp10;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	ListView lvlist;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		lvlist = (ListView)findViewById(R.id.listView1);
		String[]listeString = {"Java","Android",".Net","PHP"};
		
		lvlist.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listeString));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
