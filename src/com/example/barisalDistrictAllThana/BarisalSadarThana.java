package com.example.barisalDistrictAllThana;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.nirapodthakun.R;

public class BarisalSadarThana extends Fragment {

	Button btnDuityofficerSsadarThanaBarisal, btnRabSadarThanaBarisal,
			btnOcSadarThanaBarisal, btnDbSadarThanaBarisal;

	public BarisalSadarThana() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.sadar_thana_barisal, container,
				false);
		return view;

	}
}
