package com.example.bargunaDistrictAllThana;

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

public class BargunaDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnAmtaliThana, btnBamnaThana, btnSadarThana, btnBetagiThana,
			btnPatharghataThana, btnTaltoliThana;

	public BargunaDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.barguna_district_fragment,
				container, false);

		btnAmtaliThana = (Button) view.findViewById(R.id.btnAmtaliThanaBarguna);
		btnBamnaThana = (Button) view.findViewById(R.id.btnBamnaThanaBaruna);
		btnSadarThana = (Button) view
				.findViewById(R.id.btnbargunaSadarThanaBarguna);
		btnBetagiThana = (Button) view.findViewById(R.id.btnBetagiThana);
		btnPatharghataThana = (Button) view
				.findViewById(R.id.btnPatharghataThanaBarguna);
		btnTaltoliThana = (Button) view
				.findViewById(R.id.btnTaltoliThanaBarguna);

		btnAmtaliThana.setOnClickListener(this);
		btnBamnaThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnBetagiThana.setOnClickListener(this);
		btnPatharghataThana.setOnClickListener(this);
		btnTaltoliThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {
		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnAmtaliThanaBarguna:

			AmtaliThana amtali = new AmtaliThana();

			ft.replace(R.id.frame_container, amtali);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnBamnaThanaBaruna:
			BamnaThana bamna = new BamnaThana();

			ft.replace(R.id.frame_container, bamna);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnbargunaSadarThanaBarguna:
			BargunaSadarThana bargunasadar = new BargunaSadarThana();

			ft.replace(R.id.frame_container, bargunasadar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnBetagiThana:

			BetagiThana betagi = new BetagiThana();
			ft.replace(R.id.frame_container, betagi);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnPatharghataThanaBarguna:
			PatharghataThana pathargatha = new PatharghataThana();

			ft.replace(R.id.frame_container, pathargatha);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnTaltoliThanaBarguna:

			TaltoliThana talThana = new TaltoliThana();
			ft.replace(R.id.frame_container, talThana);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}
}
