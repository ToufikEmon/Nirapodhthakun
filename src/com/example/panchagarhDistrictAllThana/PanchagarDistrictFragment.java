package com.example.panchagarhDistrictAllThana;

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

public class PanchagarDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnAtwariThana, btnBodaThana, btnDebiganjThana, btnSadarThana,
			btnTetuliaThana;

	public PanchagarDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.panchagar_district_fragment,
				container, false);

		btnAtwariThana = (Button) view
				.findViewById(R.id.btnAtwariThanaPanchagar);
		btnBodaThana = (Button) view.findViewById(R.id.btnBodaThanaPanchagar);
		btnDebiganjThana = (Button) view
				.findViewById(R.id.btnDebiganjThanaPanchagar);
		btnSadarThana = (Button) view.findViewById(R.id.btnSadarThanaPanchagar);
		btnTetuliaThana = (Button) view
				.findViewById(R.id.btnTetuliaThanaPanchagar);

		btnAtwariThana.setOnClickListener(this);
		btnBodaThana.setOnClickListener(this);
		btnDebiganjThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnTetuliaThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnAtwariThanaPanchagar:

			AtwariThana atwari = new AtwariThana();

			ft.replace(R.id.frame_container, atwari);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnBodaThanaPanchagar:
			BodaThana boda = new BodaThana();

			ft.replace(R.id.frame_container, boda);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnDebiganjThanaPanchagar:

			DebiganjThana debi = new DebiganjThana();

			ft.replace(R.id.frame_container, debi);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSadarThanaPanchagar:

			PanchagarhSadarThana pancha = new PanchagarhSadarThana();

			ft.replace(R.id.frame_container, pancha);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnTetuliaThanaPanchagar:

			TetuliaThana tetulia = new TetuliaThana();

			ft.replace(R.id.frame_container, tetulia);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
