package com.fortnite_challange_star.challangefortnite;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WeekClosed extends Fragment {
    TextView txtheader;
    int weekInt;

    public WeekClosed() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_week_closed, container,false);
        txtheader = view.findViewById(R.id.txtheader);

        Bundle bundle = getArguments();
        if (bundle != null) {
            Integer recieveInfo = bundle.getInt("weekNumber");
            txtheader.setText("Week "+recieveInfo+"\nclosed :(");
        }


        return view;
    }

}