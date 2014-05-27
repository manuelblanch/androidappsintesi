package com.iesebre.DAM2.sintesi;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyConsolesListFragment extends ListFragment{
	
	private String myconsoles[]=new String[]{
            "Playstation",
            "Playstation 2",
            "Playstation 3",
            "Playstation 4",
            "Xbox One"
    };

	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
	      
	        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getBaseContext(), android.R.layout.simple_list_item_multiple_choice, myconsoles);
	        setListAdapter(adapter);

	        return super.onCreateView(inflater, container, savedInstanceState);

	    }    
	    
	    @Override
	    public void onStart() {    	
	    	super.onStart();
	        getListView().setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

	    }	
}
