package com.example.gaibandhaDistrictAllThana;

import com.example.nirapodthakun.R;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class GaibandhaDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnSadarThana, btnGobindaganjThana, btnPalashbariThana,
			btnPhulchhariThana, btnSadullapurThana, btnSughattaThana,
			btnSundarganjThana;

	public GaibandhaDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.gaibandha_district_fragment,
				container, false);

		btnSadarThana = (Button) view.findViewById(R.id.btnSadarThanaGaibandha);
		btnGobindaganjThana = (Button) view
				.findViewById(R.id.btnGobindoganjThanaGaibandha);
		btnPalashbariThana = (Button) view
				.findViewById(R.id.btnPalashbariThanaGaibandha);
		btnPhulchhariThana = (Button) view
				.findViewById(R.id.btnPhulchariThanaGaibandha);
		btnSadullapurThana = (Button) view
				.findViewById(R.id.btnSadullapurThanaGaibandha);
		btnSughattaThana = (Button) view
				.findViewById(R.id.btnSughattaThanaGaibandha);
		btnSundarganjThana = (Button) view
				.findViewById(R.id.btnSundarganjThanaGaibandha);

		btnSadarThana.setOnClickListener(this);
		btnGobindaganjThana.setOnClickListener(this);
		btnPalashbariThana.setOnClickListener(this);
		btnPhulchhariThana.setOnClickListener(this);
		btnSadullapurThana.setOnClickListener(this);
		btnSughattaThana.setOnClickListener(this);
		btnSundarganjThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnSadarThanaGaibandha:

			GaibandhaSadarThana sadar = new GaibandhaSadarThana();

			ft.replace(R.id.frame_container, sadar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnGobindoganjThanaGaibandha:
			GobindaganjThana gobinda = new GobindaganjThana();

			ft.replace(R.id.frame_container, gobinda);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnPalashbariThanaGaibandha:

			PalashbariThana palash = new PalashbariThana();

			ft.replace(R.id.frame_container, palash);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnPhulchariThanaGaibandha:
			PhulchhariThana phulchari = new PhulchhariThana();
			ft.replace(R.id.frame_container, phulchari);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnSadullapurThanaGaibandha:

			SadullapurThana sadullapur = new SadullapurThana();

			ft.replace(R.id.frame_container, sadullapur);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSughattaThanaGaibandha:

			SughattaThana sugha = new SughattaThana();

			ft.replace(R.id.frame_container, sugha);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSundarganjThanaGaibandha:

			SundarganjThana sundar = new SundarganjThana();

			ft.replace(R.id.frame_container, sundar);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
