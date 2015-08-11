package com.example.rangpurDistrictAllThana;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.nirapodthakun.R;

public class RangpurDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnBadarganjThana, btnGangachharaThana, btnKauniaThana,
			btnMithaputkurThana, btnPirgachhaThana, btnPirganjThana,
			btnSadarThana, btnTaraganjThana;

	public RangpurDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.rongpur_district_fragment,
				container, false);

		btnBadarganjThana = (Button) view
				.findViewById(R.id.btnBadarganjThanaRangpur);
		btnGangachharaThana = (Button) view
				.findViewById(R.id.btnGangachharaThanaRangpur);
		btnKauniaThana = (Button) view.findViewById(R.id.btnKauniaThanaRangpur);
		btnMithaputkurThana = (Button) view
				.findViewById(R.id.btnMithapukurThanaRangpur);
		btnPirgachhaThana = (Button) view
				.findViewById(R.id.btnPiragachhaThanaRangpur);
		btnPirganjThana = (Button) view
				.findViewById(R.id.btnPirganjThanaRangpur);
		btnSadarThana = (Button) view.findViewById(R.id.btnSadarThanaRangpur);
		btnTaraganjThana = (Button) view
				.findViewById(R.id.btnTaraganjThanaRangpur);

		btnBadarganjThana.setOnClickListener(this);
		btnGangachharaThana.setOnClickListener(this);
		btnKauniaThana.setOnClickListener(this);
		btnMithaputkurThana.setOnClickListener(this);
		btnPirgachhaThana.setOnClickListener(this);
		btnPirganjThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnTaraganjThana.setOnClickListener(this);
		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {

		case R.id.btnBadarganjThanaRangpur:

			BadarganjThana badar = new BadarganjThana();

			ft.replace(R.id.frame_container, badar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnGangachharaThanaRangpur:
			GangachharaThana ganj = new GangachharaThana();

			ft.replace(R.id.frame_container, ganj);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnKauniaThanaRangpur:
			KauniaThana kaunia = new KauniaThana();

			ft.replace(R.id.frame_container, kaunia);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnMithapukurThanaRangpur:

			MithapukurThana mitha = new MithapukurThana();

			ft.replace(R.id.frame_container, mitha);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnPiragachhaThanaRangpur:

			PirgachhaThana pirgachha = new PirgachhaThana();

			ft.replace(R.id.frame_container, pirgachha);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnPirganjThanaRangpur:

			PirganjThana pirganj = new PirganjThana();

			ft.replace(R.id.frame_container, pirganj);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSadarThanaRangpur:

			RangpurSadarThana rang = new RangpurSadarThana();

			ft.replace(R.id.frame_container, rang);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnTaraganjThanaRangpur:

			TaraganjThana tara = new TaraganjThana();

			ft.replace(R.id.frame_container, tara);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}
	}

}
