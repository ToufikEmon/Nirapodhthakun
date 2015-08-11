package com.example.jessoreDistrictAllThana;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.nirapodthakun.R;

public class AbhayanagarThana extends Fragment {

	Button btnDeautyOfficer, btnOC, btnSI, btnRAB, btnMP, btnAmbulance,
			bntGovthosital, btnFireService;

	public AbhayanagarThana() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.abhaynagar_thana_jessore,
				container, false);

		return view;

	}

}
