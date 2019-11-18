package com.example.sony;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button pilihan1, pilihan2;
    
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        pilihan1=(Button)findViewById(R.id.pilihan);
        pilihan2=(Button)findViewById(R.id.pilihan1);
        
        pilihan1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(MainActivity.this,pertama.class);
				startActivity(intent);
			}
		});
        
        pilihan2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent1 = new Intent(MainActivity.this,kedua.class);
				startActivity(intent1);
			}
		});
    }


    
}
