package com.example.natoreDistrictAllThana;

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

public class NatoreDistrictFragment extends Fragment implements OnClickListener {

	Button btnBagatiparaThana, btnbaraigramThana, btnGurudaspurThana,
			btnLalpurThana, btnNaldangaThana, btnSadarThana, btnSingraThana;

	public NatoreDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.natore_district_fragment,
				container, false);

		btnBagatiparaThana = (Button) view
				.findViewById(R.id.btnBagatiparaThanaNatore);
		btnbaraigramThana = (Button) view
				.findViewById(R.id.btnBaraigramThanaNatore);
		btnGurudaspurThana = (Button) view
				.findViewById(R.id.btnGurudaspurThanaNatore);
		btnLalpurThana = (Button) view.findViewById(R.id.btnLalpurThanaNatore);
		btnNaldangaThana = (Button) view
				.findViewById(R.id.btnNaldangaThanaNatore);
		btnSadarThana = (Button) view.findViewById(R.id.btnSadarThanaNatore);
		btnSingraThana = (Button) view.findViewById(R.id.btnSingraThanaNatore);

		btnBagatiparaThana.setOnClickListener(this);
		btnbaraigramThana.setOnClickListener(this);
		btnGurudaspurThana.setOnClickListener(this);
		btnLalpurThana.setOnClickListener(this);
		btnNaldangaThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnSingraThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnBagatiparaThanaNatore:

			BagatiparaThana baga = new BagatiparaThana();

			ft.replace(R.id.frame_container, baga);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnBaraigramThanaNatore:
			BaraigramThana barai = new BaraigramThana();

			ft.replace(R.id.frame_container, barai);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnGurudaspurThanaNatore:

			GurudaspurThana gurudas = new GurudaspurThana();

			ft.replace(R.id.frame_container, gurudas);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnLalpurThanaNatore:

			LalpurThana lal = new LalpurThana();

			ft.replace(R.id.frame_container, lal);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnNaldangaThanaNatore:

			NaldangaThana naldan = new NaldangaThana();

			ft.replace(R.id.frame_container, naldan);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSadarThanaNatore:

			NatoreSadarThana sadar = new NatoreSadarThana();

			ft.replace(R.id.frame_container, sadar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSingraThanaNatore:

			SingraThana singra = new SingraThana();

			ft.replace(R.id.frame_container, singra);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}
}
