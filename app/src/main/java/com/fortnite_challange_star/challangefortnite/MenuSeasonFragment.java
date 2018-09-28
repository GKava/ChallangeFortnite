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
LinearLayout week1;

    public MenuSeasonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
View view = inflater.inflate(R.layout.fragment_menu_season, container, false);

        week1 = view.findViewById(R.id.week1);
        week1.setOnClickListener(this);
        return view;
    }


    public void checkCompleteAndSetBacground(){
week1.setBackgroundResource(R.drawable.weekcomplete);

    }

    @Override
    public void onClick(View view) {

        checkCompleteAndSetBacground();
    }
}
