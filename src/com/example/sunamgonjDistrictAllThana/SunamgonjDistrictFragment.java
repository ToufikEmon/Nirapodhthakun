package com.example.sunamgonjDistrictAllThana;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.nirapodthakun.R;

public class SunamgonjDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnBishwamvapurThana, btnChhatakThana, btnDeraiThana,
			btnDharmapashaThana, btnDowarbazarThana, btnJagannathpurThana,
			btnJamalganjThana, btnSouthSunamganjThana, btnSullahThana,
			btnSadarThana, btnTahirpurThana;

	public SunamgonjDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.sunamgonj_district_fragment,
				container, false);

		btnBishwamvapurThana = (Button) view
				.findViewById(R.id.btnBishwamvarpurThanaSunamganj);
		btnChhatakThana = (Button) view
				.findViewById(R.id.btnChhatakThanaSunamganj);
		btnDeraiThana = (Button) view.findViewById(R.id.btnDeraiThanaSunamganj);
		btnDharmapashaThana = (Button) view
				.findViewById(R.id.btnDharamppashaThanaSunamganj);
		btnDowarbazarThana = (Button) view
				.findViewById(R.id.btnDowarbazarThanaSunamganj);
		btnJagannathpurThana = (Button) view
				.findViewById(R.id.btnJagannnathpurThanaSunamganj);
		btnJamalganjThana = (Button) view
				.findViewById(R.id.btnJamalganjThanaSunamganj);
		btnSouthSunamganjThana = (Button) view
				.findViewById(R.id.btnSouthSunamganjThanaSunamganj);
		btnSullahThana = (Button) view
				.findViewById(R.id.btnSullahThanaSunamganj);
		btnSadarThana = (Button) view
				.findViewById(R.id.btnSunamganjSadarThanaSunamganj);
		btnTahirpurThana = (Button) view
				.findViewById(R.id.btnTahirpurThanaSunamganj);

		btnBishwamvapurThana.setOnClickListener(this);
		btnChhatakThana.setOnClickListener(this);
		btnDeraiThana.setOnClickListener(this);
		btnDharmapashaThana.setOnClickListener(this);
		btnDowarbazarThana.setOnClickListener(this);
		btnJagannathpurThana.setOnClickListener(this);
		btnJamalganjThana.setOnClickListener(this);
		btnSouthSunamganjThana.setOnClickListener(this);
		btnSullahThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnTahirpurThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {

		case R.id.btnBishwamvarpurThanaSunamganj:
			BishwamvarpurThana bishwamvapur = new BishwamvarpurThana();
			ft.replace(R.id.frame_container, bishwamvapur);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnChhatakThanaSunamganj:

			ChhatakThana chhatak = new ChhatakThana();

			ft.replace(R.id.frame_container, chhatak);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnDeraiThanaSunamganj:

			DeraiThana derai = new DeraiThana();

			ft.replace(R.id.frame_container, derai);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnDharamppashaThanaSunamganj:

			DharampashaThana dharma = new DharampashaThana();

			ft.replace(R.id.frame_container, dharma);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnDowarbazarThanaSunamganj:

			DowarabazarThana dowarabazar = new DowarabazarThana();

			ft.replace(R.id.frame_container, dowarabazar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnJagannnathpurThanaSunamganj:
			JagannathpurThana jagannath = new JagannathpurThana();

			ft.replace(R.id.frame_container, jagannath);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnJamalganjThanaSunamganj:

			JamalganjThana jamalganj = new JamalganjThana();

			ft.replace(R.id.frame_container, jamalganj);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSouthSunamganjThanaSunamganj:

			SouthSunamganjThana southsunamganj = new SouthSunamganjThana();
			ft.replace(R.id.frame_container, southsunamganj);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSullahThanaSunamganj:

			SullahThana sullah = new SullahThana();

			ft.replace(R.id.frame_container, sullah);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSunamganjSadarThanaSunamganj:

			SunamganjSadarThana sadar = new SunamganjSadarThana();

			ft.replace(R.id.frame_container, sadar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnTahirpurThanaSunamganj:

			TahirpurThana tahirpur = new TahirpurThana();

			ft.replace(R.id.frame_container, tahirpur);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}
	}
}
