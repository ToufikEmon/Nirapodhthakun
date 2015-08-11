package com.example.nirapodthakun;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.bograDistrictAllThana.BograDistrictFragment;
import com.example.chapainawabganjDistrictAllThana.NawabanjDistrictFragment;
import com.example.joypurhatDistrictAllThana.JoypurhatDistrictFragment;
import com.example.naogaonDistrictAllThana.NoagoanDistrictFragment;
import com.example.natoreDistrictAllThana.NatoreDistrictFragment;
import com.example.pabnaDistrictAllThana.PabnaDistrictFragment;
import com.example.rajshahiDistrictAllThana.RajshahiDistrictFragment;
import com.example.sirajgonjDistrictAllThana.SirajgonjDistrictFragment;

public class RajshahiDivisionFragment extends Fragment implements
		OnClickListener {

	Button btnBaguraDistrict, btnChapainawabganjDistrict, btnJoypurhatDistrict,
			btnPabnaDistrict, btnNaogaDistrict, btnNatoreDistrict,
			btnRajshahiDistrict, btnSirajdanjDistrict;

	public RajshahiDivisionFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_rajshahi_division,
				container, false);

		btnBaguraDistrict = (Button) rootView
				.findViewById(R.id.btnBograDistrict);
		btnChapainawabganjDistrict = (Button) rootView
				.findViewById(R.id.btnChapainababganjDistrict);
		btnJoypurhatDistrict = (Button) rootView
				.findViewById(R.id.btnJoypurhatDistrict);
		btnPabnaDistrict = (Button) rootView
				.findViewById(R.id.btnPabnaDistrict);
		btnNaogaDistrict = (Button) rootView
				.findViewById(R.id.btnNoagaDistrict);
		btnNatoreDistrict = (Button) rootView
				.findViewById(R.id.btnNatoreDistrict);
		btnRajshahiDistrict = (Button) rootView
				.findViewById(R.id.btnRajshahiDistrict);
		btnSirajdanjDistrict = (Button) rootView
				.findViewById(R.id.btnSiragonjDistrict);

		btnBaguraDistrict.setOnClickListener(this);
		btnChapainawabganjDistrict.setOnClickListener(this);
		btnJoypurhatDistrict.setOnClickListener(this);
		btnPabnaDistrict.setOnClickListener(this);
		btnNaogaDistrict.setOnClickListener(this);
		btnNatoreDistrict.setOnClickListener(this);
		btnRajshahiDistrict.setOnClickListener(this);
		btnSirajdanjDistrict.setOnClickListener(this);

		return rootView;
	}

	@Override
	public void onClick(View v) {
		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnBograDistrict:

			BograDistrictFragment bogra = new BograDistrictFragment();
			ft.replace(R.id.frame_container, bogra);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnChapainababganjDistrict:
			NawabanjDistrictFragment nawab = new NawabanjDistrictFragment();
			ft.replace(R.id.frame_container, nawab);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnJoypurhatDistrict:
			JoypurhatDistrictFragment joypurhat = new JoypurhatDistrictFragment();
			ft.replace(R.id.frame_container, joypurhat);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnPabnaDistrict:
			PabnaDistrictFragment pabna = new PabnaDistrictFragment();
			ft.replace(R.id.frame_container, pabna);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnNoagaDistrict:
			NoagoanDistrictFragment naoga = new NoagoanDistrictFragment();
			ft.replace(R.id.frame_container, naoga);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnNatoreDistrict:
			NatoreDistrictFragment natore = new NatoreDistrictFragment();
			ft.replace(R.id.frame_container, natore);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnRajshahiDistrict:
			RajshahiDistrictFragment rajshahi = new RajshahiDistrictFragment();
			ft.replace(R.id.frame_container, rajshahi);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnSiragonjDistrict:
			SirajgonjDistrictFragment sirajanj = new SirajgonjDistrictFragment();
			ft.replace(R.id.frame_container, sirajanj);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
