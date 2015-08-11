package com.example.nirapodthakun;

import com.example.dhakaDistrictAllThana.DhakaDistrictFragment;
import com.example.faridpurDistrictAllThana.FaridpurDistrictFragment;
import com.example.gazipurDistrictAllThana.GazipurDistrictFragment;
import com.example.gopalgonjDistrictAllThana.GopalgonjDistrictFragment;
import com.example.jamalpurDistrictAllThana.JamalpurDistrictFragment;
import com.example.kishoreganjDistrictAllThana.KishoregonjDistrictFragment;
import com.example.madaripurDistrictAllThana.MadaripurDistrictFragment;
import com.example.manikganjDistrictAllThana.ManikganjDistrictFragment;
import com.example.munshiganjDistrictAllThana.MunshiganjDistrictFragment;
import com.example.mymensinghDistrictAllThana.MymensingDistrictFragment;
import com.example.narayanganjDistrictAllThana.NarayangDistrictFragment;
import com.example.narsingdiDistrictAllThana.NarsigndiDistrictFragment;
import com.example.netrokonaDistrictAllThana.NetrokonDistrictFragment;
import com.example.rajbariDistrictAllThana.RajbariDistrictFragment;
import com.example.shariatpurDistrictAllThana.ShariatpurDistrictFragment;
import com.example.sherpurDistrictAllThana.SherpurDistrictFragment;
import com.example.tangailDistrictAllThana.TangaillDistrictFragment;

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
public class DhakaDivisionFragment extends Fragment implements OnClickListener {

	Button btnDhakaDistrict, btnManikganjDistirct, btnNetrokonaDistrict,
			btnFaridpurDistrict, btnMamynsinghDistrict, btnRajbariDistrict,
			btnGopalganjDistrict, btnNarayanjDistrict, btnShriatpurDistrict,
			btnKishoreganjDistrict, btnJamalpurDistrict, btnSherpurDistrict,
			btnMadaripurDistrict, btnNarsigndiDistrict, btnTangailDistrict,
			btnMunshiganjDistrict, btnGazipurDistrict;

	public DhakaDivisionFragment() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_dhaka_division,
				container, false);

		/*
		 * 
		 * Button Initialization
		 */
		btnDhakaDistrict = (Button) rootView
				.findViewById(R.id.btnDhakaDisctrict);
		btnManikganjDistirct = (Button) rootView
				.findViewById(R.id.btnManikgonjDistrict);
		btnNetrokonaDistrict = (Button) rootView
				.findViewById(R.id.btnNetrokonDistirct);
		btnFaridpurDistrict = (Button) rootView
				.findViewById(R.id.btnFaridpurDistrict);
		btnMamynsinghDistrict = (Button) rootView
				.findViewById(R.id.btnMymenshinghDistrict);
		btnRajbariDistrict = (Button) rootView
				.findViewById(R.id.btnRajbariDistric);
		btnGopalganjDistrict = (Button) rootView
				.findViewById(R.id.btnGopalgonjDistrict);
		btnNarayanjDistrict = (Button) rootView
				.findViewById(R.id.btnNarayanGanjDistrict);
		btnShriatpurDistrict = (Button) rootView
				.findViewById(R.id.btnShariatpurDistrict);
		btnKishoreganjDistrict = (Button) rootView
				.findViewById(R.id.btnKishorganjDistrict);
		btnJamalpurDistrict = (Button) rootView
				.findViewById(R.id.btnJamalpurDistrict);
		btnSherpurDistrict = (Button) rootView
				.findViewById(R.id.btnSherpurDistrict);
		btnMadaripurDistrict = (Button) rootView
				.findViewById(R.id.btnMadaripurDistrict);
		btnNarsigndiDistrict = (Button) rootView
				.findViewById(R.id.btnNorshinghdhiDistrict);
		btnTangailDistrict = (Button) rootView
				.findViewById(R.id.btnTangailDistrict);
		btnMunshiganjDistrict = (Button) rootView
				.findViewById(R.id.btnMunshigonjDistrict);
		btnGazipurDistrict = (Button) rootView
				.findViewById(R.id.btnGazipurDistrict);

		/*
		 * Set On Click Listener On Every Button
		 */

		btnDhakaDistrict.setOnClickListener(this);
		btnManikganjDistirct.setOnClickListener(this);
		btnNetrokonaDistrict.setOnClickListener(this);
		btnFaridpurDistrict.setOnClickListener(this);
		btnMamynsinghDistrict.setOnClickListener(this);
		btnRajbariDistrict.setOnClickListener(this);
		btnGopalganjDistrict.setOnClickListener(this);
		btnNarayanjDistrict.setOnClickListener(this);
		btnShriatpurDistrict.setOnClickListener(this);
		btnKishoreganjDistrict.setOnClickListener(this);
		btnJamalpurDistrict.setOnClickListener(this);
		btnSherpurDistrict.setOnClickListener(this);
		btnMadaripurDistrict.setOnClickListener(this);
		btnNarsigndiDistrict.setOnClickListener(this);
		btnTangailDistrict.setOnClickListener(this);
		btnMunshiganjDistrict.setOnClickListener(this);
		btnGazipurDistrict.setOnClickListener(this);

		return rootView;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction fr = fm.beginTransaction();

		switch (v.getId()) {

		case R.id.btnDhakaDisctrict:

			DhakaDistrictFragment dhaka = new DhakaDistrictFragment();
			fr.replace(R.id.frame_container, dhaka);
			fr.addToBackStack(null);

			fr.commit();

			break;
		case R.id.btnManikgonjDistrict:
			ManikganjDistrictFragment manik = new ManikganjDistrictFragment();
			fr.replace(R.id.frame_container, manik);
			fr.addToBackStack(null);
			fr.commit();

			break;

		case R.id.btnNetrokonDistirct:
			NetrokonDistrictFragment netrokona = new NetrokonDistrictFragment();
			fr.replace(R.id.frame_container, netrokona);
			fr.addToBackStack(null);
			fr.commit();

			break;

		case R.id.btnFaridpurDistrict:
			FaridpurDistrictFragment farid = new FaridpurDistrictFragment();
			fr.replace(R.id.frame_container, farid);
			fr.addToBackStack(null);
			fr.commit();

			break;

		case R.id.btnMymenshinghDistrict:
			MymensingDistrictFragment mymen = new MymensingDistrictFragment();
			fr.replace(R.id.frame_container, mymen);
			fr.addToBackStack(null);
			fr.commit();

			break;

		case R.id.btnRajbariDistric:
			RajbariDistrictFragment rajbari = new RajbariDistrictFragment();
			fr.replace(R.id.frame_container, rajbari);
			fr.addToBackStack(null);
			fr.commit();

			break;

		case R.id.btnGopalgonjDistrict:
			GopalgonjDistrictFragment gopal = new GopalgonjDistrictFragment();
			fr.replace(R.id.frame_container, gopal);
			fr.addToBackStack(null);
			fr.commit();

			break;

		case R.id.btnNarayanGanjDistrict:
			NarayangDistrictFragment narayan = new NarayangDistrictFragment();
			fr.replace(R.id.frame_container, narayan);
			fr.addToBackStack(null);
			fr.commit();

			break;
		case R.id.btnShariatpurDistrict:
			ShariatpurDistrictFragment sharia = new ShariatpurDistrictFragment();
			fr.replace(R.id.frame_container, sharia);
			fr.addToBackStack(null);
			fr.commit();

			break;

		case R.id.btnKishorganjDistrict:
			KishoregonjDistrictFragment kishore = new KishoregonjDistrictFragment();
			fr.replace(R.id.frame_container, kishore);
			fr.addToBackStack(null);
			fr.commit();

			break;

		case R.id.btnJamalpurDistrict:
			JamalpurDistrictFragment jamal = new JamalpurDistrictFragment();
			fr.replace(R.id.frame_container, jamal);
			fr.addToBackStack(null);
			fr.commit();

			break;

		case R.id.btnSherpurDistrict:

			SherpurDistrictFragment sher = new SherpurDistrictFragment();
			fr.replace(R.id.frame_container, sher);
			fr.addToBackStack(null);
			fr.commit();

			break;

		case R.id.btnMadaripurDistrict:
			MadaripurDistrictFragment madari = new MadaripurDistrictFragment();
			fr.replace(R.id.frame_container, madari);
			fr.addToBackStack(null);
			fr.commit();

			break;

		case R.id.btnNorshinghdhiDistrict:

			NarsigndiDistrictFragment narsign = new NarsigndiDistrictFragment();
			fr.replace(R.id.frame_container, narsign);
			fr.addToBackStack(null);
			fr.commit();

			break;

		case R.id.btnTangailDistrict:

			TangaillDistrictFragment tangail = new TangaillDistrictFragment();
			fr.replace(R.id.frame_container, tangail);
			fr.addToBackStack(null);
			fr.commit();

			break;

		case R.id.btnMunshigonjDistrict:
			MunshiganjDistrictFragment munshi = new MunshiganjDistrictFragment();
			fr.replace(R.id.frame_container, munshi);
			fr.addToBackStack(null);
			fr.commit();

			break;
		case R.id.btnGazipurDistrict:

			GazipurDistrictFragment gazi = new GazipurDistrictFragment();
			fr.replace(R.id.frame_container, gazi);
			fr.addToBackStack(null);
			fr.commit();

			break;
		default:
			break;
		}

	}

}
