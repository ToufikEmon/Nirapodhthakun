package com.example.rangamatiDistrictAllThana;

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

public class RangamatiDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnBagaichhariThana, btnBarkalThana, btnBelaichhariThana,
			btnJuraichhariThana, btnKaptaiThana, btnKawkhaliThana,
			btnLangaduThana, btnNaniyarcharThana, btnRajasthaliThana,
			btnSadarThana;

	public RangamatiDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.rangamati_district_fragment,
				container, false);

		btnBagaichhariThana = (Button) view
				.findViewById(R.id.btnBagaichhariThanaRangamati);
		btnBarkalThana = (Button) view
				.findViewById(R.id.btnBarkalThanaRangamati);
		btnBelaichhariThana = (Button) view
				.findViewById(R.id.btnBelaichhariThanaRangamati);
		btnJuraichhariThana = (Button) view
				.findViewById(R.id.btnJuraichariThanaRangamati);
		btnKaptaiThana = (Button) view
				.findViewById(R.id.btnKaptaiThanaRangamati);
		btnKawkhaliThana = (Button) view
				.findViewById(R.id.btnKawkhaliThanaRangamati);
		btnLangaduThana = (Button) view
				.findViewById(R.id.btnLangaduThanaRangamati);
		btnNaniyarcharThana = (Button) view
				.findViewById(R.id.btnNaiyacharThanaRangamati);
		btnRajasthaliThana = (Button) view
				.findViewById(R.id.btnRajasthaliThanaRangamati);
		btnSadarThana = (Button) view.findViewById(R.id.btnSadarThanaRangamati);

		btnBagaichhariThana.setOnClickListener(this);
		btnBarkalThana.setOnClickListener(this);
		btnBelaichhariThana.setOnClickListener(this);
		btnJuraichhariThana.setOnClickListener(this);
		btnKaptaiThana.setOnClickListener(this);
		btnKawkhaliThana.setOnClickListener(this);
		btnLangaduThana.setOnClickListener(this);
		btnNaniyarcharThana.setOnClickListener(this);
		btnRajasthaliThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnBagaichhariThanaRangamati:

			BagaichhariThana bagai = new BagaichhariThana();

			ft.replace(R.id.frame_container, bagai);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnBarkalThanaRangamati:

			BarkalThana barkal = new BarkalThana();

			ft.replace(R.id.frame_container, barkal);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnBelaichhariThanaRangamati:
			BelaichhariThana belai = new BelaichhariThana();
			ft.replace(R.id.frame_container, belai);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnJuraichariThanaRangamati:

			JuraichhariThana jurai = new JuraichhariThana();

			ft.replace(R.id.frame_container, jurai);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnKaptaiThanaRangamati:

			KaptaiThana kaptai = new KaptaiThana();

			ft.replace(R.id.frame_container, kaptai);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnKawkhaliThanaRangamati:

			KawkhaliThana kaw = new KawkhaliThana();

			ft.replace(R.id.frame_container, kaw);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnLangaduThanaRangamati:

			LangaduThana langu = new LangaduThana();

			ft.replace(R.id.frame_container, langu);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnNaiyacharThanaRangamati:

			NaniyacharThana nani = new NaniyacharThana();

			ft.replace(R.id.frame_container, nani);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnRajasthaliThanaRangamati:

			RajasthaliThana rajas = new RajasthaliThana();

			ft.replace(R.id.frame_container, rajas);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnSadarThanaRangamati:

			RangamatiSadarThana ranga = new RangamatiSadarThana();
			ft.replace(R.id.frame_container, ranga);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
