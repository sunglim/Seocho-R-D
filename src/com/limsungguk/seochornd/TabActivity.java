package com.limsungguk.seochornd;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public abstract class TabActivity extends Activity {
    protected static final int OPTION_YANGJAE = 1;
    protected static final int OPTION_SADANG  = 2;
    protected static final int OPTION_ETC     = 3;

    protected int changedOptionIdx; 
	protected int oldOptionIdx;
	
    protected TextView currentTime;
	protected ListView lstSchedule = null;
	
	protected List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
	
	protected abstract void initOptionOneList();
	protected abstract void initOptionTwoList();
	protected abstract void initOptionThreeList();
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.first_tab);
		
		findView();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		
		menu.add(0,OPTION_YANGJAE,0,"Yangjae");
		//menu.add(0,0,0,"Yangjae").setIcon(R.drawable.icon);
		menu.add(0,OPTION_SADANG,0,"Sadang");//.setIcon(R.drawable.icon);
		menu.add(0,OPTION_ETC,0,"Etc");//.setIcon(R.drawable.icon);
		
		return true;
	}
	

	// set initial row
	// it must be the first index of current time
	protected void selectIntialRow() {
		View v = lstSchedule.getChildAt(0);
		int top = (v==null)?0:v.getTop();
		
		int initialRowIdx = 0;
		Date currentTime = new Date();
		for(HashMap<String, Object> item : list){
			Date cal1 = (Date)item.get("deadtime");
			
			//migration to current 
			cal1.setYear(currentTime.getYear());
			cal1.setMonth(currentTime.getMonth());
			cal1.setDate(currentTime.getDate());
			
			if(cal1.before(currentTime)){
				initialRowIdx++;
				
				// if it reach the bottom, move to top
				if(initialRowIdx == list.size()){
					initialRowIdx = 0;
					break;
				}
				
			}else{
				break;
			}
		}

		initialRowIdx = initialRowIdx - 1;
		if(initialRowIdx < 0)
			initialRowIdx = 0;
		
		lstSchedule.setSelectionFromTop(initialRowIdx,top);
	}
	
	private void findView() {
		lstSchedule = (ListView) findViewById(R.id.lst_schedule);
		lstSchedule.invalidate();
		lstSchedule.setDivider(new ColorDrawable(Color.GRAY));	//gray
		lstSchedule.setDividerHeight(2);
		
		currentTime = (TextView)findViewById(R.id.currentTime);
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		super.onOptionsItemSelected(item);

		if(changedOptionIdx != item.getItemId()){
			changedOptionIdx = item.getItemId();
			
			switch(item.getItemId()){
			case OPTION_YANGJAE:
				initOptionOneList();
				selectIntialRow();
				Toast.makeText(this,"양재역 셔틀", Toast.LENGTH_SHORT).show();
				((TextView)findViewById(R.id.txtViewTitle)).setText("양재역 셔틀");
				return true;
				
			case OPTION_SADANG:
				initOptionTwoList();
				selectIntialRow();
				Toast.makeText(this,"사당역 셔틀", Toast.LENGTH_SHORT).show();
				((TextView)findViewById(R.id.txtViewTitle)).setText("사당역 셔틀");
				return true;
				
			case OPTION_ETC:
				//initEtcList();
				//selectIntialRow();
				
				initOptionThreeList();
				selectIntialRow();
				Toast.makeText(this,"개발중", Toast.LENGTH_SHORT).show();
				((TextView)findViewById(R.id.txtViewTitle)).setText("사당역 셔틀");
				
				return true;
			}
		}
		
		return false;
	}
}
/*
private String getXmlAttribute(XmlResourceParser xml, String name) {
    int resId = xml.getAttributeResourceValue(null, name, 0);
    if (resId == 0) {
        return xml.getAttributeValue(null, name);
    } else {
        return getString(resId);
    }
}

protected Timenode findProviderForDomain(String domain) {
    try {
        XmlResourceParser xml = getResources().getXml(R.xml.timetable);
        int xmlEventType;
        Timenode provider = null;
        while ((xmlEventType = xml.next()) != XmlResourceParser.END_DOCUMENT) {
            if (xmlEventType == XmlResourceParser.START_TAG
                    && "provider".equals(xml.getName())
                    && domain.equalsIgnoreCase(getXmlAttribute(xml, "domain"))) {
                provider = new Timenode();
                provider.id = getXmlAttribute(xml, "id");
                provider.label = getXmlAttribute(xml, "label");
                provider.domain = getXmlAttribute(xml, "domain");
                provider.note = getXmlAttribute(xml, "note");
            } else if (xmlEventType == XmlResourceParser.START_TAG
                       && "incoming".equals(xml.getName())
                       && provider != null) {
                provider.incomingUriTemplate = new URI(getXmlAttribute(xml, "uri"));
                provider.incomingUsernameTemplate = getXmlAttribute(xml, "username");
            } else if (xmlEventType == XmlResourceParser.START_TAG
                       && "outgoing".equals(xml.getName())
                       && provider != null) {
                provider.outgoingUriTemplate = new URI(getXmlAttribute(xml, "uri"));
                provider.outgoingUsernameTemplate = getXmlAttribute(xml, "username");
            } else if (xmlEventType == XmlResourceParser.END_TAG
                       && "provider".equals(xml.getName())
                       && provider != null) {
                return provider;
            }
        }
    } catch (Exception e) {
        Log.e(SeochoRnd.LOG_TAG, "Error while trying to load provider settings.", e);
    }
    
    return null;
}
*/