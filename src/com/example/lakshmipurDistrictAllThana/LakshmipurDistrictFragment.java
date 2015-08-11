package com.example.lakshmipurDistrictAllThana;

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

public class LakshmipurDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnKamalnagarThana, btnSadarThana, btnRaipurThana, btnRamganjThana,
			btnRamgatiThana;

	public LakshmipurDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.lokkhipur_district_fragment,
				container, false);

		btnKamalnagarThana = (Button) view
				.findViewById(R.id.btnKamalnagarThanaLaskmipur);
		btnSadarThana = (Button) view.findViewById(R.id.btnSadarThanaLaskmipur);
		btnRaipurThana = (Button) view
				.findViewById(R.id.btnRaipurThanaLaskmipur);
		btnRamganjThana = (Button) view
				.findViewById(R.id.btnRamganjThanaLaskmipur);
		btnRamgatiThana = (Button) view
				.findViewById(R.id.btnRamgatiThanaLaskmipur);

		btnKamalnagarThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnRaipurThana.setOnClickListener(this);
		btnRamganjThana.setOnClickListener(this);
		btnRamgatiThana.setOnClickListener(this);
		return view;
	}

	@Override
	public void onClick(View v) {
		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnKamalnagarThanaLaskmipur:

			KamalnagarThana kamal = new KamalnagarThana();

			ft.replace(R.id.frame_container, kamal);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnSadarThanaLaskmipur:

			LakshmipurSadarThana lak = new LakshmipurSadarThana();

			ft.replace(R.id.frame_container, lak);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnRaipurThanaLaskmipur:

			RaipurThana rai = new RaipurThana();

			ft.replace(R.id.frame_container, rai);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnRamganjThanaLaskmipur:

			RamganjThana ram = new RamganjThana();

			ft.replace(R.id.frame_container, ram);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnRamgatiThanaLaskmipur:

			RamgatiThana ramg = new RamgatiThana();

			ft.replace(R.id.frame_container, ramg);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
