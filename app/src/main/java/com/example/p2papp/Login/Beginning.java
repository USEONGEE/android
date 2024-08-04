package com.example.p2papp.Login;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.p2papp.R;


public class Beginning extends Fragment {
	private Button startBtn;
	public View onCreateView(LayoutInflater inflater,
							 ViewGroup container,
							 Bundle savedInstanceState) {
		ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_beginning, container, false);
		// Inflate the layout for this fragment
		startBtn = rootView.findViewById(R.id.startBtn);
		startBtn.setOnClickListener(startBtnListener);

		return rootView;
	}


	private View.OnClickListener startBtnListener = new View.OnClickListener() {
		@Override
		public void onClick(View view) {
			BeginActivity activity = (BeginActivity) getActivity();
			activity.onFragmentChange(0);
		}
	};
}
