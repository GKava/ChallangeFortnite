package com.fortnite_challange_star.challangefortnite;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuSeasonFragment extends Fragment implements View .OnClickListener{
LinearLayout week1,week2,week3,week4,week5,week6,week7,week8,week9,week10;

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
        return view;
    }


    public void checkCompleteAndSetBacground(){
        // какие то условия
week1.setBackgroundResource(R.drawable.weekcomplete);

    }

    @Override
    public void onClick(View view) {
switch (view.getId()){
    case R.id.week1: {

        break;
    }
    case R.id.week2: {

        break;
    }
    case R.id.week3: {

        break;
    }
    case R.id.week4: {

        break;
    }
    case R.id.week5: {

        break;
    }
    case R.id.week6: {

        break;
    }
    case R.id.week7: {

        break;
    }
    case R.id.week8: {

        break;
    }
    case R.id.week9: {

        break;
    }
    case R.id.week10: {

        break;
    }

    }
    }
}
