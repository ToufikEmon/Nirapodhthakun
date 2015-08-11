package com.example.nirapodthakun;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.bargunaDistrictAllThana.BargunaDistrictFragment;
import com.example.barisalDistrictAllThana.BarisalDistrictFragment;
import com.example.bholaDistrictAllThana.BholaDistrictFragment;
import com.example.jhalokhatiDistrictAllThana.JhalokhatiDistrictFragment;
import com.example.patuakhaliDistrictAllThana.PatuakhaliDistrictFragment;
import com.example.pirojpurDistrictAllThana.PirojpurDistrictFragment;

@SuppressLint("NewApi")
public class BorisalDivisionFragment extends Fragment implements
		OnClickListener {

	Button btnBarisalDistrict, btnVholaDistrict, btnPotuakhaliDistrict,
			btnBorgunaDistrict, btnJhalakhatiDistrict, btnPirojpurDistrict;

	public BorisalDivisionFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_borisal_division,
				container, false);

		/*
		 * Initializing button
		 */
		btnBarisalDistrict = (Button) rootView
				.findViewById(R.id.btnBorisalDistrict);
		btnVholaDistrict = (Button) rootView
				.findViewById(R.id.btnVholaDistrict);
		btnPotuakhaliDistrict = (Button) rootView
				.findViewById(R.id.btnPotuakhaliDistrict);
		btnBorgunaDistrict = (Button) rootView
				.findViewById(R.id.btnBorgunaDistrict);
		btnJhalakhatiDistrict = (Button) rootView
				.findViewById(R.id.btnJhalakhatiDistrict);
		btnPirojpurDistrict = (Button) rootView
				.findViewById(R.id.btnPirojpurDistrict);

		/*
		 * Add button action
		 */

		btnBarisalDistrict.setOnClickListener(this);
		btnVholaDistrict.setOnClickListener(this);
		btnPotuakhaliDistrict.setOnClickListener(this);
		btnBorgunaDistrict.setOnClickListener(this);
		btnJhalakhatiDistrict.setOnClickListener(this);
		btnPirojpurDistrict.setOnClickListener(this);

		return rootView;
	}

	@Override
	public void onClick(View v) {
		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnBorisalDistrict:

			BarisalDistrictFragment bri = new BarisalDistrictFragment();
			ft.replace(R.id.frame_container, bri);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnBorgunaDistrict:
			BargunaDistrictFragment barguna = new BargunaDistrictFragment();
			ft.replace(R.id.frame_container, barguna);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnVholaDistrict:
			BholaDistrictFragment bhola = new BholaDistrictFragment();
			ft.replace(R.id.frame_container, bhola);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnPotuakhaliDistrict:
			PatuakhaliDistrictFragment patua = new PatuakhaliDistrictFragment();
			ft.replace(R.id.frame_container, patua);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnJhalakhatiDistrict:
			JhalokhatiDistrictFragment jhalokathi = new JhalokhatiDistrictFragment();
			ft.replace(R.id.frame_container, jhalokathi);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnPirojpurDistrict:
			PirojpurDistrictFragment pirojpur = new PirojpurDistrictFragment();
			ft.replace(R.id.frame_container, pirojpur);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}
}
