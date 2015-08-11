package com.example.kustiadistrictallthana;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nirapodthakun.R;

public class KhoksaThana extends Fragment {
	public KhoksaThana() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.khoksa_thana_kushtia, container,
				false);
		return view;

	}

}
