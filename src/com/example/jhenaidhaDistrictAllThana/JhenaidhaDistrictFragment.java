package com.example.jhenaidhaDistrictAllThana;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.nirapodthakun.R;

public class JhenaidhaDistrictFragment extends Fragment implements
		android.view.View.OnClickListener {

	Button btnHarinakundaThana, btnSadarThana, btnKaliganjThana,
			btnKotchadpurThana, btnMaheshpurThana, btnShailkupaThana;

	public JhenaidhaDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.jhenidha_district_fragment,
				container, false);

		btnHarinakundaThana = (Button) view
				.findViewById(R.id.btnHarinakundaThanaJhenaidha);
		btnSadarThana = (Button) view.findViewById(R.id.btnSadarThanaJhenaidha);
		btnKaliganjThana = (Button) view
				.findViewById(R.id.btnKaliganjThanaJhenaidha);
		btnKotchadpurThana = (Button) view
				.findViewById(R.id.btnKotchandpurThanaJhenaidha);
		btnMaheshpurThana = (Button) view
				.findViewById(R.id.btnMaheshpurThanaJhenaidha);
		btnShailkupaThana = (Button) view
				.findViewById(R.id.btnShailkupaThanaJhenaidha);

		btnHarinakundaThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnKaliganjThana.setOnClickListener(this);
		btnKotchadpurThana.setOnClickListener(this);
		btnMaheshpurThana.setOnClickListener(this);
		btnShailkupaThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {
		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnHarinakundaThanaJhenaidha:

			HarinakundaThana hari = new HarinakundaThana();

			ft.replace(R.id.frame_container, hari);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnSadarThanaJhenaidha:

			JhenidhaSadarThana jhe = new JhenidhaSadarThana();

			ft.replace(R.id.frame_container, jhe);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnKaliganjThanaJhenaidha:

			KaliganjThana kali = new KaliganjThana();

			ft.replace(R.id.frame_container, kali);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnKotchandpurThanaJhenaidha:

			KotchandpurThana kotcha = new KotchandpurThana();

			ft.replace(R.id.frame_container, kotcha);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnMaheshpurThanaJhenaidha:

			MaheshpurThana mahes = new MaheshpurThana();

			ft.replace(R.id.frame_container, mahes);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnShailkupaThanaJhenaidha:

			ShailkupaThana shail = new ShailkupaThana();

			ft.replace(R.id.frame_container, shail);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
