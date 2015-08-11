package com.example.brahmanbariaDistrictAllThana;

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

public class BrahamanbariaDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnAkhauraThana, btnAshuganjThana, btnBancharampurThana,
			btnBijoynagarThana, btnSadarThana, btnKasbaThana,
			btnNabinagarThana, btnNasirnagarThana, btnSarailThana;

	public BrahamanbariaDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.b_baria_district_fragment,
				container, false);

		btnAkhauraThana = (Button) view
				.findViewById(R.id.btnAkhauraThanaBbaria);
		btnAshuganjThana = (Button) view
				.findViewById(R.id.btnAshuganjThanaBbaria);
		btnBancharampurThana = (Button) view
				.findViewById(R.id.btnBancharampurThanaBbaria);
		btnBijoynagarThana = (Button) view
				.findViewById(R.id.btnbijoynagarThanaBbaria);
		btnSadarThana = (Button) view
				.findViewById(R.id.btnBbariaSadarThanaBbaria);
		btnKasbaThana = (Button) view.findViewById(R.id.btnKasbaThanaBbaria);
		btnNabinagarThana = (Button) view
				.findViewById(R.id.btnNabinagarThanaBbaria);
		btnNasirnagarThana = (Button) view
				.findViewById(R.id.btnNasirnaarThanaBbaria);
		btnSarailThana = (Button) view.findViewById(R.id.btnSarailThanaBbaria);

		btnAkhauraThana.setOnClickListener(this);
		btnAshuganjThana.setOnClickListener(this);
		btnBancharampurThana.setOnClickListener(this);
		btnBijoynagarThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnKasbaThana.setOnClickListener(this);
		btnNabinagarThana.setOnClickListener(this);
		btnNasirnagarThana.setOnClickListener(this);
		btnSarailThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnAkhauraThanaBbaria:

			AkhauraThana akha = new AkhauraThana();

			ft.replace(R.id.frame_container, akha);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnAshuganjThanaBbaria:

			AshuganjThana ashu = new AshuganjThana();

			ft.replace(R.id.frame_container, ashu);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnBancharampurThanaBbaria:

			BancharampurThana bancha = new BancharampurThana();

			ft.replace(R.id.frame_container, bancha);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnbijoynagarThanaBbaria:

			BijoynagarThana bijoy = new BijoynagarThana();

			ft.replace(R.id.frame_container, bijoy);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnBbariaSadarThanaBbaria:

			BrahmanbariaSadarThana sadar = new BrahmanbariaSadarThana();

			ft.replace(R.id.frame_container, sadar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnKasbaThanaBbaria:

			KasbaThana kasba = new KasbaThana();

			ft.replace(R.id.frame_container, kasba);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnNabinagarThanaBbaria:

			NabinagarThana nabi = new NabinagarThana();

			ft.replace(R.id.frame_container, nabi);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnNasirnaarThanaBbaria:

			NasirnagarThana nasir = new NasirnagarThana();

			ft.replace(R.id.frame_container, nasir);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSarailThanaBbaria:

			SarailThana sarail = new SarailThana();

			ft.replace(R.id.frame_container, sarail);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
