package com.example.thakurgaonDistrictAllThana;

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

public class ThakurgaonDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnBalidangatThana, btnHaripurThana, btnPirganjThana,
			btnRanisankailThana, btnSadarThana;

	public ThakurgaonDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.thakurgaon_district_fragment,
				container, false);

		btnBalidangatThana = (Button) view
				.findViewById(R.id.btnBaliadangiThanaThakurgaon);
		btnHaripurThana = (Button) view
				.findViewById(R.id.btnHaripurThanaThakurgaon);
		btnPirganjThana = (Button) view
				.findViewById(R.id.btnPirganjThanaThakurgaon);
		btnRanisankailThana = (Button) view
				.findViewById(R.id.btnRanisankailThanaThakurgaon);
		btnSadarThana = (Button) view
				.findViewById(R.id.btnThakurgaonSadarThanaThakurgaon);

		btnBalidangatThana.setOnClickListener(this);
		btnHaripurThana.setOnClickListener(this);
		btnPirganjThana.setOnClickListener(this);
		btnRanisankailThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {

		case R.id.btnBaliadangiThanaThakurgaon:
			BaliadangiThana bali = new BaliadangiThana();
			ft.replace(R.id.frame_container, bali);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnHaripurThanaThakurgaon:
			HaripurThana hari = new HaripurThana();
			ft.replace(R.id.frame_container, hari);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnPirganjThanaThakurgaon:
			PirganjThana pirganj = new PirganjThana();
			ft.replace(R.id.frame_container, pirganj);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnRanisankailThanaThakurgaon:
			RanisankailThana rani = new RanisankailThana();

			ft.replace(R.id.frame_container, rani);

			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnThakurgaonSadarThanaThakurgaon:

			ThakurgaonSadarThana sadar = new ThakurgaonSadarThana();

			ft.replace(R.id.frame_container, sadar);
			ft.addToBackStack(null);
			ft.commit();
			break;

		default:
			break;
		}

	}
}
