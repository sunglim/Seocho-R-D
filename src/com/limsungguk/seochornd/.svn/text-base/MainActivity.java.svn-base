package com.limsungguk.seochornd;

import java.util.Date;

import com.limsungguk.seochornd.R;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {
	private TabHost tabHost;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab);
		
		this.tabHost = getTabHost();
		
		setTabHost();
		
		selectInitialTab();
	}

	private void selectInitialTab(){
		Date currentTime = new Date();
		if(currentTime.getHours() > 10){
			tabHost.setCurrentTab(1);
		}
	}
	
	private void setTabHost(){	
		// for making Activity start, I need to use Intent 
		TabSpec firstTabSpec = tabHost.newTabSpec("Tab1").setIndicator("√‚±Ÿ").setContent(new Intent(this,FirstTab.class));
		TabSpec secondTabSpec = tabHost.newTabSpec("Tab2").setIndicator("≈±Ÿ").setContent(new Intent(this,SecondTab.class));
		TabSpec thirdTabSpec = tabHost.newTabSpec("Tab3").setIndicator("∆Ú≈√º≈∆≤").setContent(new Intent(this,ThirdTab.class));
	
		tabHost.addTab(firstTabSpec);
		tabHost.addTab(secondTabSpec);
		tabHost.addTab(thirdTabSpec);
	}

	@Override
	public void onRestoreInstanceState(Bundle savedInstanceState){
		super.onRestoreInstanceState(savedInstanceState);
		
		int myint = savedInstanceState.getInt("current_tab");
		tabHost.setCurrentTab(myint);
	}
	
	@Override
	public void onSaveInstanceState(Bundle savedInstanceState){
		savedInstanceState.putInt("current_tab",tabHost.getCurrentTab());
		
		super.onSaveInstanceState(savedInstanceState);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}
}
