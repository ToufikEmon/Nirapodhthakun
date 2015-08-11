package com.example.chapainawabganjDistrictAllThana;

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

public class NawabanjDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnBholahatThana, btnGomastapurThana, btnNacholeThana,
			btnSadarThana, btnShibganjThana;

	public NawabanjDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.nawabganj_district_fragment,
				container, false);

		btnBholahatThana = (Button) view
				.findViewById(R.id.btnBholahatThanaChapaiNawabganj);
		btnGomastapurThana = (Button) view
				.findViewById(R.id.btnGomastapurThanaChapaiNawabganj);
		btnNacholeThana = (Button) view
				.findViewById(R.id.btnNacholeThanaChapaiNawabganj);
		btnSadarThana = (Button) view
				.findViewById(R.id.btnSadarThanaChapaiNawabganj);
		btnShibganjThana = (Button) view
				.findViewById(R.id.btnShibganjThanaChapaiNawabganj);

		btnBholahatThana.setOnClickListener(this);
		btnGomastapurThana.setOnClickListener(this);
		btnNacholeThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnShibganjThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnBholahatThanaChapaiNawabganj:

			BholahatThana bholahat = new BholahatThana();

			ft.replace(R.id.frame_container, bholahat);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnGomastapurThanaChapaiNawabganj:

			GomastapurThana gomasta = new GomastapurThana();

			ft.replace(R.id.frame_container, gomasta);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnNacholeThanaChapaiNawabganj:

			NacholeThana nachole = new NacholeThana();

			ft.replace(R.id.frame_container, nachole);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSadarThanaChapaiNawabganj:

			NawabganjSadarThana sadar = new NawabganjSadarThana();

			ft.replace(R.id.frame_container, sadar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnShibganjThanaChapaiNawabganj:

			ShibganjThana shib = new ShibganjThana();

			ft.replace(R.id.frame_container, shib);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
