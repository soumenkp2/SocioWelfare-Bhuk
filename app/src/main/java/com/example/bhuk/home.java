package com.example.bhuk;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link home#newInstance} factory method to
 * create an instance of this fragment.
 */
public class home extends Fragment {
    TextView NGO, orphanage, oldage, individual;
    GridLayout grid1, grid2, grid3, grid4, grid5, grid6, grid7;
    LinearLayout sociomoney;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public home() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment home.
     */
    // TODO: Rename and change types and number of parameters
    public static home newInstance(String param1, String param2) {
        home fragment = new home();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        NGO = (TextView) view.findViewById(R.id.NGO);
        orphanage = (TextView) view.findViewById(R.id.orphanages);
        oldage = (TextView) view.findViewById(R.id.old_age_home);
        individual = (TextView) view.findViewById(R.id.individuals);
        sociomoney = (LinearLayout) view.findViewById(R.id.socio_money);

        grid1 = (GridLayout) view.findViewById(R.id.grid1);
        grid2 = (GridLayout) view.findViewById(R.id.grid2);
        grid3 = (GridLayout) view.findViewById(R.id.grid3);
        grid4 = (GridLayout) view.findViewById(R.id.grid4);
        grid5 = (GridLayout) view.findViewById(R.id.grid5);
        grid6 = (GridLayout) view.findViewById(R.id.grid6);
        grid7 = (GridLayout) view.findViewById(R.id.grid7);

        grid1.setVisibility(View.VISIBLE);
        grid2.setVisibility(View.VISIBLE);
        grid3.setVisibility(View.GONE);
        grid4.setVisibility(View.GONE);
        grid5.setVisibility(View.GONE);
        grid6.setVisibility(View.GONE);
        grid7.setVisibility(View.GONE);

        NGO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NGO.setBackgroundResource(R.drawable.bluebg);
                orphanage.setBackgroundResource(R.drawable.whitebg);
                oldage.setBackgroundResource(R.drawable.whitebg);
                individual.setBackgroundResource(R.drawable.whitebg);
                grid1.setVisibility(View.VISIBLE);
                grid2.setVisibility(View.VISIBLE);
                grid3.setVisibility(View.GONE);
                grid4.setVisibility(View.GONE);
                grid5.setVisibility(View.GONE);
                grid6.setVisibility(View.GONE);
                grid7.setVisibility(View.GONE);
            }
        });

        orphanage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                orphanage.setBackgroundResource(R.drawable.bluebg);
                NGO.setBackgroundResource(R.drawable.whitebg);
                oldage.setBackgroundResource(R.drawable.whitebg);
                individual.setBackgroundResource(R.drawable.whitebg);
                grid1.setVisibility(View.GONE);
                grid2.setVisibility(View.GONE);
                grid3.setVisibility(View.VISIBLE);
                grid4.setVisibility(View.VISIBLE);
                grid5.setVisibility(View.GONE);
                grid6.setVisibility(View.GONE);
                grid7.setVisibility(View.GONE);
            }
        });

        oldage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldage.setBackgroundResource(R.drawable.bluebg);
                orphanage.setBackgroundResource(R.drawable.whitebg);
                NGO.setBackgroundResource(R.drawable.whitebg);
                individual.setBackgroundResource(R.drawable.whitebg);
                grid1.setVisibility(View.GONE);
                grid2.setVisibility(View.GONE);
                grid3.setVisibility(View.GONE);
                grid4.setVisibility(View.GONE);
                grid5.setVisibility(View.VISIBLE);
                grid6.setVisibility(View.VISIBLE);
                grid7.setVisibility(View.GONE);
            }
        });

        individual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                individual.setBackgroundResource(R.drawable.bluebg);
                orphanage.setBackgroundResource(R.drawable.whitebg);
                NGO.setBackgroundResource(R.drawable.whitebg);
                oldage.setBackgroundResource(R.drawable.whitebg);
                grid1.setVisibility(View.GONE);
                grid2.setVisibility(View.GONE);
                grid3.setVisibility(View.GONE);
                grid4.setVisibility(View.GONE);
                grid5.setVisibility(View.GONE);
                grid6.setVisibility(View.GONE);
                grid7.setVisibility(View.VISIBLE);
            }
        });

        sociomoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(),SocioMoney.class);
                startActivity(i);
            }
        });
        return view;
    }
}