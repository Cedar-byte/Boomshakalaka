package com.example.shakeshake;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final Button button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
        	@Override
        	public void onClick(View v) {
        		Animation shake = AnimationUtils.loadAnimation(MainActivity.this, R.anim.shake_y);
//        		Animation shake = AnimationUtils.loadAnimation(MainActivity.this, R.anim.button_shake);
        		shake.reset();
        		shake.setFillAfter(true);
        		button.startAnimation(shake);
        	}
        });
    }

}
