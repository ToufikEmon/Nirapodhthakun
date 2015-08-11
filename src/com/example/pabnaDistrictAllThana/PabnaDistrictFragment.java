package com.example.pabnaDistrictAllThana;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.nirapodthakun.R;

public class PabnaDistrictFragment extends Fragment implements OnClickListener {

	Button btnAtaikulaThana, btnAtghariaThana, btnBeraThana, btnBhanguraThana,
			btnChatmoharThana, btnFaridpurThana, btnIshwardiThana,
			btnSadarThana, btnSanthiaThana, btnSujanaagarThana;

	public PabnaDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.pabna_district_fragment,
				container, false);

		btnAtaikulaThana = (Button) view
				.findViewById(R.id.btnAtaikulaThanaPabna);
		btnAtghariaThana = (Button) view
				.findViewById(R.id.btnAtghariaThanaPabna);
		btnBeraThana = (Button) view.findViewById(R.id.btnBeraThanaPabna);
		btnBhanguraThana = (Button) view
				.findViewById(R.id.btnBhanguraThanaPabna);
		btnChatmoharThana = (Button) view
				.findViewById(R.id.btnChatmoharThanaPabna);
		btnFaridpurThana = (Button) view
				.findViewById(R.id.btnFaridpurThanaPabna);
		btnIshwardiThana = (Button) view
				.findViewById(R.id.btnIshwardiThanaPabna);
		btnSadarThana = (Button) view.findViewById(R.id.btnSadarThanaPabna);
		btnSanthiaThana = (Button) view.findViewById(R.id.btnSanthiaThanaPabna);
		btnSujanaagarThana = (Button) view
				.findViewById(R.id.btnSujanagarThanaPabna);

		btnAtaikulaThana.setOnClickListener(this);
		btnAtghariaThana.setOnClickListener(this);
		btnBeraThana.setOnClickListener(this);
		btnBhanguraThana.setOnClickListener(this);
		btnChatmoharThana.setOnClickListener(this);
		btnFaridpurThana.setOnClickListener(this);
		btnIshwardiThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnSanthiaThana.setOnClickListener(this);
		btnSujanaagarThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnAtaikulaThanaPabna:

			AtaikulaThana ataikula = new AtaikulaThana();

			ft.replace(R.id.frame_container, ataikula);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnAtghariaThanaPabna:

			AtghariaThana atgharia = new AtghariaThana();

			ft.replace(R.id.frame_container, atgharia);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnBeraThanaPabna:

			BeraThana bera = new BeraThana();

			ft.replace(R.id.frame_container, bera);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnBhanguraThanaPabna:

			BhanguraThana bhangura = new BhanguraThana();

			ft.replace(R.id.frame_container, bhangura);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnChatmoharThanaPabna:

			ChatmoharThana chatmohar = new ChatmoharThana();

			ft.replace(R.id.frame_container, chatmohar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnFaridpurThanaPabna:

			FaridpurThana farid = new FaridpurThana();

			ft.replace(R.id.frame_container, farid);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnIshwardiThanaPabna:

			IshwardiThana ishwardi = new IshwardiThana();

			ft.replace(R.id.frame_container, ishwardi);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSadarThanaPabna:

			PabnaSadarThana sadar = new PabnaSadarThana();

			ft.replace(R.id.frame_container, sadar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSanthiaThanaPabna:

			SanthiaThana santhia = new SanthiaThana();

			ft.replace(R.id.frame_container, santhia);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSujanagarThanaPabna:

			SujanagarThana suja = new SujanagarThana();

			ft.replace(R.id.frame_container, suja);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
