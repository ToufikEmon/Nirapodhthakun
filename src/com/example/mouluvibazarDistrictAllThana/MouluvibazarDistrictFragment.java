package com.example.mouluvibazarDistrictAllThana;

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

public class MouluvibazarDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnBarlekhaThan, btnJuriThana, btnKamalganjThana, btnKuluraThana,
			btnSadarThana, btnRajnagarThana, btnSreemangalThana;

	public MouluvibazarDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.mouluvibazar_district_fragment,
				container, false);

		btnBarlekhaThan = (Button) view
				.findViewById(R.id.btnBarlekhaThanaMouluvibazar);
		btnJuriThana = (Button) view
				.findViewById(R.id.btnJuriThanaMouluvibazar);
		btnKamalganjThana = (Button) view
				.findViewById(R.id.btnKamalganjThanaMouluvibazar);
		btnKuluraThana = (Button) view
				.findViewById(R.id.btnKuluraThanaMouluvibazar);
		btnSadarThana = (Button) view
				.findViewById(R.id.btnSadarThanaMouluvibazar);
		btnRajnagarThana = (Button) view
				.findViewById(R.id.btnRajanagarThanaMouluvibazar);
		btnSreemangalThana = (Button) view
				.findViewById(R.id.btnSreemangalThanaMouluvibazar);

		btnBarlekhaThan.setOnClickListener(this);
		btnJuriThana.setOnClickListener(this);
		btnKamalganjThana.setOnClickListener(this);
		btnKuluraThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnRajnagarThana.setOnClickListener(this);
		btnSreemangalThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnBarlekhaThanaMouluvibazar:

			BarlekhaThana barlekha = new BarlekhaThana();

			ft.replace(R.id.frame_container, barlekha);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnJuriThanaMouluvibazar:
			JuriThana juri = new JuriThana();

			ft.replace(R.id.frame_container, juri);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnKamalganjThanaMouluvibazar:

			KamalganjThana kamalganj = new KamalganjThana();

			ft.replace(R.id.frame_container, kamalganj);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnKuluraThanaMouluvibazar:

			KuluraThana kulura = new KuluraThana();

			ft.replace(R.id.frame_container, kulura);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSadarThanaMouluvibazar:

			MoulvibazarSadarThana sadar = new MoulvibazarSadarThana();

			ft.replace(R.id.frame_container, sadar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnRajanagarThanaMouluvibazar:

			RajnagarThana rajnagar = new RajnagarThana();

			ft.replace(R.id.frame_container, rajnagar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSreemangalThanaMouluvibazar:

			SreemangalThana sree = new SreemangalThana();

			ft.replace(R.id.frame_container, sree);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
