package com.example.bholaDistrictAllThana;

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

public class BholaDistrictFragment extends Fragment implements OnClickListener {

	Button btnSadarThana, btnBurhanuddinThana, btnCharfassionThana,
			btnDaulatkhanThana, btnLalmohanThana, btnManpuraThana,
			btnTazumuddinThana;

	public BholaDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.bhola_district_fragment,
				container, false);

		btnSadarThana = (Button) view
				.findViewById(R.id.btnBholaSadarThanaBhola);
		btnBurhanuddinThana = (Button) view
				.findViewById(R.id.btnBurhanuddinThanaBhola);
		btnCharfassionThana = (Button) view
				.findViewById(R.id.btnCharfassonThanaBhola);
		btnDaulatkhanThana = (Button) view
				.findViewById(R.id.btnDaulatkhanThanaBhola);
		btnLalmohanThana = (Button) view
				.findViewById(R.id.btnLalmohanThanaBhola);
		btnManpuraThana = (Button) view.findViewById(R.id.btnManpuraThanaBhola);
		btnTazumuddinThana = (Button) view
				.findViewById(R.id.btnTazumuddinThanaBhola);

		btnSadarThana.setOnClickListener(this);
		btnBurhanuddinThana.setOnClickListener(this);
		btnCharfassionThana.setOnClickListener(this);
		btnDaulatkhanThana.setOnClickListener(this);
		btnLalmohanThana.setOnClickListener(this);
		btnManpuraThana.setOnClickListener(this);
		btnTazumuddinThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnBurhanuddinThanaBhola:

			BurhanuddinThana burha = new BurhanuddinThana();
			ft.replace(R.id.frame_container, burha);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnBholaSadarThanaBhola:

			BholaSadarThana blasa = new BholaSadarThana();
			ft.replace(R.id.frame_container, blasa);

			break;

		case R.id.btnCharfassonThanaBhola:
			CharFassonThana charfassion = new CharFassonThana();
			ft.replace(R.id.frame_container, charfassion);
			ft.commit();

			break;

		case R.id.btnDaulatkhanThanaBhola:
			DaulatkhanThana daulat = new DaulatkhanThana();
			ft.replace(R.id.frame_container, daulat);
			ft.commit();

			break;

		case R.id.btnLalmohanThanaBhola:
			LalmohanThana lalmohan = new LalmohanThana();
			ft.replace(R.id.frame_container, lalmohan);
			ft.commit();

			break;
		case R.id.btnManpuraThanaBhola:

			ManpuraThana manpura = new ManpuraThana();
			ft.replace(R.id.frame_container, manpura);
			ft.commit();

			break;
		case R.id.btnTazumuddinThanaBhola:

			TazumuddinThana tazumuddin = new TazumuddinThana();
			ft.replace(R.id.frame_container, tazumuddin);

			break;

		default:
			break;
		}

	}
}
