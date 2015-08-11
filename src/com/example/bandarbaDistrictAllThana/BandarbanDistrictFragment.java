package com.example.bandarbaDistrictAllThana;

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

public class BandarbanDistrictFragment extends Fragment implements
		OnClickListener {
	Button btnAlikadamThana, btnSadarThana, btnLamaThana,
			btnNaikhongchariThana, btnRowangchhariThana, btnRumaThana,
			btnThanchiThana;

	public BandarbanDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.bandarban_district_fragment,
				container, false);

		btnAlikadamThana = (Button) view
				.findViewById(R.id.btnAlikadamThanaBandarban);
		btnSadarThana = (Button) view.findViewById(R.id.btnBandarbanSadarThana);
		btnLamaThana = (Button) view.findViewById(R.id.btnLamaThanaBandarban);
		btnNaikhongchariThana = (Button) view
				.findViewById(R.id.btnNaikongchhariThanabandarban);
		btnRowangchhariThana = (Button) view
				.findViewById(R.id.btnRownagchhariThanaBandarban);
		btnRumaThana = (Button) view.findViewById(R.id.btnRumaThanaBandarban);
		btnThanchiThana = (Button) view
				.findViewById(R.id.btnThanchiThanaBandarban);

		btnAlikadamThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnLamaThana.setOnClickListener(this);
		btnNaikhongchariThana.setOnClickListener(this);
		btnRowangchhariThana.setOnClickListener(this);
		btnRumaThana.setOnClickListener(this);
		btnThanchiThana.setOnClickListener(this);
		return view;
	}

	@Override
	public void onClick(View v) {
		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {

		case R.id.btnAlikadamThanaBandarban:

			AliKadamThana alika = new AliKadamThana();
			ft.replace(R.id.frame_container, alika);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnBandarbanSadarThana:
			BandarbanSadarThana bands = new BandarbanSadarThana();
			ft.replace(R.id.frame_container, bands);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnLamaThanaBandarban:

			LamaThana lama = new LamaThana();

			ft.replace(R.id.frame_container, lama);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnNaikongchhariThanabandarban:

			NaikhongchhariThana naika = new NaikhongchhariThana();
			ft.replace(R.id.frame_container, naika);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnRownagchhariThanaBandarban:
			RowangchhariThana rowa = new RowangchhariThana();
			ft.replace(R.id.frame_container, rowa);
			ft.addToBackStack(null);
			ft.commit();
			break;

		case R.id.btnRumaThanaBandarban:

			RumaThana ruma = new RumaThana();

			ft.replace(R.id.frame_container, ruma);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnThanchiThanaBandarban:
			ThanchiThana thanci = new ThanchiThana();

			ft.replace(R.id.frame_container, thanci);
			ft.addToBackStack(null);
			ft.commit();
			break;

		default:
			break;
		}
	}
}
