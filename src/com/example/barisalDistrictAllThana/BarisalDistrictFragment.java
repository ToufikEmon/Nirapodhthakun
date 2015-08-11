package com.example.barisalDistrictAllThana;

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

public class BarisalDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnBarisalSadarThana, btnHizlaThana, btnGaurnadiThana,
			btnAgailjaharaThana, btnBabuganjThana, btnBakerganjThana,
			btnMuladiThana, btnMehendiganjThana, btnWazirpurThana,
			btnBanariparaThana;

	public BarisalDistrictFragment() {

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.barisal_district_fragment,
				container, false);
		/*
		 * Initialize Button
		 */

		btnAgailjaharaThana = (Button) view
				.findViewById(R.id.btnAgailjharaThana);
		btnBabuganjThana = (Button) view.findViewById(R.id.btnBabuganjThana);
		btnBakerganjThana = (Button) view.findViewById(R.id.btnBakerganjThana);
		btnBanariparaThana = (Button) view
				.findViewById(R.id.btnBanariparaThana);
		btnBarisalSadarThana = (Button) view
				.findViewById(R.id.btnBarisalSadarThana);
		btnGaurnadiThana = (Button) view.findViewById(R.id.btnGaurnadiThana);
		btnHizlaThana = (Button) view.findViewById(R.id.btnHizlaThana);
		btnMehendiganjThana = (Button) view
				.findViewById(R.id.btnMehendiganjThana);
		btnMuladiThana = (Button) view.findViewById(R.id.btnMuladiThana);
		btnWazirpurThana = (Button) view.findViewById(R.id.btnWazirpurThana);

		/*
		 * Set Action On Button
		 */

		btnAgailjaharaThana.setOnClickListener(this);
		btnBabuganjThana.setOnClickListener(this);
		btnBakerganjThana.setOnClickListener(this);
		btnBanariparaThana.setOnClickListener(this);
		btnBarisalSadarThana.setOnClickListener(this);
		btnGaurnadiThana.setOnClickListener(this);
		btnHizlaThana.setOnClickListener(this);
		btnMehendiganjThana.setOnClickListener(this);
		btnMuladiThana.setOnClickListener(this);
		btnWazirpurThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {
		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();
		switch (v.getId()) {
		case R.id.btnAgailjharaThana:

			AgailjharaThana alig = new AgailjharaThana();
			ft.replace(R.id.frame_container, alig);
			ft.commit();

			break;
		case R.id.btnBabuganjThana:

			BabuganjThana babuganj = new BabuganjThana();
			ft.replace(R.id.frame_container, babuganj);
			ft.commit();

			break;
		case R.id.btnBakerganjThana:

			BakerganjThana bakerganj = new BakerganjThana();
			ft.replace(R.id.frame_container, bakerganj);
			ft.commit();

			break;
		case R.id.btnBanariparaThana:

			BanariparaThana banaripara = new BanariparaThana();
			ft.replace(R.id.frame_container, banaripara);
			ft.commit();

			break;
		case R.id.btnBarisalSadarThana:

			BarisalSadarThana barsadar = new BarisalSadarThana();
			ft.replace(R.id.frame_container, barsadar);
			ft.commit();

			break;
		case R.id.btnGaurnadiThana:

			GaurnadiThana gaurnadi = new GaurnadiThana();
			ft.replace(R.id.frame_container, gaurnadi);
			ft.commit();

			break;
		case R.id.btnHizlaThana:

			HizlaThana hizla = new HizlaThana();
			ft.replace(R.id.frame_container, hizla);
			ft.commit();

			break;
		case R.id.btnMehendiganjThana:

			MehendiganjThana mehendiganj = new MehendiganjThana();
			ft.replace(R.id.frame_container, mehendiganj);
			ft.commit();

			break;
		case R.id.btnMuladiThana:

			MuladiThana muladi = new MuladiThana();
			ft.replace(R.id.frame_container, muladi);
			ft.commit();

			break;
		case R.id.btnWazirpurThana:

			WazirpurThana wazirpur = new WazirpurThana();
			ft.replace(R.id.frame_container, wazirpur);
			ft.commit();

			break;

		default:
			break;
		}

	}
}
