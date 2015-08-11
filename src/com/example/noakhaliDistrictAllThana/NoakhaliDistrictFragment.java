package com.example.noakhaliDistrictAllThana;

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

public class NoakhaliDistrictFragment extends Fragment implements
		OnClickListener {

	Button btnBegumganjThana, btnChatkhaliThana, btnCompaniganjThana,
			btnHatiyaThana, btnSadarThana, btnSenbaghThana, btnSonaimuriThana,
			btnSubarnacharThana;

	public NoakhaliDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.noakhali_district_fragment,
				container, false);

		btnBegumganjThana = (Button) view
				.findViewById(R.id.btnBegumganjThanaNoakhali);
		btnChatkhaliThana = (Button) view
				.findViewById(R.id.btnChatkhilThanaNoakhali);
		btnCompaniganjThana = (Button) view
				.findViewById(R.id.btnCompaniganjThanaNoakhali);
		btnHatiyaThana = (Button) view.findViewById(R.id.btnHatiaThanaNoakhali);
		btnSadarThana = (Button) view.findViewById(R.id.btnSadarThanaNoakhali);
		btnSenbaghThana = (Button) view
				.findViewById(R.id.btnSenbaghThanaNoakhali);
		btnSonaimuriThana = (Button) view
				.findViewById(R.id.btnSonaimuriThanaNoakhali);
		btnSubarnacharThana = (Button) view
				.findViewById(R.id.btnSubarnacharThanaNoakhali);

		btnBegumganjThana.setOnClickListener(this);
		btnChatkhaliThana.setOnClickListener(this);
		btnCompaniganjThana.setOnClickListener(this);
		btnHatiyaThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnSenbaghThana.setOnClickListener(this);
		btnSonaimuriThana.setOnClickListener(this);
		btnSubarnacharThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnBegumganjThanaNoakhali:

			BegumganjThana begum = new BegumganjThana();

			ft.replace(R.id.frame_container, begum);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnChatkhilThanaNoakhali:

			ChatkhilThana chat = new ChatkhilThana();

			ft.replace(R.id.frame_container, chat);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnCompaniganjThanaNoakhali:

			CompaniganjThana compani = new CompaniganjThana();

			ft.replace(R.id.frame_container, compani);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnHatiaThanaNoakhali:

			HatiyaThana hatia = new HatiyaThana();

			ft.replace(R.id.frame_container, hatia);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSadarThanaNoakhali:

			NoakhaliSadarThana sadr = new NoakhaliSadarThana();

			ft.replace(R.id.frame_container, sadr);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSenbaghThanaNoakhali:

			SenbaghThana senbagh = new SenbaghThana();

			ft.replace(R.id.frame_container, senbagh);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSonaimuriThanaNoakhali:

			SonaimuriThana sonai = new SonaimuriThana();

			ft.replace(R.id.frame_container, sonai);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSubarnacharThanaNoakhali:

			SubarnacharThana subar = new SubarnacharThana();

			ft.replace(R.id.frame_container, subar);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
