package com.example.lalmonirhatDistrictAllThana;

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

public class LalmonirhatDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnAditmariThana, btnHatibandhaThana, btnKaliganjThana,
			btnSadarThana, btnPatgramThana;

	public LalmonirhatDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.lalmonirhat_district_fragment,
				container, false);

		btnAditmariThana = (Button) view
				.findViewById(R.id.btnAditmariThanaLalmonirhat);
		btnHatibandhaThana = (Button) view
				.findViewById(R.id.btnHatibandaThanaLalmonirhat);
		btnKaliganjThana = (Button) view
				.findViewById(R.id.btnKaliganjThanaLalmonirhat);
		btnSadarThana = (Button) view
				.findViewById(R.id.btnSadarThanaLalmonirhat);
		btnPatgramThana = (Button) view
				.findViewById(R.id.btnPatgramThanaLalmonirhat);

		btnAditmariThana.setOnClickListener(this);
		btnHatibandhaThana.setOnClickListener(this);
		btnKaliganjThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnPatgramThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnAditmariThanaLalmonirhat:

			AditmariThana aditmari = new AditmariThana();

			ft.replace(R.id.frame_container, aditmari);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnHatibandaThanaLalmonirhat:

			HatibandhaThana hatibandha = new HatibandhaThana();

			ft.replace(R.id.frame_container, hatibandha);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnKaliganjThanaLalmonirhat:

			KaliganjThana kali = new KaliganjThana();

			ft.replace(R.id.frame_container, kali);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSadarThanaLalmonirhat:

			LalmonirhatSadarThana sadar = new LalmonirhatSadarThana();

			ft.replace(R.id.frame_container, sadar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnPatgramThanaLalmonirhat:

			PatgramThana path = new PatgramThana();

			ft.replace(R.id.frame_container, path);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
