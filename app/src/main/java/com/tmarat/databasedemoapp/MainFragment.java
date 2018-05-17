package com.tmarat.databasedemoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.tmarat.databasedemoapp.sql.SqlActivity;

public class MainFragment extends Fragment implements View.OnClickListener {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container,false);

        v.findViewById(R.id.use_realm_button).setOnClickListener(this);
        v.findViewById(R.id.use_sql_button).setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.use_realm_button:
//                intent = new Intent(getContext(), RealmActivity.class);
//                getActivity().startActivity(intent);
                break;

            case R.id.use_sql_button:
                intent = new Intent(getContext(), SqlActivity.class);
                getActivity().startActivity(intent);
                break;
        }
    }
}
