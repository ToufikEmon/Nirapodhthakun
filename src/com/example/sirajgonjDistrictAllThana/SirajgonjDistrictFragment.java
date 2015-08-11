package com.example.sirajgonjDistrictAllThana;

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

public class SirajgonjDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnBelkuchiThana, btnChauhaliThana, btnKamarkandaThana,
			btnKazipurThana, btnRaiganjThana, btnShahjadpurThana,
			btnSadartThana, btnTarashThana, btnUllahparaThana;

	public SirajgonjDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.sirajgonj_district_fragment,
				container, false);

		btnBelkuchiThana = (Button) view
				.findViewById(R.id.btnBelkuchiThanaSirajgonj);
		btnChauhaliThana = (Button) view
				.findViewById(R.id.btnChauchaliThanaSirajgonj);
		btnKamarkandaThana = (Button) view
				.findViewById(R.id.btnKamarkandiThanaSirajgonj);
		btnKazipurThana = (Button) view
				.findViewById(R.id.btnKazipurThanaSirajgonj);
		btnRaiganjThana = (Button) view
				.findViewById(R.id.btnRaiganjThanaSirajgonj);
		btnShahjadpurThana = (Button) view.findViewById(R.id.btnShahjadpur);
		btnSadartThana = (Button) view
				.findViewById(R.id.btnSadarThanaSirajgonj);
		btnTarashThana = (Button) view
				.findViewById(R.id.btnTarashThanaSirajgonj);
		btnUllahparaThana = (Button) view
				.findViewById(R.id.btnUllahparaThanaSirajgonj);

		btnBelkuchiThana.setOnClickListener(this);
		btnChauhaliThana.setOnClickListener(this);
		btnKamarkandaThana.setOnClickListener(this);
		btnKazipurThana.setOnClickListener(this);
		btnRaiganjThana.setOnClickListener(this);
		btnShahjadpurThana.setOnClickListener(this);
		btnSadartThana.setOnClickListener(this);
		btnTarashThana.setOnClickListener(this);
		btnUllahparaThana.setOnClickListener(this);
		return view;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {

		case R.id.btnBelkuchiThanaSirajgonj:

			BelkuchiThana bel = new BelkuchiThana();

			ft.replace(R.id.frame_container, bel);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnChauchaliThanaSirajgonj:
			ChauhaliThana chau = new ChauhaliThana();
			ft.replace(R.id.frame_container, chau);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnKamarkandiThanaSirajgonj:

			KamarkhandaThana kamar = new KamarkhandaThana();

			ft.replace(R.id.frame_container, kamar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnKazipurThanaSirajgonj:

			KazipurThana kazi = new KazipurThana();

			ft.replace(R.id.frame_container, kazi);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnRaiganjThanaSirajgonj:
			RaiganjThana rai = new RaiganjThana();
			ft.replace(R.id.frame_container, rai);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnShahjadpur:

			ShahjadpurThana sha = new ShahjadpurThana();

			ft.replace(R.id.frame_container, sha);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSadarThanaSirajgonj:

			SirajgonjSadarThana siraj = new SirajgonjSadarThana();

			ft.replace(R.id.frame_container, siraj);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnTarashThanaSirajgonj:

			TarashThana tar = new TarashThana();

			ft.replace(R.id.frame_container, tar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnUllahparaThanaSirajgonj:

			UllahparaThana ulla = new UllahparaThana();

			ft.replace(R.id.frame_container, ulla);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
