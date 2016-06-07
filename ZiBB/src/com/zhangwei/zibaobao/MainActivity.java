package com.zhangwei.zibaobao;


import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements TextWatcher, OnClickListener {
	EditText search_ed;
	TextView result_tv;
	Button clear_btn;
	
	public static List<ZiBBUnit> globeZBBs;
	static {
		globeZBBs = new ArrayList<ZiBBUnit>();
		globeZBBs.add(new ZiBBUnit("爸爸", "好", 1));
		globeZBBs.add(new ZiBBUnit("桌子", "洗碗", 4));
		globeZBBs.add(new ZiBBUnit("爷爷", "笑", 2));
		
	}
	
	
	private String searchZBB(String input){
		if(globeZBBs.size()>0){
			StringBuilder sb = new StringBuilder();
			boolean hasResult = false;
			for(ZiBBUnit unit : globeZBBs){
				String re = unit.search(input);
				if(re!=null){
					sb.append(re);
					sb.append("\n");
					hasResult = true;
				}
			}
			if(hasResult){
				return sb.toString();
			}else{
				return "没有找到 ‘" + input + "’ 相关";
			}
		}else{
			return "字宝宝集合为空";
		}
	}


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		search_ed = (EditText) findViewById(R.id.search_ed);
		result_tv = (TextView) findViewById(R.id.relust_tv);
		clear_btn = (Button) findViewById(R.id.clear_btn);
		
		search_ed.addTextChangedListener(this);
		clear_btn.setOnClickListener(this);
		result_tv.setText(R.string.inputplease);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void beforeTextChanged(CharSequence s, int start, int count,
			int after) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTextChanged(CharSequence s, int start, int before, int count) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterTextChanged(Editable s) {
		// TODO Auto-generated method stub
		String word = s.toString();
		if(word.equals("")){
			result_tv.setText(R.string.inputplease);
		}else{
			String result = searchZBB(word);
			result_tv.setText(result);
		}

		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		search_ed.getEditableText().clear();
		result_tv.setText(R.string.inputplease);
	}
}
