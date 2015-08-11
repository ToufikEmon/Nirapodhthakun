package com.example.bagerhatDistrictAllThana;

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

public class BagerhatDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnSadarThana, btnChitalmariThana, btnKocuaThana, btnMollarhatThana,
			btnMonglaThana, btnRamalThana, btnSoronkholaThana,
			btnMorolgonjThana;

	public BagerhatDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.bagerhat_district_fragment,
				container, false);

		btnSadarThana = (Button) view.findViewById(R.id.btnBagerhatSadarThana);
		btnChitalmariThana = (Button) view.findViewById(R.id.btnChitalmariThan);
		btnKocuaThana = (Button) view.findViewById(R.id.btnKocuaThana);
		btnMollarhatThana = (Button) view.findViewById(R.id.btnMollahatThana);
		btnMonglaThana = (Button) view.findViewById(R.id.btnMonglaThana);
		btnRamalThana = (Button) view.findViewById(R.id.btnRampalThana);
		btnSoronkholaThana = (Button) view
				.findViewById(R.id.btnSoronkholaThana);
		btnMorolgonjThana = (Button) view.findViewById(R.id.btnMorolgonjThana);

		btnSadarThana.setOnClickListener(this);
		btnChitalmariThana.setOnClickListener(this);

		btnKocuaThana.setOnClickListener(this);
		btnMollarhatThana.setOnClickListener(this);
		btnMonglaThana.setOnClickListener(this);
		btnRamalThana.setOnClickListener(this);
		btnSoronkholaThana.setOnClickListener(this);
		btnMorolgonjThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {
		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {

		case R.id.btnBagerhatSadarThana:

			BagerhatSadar bgs = new BagerhatSadar();
			ft.replace(R.id.frame_container, bgs);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnChitalmariThan:
			ChitalmariThana chital = new ChitalmariThana();
			ft.replace(R.id.frame_container, chital);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnKocuaThana:

			KocuaThana kocua = new KocuaThana();

			ft.replace(R.id.frame_container, kocua);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnMollahatThana:

			MollahatThana mollahat = new MollahatThana();
			ft.replace(R.id.frame_container, mollahat);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnMonglaThana:
			MonglaThana mongla = new MonglaThana();

			ft.replace(R.id.frame_container, mongla);
			ft.addToBackStack(null);
			ft.commit();
			break;

		case R.id.btnRampalThana:

			RampalThana rampal = new RampalThana();

			ft.replace(R.id.frame_container, rampal);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnSoronkholaThana:
			SoronkholaThana soron = new SoronkholaThana();

			ft.replace(R.id.frame_container, soron);
			ft.addToBackStack(null);
			ft.commit();
			break;

		case R.id.btnMorolgonjThana:
			MorolgonjThana morol = new MorolgonjThana();

			ft.replace(R.id.frame_container, morol);
			ft.addToBackStack(null);
			ft.commit();
			break;

		default:
			break;
		}

	}
}
