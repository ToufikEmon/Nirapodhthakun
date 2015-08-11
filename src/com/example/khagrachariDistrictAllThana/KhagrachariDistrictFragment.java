package com.example.khagrachariDistrictAllThana;

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

public class KhagrachariDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnDighinalaThana, btnSadarThana, btnLakshmichhariThana,
			btnMahalchhariThana, btnManikchhariThana, btnMatirangaThana,
			btnPachhariThana, btnRamgrahThana;

	public KhagrachariDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.khagrachori_district_fragment,
				container, false);

		btnDighinalaThana = (Button) view
				.findViewById(R.id.btnDighinalaThanaKhagrachari);
		btnSadarThana = (Button) view
				.findViewById(R.id.btnSadarThanaKhagrachari);
		btnLakshmichhariThana = (Button) view
				.findViewById(R.id.btnLaksmichhariThanaKhagrachari);
		btnMahalchhariThana = (Button) view
				.findViewById(R.id.btnMahalchhariThanaKhagrachari);
		btnManikchhariThana = (Button) view
				.findViewById(R.id.btnManikchhariThanaKhagrachari);
		btnMatirangaThana = (Button) view
				.findViewById(R.id.btnMatirangaThanaKhagrachari);
		btnPachhariThana = (Button) view
				.findViewById(R.id.btnPanchhariThanaKhagrachari);
		btnRamgrahThana = (Button) view
				.findViewById(R.id.btnRamgarhThanaKhagrachari);

		btnDighinalaThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnLakshmichhariThana.setOnClickListener(this);
		btnMahalchhariThana.setOnClickListener(this);
		btnManikchhariThana.setOnClickListener(this);
		btnMatirangaThana.setOnClickListener(this);
		btnPachhariThana.setOnClickListener(this);
		btnRamgrahThana.setOnClickListener(this);
		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnDighinalaThanaKhagrachari:

			DighinalaThana dighi = new DighinalaThana();

			ft.replace(R.id.frame_container, dighi);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnSadarThanaKhagrachari:

			KhagrachhariThana khag = new KhagrachhariThana();

			ft.replace(R.id.frame_container, khag);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnLaksmichhariThanaKhagrachari:

			LakshmichhariThana laks = new LakshmichhariThana();

			ft.replace(R.id.frame_container, laks);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnMahalchhariThanaKhagrachari:

			MahalchhariThana mahal = new MahalchhariThana();

			ft.replace(R.id.frame_container, mahal);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnManikchhariThanaKhagrachari:

			ManikchhariThana manik = new ManikchhariThana();

			ft.replace(R.id.frame_container, manik);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnMatirangaThanaKhagrachari:

			MatirangaThana mati = new MatirangaThana();

			ft.replace(R.id.frame_container, mati);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnPanchhariThanaKhagrachari:
			PanchhariThana panch = new PanchhariThana();

			ft.replace(R.id.frame_container, panch);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnRamgarhThanaKhagrachari:

			RamgarhThana ramg = new RamgarhThana();

			ft.replace(R.id.frame_container, ramg);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
