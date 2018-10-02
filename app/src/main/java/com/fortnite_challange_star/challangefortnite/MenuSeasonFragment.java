package com.fortnite_challange_star.challangefortnite;


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuSeasonFragment extends Fragment implements View .OnClickListener{
LinearLayout week1,week2,week3,week4,week5,week6,week7,week8,week9,week10;
TextView textViewHeader;
int adsInt=0;
    private InterstitialAd mInterstitialAd;
    public MenuSeasonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
View view = inflater.inflate(R.layout.fragment_menu_season, container, false);

        week1 = view.findViewById(R.id.week1);
        week2 = view.findViewById(R.id.week2);
        week3 = view.findViewById(R.id.week3);
        week4 = view.findViewById(R.id.week4);
        week5 = view.findViewById(R.id.week5);
        week6 = view.findViewById(R.id.week6);
        week7 = view.findViewById(R.id.week7);
        week8 = view.findViewById(R.id.week8);
        week9 = view.findViewById(R.id.week9);
        week10 = view.findViewById(R.id.week10);
        textViewHeader = view.findViewById(R.id.textViewHeader);


        week1.setOnClickListener(this);
        week2.setOnClickListener(this);
        week3.setOnClickListener(this);
        week4.setOnClickListener(this);
        week5.setOnClickListener(this);
        week6.setOnClickListener(this);
        week7.setOnClickListener(this);
        week8.setOnClickListener(this);
        week9.setOnClickListener(this);
        week10.setOnClickListener(this);

        MobileAds.initialize(getActivity(),
                "ca-app-pub-1336421761813784~1587796803");

        mInterstitialAd = new InterstitialAd(getActivity());
        mInterstitialAd.setAdUnitId("ca-app-pub-1336421761813784/2865219455");


//        test
//        MobileAds.initialize(getActivity(),
//                "ca-app-pub-3940256099942544~3347511713");
//
//        mInterstitialAd = new InterstitialAd(getActivity());
//        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");


        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        return view;
    }

    public void showInterstitial (){
        if (adsInt==(1^4^7^10^13^16^19^21)) {
            if (mInterstitialAd.isLoaded()) {
                mInterstitialAd.show();
                adsInt++;
            }
        }
        else
        {
            adsInt++;
        }
    }


    @Override
    public void onClick(View view) {
        WeekClosed weekClosed = new WeekClosed();

switch (view.getId()){
    case R.id.week1: {
        showInterstitial();
        MainActivity.fragmentManager.beginTransaction()
                .replace(R.id.fragment_container, new Week1())
                .addToBackStack(null)
                .commit();
        break;
    }
    case R.id.week2: {
        showInterstitial();
        MainActivity.fragmentManager.beginTransaction()
                .replace(R.id.fragment_container, new Week2())
                .addToBackStack(null)
                .commit();
        break;
    }
    case R.id.week3: {
        showInterstitial();

        Bundle bundle = new Bundle();
        bundle.putInt("weekNumber", 3);
        weekClosed.setArguments(bundle);


        MainActivity.fragmentManager.beginTransaction()
                .replace(R.id.fragment_container,  weekClosed)
                .addToBackStack(null)
                .commit();
        break;
    }
    case R.id.week4: {
        showInterstitial();

        Bundle bundle = new Bundle();
        bundle.putInt("weekNumber", 4);
        weekClosed.setArguments(bundle);
        MainActivity.fragmentManager.beginTransaction()
                .replace(R.id.fragment_container, weekClosed)
                .addToBackStack(null)
                .commit();
        break;
    }
    case R.id.week5: {
        showInterstitial();
        Bundle bundle = new Bundle();
        bundle.putInt("weekNumber", 5);
        weekClosed.setArguments(bundle);
        MainActivity.fragmentManager.beginTransaction()
                .replace(R.id.fragment_container, weekClosed)
                .addToBackStack(null)
                .commit();
        break;
    }
    case R.id.week6: {
        showInterstitial();
        Bundle bundle = new Bundle();
        bundle.putInt("weekNumber", 6);
        weekClosed.setArguments(bundle);
        MainActivity.fragmentManager.beginTransaction()
                .replace(R.id.fragment_container, weekClosed)
                .addToBackStack(null)
                .commit();
        break;
    }
    case R.id.week7: {
        showInterstitial();
        Bundle bundle = new Bundle();
        bundle.putInt("weekNumber", 7);
        weekClosed.setArguments(bundle);
        MainActivity.fragmentManager.beginTransaction()
                .replace(R.id.fragment_container, weekClosed)
                .addToBackStack(null)
                .commit();
        break;
    }
    case R.id.week8: {
        showInterstitial();
        Bundle bundle = new Bundle();
        bundle.putInt("weekNumber", 8);
        weekClosed.setArguments(bundle);
        MainActivity.fragmentManager.beginTransaction()
                .replace(R.id.fragment_container, weekClosed)
                .addToBackStack(null)
                .commit();
        break;
    }
    case R.id.week9: {
        showInterstitial();
        Bundle bundle = new Bundle();
        bundle.putInt("weekNumber", 9);
        weekClosed.setArguments(bundle);
        MainActivity.fragmentManager.beginTransaction()
                .replace(R.id.fragment_container, weekClosed)
                .addToBackStack(null)
                .commit();
        break;
    }
    case R.id.week10: {
        showInterstitial();
        Bundle bundle = new Bundle();
        bundle.putInt("weekNumber", 10);
        weekClosed.setArguments(bundle);
        MainActivity.fragmentManager.beginTransaction()
                .replace(R.id.fragment_container, weekClosed)
                .addToBackStack(null)
                .commit();
        break;
    }

    }
    }
}
