package com.example.testlistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * 
 * 
 * @author Baoyz
 * 
 * @date 2014-6-20 ÏÂÎç6:28:08
 */
public class MainActivity extends Activity {

	ListView lv_list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		lv_list = (ListView) findViewById(R.id.lv_list);
		
		View header = View.inflate(this, R.layout.header, null);
		HeaderListView headerList = (HeaderListView) header.findViewById(R.id.lv_list);
		headerList.setMaxHeight(800);
		String[] headerArr = new String[20];
		for (int i = 0; i < headerArr.length; i++) {
			headerArr[i] = "header " + i;
		}
		headerList.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, android.R.id.text1, headerArr));
		
		lv_list.addHeaderView(header);
		
		String[] arr = new String[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = "test " + i;
		}
		lv_list.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, android.R.id.text1, arr));
	}

}
