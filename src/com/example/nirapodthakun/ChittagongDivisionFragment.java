package com.example.nirapodthakun;

import com.example.bandarbaDistrictAllThana.BandarbanDistrictFragment;
import com.example.brahmanbariaDistrictAllThana.BrahamanbariaDistrictFragment;
import com.example.chadpurDistrictAllThana.ChadurDistrictFragment;
import com.example.chittaonjDistrictAllThana.ChittagongDistrictFragment;
import com.example.comillaDistirictAllThana.ComillaDistrictFragment;
import com.example.coxsbazarDistrictAllThana.CoxsBazarDistrictFragment;
import com.example.feniDsitrictAllThana.FeniDistrictFragment;
import com.example.khagrachariDistrictAllThana.KhagrachariDistrictFragment;
import com.example.lakshmipurDistrictAllThana.LakshmipurDistrictFragment;
import com.example.noakhaliDistrictAllThana.NoakhaliDistrictFragment;
import com.example.rangamatiDistrictAllThana.RangamatiDistrictFragment;

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

@SuppressLint("NewApi")
public class ChittagongDivisionFragment extends Fragment implements
		OnClickListener {

	Button btnChittagonjDistrict, btnComillaDistrict, btnKhagchariDistrict,
			btnBandarbanDistrict, btnCoxsBazarDistrict, btnLaksmipurDistrict,
			btnBrammanbariaDistrict, btnFeniDistrict, btnNoakhaliDistrict,
			btnChadpurDistrict, btnRangamatiDistrict;

	public ChittagongDivisionFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_chittagong_division,
				container, false);

		/*
		 * Button initialization
		 */

		btnBandarbanDistrict = (Button) rootView
				.findViewById(R.id.btnBandorbanDistrict);
		btnBrammanbariaDistrict = (Button) rootView
				.findViewById(R.id.btnBrammanbariaDistrict);
		btnChadpurDistrict = (Button) rootView
				.findViewById(R.id.btnChadpurDistrict);
		btnChittagonjDistrict = (Button) rootView
				.findViewById(R.id.btnChittagonDistrict);
		btnComillaDistrict = (Button) rootView
				.findViewById(R.id.btnComillaDistrict);
		btnCoxsBazarDistrict = (Button) rootView
				.findViewById(R.id.btnCoxbazarDistrict);
		btnFeniDistrict = (Button) rootView.findViewById(R.id.btnFeniDistrict);
		btnKhagchariDistrict = (Button) rootView
				.findViewById(R.id.btnKhagrachariDistrict);
		btnLaksmipurDistrict = (Button) rootView
				.findViewById(R.id.btnLokkhipurDistrict);
		btnNoakhaliDistrict = (Button) rootView
				.findViewById(R.id.btnNoakhaliDistrict);
		btnRangamatiDistrict = (Button) rootView
				.findViewById(R.id.btnRangamatiDistrict);

		btnBandarbanDistrict.setOnClickListener(this);
		btnBrammanbariaDistrict.setOnClickListener(this);
		btnChadpurDistrict.setOnClickListener(this);
		btnChittagonjDistrict.setOnClickListener(this);
		btnComillaDistrict.setOnClickListener(this);
		btnCoxsBazarDistrict.setOnClickListener(this);
		btnFeniDistrict.setOnClickListener(this);
		btnKhagchariDistrict.setOnClickListener(this);
		btnLaksmipurDistrict.setOnClickListener(this);
		btnNoakhaliDistrict.setOnClickListener(this);
		btnRangamatiDistrict.setOnClickListener(this);

		return rootView;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnBandorbanDistrict:

			BandarbanDistrictFragment bandarban = new BandarbanDistrictFragment();
			ft.replace(R.id.frame_container, bandarban);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnBrammanbariaDistrict:

			BrahamanbariaDistrictFragment brammanbarai = new BrahamanbariaDistrictFragment();
			ft.replace(R.id.frame_container, brammanbarai);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnChadpurDistrict:

			ChadurDistrictFragment chadpur = new ChadurDistrictFragment();
			ft.replace(R.id.frame_container, chadpur);
			ft.addToBackStack(null);
			ft.commit();
			break;

		case R.id.btnComillaDistrict:

			ComillaDistrictFragment comilla = new ComillaDistrictFragment();
			ft.replace(R.id.frame_container, comilla);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnChittagonDistrict:

			ChittagongDistrictFragment chittaganj = new ChittagongDistrictFragment();
			ft.replace(R.id.frame_container, chittaganj);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnCoxbazarDistrict:
			CoxsBazarDistrictFragment coxs = new CoxsBazarDistrictFragment();
			ft.replace(R.id.frame_container, coxs);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnFeniDistrict:

			FeniDistrictFragment feni = new FeniDistrictFragment();
			ft.replace(R.id.frame_container, feni);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnKhagrachariDistrict:

			KhagrachariDistrictFragment khagrachari = new KhagrachariDistrictFragment();
			ft.replace(R.id.frame_container, khagrachari);
			ft.addToBackStack(null);
			ft.commit();
			break;

		case R.id.btnNoakhaliDistrict:

			NoakhaliDistrictFragment noakhali = new NoakhaliDistrictFragment();
			ft.replace(R.id.frame_container, noakhali);
			ft.addToBackStack(null);
			ft.commit();
			break;

		case R.id.btnRangamatiDistrict:

			RangamatiDistrictFragment rangamati = new RangamatiDistrictFragment();
			ft.replace(R.id.frame_container, rangamati);
			ft.addToBackStack(null);
			ft.commit();
			break;

		case R.id.btnLokkhipurDistrict:

			LakshmipurDistrictFragment lasmi = new LakshmipurDistrictFragment();
			ft.replace(R.id.frame_container, lasmi);
			ft.addToBackStack(null);
			ft.commit();
			break;

		default:
			break;
		}

	}

}
