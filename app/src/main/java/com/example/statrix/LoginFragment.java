package com.example.statrix;

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
    private PrimaryCallbackInterface primaryCallbackInterface;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_login, container, false);
        email = rootView.findViewById(R.id.frgmnt_reg_email);
        password = rootView.findViewById(R.id.frgmnt_reg_password);
        enter = rootView.findViewById(R.id.frgmnt_reg_enter);
        logo = rootView.findViewById(R.id.logo);
        forgetPassword = rootView.findViewById(R.id.frgmnt_reg_forget_password);
        registration = rootView.findViewById(R.id.registration);
        registration.setOnClickListener(this);
        forgetPassword.setOnClickListener(this);
        enter.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        primaryCallbackInterface = (PrimaryCallbackInterface) getActivity();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.registration:

                primaryCallbackInterface.registration();
                break;
            case R.id.frgmnt_reg_forget_password:
                primaryCallbackInterface.forgetpassword();
                break;
            case R.id.frgmnt_reg_enter:
                String lg = email.getText().toString();
                String pw = password.getText().toString();
                primaryCallbackInterface.entry(lg,pw);
            default:
                break;
        }
    }

}
