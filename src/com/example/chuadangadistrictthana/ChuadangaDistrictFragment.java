package com.example.chuadangadistrictthana;

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

public class ChuadangaDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnAlamdangaThana, btnSadarThana, btnDamurhudaThana,
			btnJibannagarThana;

	public ChuadangaDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.chuadanga_district_fragment,
				container, false);

		btnAlamdangaThana = (Button) view
				.findViewById(R.id.btnAlamdangaThanaChuadanga);
		btnSadarThana = (Button) view.findViewById(R.id.btnSadarThanaChuadanga);
		btnDamurhudaThana = (Button) view
				.findViewById(R.id.btnDamuuhudaThanaChuadanga);
		btnJibannagarThana = (Button) view
				.findViewById(R.id.btnJibannagarThanaChuadanga);

		btnAlamdangaThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnDamurhudaThana.setOnClickListener(this);
		btnJibannagarThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnAlamdangaThanaChuadanga:

			AlamdangaThana alamdanga = new AlamdangaThana();

			ft.replace(R.id.frame_container, alamdanga);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnSadarThanaChuadanga:

			ChudangaSadarThana sadar = new ChudangaSadarThana();

			ft.replace(R.id.frame_container, sadar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnDamuuhudaThanaChuadanga:

			DamurhudaThana damurhuda = new DamurhudaThana();

			ft.replace(R.id.frame_container, damurhuda);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnJibannagarThanaChuadanga:

			JibannagarThana jiban = new JibannagarThana();

			ft.replace(R.id.frame_container, jiban);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
