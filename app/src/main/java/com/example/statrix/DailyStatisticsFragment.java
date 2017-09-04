package com.example.statrix;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;


public class DailyStatisticsFragment extends Fragment {
    private TextView resource;
    private ImageButton addResource;
    private ListView resourceList;
    private TextView person;
    private ImageButton addPerson;
    private ListView personList;
    private DatePicker datePicker;
    private Button choose;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_daily_statistics,container,false);
        resource = (TextView)rootView.findViewById(R.id.daily_stat_resource);
        addResource=(ImageButton)rootView.findViewById(R.id.daily_stat_add_resource);
        resourceList=(ListView)rootView.findViewById(R.id.daily_stat_resource_list);
        person=rootView.findViewById(R.id.daily_stat_person);
        addPerson=rootView.findViewById(R.id.daily_stat_add_person);
        personList=rootView.findViewById(R.id.daily_stat_person_list);
        datePicker=rootView.findViewById(R.id.daily_stat_datePicker);
        choose=rootView.findViewById(R.id.daily_stat_choose);
        return rootView;
    }
}
