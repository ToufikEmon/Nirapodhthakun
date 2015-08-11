package com.example.jessoreDistrictAllThana;

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

public class JessoreDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnAbhayanagarThana, btnBagherparaThana, btnChaugachhaThana,
			btnSadarThana, btnJhikargachhaThana, btnKeshabpurThana,
			btnManirampurThana, btnSharshaThana;

	public JessoreDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.jessore_district_fragment,
				container, false);

		btnAbhayanagarThana = (Button) view
				.findViewById(R.id.btnAbhayanagarThanaJessore);
		btnBagherparaThana = (Button) view
				.findViewById(R.id.btnBagherparaThanaJessore);
		btnChaugachhaThana = (Button) view
				.findViewById(R.id.btnChaugacchaThanaJessore);
		btnSadarThana = (Button) view.findViewById(R.id.btnSadarThanaJessore);
		btnJhikargachhaThana = (Button) view
				.findViewById(R.id.btnJhikargachaThanaJessore);
		btnKeshabpurThana = (Button) view
				.findViewById(R.id.btnKeshabpurThanaJessore);
		btnManirampurThana = (Button) view
				.findViewById(R.id.btnManirampurThanaJessore);
		btnSharshaThana = (Button) view
				.findViewById(R.id.btnSharshaThanaJessore);

		btnAbhayanagarThana.setOnClickListener(this);
		btnBagherparaThana.setOnClickListener(this);
		btnChaugachhaThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnJhikargachhaThana.setOnClickListener(this);
		btnKeshabpurThana.setOnClickListener(this);
		btnManirampurThana.setOnClickListener(this);
		btnSharshaThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnAbhayanagarThanaJessore:

			AbhayanagarThana abhy = new AbhayanagarThana();

			ft.replace(R.id.frame_container, abhy);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnBagherparaThanaJessore:

			BagherparaThana bager = new BagherparaThana();

			ft.replace(R.id.frame_container, bager);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnChaugacchaThanaJessore:

			ChaugachhaThana chau = new ChaugachhaThana();

			ft.replace(R.id.frame_container, chau);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSadarThanaJessore:

			JessoreSadarThana sadar = new JessoreSadarThana();

			ft.replace(R.id.frame_container, sadar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnJhikargachaThanaJessore:

			JhikargachaThana jhikar = new JhikargachaThana();

			ft.replace(R.id.frame_container, jhikar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnKeshabpurThanaJessore:

			KeshabpurThana keshab = new KeshabpurThana();

			ft.replace(R.id.frame_container, keshab);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnManirampurThanaJessore:

			ManirampurThana mani = new ManirampurThana();

			ft.replace(R.id.frame_container, mani);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSharshaThanaJessore:

			SharshaThana sharsha = new SharshaThana();

			ft.replace(R.id.frame_container, sharsha);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
