package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_A#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_A extends Fragment {
    ListView listView;
    Item_until item_until;
    ArrayList<Item_entity> item_entities;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment_A() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_A.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_A newInstance(String param1, String param2) {
        Fragment_A fragment = new Fragment_A();
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
        View view=inflater.inflate(R.layout.fragment__a, container, false);
        listView=view.findViewById(R.id.list_view);
        item_entities=new ArrayList<>();
        item_entities.add(new Item_entity("Nike shoes-discount 50%",
                "Pls touch to see detail",R.drawable.shoes_rm_purple));
        item_entities.add(new Item_entity("Nike shoes-discount 50%",
                "Pls touch to see detail",R.drawable.shoes_rm_preview));
        item_entities.add(new Item_entity("Nike shoes-discount 50%",
                "Pls touch to see detail",R.drawable.shoes_rm_preview_a));
        item_entities.add(new Item_entity("Nike shoes-discount 50%",
                "Pls touch to see detail",R.drawable.shoes_rm_preview_b));
        item_entities.add(new Item_entity("Nike shoes-discount 50%",
                "Pls touch to see detail",R.drawable.shoes_white_removebg_preview));
        item_entities.add(new Item_entity("Nike shoes-discount 50%",
                "Pls touch to see detail",R.drawable.shoes_white_removebg_preview));
        item_entities.add(new Item_entity("Nike shoes-discount 50%",
                "Pls touch to see detail",R.drawable.shoes_white_removebg_preview));
        item_until=new Item_until(getActivity(),R.layout.item_lits_view,item_entities);
        listView.setAdapter(item_until);

        // Inflate the layout for this fragment
        return view;
    }
}