package com.example.tangailDistrictAllThana;

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

public class TangaillDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnBasilThana, btnBhuapurThana, btnDelduarThana, btnDhanbariThana,
			btnGhatailThana, btnGopalpurThana, btnKalihatiThana,
			btnMadhupurThana, btnMirzapurThana, btnNagarpurThana,
			btnSakhipurThana, btnSadarThana;

	public TangaillDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.tangail_district, container,
				false);

		btnBasilThana = (Button) view.findViewById(R.id.btnBasilThanaTangail);
		btnBhuapurThana = (Button) view
				.findViewById(R.id.btnBhuapurThanaTangail);
		btnDelduarThana = (Button) view
				.findViewById(R.id.btnDelduarThanaTangail);
		btnDhanbariThana = (Button) view
				.findViewById(R.id.btnDhanbarThanaTangail);
		btnGhatailThana = (Button) view
				.findViewById(R.id.btnGhatailThanaTangail);
		btnGopalpurThana = (Button) view
				.findViewById(R.id.btnGopalpurThanaTangail);
		btnKalihatiThana = (Button) view
				.findViewById(R.id.btnKalihatiThanaTangail);
		btnMadhupurThana = (Button) view
				.findViewById(R.id.btnMadhupurThanaTangail);
		btnMirzapurThana = (Button) view
				.findViewById(R.id.btnMirzapurThanaTangail);
		btnNagarpurThana = (Button) view
				.findViewById(R.id.btnNagarpurThanaTangail);
		btnSakhipurThana = (Button) view
				.findViewById(R.id.btnSakhipurThanaTangail);
		btnSadarThana = (Button) view.findViewById(R.id.btnSadarThanaTangail);

		btnBasilThana.setOnClickListener(this);
		btnBhuapurThana.setOnClickListener(this);
		btnDelduarThana.setOnClickListener(this);
		btnDhanbariThana.setOnClickListener(this);
		btnGhatailThana.setOnClickListener(this);
		btnGopalpurThana.setOnClickListener(this);
		btnKalihatiThana.setOnClickListener(this);
		btnMadhupurThana.setOnClickListener(this);
		btnMirzapurThana.setOnClickListener(this);
		btnNagarpurThana.setOnClickListener(this);
		btnSakhipurThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		return view;
	}

	@Override
	public void onClick(View v) {
		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnBasilThanaTangail:

			BasilThana basil = new BasilThana();

			ft.replace(R.id.frame_container, basil);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnBhuapurThanaTangail:
			BhuapurThana bhua = new BhuapurThana();

			ft.replace(R.id.frame_container, bhua);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnDelduarThanaTangail:
			DelduarThana delduar = new DelduarThana();

			ft.replace(R.id.frame_container, delduar);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnDhanbarThanaTangail:
			DhanbariThana dhan = new DhanbariThana();

			ft.replace(R.id.frame_container, dhan);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnGhatailThanaTangail:
			GhatailThana ghatail = new GhatailThana();

			ft.replace(R.id.frame_container, ghatail);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnGopalpurThanaTangail:
			GopalpurThana gopalpur = new GopalpurThana();

			ft.replace(R.id.frame_container, gopalpur);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnKalihatiThanaTangail:
			KalihatiThana kalihati = new KalihatiThana();

			ft.replace(R.id.frame_container, kalihati);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnMadhupurThanaTangail:
			MadhupurThana madhu = new MadhupurThana();

			ft.replace(R.id.frame_container, madhu);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnMirzapurThanaTangail:
			MirzapurThana mirza = new MirzapurThana();

			ft.replace(R.id.frame_container, mirza);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnNagarpurThanaTangail:
			NagarpurThana nagarpur = new NagarpurThana();

			ft.replace(R.id.frame_container, nagarpur);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnSakhipurThanaTangail:
			SakhipurThana sakhipur = new SakhipurThana();

			ft.replace(R.id.frame_container, sakhipur);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnSadarThanaTangail:
			TangailSadarThana sadar = new TangailSadarThana();

			ft.replace(R.id.frame_container, sadar);
			ft.addToBackStack(null);
			ft.commit();
			break;

		default:
			break;
		}

	}
}
