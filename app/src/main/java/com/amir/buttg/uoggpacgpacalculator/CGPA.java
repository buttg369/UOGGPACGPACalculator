package com.amir.buttg.uoggpacgpacalculator;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class CGPA extends Fragment {


    public CGPA() {
        // Required empty public constructor
    }


    Spinner sp_one, sp_two, sp_three, sp_four, sp_five, sp_six, sp_seven;
    Spinner ch_one, ch_two, ch_three, ch_four, ch_five, ch_six, ch_seven;
    EditText cgpa, c_credit,ch_sum;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_cg, container, false);
        final EditText result = (EditText) v.findViewById(R.id.result);
        List<String> grades = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.grades)));
        List<String> chours = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.c_hours)));
        ArrayAdapter g_adapter = new ArrayAdapter(getContext(), R.layout.custom_spinner, R.id.spinner_text, grades);
        ArrayAdapter ch_adaper = new ArrayAdapter(getContext(), R.layout.custom_spinner, R.id.spinner_text, chours);
        cgpa = (EditText) v.findViewById(R.id.CGPA);
        c_credit = (EditText) v.findViewById(R.id.credit);
        ch_sum = (EditText) v.findViewById(R.id.csum);
        sp_one = (Spinner) v.findViewById(R.id.sp_one);
        sp_two = (Spinner) v.findViewById(R.id.sp_two);
        sp_three = (Spinner) v.findViewById(R.id.sp_three);
        sp_four = (Spinner) v.findViewById(R.id.sp_four);
        sp_five = (Spinner) v.findViewById(R.id.sp_five);
        sp_six = (Spinner) v.findViewById(R.id.sp_six);
        sp_seven = (Spinner) v.findViewById(R.id.sp_seven);

        ch_one = (Spinner) v.findViewById(R.id.ch_one);
        ch_two = (Spinner) v.findViewById(R.id.ch_two);
        ch_three = (Spinner) v.findViewById(R.id.ch_three);
        ch_four = (Spinner) v.findViewById(R.id.ch_four);
        ch_five = (Spinner) v.findViewById(R.id.ch_five);
        ch_six = (Spinner) v.findViewById(R.id.ch_six);
        ch_seven = (Spinner) v.findViewById(R.id.ch_seven);

        sp_one.setAdapter(g_adapter);
        sp_two.setAdapter(g_adapter);
        sp_three.setAdapter(g_adapter);
        sp_four.setAdapter(g_adapter);
        sp_five.setAdapter(g_adapter);
        sp_six.setAdapter(g_adapter);
        sp_seven.setAdapter(g_adapter);

        ch_one.setAdapter(ch_adaper);
        ch_two.setAdapter(ch_adaper);
        ch_three.setAdapter(ch_adaper);
        ch_four.setAdapter(ch_adaper);
        ch_five.setAdapter(ch_adaper);
        ch_six.setAdapter(ch_adaper);
        ch_seven.setAdapter(ch_adaper);
        Button b = (Button) v.findViewById(R.id.btn_calculate);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double res = calculateGPA();
                //result.setTextColor(getResutColor(res));
                if (res > 0) {
                    result.setText(GPAFormat(res));
                } else {
                    result.setText("Null");
                }
            }
        });
        return v;
    }
    private String GPAFormat(double r)
    {
        String s = String.valueOf(r);
        String s1;
        try
        {
            s1=s.substring(0,4);
        }catch (Exception ex)
        {
            s1 = s;
        }
        return s1;
    }
    private double calculateGPA()
    {
        double sum = 0;
        double res = 0;
        double [] points = this.getPoints();
        double [] creditH = this.getCHours();
        for (int i =0; i <7; i ++)
        {
            sum += creditH[i];
            res += points[i] * creditH[i];
        }
        if (!cgpa.getText().toString().equals("") && !c_credit.getText().toString().equals("")) {
            res += Double.parseDouble(cgpa.getText().toString()) * Double.parseDouble(c_credit.getText().toString());
            sum += Double.parseDouble(c_credit.getText().toString());
        }
        if (sum > 0){
            ch_sum.setText(String.valueOf(Math.abs(sum)));
        }else
            ch_sum.setText("Null");
        return res / sum;
    }
    private double[] getPoints ()
    {
        double [] points = new double[7];
        points[0] = getPoints(sp_one.getSelectedItem().toString());
        points[1] = getPoints(sp_two.getSelectedItem().toString());
        points[2] = getPoints(sp_three.getSelectedItem().toString());
        points[3] = getPoints(sp_four.getSelectedItem().toString());
        points[4] = getPoints(sp_five.getSelectedItem().toString());
        points[5] = getPoints(sp_six.getSelectedItem().toString());
        points[6] = getPoints(sp_seven.getSelectedItem().toString());
        return points;
    }
    private double[] getCHours()
    {
        double[] chours = new double[7];
        chours[0] = getCHour(ch_one.getSelectedItem().toString());
        chours[1] = getCHour(ch_two.getSelectedItem().toString());
        chours[2] = getCHour(ch_three.getSelectedItem().toString());
        chours[3] = getCHour(ch_four.getSelectedItem().toString());
        chours[4] = getCHour(ch_five.getSelectedItem().toString());
        chours[5] = getCHour(ch_six.getSelectedItem().toString());
        chours[6] = getCHour(ch_seven.getSelectedItem().toString());
        return chours;
    }

    private double getPoints(String grd)
    {

        switch (grd)
        {
            case "Select":
                return 0;
            case "A+":
                return 4;
            case "A":
                return 3.70;
            case "B+":
                return 3.40;
            case "B":
                return 3.00;
            case "B-":
                return 2.50;
            case "C+":
                return 2.00;
            case "C":
                return 1.50;
            case "D":
                return 1.00;
            case "F":
                return 0.00;
        }
        return 0.00;
    }
    private int getCHour(String s)
    {
        switch (s)
        {
            case "Select":
                return 0;
            case "1":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
        }
        return 0;
    }
}
