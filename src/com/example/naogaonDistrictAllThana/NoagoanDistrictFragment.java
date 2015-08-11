package com.example.naogaonDistrictAllThana;

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

public class NoagoanDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnAtraiThana, btnBadalgacchiThana, btnDhamoirhatThana,
			btnMandaThana, btnModevurThana, btnSadarThana, btnNiamatpurThana,
			btnPatnitalaThana, btnPorshaThana, btnRaninagarThana,
			btnSapharThana;

	public NoagoanDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.naogaon_district_fragment,
				container, false);

		btnAtraiThana = (Button) view.findViewById(R.id.btnAtraiThanaNaogaon);
		btnBadalgacchiThana = (Button) view
				.findViewById(R.id.btnBadalgacchiThanaNaogaon);
		btnDhamoirhatThana = (Button) view
				.findViewById(R.id.btnDhamoirhatThanaNaogaon);
		btnMandaThana = (Button) view.findViewById(R.id.btnMandaThanaNaogaon);
		btnModevurThana = (Button) view
				.findViewById(R.id.btnMohadevpurThanaNaogaon);
		btnSadarThana = (Button) view.findViewById(R.id.btnSadarThanaNaogaon);
		btnNiamatpurThana = (Button) view
				.findViewById(R.id.btnNiamatpurThanaNaogaon);
		btnPatnitalaThana = (Button) view
				.findViewById(R.id.btnPatnitalaThanaNaogaon);
		btnPorshaThana = (Button) view.findViewById(R.id.btnPorshaThanaNaogaon);
		btnRaninagarThana = (Button) view
				.findViewById(R.id.btnRaninagarThanaNaogaon);
		btnSapharThana = (Button) view
				.findViewById(R.id.btnSapaharThanaNaogaon);

		btnAtraiThana.setOnClickListener(this);
		btnBadalgacchiThana.setOnClickListener(this);
		btnDhamoirhatThana.setOnClickListener(this);
		btnMandaThana.setOnClickListener(this);
		btnModevurThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnNiamatpurThana.setOnClickListener(this);
		btnPatnitalaThana.setOnClickListener(this);
		btnPorshaThana.setOnClickListener(this);
		btnRaninagarThana.setOnClickListener(this);

		btnSapharThana.setOnClickListener(this);
		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnAtraiThanaNaogaon:

			AtraiThana atrai = new AtraiThana();

			ft.replace(R.id.frame_container, atrai);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnBadalgacchiThanaNaogaon:

			BadalgachhiThana badal = new BadalgachhiThana();

			ft.replace(R.id.frame_container, badal);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnDhamoirhatThanaNaogaon:

			DhamoirhatThana dhamoirhat = new DhamoirhatThana();

			ft.replace(R.id.frame_container, dhamoirhat);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnMandaThanaNaogaon:

			MandaThana manda = new MandaThana();

			ft.replace(R.id.frame_container, manda);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnMohadevpurThanaNaogaon:

			MohadevpurThana mohadev = new MohadevpurThana();

			ft.replace(R.id.frame_container, mohadev);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnSadarThanaNaogaon:

			NaogaonSadarThana naogan = new NaogaonSadarThana();
			ft.replace(R.id.frame_container, naogan);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnNiamatpurThanaNaogaon:

			NiamatpurThana nia = new NiamatpurThana();

			ft.replace(R.id.frame_container, nia);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnPatnitalaThanaNaogaon:

			PatnitalaThana patni = new PatnitalaThana();

			ft.replace(R.id.frame_container, patni);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnPorshaThanaNaogaon:

			PorshaThana porsha = new PorshaThana();

			ft.replace(R.id.frame_container, porsha);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnRaninagarThanaNaogaon:

			RaninagarThana rani = new RaninagarThana();

			ft.replace(R.id.frame_container, rani);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnSapaharThanaNaogaon:

			SapaharThana sap = new SapaharThana();

			ft.replace(R.id.frame_container, sap);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
