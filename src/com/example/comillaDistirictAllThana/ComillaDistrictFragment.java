package com.example.comillaDistirictAllThana;

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

public class ComillaDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnBaruaThana, btnBrahmanparaThana, btnBurichangThana,
			btnChnadinaThana, btnChuaddagramThana, btnAdarashaThana,
			btnDaudkandiThana, btnDebidwarThana, btnHomnaThana, btnLaksamThana,
			btnMeghnaThana, btnMonohargonjThana, btnMuradnagarThaan,
			btnNangalkotThana, btnTitasThana, btnSadarDaskinThana;

	public ComillaDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.comilla_district_fragment,
				container, false);

		btnBaruaThana = (Button) view.findViewById(R.id.btnBaruaThanaComilla);
		btnBrahmanparaThana = (Button) view
				.findViewById(R.id.btnBrahamanparaThanaComilla);
		btnBurichangThana = (Button) view
				.findViewById(R.id.btnBuriachangThanaComilla);
		btnChnadinaThana = (Button) view
				.findViewById(R.id.btnChandinaThanaComilla);
		btnChuaddagramThana = (Button) view
				.findViewById(R.id.btnChauddagramThanaComilla);
		btnAdarashaThana = (Button) view
				.findViewById(R.id.btnAdarshaThanaComilla);
		btnDaudkandiThana = (Button) view
				.findViewById(R.id.btnDaudkandiThanaComilla);
		btnDebidwarThana = (Button) view
				.findViewById(R.id.btnDebidwarThanaComilla);
		btnHomnaThana = (Button) view.findViewById(R.id.btnHomnaThanaComilla);
		btnLaksamThana = (Button) view.findViewById(R.id.btnLaksamThanaComilla);
		btnMeghnaThana = (Button) view.findViewById(R.id.btnMghnaThanaComilla);
		btnMonohargonjThana = (Button) view
				.findViewById(R.id.btnMonoharganjThanaComilla);
		btnMuradnagarThaan = (Button) view
				.findViewById(R.id.btnMuradnagarThanaComilla);
		btnNangalkotThana = (Button) view
				.findViewById(R.id.btnNangalkotThanaComilla);
		btnTitasThana = (Button) view.findViewById(R.id.btnTitasThanaComilla);

		btnSadarDaskinThana = (Button) view
				.findViewById(R.id.btnSadarDaskinThanaComilla);

		btnBaruaThana.setOnClickListener(this);
		btnBrahmanparaThana.setOnClickListener(this);
		btnBurichangThana.setOnClickListener(this);
		btnChnadinaThana.setOnClickListener(this);
		btnChuaddagramThana.setOnClickListener(this);
		btnAdarashaThana.setOnClickListener(this);
		btnDaudkandiThana.setOnClickListener(this);
		btnDebidwarThana.setOnClickListener(this);
		btnHomnaThana.setOnClickListener(this);
		btnLaksamThana.setOnClickListener(this);
		btnMeghnaThana.setOnClickListener(this);
		btnMonohargonjThana.setOnClickListener(this);
		btnMuradnagarThaan.setOnClickListener(this);
		btnNangalkotThana.setOnClickListener(this);
		btnTitasThana.setOnClickListener(this);
		btnSadarDaskinThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnBaruaThanaComilla:
			BaruraThana barura = new BaruraThana();
			ft.replace(R.id.frame_container, barura);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnBrahamanparaThanaComilla:

			BrahmanparaThana brahmanpara = new BrahmanparaThana();

			ft.replace(R.id.frame_container, brahmanpara);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnBuriachangThanaComilla:

			BurichangThana buriachang = new BurichangThana();
			ft.replace(R.id.frame_container, buriachang);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnChandinaThanaComilla:
			ChandinaThana chandina = new ChandinaThana();
			ft.replace(R.id.frame_container, chandina);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnChauddagramThanaComilla:

			ChauddagramThana chauddagram = new ChauddagramThana();
			ft.replace(R.id.frame_container, chauddagram);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnAdarshaThanaComilla:

			ComillaAdarshaThana adarsha = new ComillaAdarshaThana();
			ft.replace(R.id.frame_container, adarsha);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSadarDaskinThanaComilla:

			ComillaSadarDaksinThana sadardaskin = new ComillaSadarDaksinThana();
			ft.replace(R.id.frame_container, sadardaskin);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnDaudkandiThanaComilla:
			DaudkandiThana daudkandi = new DaudkandiThana();
			ft.replace(R.id.frame_container, daudkandi);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnDebidwarThanaComilla:
			DebidwarThana debidwar = new DebidwarThana();
			ft.replace(R.id.frame_container, debidwar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnHomnaThanaComilla:

			HomnaThana homna = new HomnaThana();
			ft.replace(R.id.frame_container, homna);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnLaksamThanaComilla:

			LaksamThana laksam = new LaksamThana();
			ft.replace(R.id.frame_container, laksam);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnMghnaThanaComilla:

			MeghnaThana meghna = new MeghnaThana();
			ft.replace(R.id.frame_container, meghna);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnMonoharganjThanaComilla:
			MonohargonjThana monohar = new MonohargonjThana();
			ft.replace(R.id.frame_container, monohar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnMuradnagarThanaComilla:

			MuradnagarThana muradnagar = new MuradnagarThana();
			ft.replace(R.id.frame_container, muradnagar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnNangalkotThanaComilla:

			NangalkotThana nangolkot = new NangalkotThana();
			ft.replace(R.id.frame_container, nangolkot);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnTitasThanaComilla:

			TitasThana titas = new TitasThana();
			ft.replace(R.id.frame_container, titas);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
