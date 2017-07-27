package com.amir.buttg.uoggpacgpacalculator;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;


/**
 * A simple {@link Fragment} subclass.
 */
public class AtLoadFragment extends Fragment {


    public AtLoadFragment() {
        // Required empty public constructor
    }

    private InterstitialAd mInterstitialAd;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_at_load, container, false);
        //--------<Top AdView>--------------
        AdView t_adView = (AdView) view.findViewById(R.id.adView4);
        AdRequest t_adRequest = new AdRequest.Builder()
                .setRequestAgent("top").build();
        t_adView.loadAd(t_adRequest);
        //-------<Bottom AdView>------------
        AdView b_adView = (AdView) view.findViewById(R.id.adView2);
        AdRequest b_adRequest = new AdRequest.Builder()
                .setRequestAgent("bottom").build();
        b_adView.loadAd(b_adRequest);
        //-------<Center AdView>--------------
        AdView c_adView = (AdView) view.findViewById(R.id.adView3);
        AdRequest c_adRequest = new AdRequest.Builder()
                .setRequestAgent("center").build();
        c_adView.loadAd(c_adRequest);
        Button gpa = (Button) view.findViewById(R.id.button3);
        Button cgpa = (Button) view.findViewById(R.id.button);
        Button sec = (Button) view.findViewById(R.id.button4);

        gpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showInterstitial();

                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                GPAFragment gpa = new GPAFragment();
                ft.replace(R.id.f_home,gpa);
                ft.addToBackStack("GPA");
                ft.commit();
            }
        });
        cgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showInterstitial();

                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                CGPA cgpa = new CGPA();
                ft.replace(R.id.f_home,cgpa);
                ft.addToBackStack("CGPA");
                ft.commit();
            }
        });
        sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInterstitial();
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                BlankFragment count = new BlankFragment();
                ft.replace(R.id.f_home,count);
                ft.addToBackStack("Sec");
                ft.commit();
            }
        });
        mInterstitialAd = newInterstitialAd1();
        loadInterstitial();
        mInterstitialAd = newInterstitialAd();
        loadInterstitial1();
        return view;
    }
    private InterstitialAd newInterstitialAd() {
        InterstitialAd interstitialAd = new InterstitialAd(getActivity());
        interstitialAd.setAdUnitId(getString(R.string.secondFull));
        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {

            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                //Toast.makeText(getContext(),"Failed",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdClosed() {
                // Proceed to the next level.
            }
        });
        return interstitialAd;
    }
    private InterstitialAd newInterstitialAd1() {
        InterstitialAd interstitialAd = new InterstitialAd(getActivity());
        interstitialAd.setAdUnitId(getString(R.string.full_ad));
        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {

            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                //Toast.makeText(getContext(),"Failed",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdClosed() {
                // Proceed to the next level.
            }
        });
        return interstitialAd;
    }

    private void showInterstitial() {
        // Show the ad if it's ready. Otherwise toast and reload the ad.
        if (mInterstitialAd != null && mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }

    private void loadInterstitial() {
        // Disable the next level button and load the ad.
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("third").build();
        mInterstitialAd.loadAd(adRequest);
    }
    private void loadInterstitial1() {
        // Disable the next level button and load the ad.
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("secondFull").build();
        mInterstitialAd.loadAd(adRequest);
    }
}
