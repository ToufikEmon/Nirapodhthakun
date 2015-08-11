package com.example.bograDistrictAllThana;

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

public class BograDistrictFragment extends Fragment implements OnClickListener {
	Button btnAdamdighiThana, btnSadarThana, btnDhunatThana,
			btnDhupchanchiaThana, btnGabtaliThana, btnKahalooThana,
			btnNandigramThana, btnSariakandiThana, btnShajadpurThana,
			btnSherpurThana, btnShibganjThana, btnSonatolaThana;

	public BograDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.bogra_district_fragment,
				container, false);

		btnAdamdighiThana = (Button) view
				.findViewById(R.id.btnAdamdighiThanaBogra);
		btnSadarThana = (Button) view
				.findViewById(R.id.btnBograSadarThanaBogra);
		btnDhunatThana = (Button) view.findViewById(R.id.btnDhunatThanaBogra);
		btnDhupchanchiaThana = (Button) view
				.findViewById(R.id.btnDhupchanchiaThanaBogra);
		btnGabtaliThana = (Button) view.findViewById(R.id.btnGabtoliThanabogra);
		btnKahalooThana = (Button) view.findViewById(R.id.btnKahalooThanaBogra);
		btnNandigramThana = (Button) view
				.findViewById(R.id.btnNandigramThanaBogra);
		btnSariakandiThana = (Button) view
				.findViewById(R.id.btnSariakandiThanaBogra);
		btnShajadpurThana = (Button) view
				.findViewById(R.id.btnShajahanpurThanaBora);
		btnSherpurThana = (Button) view.findViewById(R.id.btnSherpurThanaBogra);
		btnShibganjThana = (Button) view
				.findViewById(R.id.btnShibganjThanaBogra);
		btnSonatolaThana = (Button) view
				.findViewById(R.id.btnSontolaThanaBogra);

		btnAdamdighiThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnDhunatThana.setOnClickListener(this);
		btnDhupchanchiaThana.setOnClickListener(this);
		btnGabtaliThana.setOnClickListener(this);
		btnKahalooThana.setOnClickListener(this);
		btnNandigramThana.setOnClickListener(this);
		btnSariakandiThana.setOnClickListener(this);
		btnShajadpurThana.setOnClickListener(this);
		btnSherpurThana.setOnClickListener(this);
		btnShibganjThana.setOnClickListener(this);
		btnSonatolaThana.setOnClickListener(this);
		return view;
	}

	@Override
	public void onClick(View v) {
		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnAdamdighiThanaBogra:

			AdamdighiThana adam = new AdamdighiThana();

			ft.replace(R.id.frame_container, adam);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnBograSadarThanaBogra:

			BograSadarThana sadar = new BograSadarThana();
			ft.replace(R.id.frame_container, sadar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnDhunatThanaBogra:
			DhunatThana dhunat = new DhunatThana();
			ft.replace(R.id.frame_container, dhunat);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnDhupchanchiaThanaBogra:

			DhupchanchiaThana dhup = new DhupchanchiaThana();
			ft.replace(R.id.frame_container, dhup);
			ft.addToBackStack(null);
			ft.commit();
			break;

		case R.id.btnGabtoliThanabogra:
			GabtaliThana gabtali = new GabtaliThana();
			ft.replace(R.id.frame_container, gabtali);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnKahalooThanaBogra:
			KahalooThana kahaloo = new KahalooThana();
			ft.replace(R.id.frame_container, kahaloo);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnNandigramThanaBogra:

			NandigramThana nandigram = new NandigramThana();
			ft.replace(R.id.frame_container, nandigram);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnSariakandiThanaBogra:

			SariakandiThana saria = new SariakandiThana();
			ft.replace(R.id.frame_container, saria);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnShajahanpurThanaBora:

			ShajahanpurThana shajan = new ShajahanpurThana();
			ft.replace(R.id.frame_container, shajan);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnSherpurThanaBogra:
			SherpurThana sherpur = new SherpurThana();
			ft.replace(R.id.frame_container, sherpur);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnShibganjThanaBogra:
			ShibganjThana shibganj = new ShibganjThana();
			ft.replace(R.id.frame_container, shibganj);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnSontolaThanaBogra:

			SonatolaThana sontaola = new SonatolaThana();
			ft.replace(R.id.frame_container, sontaola);
			ft.addToBackStack(null);
			ft.commit();
			break;

		default:
			break;
		}

	}
}
