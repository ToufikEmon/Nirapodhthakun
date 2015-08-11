package com.example.joypurhatDistrictAllThana;

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

public class JoypurhatDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnAkkelpurThana, btnSadarThana, btnKalaiThana, btnKhetlalThana,
			btnPanchbibiThana;

	public JoypurhatDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.joypurhat_district_fragment,
				container, false);

		btnAkkelpurThana = (Button) view
				.findViewById(R.id.btnAkkelpurThanaJoypurhat);
		btnSadarThana = (Button) view.findViewById(R.id.btnSadarThanaJoypurhat);
		btnKalaiThana = (Button) view.findViewById(R.id.btnKalaiThanaJoypurhat);
		btnKhetlalThana = (Button) view
				.findViewById(R.id.btnKhetlalThanaJoypurhat);
		btnPanchbibiThana = (Button) view
				.findViewById(R.id.btnPanchbibiThanaJoypurhat);

		btnAkkelpurThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnKalaiThana.setOnClickListener(this);
		btnKhetlalThana.setOnClickListener(this);
		btnPanchbibiThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnAkkelpurThanaJoypurhat:

			AkkelpurThana akkelpur = new AkkelpurThana();

			ft.replace(R.id.frame_container, akkelpur);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnSadarThanaJoypurhat:

			JoypurhatSadarThana joy = new JoypurhatSadarThana();

			ft.replace(R.id.frame_container, joy);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnKalaiThanaJoypurhat:

			KalaiThana kalai = new KalaiThana();

			ft.replace(R.id.frame_container, kalai);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnKhetlalThanaJoypurhat:

			KhetlalThana khetlala = new KhetlalThana();

			ft.replace(R.id.frame_container, khetlala);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnPanchbibiThanaJoypurhat:

			PanchbibiThana panchbibi = new PanchbibiThana();

			ft.replace(R.id.frame_container, panchbibi);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
