package com.example.sylhetDistrictAllThana;

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

public class SylhetDistrictFragment extends Fragment implements OnClickListener {

	Button btnBalaganjThana, btnBeanibazarThana, btnBishwanathThana,
			btnConpaniganjThana, btnFenchuganjThana, btnGopalganjThana,
			btnGoainghatThana, btnJaintapurThana, btnKanaighatThana,
			btnSouthSurmaThana, btnSadarThana, btnZakiganjThana;

	public SylhetDistrictFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.sylhet_district_fragment,
				container, false);

		btnBalaganjThana = (Button) view
				.findViewById(R.id.btnBalaganjThanaSylhet);
		btnBeanibazarThana = (Button) view
				.findViewById(R.id.btnBeanibazarThanaSylhet);
		btnBishwanathThana = (Button) view
				.findViewById(R.id.btnBishwanathThanaSylhet);
		btnConpaniganjThana = (Button) view
				.findViewById(R.id.btnCompaniganjThanaSylhet);
		btnFenchuganjThana = (Button) view
				.findViewById(R.id.btnFenchuganjThanaSylhet);
		btnGopalganjThana = (Button) view
				.findViewById(R.id.btnGopalganjThanaSylhet);
		btnGoainghatThana = (Button) view
				.findViewById(R.id.btnGowainghatThanaSylhet);
		btnJaintapurThana = (Button) view
				.findViewById(R.id.btnjaintappurThanaSylhet);
		btnKanaighatThana = (Button) view
				.findViewById(R.id.btnKanaighatThanaSylhet);
		btnSouthSurmaThana = (Button) view
				.findViewById(R.id.btnSouthSurmaThanaSylhet);
		btnSadarThana = (Button) view.findViewById(R.id.btnSadarThanaSylhet);
		btnZakiganjThana = (Button) view
				.findViewById(R.id.btnZakiganjThanaSylhet);

		btnBalaganjThana.setOnClickListener(this);
		btnBeanibazarThana.setOnClickListener(this);
		btnBishwanathThana.setOnClickListener(this);
		btnConpaniganjThana.setOnClickListener(this);
		btnFenchuganjThana.setOnClickListener(this);
		btnGopalganjThana.setOnClickListener(this);
		btnGoainghatThana.setOnClickListener(this);
		btnJaintapurThana.setOnClickListener(this);
		btnKanaighatThana.setOnClickListener(this);
		btnSouthSurmaThana.setOnClickListener(this);
		btnSadarThana.setOnClickListener(this);
		btnZakiganjThana.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnBalaganjThanaSylhet:

			BalaganjThana bala = new BalaganjThana();

			ft.replace(R.id.frame_container, bala);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnBeanibazarThanaSylhet:

			BeanibazarThana beani = new BeanibazarThana();

			ft.replace(R.id.frame_container, beani);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnBishwanathThanaSylhet:

			BishwanathThana bishwanath = new BishwanathThana();

			ft.replace(R.id.frame_container, bishwanath);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnCompaniganjThanaSylhet:

			CompanigonjThana compani = new CompanigonjThana();

			ft.replace(R.id.frame_container, compani);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnFenchuganjThanaSylhet:

			FenchuganjThana fenchu = new FenchuganjThana();

			ft.replace(R.id.frame_container, fenchu);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnGopalganjThanaSylhet:

			GolapganjThana golap = new GolapganjThana();

			ft.replace(R.id.frame_container, golap);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnGowainghatThanaSylhet:

			GowainghatThana gowani = new GowainghatThana();
			ft.replace(R.id.frame_container, gowani);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnjaintappurThanaSylhet:

			JaintiapurThana jainta = new JaintiapurThana();

			ft.replace(R.id.frame_container, jainta);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnKanaighatThanaSylhet:

			KanaighatThana kania = new KanaighatThana();

			ft.replace(R.id.frame_container, kania);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSouthSurmaThanaSylhet:

			SouthShurmaThana southsurma = new SouthShurmaThana();

			ft.replace(R.id.frame_container, southsurma);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSadarThanaSylhet:

			SylhetSadarThana sadar = new SylhetSadarThana();

			ft.replace(R.id.frame_container, sadar);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnZakiganjThanaSylhet:

			ZakiganjThana zaki = new ZakiganjThana();

			ft.replace(R.id.frame_container, zaki);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
