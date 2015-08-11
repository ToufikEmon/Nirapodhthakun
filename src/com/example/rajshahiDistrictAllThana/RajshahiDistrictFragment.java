package com.example.rajshahiDistrictAllThana;

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

public class RajshahiDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnBaghaThana, btnBagmaraThana, btnBoaliaThana, btnCharghatThana,
			btnDurgapurThana, btnGodagariThana, btnMatiharThana,
			btnMohanpurThana, btnPabaThana, btnPuthiaThana, btnRajparaThana,
			btnSadarThana, btnShahmakdumThana;

	public RajshahiDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.rajshahi_district_fragment,
				container, false);

		btnBaghaThana = (Button) view.findViewById(R.id.btnBaghaThanaRajshahi);
		btnBagmaraThana = (Button) view
				.findViewById(R.id.btnBagmaraThanaRajshahi);
		btnBoaliaThana = (Button) view
				.findViewById(R.id.btnBoaliaThanaRajshahi);
		btnCharghatThana = (Button) view
				.findViewById(R.id.btnCharghatThanaRajshahi);
		btnDurgapurThana = (Button) view
				.findViewById(R.id.btnDurgapurThanaRajshahi);
		btnGodagariThana = (Button) view
				.findViewById(R.id.btnGodagariThanaRajshahi);
		btnMatiharThana = (Button) view
				.findViewById(R.id.btnMatiharThanaRajshahi);
		btnMohanpurThana = (Button) view
				.findViewById(R.id.btnMohanpurThanaRajshahi);
		btnPabaThana = (Button) view.findViewById(R.id.btnPabnThanaRajshahi);
		btnPuthiaThana = (Button) view
				.findViewById(R.id.btnPuthiaThanaRajshahi);
		btnRajparaThana = (Button) view
				.findViewById(R.id.btnRajparaThanaRajshahi);
		// btnSadarThana= (Button) view.findViewById(R.id.btnSadarThanaR);
		btnShahmakdumThana = (Button) view
				.findViewById(R.id.btnShahmakdumThanaRajshahi);

		btnBaghaThana.setOnClickListener(this);

		btnBagmaraThana.setOnClickListener(this);
		btnBoaliaThana.setOnClickListener(this);
		btnCharghatThana.setOnClickListener(this);
		btnDurgapurThana.setOnClickListener(this);
		btnGodagariThana.setOnClickListener(this);
		btnMatiharThana.setOnClickListener(this);
		btnMohanpurThana.setOnClickListener(this);
		btnPabaThana.setOnClickListener(this);
		btnPuthiaThana.setOnClickListener(this);
		btnRajparaThana.setOnClickListener(this);
		// btnSadarThana.setOnClickListener(this);
		btnShahmakdumThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnBaghaThanaRajshahi:
			BaghaThana bagha = new BaghaThana();

			ft.replace(R.id.frame_container, bagha);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnBagmaraThanaRajshahi:

			BagmaraThana bag = new BagmaraThana();

			ft.replace(R.id.frame_container, bag);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnBoaliaThanaRajshahi:

			BoaliaThana boali = new BoaliaThana();

			ft.replace(R.id.frame_container, boali);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnCharghatThanaRajshahi:

			CharghatThana charg = new CharghatThana();

			ft.replace(R.id.frame_container, charg);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnDurgapurThanaRajshahi:
			DurgapurThana durga = new DurgapurThana();
			ft.replace(R.id.frame_container, durga);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnGodagariThanaRajshahi:

			GodagariThana godagari = new GodagariThana();

			ft.replace(R.id.frame_container, godagari);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnMatiharThanaRajshahi:

			MatiharThana matihar = new MatiharThana();

			ft.replace(R.id.frame_container, matihar);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnMohanpurThanaRajshahi:

			MohanpurThana mohan = new MohanpurThana();

			ft.replace(R.id.frame_container, mohan);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnPabnThanaRajshahi:

			PabaThana paba = new PabaThana();

			ft.replace(R.id.frame_container, paba);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnPuthiaThanaRajshahi:

			PuthiaThana puthia = new PuthiaThana();

			ft.replace(R.id.frame_container, puthia);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnRajparaThanaRajshahi:

			RajparaThana raj = new RajparaThana();

			ft.replace(R.id.frame_container, raj);
			ft.addToBackStack(null);
			ft.commit();

			break;

		case R.id.btnShahmakdumThanaRajshahi:

			ShahmakdumThana shah = new ShahmakdumThana();

			ft.replace(R.id.frame_container, shah);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}
}
