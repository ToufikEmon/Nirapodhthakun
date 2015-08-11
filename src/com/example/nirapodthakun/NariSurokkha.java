package com.example.nirapodthakun;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


@SuppressLint("NewApi")
public class NariSurokkha extends Fragment{
	
	public NariSurokkha() {
		// TODO Auto-generated constructor stub
	}
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_nari_surokkha, container, false);
          
        return rootView;
    }

}
