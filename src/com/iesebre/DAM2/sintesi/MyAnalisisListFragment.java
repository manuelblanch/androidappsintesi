package com.iesebre.DAM2.sintesi;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyAnalisisListFragment extends ListFragment{
	
	

	private String myanalisis[]=new String[]{
            "1",
            "2",
            "3",
            "4",
            "5"
    };

	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
	      
	        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getBaseContext(), android.R.layout.simple_list_item_multiple_choice, myanalisis);
	        setListAdapter(adapter);

	        return super.onCreateView(inflater, container, savedInstanceState);

	    }    
	    
	    @Override
	    public void onStart() {    	
	    	super.onStart();
	        getListView().setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

	    }	
}
