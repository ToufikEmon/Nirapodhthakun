package com.example.coxsbazarDistrictAllThana;

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

public class CoxsBazarDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnChakariaThana, btnSadarThana, btnKutubdiaThana,
			btnMaheshkhaliThana, btnPekuaThana, btnRamuaThana, btnTeknafThana,
			btnUkhiaThana;

	public CoxsBazarDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.coxsbazar_district_fragment,
				container, false);

		btnChakariaThana = (Button) view
				.findViewById(R.id.btnChakariaThanaCoxsBazar);
		btnSadarThana = (Button) view.findViewById(R.id.btnSadarThanaCoxsBazar);
		btnKutubdiaThana = (Button) view
				.findViewById(R.id.btnKutubdiaThanaCoxsBazar);
		btnMaheshkhaliThana = (Button) view
				.findViewById(R.id.btnMaheshkhaliThanaCoxsBazar);
		btnPekuaThana = (Button) view.findViewById(R.id.btnPekuaThanaCoxsbazar);
		btnRamuaThana = (Button) view.findViewById(R.id.btnRamuThanaCoxsbazar);
		btnTeknafThana = (Button) view
				.findViewById(R.id.btnTeknafThanaCoxsbazar);
		btnUkhiaThana = (Button) view.findViewById(R.id.btnUkhiaThanaCoxsbazar);

		btnChakariaThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnKutubdiaThana.setOnClickListener(this);
		btnMaheshkhaliThana.setOnClickListener(this);
		btnPekuaThana.setOnClickListener(this);
		btnRamuaThana.setOnClickListener(this);
		btnTeknafThana.setOnClickListener(this);
		btnUkhiaThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnChakariaThanaCoxsBazar:

			ChakariaThana chaka = new ChakariaThana();

			ft.replace(R.id.frame_container, chaka);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnSadarThanaCoxsBazar:

			CoxsbazarSadarThana coxs = new CoxsbazarSadarThana();

			ft.replace(R.id.frame_container, coxs);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnKutubdiaThanaCoxsBazar:

			KutubdiaThana kutub = new KutubdiaThana();

			ft.replace(R.id.frame_container, kutub);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnMaheshkhaliThanaCoxsBazar:

			MaheshkhaliThana mahes = new MaheshkhaliThana();

			ft.replace(R.id.frame_container, mahes);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnPekuaThanaCoxsbazar:

			PekuaThana pekua = new PekuaThana();

			ft.replace(R.id.frame_container, pekua);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnRamuThanaCoxsbazar:

			RamuThana ramu = new RamuThana();

			ft.replace(R.id.frame_container, ramu);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnTeknafThanaCoxsbazar:

			TeknafThana teknaf = new TeknafThana();

			ft.replace(R.id.frame_container, teknaf);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnUkhiaThanaCoxsbazar:

			UkhiaThana ukhia = new UkhiaThana();

			ft.replace(R.id.frame_container, ukhia);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
