package com.limsungguk.seochornd;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.limsungguk.seochornd.R;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

class MyAdapter extends BaseAdapter {
	private List<HashMap<String, Object>> list;
	private LayoutInflater infl = null;

	private TextView titleView;
	private TextView txtRemainTime;
	private TextView txtDestination;
	
	private int lastOuttimeIdx;
	
	public MyAdapter(Context context, List<HashMap<String, Object>> list) {
		this.infl = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		this.list = list;
		
		lastOuttimeIdx = -1;
	}
	
	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	// 여기서는 초기값만 해준다
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		convertView = infl.inflate(R.layout.lst_schedule, null);
		titleView = (TextView) convertView.findViewById(R.id.title);
		txtRemainTime = (TextView) convertView.findViewById(R.id.txtTImeRemain);
		txtDestination = (TextView) convertView.findViewById(R.id.destination);
		
		HashMap<String, Object> detail = list.get(position);
		String t = (String) detail.get("title");
		titleView.setText(t);
		
		Date currentTime = new Date();
		Date cal1 = (Date)detail.get("deadtime");
		
		//migration to current 
		cal1.setYear(currentTime.getYear());
		cal1.setMonth(currentTime.getMonth());
		cal1.setDate(currentTime.getDate());
		
		if(cal1.before(currentTime)){
			titleView.setTextColor(Color.GRAY);
			txtRemainTime.setTextColor(Color.GRAY);
			txtDestination.setTextColor(Color.GRAY);
			lastOuttimeIdx = position;
		}else{
			if(position == 0){
				//처음부터 없다면?
				titleView.setTextColor(Color.RED);
				txtRemainTime.setTextColor(Color.RED);
				txtDestination.setTextColor(Color.RED);
			}else{
				if((lastOuttimeIdx == position -1) && (lastOuttimeIdx != -1)){
					titleView.setTextColor(Color.RED);
					txtRemainTime.setTextColor(Color.RED);
					txtDestination.setTextColor(Color.RED);
				}	
			}
		}
		
		int remainMinute = 0;
		if(currentTime.getHours() < cal1.getHours()){ // Today
			remainMinute =	(cal1.getHours() * 60 + cal1.getMinutes()) - (currentTime.getHours() * 60 + currentTime.getMinutes());
		}else if(currentTime.getHours() ==  cal1.getHours()){
			if(currentTime.getMinutes() > cal1.getMinutes()){
				remainMinute =	(cal1.getHours()*60 + 24*60 + cal1.getMinutes()) - (currentTime.getHours() * 60 + currentTime.getMinutes());
			}else{
				remainMinute =	(cal1.getHours() * 60 + cal1.getMinutes()) - (currentTime.getHours() * 60 + currentTime.getMinutes());
			}
		}else{
			remainMinute =	(cal1.getHours()*60 + 24*60 + cal1.getMinutes()) - (currentTime.getHours() * 60 + currentTime.getMinutes());
		}
		
		
		if(remainMinute < 100){
			txtRemainTime.setText(remainMinute + "Min");
		}else{
			txtRemainTime.setText(remainMinute/60 + "Hr");
		}
		
		txtDestination.setText((String)detail.get("destination"));
		
		return convertView;
	}

	// adapter에서 수정을 하네..
	public void chargeProgress(int postion, HashMap<String, Object> detail) {
		//this.list.set(postion, detail);
		
		//txtRemainTime.setText("" + new GregorianCalendar().MILLISECOND);

		notifyDataSetChanged();
	}
	
	public void changeRemainTime(){
		notifyDataSetChanged();
	}
}