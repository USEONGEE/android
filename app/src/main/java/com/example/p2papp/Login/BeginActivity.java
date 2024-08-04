package com.example.p2papp.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.p2papp.R;

public class BeginActivity extends AppCompatActivity {

	SignIn singin;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_begin);

		init();

	}

	void init() {
		singin = new SignIn();
	}

	public void onFragmentChange(int index){
		if(index == 0) {
			getSupportFragmentManager().beginTransaction().replace(R.id.fragmentFrame,singin).commit();
		}
	}

}