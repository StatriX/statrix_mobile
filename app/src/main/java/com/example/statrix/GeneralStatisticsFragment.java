package com.example.statrix;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class GeneralStatisticsFragment extends Fragment {

    private TextView resource;
    private ImageButton addResource;
    private ListView resourceList;
    private TextView person;
    private  ImageButton addPerson;
    private ListView personList;
    private Button choose;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_general_statistics,container,false);
        resource=rootView.findViewById(R.id.resource);
        addResource=rootView.findViewById(R.id.add_resource);
        resourceList = rootView.findViewById(R.id.resource_list);
        person=rootView.findViewById(R.id.person);
        addPerson=rootView.findViewById(R.id.add_person);
        personList=rootView.findViewById(R.id.person_list);
        choose=rootView.findViewById(R.id.choose);
        return rootView;
    }
}
