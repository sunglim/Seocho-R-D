package com.limsungguk.seochornd;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class SecondTab extends TabActivity {

	private MyAdapter myAdapet;

	private void initEtcList() {
		list = new ArrayList<HashMap<String, Object>>();

		HashMap<String, Object> data;

		data = new HashMap<String, Object>();
		data.put("title", "7 : 30 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 19, 30));
		data.put("destination", "부천");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "7 : 30 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 19, 30));
		data.put("destination", "용인");
		list.add(data);

		myAdapet = new MyAdapter(this, list);
		lstSchedule.setAdapter(myAdapet);
	}

	private void initSadangList() {
		list = new ArrayList<HashMap<String, Object>>();

		HashMap<String, Object> data;

		data = new HashMap<String, Object>();
		data.put("title", "6 : 10 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 18, 10));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "6 : 15 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 18, 15));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "6 : 20 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 18, 20));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "6 : 30 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 18, 30));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "6 : 40 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 18, 40));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "6 : 50 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 18, 50));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "7 : 00 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 19, 0));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "7 : 10 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 19, 10));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "7 : 20 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 19, 20));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "7 : 30 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 19, 30));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "7 : 40 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 19, 40));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "7 : 50 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 19, 50));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "8 : 00 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 20, 00));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "8 : 10 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 20, 10));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "8 : 20 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 20, 20));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "8 : 30 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 20, 30));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "8 : 40 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 20, 40));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "8 : 50 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 20, 50));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "9 : 00 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 21, 0));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "9 : 10 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 21, 10));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "9 : 20 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 21, 20));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "9 : 30 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 21, 30));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "9 : 40 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 21, 40));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "9 : 50 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 21, 50));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "10 : 15 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 22, 15));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "10 : 30 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 22, 30));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "11 : 15 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 23, 15));
		data.put("destination", "사당");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "11 : 20 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 23, 20));
		data.put("destination", "사당");

		list.add(data);

		myAdapet = new MyAdapter(this, list);
		lstSchedule.setAdapter(myAdapet);
	}

	private void initList() {
		list = new ArrayList<HashMap<String, Object>>();

		HashMap<String, Object> data;
		for (int i = 1; i <= 9; i++) {
			data = new HashMap<String, Object>();

			data.put("title", "6 : " + (10 + i * 5) + " PM");
			data.put("current", 0);
			data.put("deadtime", new Date(2011, 8, 29, 18, 10 + i * 5));
			data.put("destination", "양재");
			list.add(data);
		}

		data = new HashMap<String, Object>();
		data.put("title", "7 : 00 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 19, 0));
		data.put("destination", "양재");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "7 : 10 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 19, 10));
		data.put("destination", "양재");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "7 : 20 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 19, 20));
		data.put("destination", "양재");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "7 : 30 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 19, 30));
		data.put("destination", "양재");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "7 : 40 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 19, 40));
		data.put("destination", "양재");
		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "7 : 50 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 19, 50));
		data.put("destination", "양재");
		list.add(data);

		for (int i = 0; i <= 5; i++) {
			data = new HashMap<String, Object>();

			if (i == 0) {
				data.put("title", "8 : 0" + (0 + i * 10) + " PM");
			} else {
				data.put("title", "8 : " + (0 + i * 10) + " PM");
			}
			data.put("current", 0);
			data.put("deadtime", new Date(2011, 8, 29, 20, i * 10));
			data.put("destination", "양재");
			list.add(data);
		}

		for (int i = 0; i <= 5; i++) {
			data = new HashMap<String, Object>();

			if (i == 0) {
				data.put("title", "9 : 0" + (0 + i * 10) + " PM");
			} else {
				data.put("title", "9 : " + (0 + i * 10) + " PM");
			}
			data.put("current", 0);
			data.put("deadtime", new Date(2011, 8, 29, 21, i * 10));
			data.put("destination", "양재");

			list.add(data);
		}

		data = new HashMap<String, Object>();
		data.put("title", "10 : 15 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 22, 15));
		data.put("destination", "양재");

		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "10 : 30 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 22, 30));
		data.put("destination", "양재");

		list.add(data);

		data = new HashMap<String, Object>();
		data.put("title", "11 : 15 PM");
		data.put("current", 0);
		data.put("deadtime", new Date(2011, 8, 29, 23, 15));
		data.put("destination", "양재");

		list.add(data);

		myAdapet = new MyAdapter(this, list);
		lstSchedule.setAdapter(myAdapet);
	}

	@Override
	protected void onPause() {
		super.onPause();

		SharedPreferences pref = getSharedPreferences("OptionLocation", 0);
		SharedPreferences.Editor edit = pref.edit();

		edit.putInt("OptionInit", changedOptionIdx);
		edit.commit();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		SharedPreferences pref = getSharedPreferences("OptionLocation", 0);
		int optionInit = pref.getInt("OptionInit", 0);
		changedOptionIdx = optionInit;
		oldOptionIdx = optionInit;

		if (optionInit == OPTION_YANGJAE || optionInit == 0) {
			initList();
			((TextView) findViewById(R.id.txtViewTitle)).setText("양재역 셔틀");
		} else if (optionInit == OPTION_SADANG) {
			initSadangList();
			((TextView) findViewById(R.id.txtViewTitle)).setText("사당역 셔틀");
		} else {
			initEtcList();
			((TextView) findViewById(R.id.txtViewTitle)).setText("부천, 용인 셔틀");
		}

		selectIntialRow();
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
		initEtcList();
	}
}