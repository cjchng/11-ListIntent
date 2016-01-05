package com.course.example.listintent;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.net.Uri;
import android.content.Intent;

public class ListIntentActivity extends ListActivity {
  	
	private String[] options = {"Explicit", "Maps", "Open Dialer", "Exit"};
	private ArrayAdapter<String> adapt = null;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //notice custom format for list items
        adapt = new ArrayAdapter<String> (this, R.layout.item, options);
        setListAdapter(adapt);
               
    }
    
    	//start activity based on list item selected
        @Override
    	protected void onListItemClick(ListView l, View v, int position, long id) {
    		super.onListItemClick(l, v, position, id);
    		
    		switch (position) {
    		
    		case 0 : { 
    			Intent intent = new Intent(this, LifeCycleTest.class);
    			startActivity(intent);
    			break;
    		}
    		
    		case 1 : {
    			Uri uri = Uri.parse("geo:0,0?q=175+forest+street+waltham+ma");
    			Intent intent = new Intent(Intent.ACTION_VIEW, uri);
    			startActivity(intent);
    			break;
    		}
    		
    		case 2 : {
    			 
    			Uri uri = Uri.parse("tel:8005551212");
    			Intent intent = new Intent(Intent.ACTION_VIEW, uri);
    			startActivity(intent);
    			break;
    		}
    		
    		case 3 : finish();
    		
    		}
    	}
    
}