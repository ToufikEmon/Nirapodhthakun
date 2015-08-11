package com.example.dinajpurDistrictAllThana;

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

public class DinajpurDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnBiralThana, btnBirampurThana, btnBirganjThana, btnBochaanjThana,
			btnChirirbariThana, btnSadarThana, btnGhoraghatThana,
			btnHakimpurThana, btnKahaloreThana, btnKhansamaThana,
			btnNawabganjThana, btnParbatipurThana, btnPhulbariThana;

	public DinajpurDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.dinajpur_district_fragment,
				container, false);

		btnBiralThana = (Button) view.findViewById(R.id.btnBiralThanaDinajpur);
		btnBirampurThana = (Button) view
				.findViewById(R.id.btnBirampurThanaDinajpur);
		btnBirganjThana = (Button) view
				.findViewById(R.id.btnBirganjThanaDinajpur);
		btnBochaanjThana = (Button) view
				.findViewById(R.id.btnBochaganjThanaDinajpur);
		btnChirirbariThana = (Button) view
				.findViewById(R.id.btnChirirbandarThanaDinajpur);
		btnSadarThana = (Button) view.findViewById(R.id.btnSadarThanaDinajpur);
		btnGhoraghatThana = (Button) view
				.findViewById(R.id.btnGoraghatThanaDinajpur);
		btnHakimpurThana = (Button) view
				.findViewById(R.id.btnHakimpurThanaDinajpur);
		btnKahaloreThana = (Button) view
				.findViewById(R.id.btnKahaloreThanaDinajpur);
		btnKhansamaThana = (Button) view
				.findViewById(R.id.btnKhansamaThanaDinajpur);
		btnNawabganjThana = (Button) view
				.findViewById(R.id.btnNawabganjThanaDinajpur);
		btnParbatipurThana = (Button) view
				.findViewById(R.id.btnParbatipurThanaDinajpur);
		btnPhulbariThana = (Button) view
				.findViewById(R.id.btnPhulbariThanaDinajpur);

		btnBiralThana.setOnClickListener(this);
		btnBirampurThana.setOnClickListener(this);
		btnBirganjThana.setOnClickListener(this);
		btnBochaanjThana.setOnClickListener(this);
		btnChirirbariThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnGhoraghatThana.setOnClickListener(this);
		btnHakimpurThana.setOnClickListener(this);
		btnKahaloreThana.setOnClickListener(this);
		btnKhansamaThana.setOnClickListener(this);
		btnNawabganjThana.setOnClickListener(this);
		btnParbatipurThana.setOnClickListener(this);
		btnPhulbariThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnBiralThanaDinajpur:

			BiralThana biral = new BiralThana();

			ft.replace(R.id.frame_container, biral);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnBirampurThanaDinajpur:

			BirampurThana biram = new BirampurThana();

			ft.replace(R.id.frame_container, biram);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnBirganjThanaDinajpur:

			BirganjThana birganj = new BirganjThana();

			ft.replace(R.id.frame_container, birganj);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnBochaganjThanaDinajpur:

			BochaganjThana bocha = new BochaganjThana();

			ft.replace(R.id.frame_container, bocha);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnChirirbandarThanaDinajpur:

			ChirirbandarThana chiri = new ChirirbandarThana();

			ft.replace(R.id.frame_container, chiri);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSadarThanaDinajpur:

			DinajpurSadarThana sadar = new DinajpurSadarThana();

			ft.replace(R.id.frame_container, sadar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnGoraghatThanaDinajpur:

			GhoraghatThana ghora = new GhoraghatThana();

			ft.replace(R.id.frame_container, ghora);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnHakimpurThanaDinajpur:

			HakimpurThana hakim = new HakimpurThana();

			ft.replace(R.id.frame_container, hakim);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnKahaloreThanaDinajpur:

			KaharoleThana kahalore = new KaharoleThana();

			ft.replace(R.id.frame_container, kahalore);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnKhansamaThanaDinajpur:

			KhansamaThana khansam = new KhansamaThana();

			ft.replace(R.id.frame_container, khansam);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnNawabganjThanaDinajpur:

			NawabganjThana nawabganj = new NawabganjThana();

			ft.replace(R.id.frame_container, nawabganj);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnParbatipurThanaDinajpur:

			ParbatipurThana parbati = new ParbatipurThana();

			ft.replace(R.id.frame_container, parbati);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnPhulbariThanaDinajpur:

			PhulbariThana phulbari = new PhulbariThana();

			ft.replace(R.id.frame_container, phulbari);
			ft.addToBackStack(null);
			ft.commit();

		default:
			break;
		}

	}

}
