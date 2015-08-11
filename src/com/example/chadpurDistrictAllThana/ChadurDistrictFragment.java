package com.example.chadpurDistrictAllThana;

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

public class ChadurDistrictFragment extends Fragment implements OnClickListener {

	Button btnSadarThana, btnFaridganjThana, btnHaimchariThana,
			btnHaziganjThana, btnKachuaThana, btnMatlabDaskinThana,
			btnMatlabUttarThana, btnShahrastiThana;

	public ChadurDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.chadpur_district_fragment,
				container, false);

		btnSadarThana = (Button) view
				.findViewById(R.id.btnChadpurSadarThanaChadpur);
		btnFaridganjThana = (Button) view
				.findViewById(R.id.btnFaridganjThanaChadpur);
		btnHaimchariThana = (Button) view
				.findViewById(R.id.btnHaimchariThanaChadpur);
		btnHaziganjThana = (Button) view
				.findViewById(R.id.btnHaziganjThanaChadpur);
		btnKachuaThana = (Button) view.findViewById(R.id.btnKachuaThanaChadpur);
		btnMatlabDaskinThana = (Button) view
				.findViewById(R.id.btnMatlabDaskinThanaChadpur);
		btnMatlabUttarThana = (Button) view
				.findViewById(R.id.btnMatlabUttarThanaChadpur);
		btnShahrastiThana = (Button) view
				.findViewById(R.id.btnSharastiThanaChadpur);

		btnSadarThana.setOnClickListener(this);
		btnFaridganjThana.setOnClickListener(this);
		btnHaimchariThana.setOnClickListener(this);
		btnHaziganjThana.setOnClickListener(this);
		btnKachuaThana.setOnClickListener(this);
		btnMatlabDaskinThana.setOnClickListener(this);
		btnMatlabUttarThana.setOnClickListener(this);
		btnShahrastiThana.setOnClickListener(this);
		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {

		case R.id.btnChadpurSadarThanaChadpur:
			ChandpurSadarThana chand = new ChandpurSadarThana();
			ft.replace(R.id.frame_container, chand);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnFaridganjThanaChadpur:

			FaridganjThana farid = new FaridganjThana();

			ft.replace(R.id.frame_container, farid);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnHaimchariThanaChadpur:

			HaimcharThana haim = new HaimcharThana();

			ft.replace(R.id.frame_container, haim);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnHaziganjThanaChadpur:

			HaziganjThana hazi = new HaziganjThana();

			ft.replace(R.id.frame_container, hazi);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnKachuaThanaChadpur:

			KachuaThana kacua = new KachuaThana();

			ft.replace(R.id.frame_container, kacua);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnMatlabDaskinThanaChadpur:

			MatlabDakshinThana matlabd = new MatlabDakshinThana();

			ft.replace(R.id.frame_container, matlabd);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnMatlabUttarThanaChadpur:

			MatlabUttarThana uttar = new MatlabUttarThana();

			ft.replace(R.id.frame_container, uttar);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnSharastiThanaChadpur:

			ShahrastiThana sha = new ShahrastiThana();

			ft.replace(R.id.frame_container, sha);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}
	}

}
