package com.example.khulnadistrictthana;

import com.example.nirapodthakun.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class KhulnaDistrictFragment extends Fragment {
	public KhulnaDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.khulna_district_fragment,
				container, false);
		return view;
	}
}
