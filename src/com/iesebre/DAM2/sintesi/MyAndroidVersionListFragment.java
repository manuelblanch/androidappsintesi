package com.iesebre.DAM2.sintesi;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyAndroidVersionListFragment extends ListFragment{	
	
    /** An array of items to display in ArrayList */
    String android_versions[] = new String[]{
            "Jelly Bean",
            "IceCrean Sandwich",
            "Honey Comb",
            "Gingerbread",
            "Froyo"
    };
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
      
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getBaseContext(), android.R.layout.simple_list_item_multiple_choice, android_versions);
        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);

    }    
    
    @Override
    public void onStart() {    	
    	super.onStart();
        getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);

    }	
}