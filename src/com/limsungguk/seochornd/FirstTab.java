package com.limsungguk.seochornd;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class FirstTab extends TabActivity {

	private MyAdapter myAdapet;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		SharedPreferences pref = getSharedPreferences("OptionLocation", 0);
		int optionInit = pref.getInt("OptionInit2", 0);
		changedOptionIdx = optionInit;
		oldOptionIdx = optionInit;
		
		if(optionInit == OPTION_YANGJAE || optionInit == 0){
			initOptionOneList();
			((TextView)findViewById(R.id.txtViewTitle)).setText("양재역 셔틀");
		}else if(optionInit == OPTION_SADANG){
			initOptionTwoList();
			((TextView)findViewById(R.id.txtViewTitle)).setText("사당역 셔틀");
		}else{
			((TextView)findViewById(R.id.txtViewTitle)).setText("개발중");
		}
		
		selectIntialRow();
	}

	@Override
	protected void onPause() {
		super.onPause();
		
		if(IsOptionChanged()){
			SharedPreferences pref = getSharedPreferences("OptionLocation", 0);
			SharedPreferences.Editor edit = pref.edit();
			
			edit.putInt("OptionInit2", changedOptionIdx);
			edit.commit();
		}
	}
	
	private boolean IsOptionChanged(){
		return (changedOptionIdx == oldOptionIdx);
	}
	
	@Override
	protected void initOptionOneList() {
		initList();
	}

	@Override
	protected void initOptionTwoList() {
		initSadangList();
	}

	@Override
	protected void initOptionThreeList() {
		initSadangList();
	}
	
	private void initSadangList(){
		list = new ArrayList<HashMap<String, Object>>();
		
		HashMap<String, Object> data;
		
		data = new HashMap<String, Object>();
		data.put("title", "7 : 20 AM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011,8,29,7,20));
		data.put("destination", "사당");
		list.add(data);
		
		data = new HashMap<String, Object>();
		data.put("title", "7 : 30 AM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011,8,29,7,30));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "7 : 40 AM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011,8,29,7,40));
		data.put("destination", "사당");
		list.add(data);
		
		data = new HashMap<String, Object>();
		data.put("title", "7 : 50 AM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011,8,29,7,50));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "8 : 00 AM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011,8,29,8,0));
		data.put("destination", "사당");
		list.add(data);
		
		data = new HashMap<String, Object>();
		data.put("title", "8 : 07 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011,8,29,8,7));
		data.put("destination", "사당");
		list.add(data);
		
		data = new HashMap<String, Object>();
		data.put("title", "8 : 10 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011,8,29,8,10));
		data.put("destination", "사당");
		list.add(data);
		
		data = new HashMap<String, Object>();
		data.put("title", "8 : 15 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011,8,29,8,15));
		data.put("destination", "사당");
		list.add(data);
		
		data = new HashMap<String, Object>();
		data.put("title", "8 : 19 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011,8,29,8,19));
		data.put("destination", "사당");
		list.add(data);
		
		data = new HashMap<String, Object>();
		data.put("title", "8 : 22 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011,8,29,8,22));
		data.put("destination", "사당");
		list.add(data);
		
		data = new HashMap<String, Object>();
		data.put("title", "8 : 25 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011,8,29,8,25));
		data.put("destination", "사당");
		list.add(data);
		
		data = new HashMap<String, Object>();
		data.put("title", "8 : 26 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011,8,29,8,26));
		data.put("destination", "사당");
		list.add(data);
			
		myAdapet = new MyAdapter(this, list);
		lstSchedule.setAdapter(myAdapet);
	}
	
	private void initList() {
		list = new ArrayList<HashMap<String, Object>>();
		HashMap<String, Object> testA = new HashMap<String, Object>();
		HashMap<String, Object> testB = new HashMap<String, Object>();
		HashMap<String, Object> dataA = new HashMap<String, Object>();
		HashMap<String, Object> dataB = new HashMap<String, Object>();
		HashMap<String, Object> dataC = new HashMap<String, Object>();
		HashMap<String, Object> dataD = new HashMap<String, Object>();
		HashMap<String, Object> dataE = new HashMap<String, Object>();
		HashMap<String, Object> dataF = new HashMap<String, Object>();
		HashMap<String, Object> dataG = new HashMap<String, Object>();
		HashMap<String, Object> dataH = new HashMap<String, Object>();
		HashMap<String, Object> dataI = new HashMap<String, Object>();
		HashMap<String, Object> dataJ = new HashMap<String, Object>();
		HashMap<String, Object> dataK = new HashMap<String, Object>();
		
		testA.put("title", "7 : 30 AM");
		testA.put("current", 0);
		testA.put("deadtime", new Date(2021,1,29,0,10));
		testA.put("destination", "양재");
		
		//list.add(testA);
		
		testB.put("title", "7 : 30 AM");
		testB.put("current", 0);
		testB.put("deadtime", new Date(2021,1,29,0,20));
		testA.put("destination", "양재");
		//list.add(testB);
		
		dataA.put("title", "7 : 30 AM");
		dataA.put("current", 0);
		dataA.put("deadtime", new Date(2021,1,29,7,30));
		dataA.put("destination", "양재");
		list.add(dataA);
		
		dataB.put("title", "7 : 40 AM");
		dataB.put("current", 0);
		dataB.put("deadtime", new Date(2021,1,29,7,40));
		dataB.put("destination", "양재");
		list.add(dataB);

		dataC.put("title", "7 : 50 AM");
		dataC.put("current", 0);
		dataC.put("deadtime", new Date(2021,1,29,7,50));
		dataC.put("destination", "양재");
		list.add(dataC);

		dataD.put("title", "8 : 00 AM");
		dataD.put("current", 0);
		dataD.put("deadtime", new Date(2011,1,29,8,00));
		dataD.put("destination", "양재");
		list.add(dataD);
		
		dataE.put("title", "8 : 10 AM");
		dataE.put("current", 0);
		dataE.put("deadtime", new Date(2011,8,29,8,10));
		dataE.put("destination", "양재");
		list.add(dataE);

		dataF.put("title", "8 : 20 AM");
		dataF.put("current", 0);
		dataF.put("deadtime", new Date(2011,8,29,8,20));
		dataF.put("destination", "양재");
		list.add(dataF);
		
		dataG.put("title", "8 : 30 AM");
		dataG.put("current", 0);
		dataG.put("deadtime", new Date(2011,8,29,8,30));
		dataG.put("destination", "양재");
		list.add(dataG);
/*
		dataH.put("title", "하2-brand");
		dataH.put("current", 0);
		dataH.put("deadtime", new Date(2011,8,29,8,40));
		dataH.put("destination", "양재");
		list.add(dataH);
	*/	
		dataI.put("title", "11-7 버스");
		dataI.put("current", 0);
		dataI.put("deadtime", new Date(2011,8,29,8,40));
		dataI.put("destination", "양재역7번");
		list.add(dataI);
		
		dataJ.put("title", "3000 광역버스");
		dataJ.put("current", 0);
		dataJ.put("deadtime", new Date(2011,8,29,8,40));
		dataJ.put("destination", "양재역7번");
		list.add(dataJ);
		
		dataK.put("title", "3003 광역버스");
		dataK.put("current", 0);
		dataK.put("deadtime", new Date(2011,8,29,8,40));
		dataK.put("destination", "양재역7번");
		list.add(dataK);
		
		myAdapet = new MyAdapter(this, list);
		lstSchedule.setAdapter(myAdapet);
	}
}