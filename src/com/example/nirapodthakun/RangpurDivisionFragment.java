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

import com.example.dinajpurDistrictAllThana.DinajpurDistrictFragment;
import com.example.gaibandhaDistrictAllThana.GaibandhaDistrictFragment;
import com.example.kurigramDistrictAllThana.KurigramDistrictFragment;
import com.example.lalmonirhatDistrictAllThana.LalmonirhatDistrictFragment;
import com.example.nilphamariDistrictAllThana.NilphamariDistrictFragment;
import com.example.panchagarhDistrictAllThana.PanchagarDistrictFragment;
import com.example.rangpurDistrictAllThana.RangpurDistrictFragment;
import com.example.thakurgaonDistrictAllThana.ThakurgaonDistrictFragment;

@SuppressLint("NewApi")
public class RangpurDivisionFragment extends Fragment implements
		OnClickListener {
	Button btnDinajpurDistrict, btnGaibandhaDistrict, btnKurigramDistrict,
			btnLalmonirhatDistrict, btnNilphamaryDistrict,
			btnPanchagarDistrict, btnRangpurDistrict, btnThakurgaonDistrict;

	public RangpurDivisionFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_rangpur_division,
				container, false);

		btnDinajpurDistrict = (Button) rootView
				.findViewById(R.id.btnDinajpurDistrict);
		btnGaibandhaDistrict = (Button) rootView
				.findViewById(R.id.btnGaibandhaDistrict);
		btnKurigramDistrict = (Button) rootView
				.findViewById(R.id.btnKurigramDistrict);
		btnLalmonirhatDistrict = (Button) rootView
				.findViewById(R.id.btnlalmonirhatDistrict);
		btnNilphamaryDistrict = (Button) rootView
				.findViewById(R.id.btnNilphamariDistrict);
		btnPanchagarDistrict = (Button) rootView
				.findViewById(R.id.btnPhancagorDistrict);
		btnRangpurDistrict = (Button) rootView
				.findViewById(R.id.btnRongpurDistrict);
		btnThakurgaonDistrict = (Button) rootView
				.findViewById(R.id.btnThakurgaonDistrict);

		btnDinajpurDistrict.setOnClickListener(this);
		btnGaibandhaDistrict.setOnClickListener(this);
		btnKurigramDistrict.setOnClickListener(this);
		btnLalmonirhatDistrict.setOnClickListener(this);
		btnNilphamaryDistrict.setOnClickListener(this);
		btnPanchagarDistrict.setOnClickListener(this);
		btnRangpurDistrict.setOnClickListener(this);
		btnThakurgaonDistrict.setOnClickListener(this);

		return rootView;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {

		case R.id.btnDinajpurDistrict:
			DinajpurDistrictFragment dinajpur = new DinajpurDistrictFragment();
			ft.replace(R.id.frame_container, dinajpur);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnGaibandhaDistrict:
			GaibandhaDistrictFragment gaibandha = new GaibandhaDistrictFragment();
			ft.replace(R.id.frame_container, gaibandha);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnKurigramDistrict:
			KurigramDistrictFragment kurigram = new KurigramDistrictFragment();
			ft.replace(R.id.frame_container, kurigram);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnlalmonirhatDistrict:
			LalmonirhatDistrictFragment lalmonirhat = new LalmonirhatDistrictFragment();
			ft.replace(R.id.frame_container, lalmonirhat);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnNilphamariDistrict:
			NilphamariDistrictFragment nilphamary = new NilphamariDistrictFragment();
			ft.replace(R.id.frame_container, nilphamary);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnPhancagorDistrict:
			PanchagarDistrictFragment panchagar = new PanchagarDistrictFragment();
			ft.replace(R.id.frame_container, panchagar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnRongpurDistrict:
			RangpurDistrictFragment rangpur = new RangpurDistrictFragment();
			ft.replace(R.id.frame_container, rangpur);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnThakurgaonDistrict:
			ThakurgaonDistrictFragment thakurgaon = new ThakurgaonDistrictFragment();
			ft.replace(R.id.frame_container, thakurgaon);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
