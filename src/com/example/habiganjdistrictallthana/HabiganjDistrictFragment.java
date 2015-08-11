package com.example.habiganjdistrictallthana;

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

public class HabiganjDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnAjmirganjThana, btnBahubalThana, btnBaniyachangThana,
			btnChunarughatThana, btnSadarThana, btnLakhaiThana,
			btnMadhabpurThana, btnNabiganjThana;

	public HabiganjDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.hobiganj_district_fragment,
				container, false);

		btnAjmirganjThana = (Button) view
				.findViewById(R.id.btnAjmirganjThanaHabiganj);
		btnBahubalThana = (Button) view
				.findViewById(R.id.btnBahubalThanaHabiganj);
		btnBaniyachangThana = (Button) view
				.findViewById(R.id.btnBaniyachongThanaHabiganj);
		btnChunarughatThana = (Button) view
				.findViewById(R.id.btnChunarughatThanaHabiganj);
		btnSadarThana = (Button) view.findViewById(R.id.btnSadarThanaHabiganj);
		btnLakhaiThana = (Button) view
				.findViewById(R.id.btnLakhaiThanaHabiganj);
		btnMadhabpurThana = (Button) view
				.findViewById(R.id.btnMadhabpurThanaHabiganj);
		btnNabiganjThana = (Button) view
				.findViewById(R.id.btnNabiganjThanaHabiganj);

		btnAjmirganjThana.setOnClickListener(this);
		btnBahubalThana.setOnClickListener(this);
		btnBaniyachangThana.setOnClickListener(this);
		btnChunarughatThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnLakhaiThana.setOnClickListener(this);
		btnMadhabpurThana.setOnClickListener(this);
		btnNabiganjThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnAjmirganjThanaHabiganj:

			AjmirganjThana ajmirganj = new AjmirganjThana();

			ft.replace(R.id.frame_container, ajmirganj);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnBahubalThanaHabiganj:
			BahubalThana bahu = new BahubalThana();

			ft.replace(R.id.frame_container, bahu);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnBaniyachongThanaHabiganj:

			BaniyachongThan baniya = new BaniyachongThan();

			ft.replace(R.id.frame_container, baniya);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnChunarughatThanaHabiganj:

			ChunarughatThana chunaru = new ChunarughatThana();

			ft.replace(R.id.frame_container, chunaru);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnSadarThanaHabiganj:

			HabiganjSadarThana sadar = new HabiganjSadarThana();
			ft.replace(R.id.frame_container, sadar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnLakhaiThanaHabiganj:

			LakhaiThana lakhai = new LakhaiThana();

			ft.replace(R.id.frame_container, lakhai);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnMadhabpurThanaHabiganj:

			MadhabpurThana madhabpur = new MadhabpurThana();

			ft.replace(R.id.frame_container, madhabpur);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnNabiganjThanaHabiganj:
			NabiganjThana nabiganj = new NabiganjThana();
			ft.replace(R.id.frame_container, nabiganj);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
