package com.example.feniDsitrictAllThana;

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

public class FeniDistrictFragment extends Fragment implements OnClickListener {

	Button btnChhagalnaiyaThana, btnDaganbhuiyanThana, btnSadarThana,
			btnFulgaziThana, btnParsuramThana, btnSonagaziThana;

	public FeniDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.feni_district_fragment,
				container, false);

		btnChhagalnaiyaThana = (Button) view
				.findViewById(R.id.btnChhagalniyaThanaFeni);
		btnDaganbhuiyanThana = (Button) view
				.findViewById(R.id.btnDaganvhuiyaThanaFeni);
		btnSadarThana = (Button) view.findViewById(R.id.btnSadarThanaFeni);
		btnFulgaziThana = (Button) view.findViewById(R.id.btnFulgaziThanaFeni);
		btnParsuramThana = (Button) view
				.findViewById(R.id.btnParsuramThanaFeni);
		btnSonagaziThana = (Button) view
				.findViewById(R.id.btnSonagaziThanaFeni);

		btnChhagalnaiyaThana.setOnClickListener(this);
		btnDaganbhuiyanThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnFulgaziThana.setOnClickListener(this);
		btnParsuramThana.setOnClickListener(this);
		btnSonagaziThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {

		case R.id.btnDaganvhuiyaThanaFeni:

			DaganbhuiyanThana dagan = new DaganbhuiyanThana();

			ft.replace(R.id.frame_container, dagan);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnChhagalniyaThanaFeni:
			ChhagalnaiyaThana chagal = new ChhagalnaiyaThana();

			ft.replace(R.id.frame_container, chagal);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnSadarThanaFeni:

			FeniSadarThana sadar = new FeniSadarThana();

			ft.replace(R.id.frame_container, sadar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnFulgaziThanaFeni:
			FulgaziThana fulgazi = new FulgaziThana();

			ft.replace(R.id.frame_container, fulgazi);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnParsuramThanaFeni:

			ParshuramThana parshu = new ParshuramThana();

			ft.replace(R.id.frame_container, parshu);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSonagaziThanaFeni:

			SonagaziThana sona = new SonagaziThana();

			ft.replace(R.id.frame_container, sona);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
