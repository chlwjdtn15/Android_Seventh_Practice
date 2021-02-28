package com.example.viewpageexample;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FragmentA extends Fragment {

    MyListener listener;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a, container, false);



        Button btn = view.findViewById(R.id.button);
        EditText messageEdt = view.findViewById(R.id.editTextTextPersonName);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = messageEdt.getText().toString();

                listener.sendMessage(message);


            }
        });



        return view;
    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);


        listener = (MyListener) context;
    }
}