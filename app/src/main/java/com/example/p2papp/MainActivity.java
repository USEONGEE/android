package com.example.p2papp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.p2papp.Login.BeginActivity;

public class MainActivity extends AppCompatActivity {
	Button beginActivity;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		beginActivity = findViewById(R.id.beginActivity);
		beginActivity.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(getApplication(), BeginActivity.class);

			}
		});
	}
}