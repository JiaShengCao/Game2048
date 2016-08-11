package com.example.cjs.game2048;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.TreeMap;

public class MainActivity extends Activity {

	private Button btn_restare;
	private boolean restare=false;

	public MainActivity() {
		mainActivity = this;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		tvScore = (TextView) findViewById(R.id.tv_score);
		btn_restare= (Button) findViewById(R.id.btn_restart);
		btn_restare.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				restare=true;
				Toast.makeText(MainActivity.this,"请点击屏幕下方重新开始游戏",Toast.LENGTH_SHORT).show();
			}
		});
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void setrestare(boolean restare){
			this.restare=restare;
	}
	public boolean getrestare(){
		return restare;
	}
	public void clearScore(){
		score = 0;
		showScore();
	}

	public void showScore(){
		tvScore.setText(score+"");
	}

	public void addScore(int s){
		score+=s;
		showScore();
	}


	private int score = 0;
	private TextView tvScore;

	private static MainActivity mainActivity = null;

	public static MainActivity getMainActivity() {
		return mainActivity;
	}

}
