package com.example.fifthproject;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class FirstFragment extends Fragment {

    private Button btn_plus;
    private Button btn_minus;
    private TextView number;
    private  Integer count = 0;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btn_plus = view.findViewById(R.id.increaseButton);
        btn_minus = view.findViewById(R.id.decreaseButton);
        number = view.findViewById(R.id.textView);
        btn_plus.setOnClickListener(v -> {
            count += 1;
            number.setText(count.toString());
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count -= 1;
                number.setText(count.toString());
            }
        });

    }
}