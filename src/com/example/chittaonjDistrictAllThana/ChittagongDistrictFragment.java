package com.example.chittaonjDistrictAllThana;

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

public class ChittagongDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnAnwaraThana, btnBandorThana, btnBanshkhaliThana,
			btnBoalkhaliThana, bntChandanlaishThana, btnChnadgaonThana,
			btnDoublemooringThana, btnFatikchhariThana, btnHathazariThana,
			btnKotwaliThana, btnLohagaraThana, btnMirsharaiThana,
			btnPahartaliThana, btnPanchalaishThana, bntPatiyaThana,
			btnRanguniaThana, btnRaozanThana, btnSandwipThana,
			btnSatkaniaThana, btnSitakundaThana;

	public ChittagongDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.chittagong_district_fragment,
				container, false);

		btnAnwaraThana = (Button) view
				.findViewById(R.id.btnAnwaraThanaChittagong);
		btnBandorThana = (Button) view
				.findViewById(R.id.btnBandorThanaChittagong);
		btnBanshkhaliThana = (Button) view
				.findViewById(R.id.btnBanshkhaliThanaChittagong);
		btnBoalkhaliThana = (Button) view
				.findViewById(R.id.btnBoalkhaliThanaChittagong);
		bntChandanlaishThana = (Button) view
				.findViewById(R.id.btnChandanaishThanaChittagong);
		btnChnadgaonThana = (Button) view
				.findViewById(R.id.btnChandgaonThanaChittagong);
		btnDoublemooringThana = (Button) view
				.findViewById(R.id.btnDoublemooringThanaChittagong);
		btnFatikchhariThana = (Button) view
				.findViewById(R.id.btnFatikchariThanaChittagong);
		btnHathazariThana = (Button) view
				.findViewById(R.id.btnHathazariThanaChittagong);
		btnKotwaliThana = (Button) view
				.findViewById(R.id.btnKotwaliThanaChittagong);
		btnLohagaraThana = (Button) view
				.findViewById(R.id.btnLohagaraThanaChittagong);
		btnMirsharaiThana = (Button) view
				.findViewById(R.id.btnMirsharaiThanaChittagong);
		btnPahartaliThana = (Button) view
				.findViewById(R.id.btnPahartaliThanaChittagong);
		btnPanchalaishThana = (Button) view
				.findViewById(R.id.btnPanchlaishThanaChittagong);
		bntPatiyaThana = (Button) view
				.findViewById(R.id.btnPatiyaThanaChittagong);
		btnRanguniaThana = (Button) view
				.findViewById(R.id.btnRanguniaThanaChittagong);
		btnRaozanThana = (Button) view
				.findViewById(R.id.btnRaozanThanaChittagong);
		btnSandwipThana = (Button) view
				.findViewById(R.id.btnSandwipThanaChittagong);
		btnSatkaniaThana = (Button) view
				.findViewById(R.id.btnSatkaniaThanaChittagong);
		btnSitakundaThana = (Button) view
				.findViewById(R.id.btnSitakundaThanaChittagong);

		btnAnwaraThana.setOnClickListener(this);
		btnBandorThana.setOnClickListener(this);
		btnBanshkhaliThana.setOnClickListener(this);
		btnBoalkhaliThana.setOnClickListener(this);
		bntChandanlaishThana.setOnClickListener(this);
		btnChnadgaonThana.setOnClickListener(this);
		btnDoublemooringThana.setOnClickListener(this);
		btnFatikchhariThana.setOnClickListener(this);
		btnHathazariThana.setOnClickListener(this);
		btnKotwaliThana.setOnClickListener(this);
		btnLohagaraThana.setOnClickListener(this);
		btnMirsharaiThana.setOnClickListener(this);
		btnPahartaliThana.setOnClickListener(this);
		btnPanchalaishThana.setOnClickListener(this);
		bntPatiyaThana.setOnClickListener(this);
		btnRanguniaThana.setOnClickListener(this);
		btnRaozanThana.setOnClickListener(this);
		btnSandwipThana.setOnClickListener(this);
		btnSatkaniaThana.setOnClickListener(this);
		btnSitakundaThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnAnwaraThanaChittagong:

			AnwaraThana anwara = new AnwaraThana();

			ft.replace(R.id.frame_container, anwara);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnBandorThanaChittagong:

			BandorThana bandor = new BandorThana();
			ft.replace(R.id.frame_container, bandor);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnBanshkhaliThanaChittagong:
			BanshkhaliThana banshakhali = new BanshkhaliThana();

			ft.replace(R.id.frame_container, banshakhali);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnBoalkhaliThanaChittagong:
			BoalkhaliThana boalkhali = new BoalkhaliThana();
			ft.replace(R.id.frame_container, boalkhali);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnChandanaishThanaChittagong:

			ChandanaishThana chandanaish = new ChandanaishThana();
			ft.replace(R.id.frame_container, chandanaish);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnChandgaonThanaChittagong:

			ChandgaonThana chandagaon = new ChandgaonThana();
			ft.replace(R.id.frame_container, chandagaon);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnDoublemooringThanaChittagong:

			DoubleMooringThana doublem = new DoubleMooringThana();

			ft.replace(R.id.frame_container, doublem);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnFatikchariThanaChittagong:

			FatikchhariThana fatikcari = new FatikchhariThana();
			ft.replace(R.id.frame_container, fatikcari);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnHathazariThanaChittagong:
			HathazariThana hathazari = new HathazariThana();
			ft.replace(R.id.frame_container, hathazari);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnKotwaliThanaChittagong:

			KotwaliThana kotwali = new KotwaliThana();
			ft.replace(R.id.frame_container, kotwali);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnLohagaraThanaChittagong:
			LohagaraThana loha = new LohagaraThana();

			ft.replace(R.id.frame_container, loha);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnMirsharaiThanaChittagong:

			MirsharaiThana mirsarai = new MirsharaiThana();

			ft.replace(R.id.frame_container, mirsarai);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnPahartaliThanaChittagong:

			PahartaliThana pahartali = new PahartaliThana();
			ft.replace(R.id.frame_container, pahartali);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnPanchlaishThanaChittagong:

			PanchlaishThana panchala = new PanchlaishThana();

			ft.replace(R.id.frame_container, panchala);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnPatiyaThanaChittagong:
			PatiyaThana patiy = new PatiyaThana();

			ft.replace(R.id.frame_container, patiy);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnRanguniaThanaChittagong:

			RanguniaThana rangunia = new RanguniaThana();
			ft.replace(R.id.frame_container, rangunia);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnRaozanThanaChittagong:

			RaozanThana raozan = new RaozanThana();
			ft.replace(R.id.frame_container, raozan);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnSandwipThanaChittagong:
			SandwipThana sandwip = new SandwipThana();
			ft.replace(R.id.frame_container, sandwip);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSatkaniaThanaChittagong:

			SatkaniaThana satkania = new SatkaniaThana();
			ft.replace(R.id.frame_container, satkania);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSitakundaThanaChittagong:
			SitakundaThana sita = new SitakundaThana();
			ft.replace(R.id.frame_container, sita);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}
}
