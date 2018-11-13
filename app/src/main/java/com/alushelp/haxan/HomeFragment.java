package com.alushelp.haxan;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HomeFragment extends Fragment {

    View myView;
    TextView tvDateMain;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_home, container, false);

        tvDateMain = (TextView) myView.findViewById(R.id.tv_haridantanggal_main);

        String dateFormat = new SimpleDateFormat("EEE, d MMM yyyy", Locale.getDefault()).format(new Date());
        tvDateMain.setText(dateFormat);

        return myView;
    }

}
