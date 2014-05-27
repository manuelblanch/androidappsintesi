package com.iesebre.DAM2.sintesi;

import com.sunil.actionabrtabnavigation.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class PantallaCarga extends Activity {
	
private final int DURACION_SPLASH = 3000;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_carga);
        
        new Handler().postDelayed(new Runnable(){
        	public void run(){
        		Intent intent = new Intent(PantallaCarga.this, MainActivity.class);
        		startActivity(intent);
        		finish();
        	};
        	
        }, DURACION_SPLASH);
        
	}
	

}
