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

@SuppressLint("NewApi")
public class HomeFragment extends Fragment implements OnClickListener {

	Button btnNariSurrokha, btnDhakaDivision, btnKhulnaDivision,
			btnChittagonDivision, btnRajshahiDivision, btnBorishalDivision,
			btnSylheDivision, btnRangpurdivision;

	public HomeFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_home, container, false);

		// Button initialise in a fragment

		btnNariSurrokha = (Button) view.findViewById(R.id.btnNariSurokkha);
		btnDhakaDivision = (Button) view.findViewById(R.id.btnDhakaDivision);
		btnKhulnaDivision = (Button) view.findViewById(R.id.btnKhulnaDivision);
		btnChittagonDivision = (Button) view
				.findViewById(R.id.btnChittaongDivision);
		btnRajshahiDivision = (Button) view
				.findViewById(R.id.btnRajshahiDivision);
		btnBorishalDivision = (Button) view
				.findViewById(R.id.btnBorishalDivision);
		btnSylheDivision = (Button) view.findViewById(R.id.btnSylhetDivision);
		btnRangpurdivision = (Button) view
				.findViewById(R.id.btnRangpurDivision);

		// Set Action In Button

		btnNariSurrokha.setOnClickListener(this);
		btnDhakaDivision.setOnClickListener(this);
		btnKhulnaDivision.setOnClickListener(this);
		btnChittagonDivision.setOnClickListener(this);
		btnRajshahiDivision.setOnClickListener(this);
		btnBorishalDivision.setOnClickListener(this);
		btnSylheDivision.setOnClickListener(this);
		btnRangpurdivision.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {
		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnNariSurokkha:

			NariSurokkha nari = new NariSurokkha();
			ft.replace(R.id.frame_container, nari);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnDhakaDivision:

			DhakaDivisionFragment dha = new DhakaDivisionFragment();
			ft.replace(R.id.frame_container, dha);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnKhulnaDivision:

			KhulnaDivisionFragment khu = new KhulnaDivisionFragment();
			ft.replace(R.id.frame_container, khu);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnChittaongDivision:

			ChittagongDivisionFragment chi = new ChittagongDivisionFragment();
			ft.replace(R.id.frame_container, chi);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnRajshahiDivision:

			RajshahiDivisionFragment raj = new RajshahiDivisionFragment();
			ft.replace(R.id.frame_container, raj);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnBorishalDivision:

			BorisalDivisionFragment bor = new BorisalDivisionFragment();
			ft.replace(R.id.frame_container, bor);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnSylhetDivision:

			SylhetDivisionFragment syl = new SylhetDivisionFragment();
			ft.replace(R.id.frame_container, syl);
			ft.addToBackStack(null);
			ft.commit();
			break;

		case R.id.btnRangpurDivision:

			RangpurDivisionFragment rang = new RangpurDivisionFragment();
			ft.replace(R.id.frame_container, rang);
			ft.addToBackStack(null);
			ft.commit();
			break;

		default:
			break;
		}

	}

}
