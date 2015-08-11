package com.example.nirapodthakun;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.bagerhatDistrictAllThana.BagerhatDistrictFragment;
import com.example.chuadangadistrictthana.ChuadangaDistrictFragment;
import com.example.jessoreDistrictAllThana.JessoreDistrictFragment;
import com.example.jhenaidhaDistrictAllThana.JhenaidhaDistrictFragment;
import com.example.khulnadistrictthana.KhulnaDistrictFragment;
import com.example.kustiadistrictallthana.KustiaDistrictFragment;
import com.example.maguradistrictallthana.MaguraDistrictFragment;
import com.example.meherpurdistrictthana.MeherpurDistrictFragment;
import com.example.naraildistrictthana.NarailDistrictFragment;
import com.example.satkhiraDistrictAllthana.SatkhiraDistrictFragment;

@SuppressLint("NewApi")
public class KhulnaDivisionFragment extends Fragment implements OnClickListener {

	Button btnBagerhatDistrict, btnJhenidhaDistrict, btnMeherpurDistrict,
			btnChuadangaDistrict, btnKhulnaDistrict, btnNorailDistrict,
			btnJessoreDistrict, btnKustiaDistrict, btnShatkhiraDistrict,
			btnMaguraDistrict;

	public KhulnaDivisionFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_khulna_division,
				container, false);

		btnBagerhatDistrict = (Button) rootView
				.findViewById(R.id.btnBagerhatDistrict);
		btnChuadangaDistrict = (Button) rootView
				.findViewById(R.id.btnChuadangaDistrict);
		btnJessoreDistrict = (Button) rootView
				.findViewById(R.id.btnJessoreDistrict);
		btnJhenidhaDistrict = (Button) rootView
				.findViewById(R.id.btnJhedinaDistrict);
		btnKhulnaDistrict = (Button) rootView
				.findViewById(R.id.btnKhulnaDistrict);
		btnKustiaDistrict = (Button) rootView
				.findViewById(R.id.btnKustiaDistrict);
		btnMaguraDistrict = (Button) rootView
				.findViewById(R.id.btnMaguraDitrict);
		btnMeherpurDistrict = (Button) rootView
				.findViewById(R.id.btnMeherpurDistrict);
		btnNorailDistrict = (Button) rootView
				.findViewById(R.id.btnNarailDitrict);
		btnShatkhiraDistrict = (Button) rootView
				.findViewById(R.id.btnShatkhiraDistrict);

		btnBagerhatDistrict.setOnClickListener(this);
		btnJhenidhaDistrict.setOnClickListener(this);
		btnMeherpurDistrict.setOnClickListener(this);
		btnChuadangaDistrict.setOnClickListener(this);
		btnKhulnaDistrict.setOnClickListener(this);
		btnNorailDistrict.setOnClickListener(this);
		btnJessoreDistrict.setOnClickListener(this);
		btnKustiaDistrict.setOnClickListener(this);
		btnShatkhiraDistrict.setOnClickListener(this);
		btnMaguraDistrict.setOnClickListener(this);

		return rootView;
	}

	@Override
	public void onClick(View v) {
		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnBagerhatDistrict:
			BagerhatDistrictFragment bagerhat = new BagerhatDistrictFragment();
			ft.replace(R.id.frame_container, bagerhat);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnChuadangaDistrict:
			ChuadangaDistrictFragment chuadanga = new ChuadangaDistrictFragment();
			ft.replace(R.id.frame_container, chuadanga);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnJessoreDistrict:
			JessoreDistrictFragment jessore = new JessoreDistrictFragment();
			ft.replace(R.id.frame_container, jessore);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnJhedinaDistrict:
			JhenaidhaDistrictFragment jhenaidha = new JhenaidhaDistrictFragment();
			ft.replace(R.id.frame_container, jhenaidha);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnKhulnaDistrict:
			KhulnaDistrictFragment khulna = new KhulnaDistrictFragment();
			ft.replace(R.id.frame_container, khulna);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnKustiaDistrict:
			KustiaDistrictFragment kustia = new KustiaDistrictFragment();
			ft.replace(R.id.frame_container, kustia);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnMaguraDitrict:
			MaguraDistrictFragment magura = new MaguraDistrictFragment();
			ft.replace(R.id.frame_container, magura);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnMeherpurDistrict:
			MeherpurDistrictFragment meherpur = new MeherpurDistrictFragment();
			ft.replace(R.id.frame_container, meherpur);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnNarailDitrict:
			NarailDistrictFragment narail = new NarailDistrictFragment();
			ft.replace(R.id.frame_container, narail);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnShatkhiraDistrict:
			SatkhiraDistrictFragment shatkhira = new SatkhiraDistrictFragment();
			ft.replace(R.id.frame_container, shatkhira);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
