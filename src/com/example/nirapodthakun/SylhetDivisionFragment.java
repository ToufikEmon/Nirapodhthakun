package com.example.nirapodthakun;

import com.example.habiganjdistrictallthana.HabiganjDistrictFragment;
import com.example.mouluvibazarDistrictAllThana.MouluvibazarDistrictFragment;
import com.example.sunamgonjDistrictAllThana.SunamgonjDistrictFragment;
import com.example.sylhetDistrictAllThana.SylhetDistrictFragment;

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

@SuppressLint("NewApi")
public class SylhetDivisionFragment extends Fragment implements OnClickListener {

	Button btnHabiganjDistrict, btnMouluvibazarDistrict, btnSylhetDistrict,
			btnSunamganjDistrict;

	public SylhetDivisionFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_sylhet_division,
				container, false);
		btnHabiganjDistrict = (Button) rootView
				.findViewById(R.id.btnHobigonjDistrict);
		btnMouluvibazarDistrict = (Button) rootView
				.findViewById(R.id.btnMoulovibazarDistrict);
		btnSylhetDistrict = (Button) rootView
				.findViewById(R.id.btnSylhetDistrict);
		btnSunamganjDistrict = (Button) rootView
				.findViewById(R.id.btnSunamgonjDistrict);

		btnHabiganjDistrict.setOnClickListener(this);
		btnMouluvibazarDistrict.setOnClickListener(this);
		btnSylhetDistrict.setOnClickListener(this);
		btnSunamganjDistrict.setOnClickListener(this);

		return rootView;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnSunamgonjDistrict:
			SunamgonjDistrictFragment sunamganj = new SunamgonjDistrictFragment();
			ft.replace(R.id.frame_container, sunamganj);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnHobigonjDistrict:
			HabiganjDistrictFragment habiganj = new HabiganjDistrictFragment();
			ft.replace(R.id.frame_container, habiganj);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnMoulovibazarDistrict:
			MouluvibazarDistrictFragment mouluvibazar = new MouluvibazarDistrictFragment();
			ft.replace(R.id.frame_container, mouluvibazar);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnSylhetDistrict:
			SylhetDistrictFragment sylhet = new SylhetDistrictFragment();
			ft.replace(R.id.frame_container, sylhet);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
