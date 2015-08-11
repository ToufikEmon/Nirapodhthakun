package com.example.nilphamariDistrictAllThana;

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

public class NilphamariDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnDimlaThana, btnDomarThana, btnJalkandaThana, btnKishoreganjThana,
			btnSadarThana, btnSaidpurThana;

	public NilphamariDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.nilphamary_district_fragment,
				container, false);

		btnDimlaThana = (Button) view
				.findViewById(R.id.btnDimlaThanaNilphamari);
		btnDomarThana = (Button) view
				.findViewById(R.id.btnDomarThanaNilphamari);
		btnJalkandaThana = (Button) view
				.findViewById(R.id.btnJalkandaThanaNilphamari);
		btnKishoreganjThana = (Button) view
				.findViewById(R.id.btnKishoreganjThanaNilphamari);
		btnSadarThana = (Button) view.findViewById(R.id.btnSadarThanaNilphamri);
		btnSaidpurThana = (Button) view
				.findViewById(R.id.btnSaidpurThanaNilphamari);

		btnDimlaThana.setOnClickListener(this);
		btnDomarThana.setOnClickListener(this);
		btnJalkandaThana.setOnClickListener(this);
		btnKishoreganjThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnSaidpurThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnDimlaThanaNilphamari:

			DimlaThana dimla = new DimlaThana();

			ft.replace(R.id.frame_container, dimla);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnDomarThanaNilphamari:

			DomarThana domar = new DomarThana();

			ft.replace(R.id.frame_container, domar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnJalkandaThanaNilphamari:

			JaldhakaThana jaldhaka = new JaldhakaThana();

			ft.replace(R.id.frame_container, jaldhaka);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnKishoreganjThanaNilphamari:

			KishoreganjThana kishore = new KishoreganjThana();

			ft.replace(R.id.frame_container, kishore);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSadarThanaNilphamri:

			NilphamariSadarThana nilhamari = new NilphamariSadarThana();

			ft.replace(R.id.frame_container, nilhamari);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSaidpurThanaNilphamari:

			SaidpurThana said = new SaidpurThana();

			ft.replace(R.id.frame_container, said);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}
	}

}
