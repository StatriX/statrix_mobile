package com.example.statrix;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class LoginFragment extends Fragment implements View.OnClickListener {

    private EditText email;
    private EditText password;
    private Button enter;
    private ImageView logo;
    private TextView forgetPassword;
    private TextView registration;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view!=null){
            email = getActivity().findViewById(R.id.email);
            password = getActivity().findViewById(R.id.password);
            enter = getActivity().findViewById(R.id.enter);
            logo = getActivity().findViewById(R.id.logo);
            forgetPassword = getActivity().findViewById(R.id.forget_password);
            registration = getActivity().findViewById(R.id.registration);
            registration.setOnClickListener(this);
        }
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.registration:
                Intent intent = new Intent(getContext(), RegistrationActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

}
