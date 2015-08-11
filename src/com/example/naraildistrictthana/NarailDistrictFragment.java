package com.example.naraildistrictthana;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nirapodthakun.R;

public class NarailDistrictFragment extends Fragment {
	public NarailDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.narail_district_fragment,
				container, false);
		return view;
	}

}
