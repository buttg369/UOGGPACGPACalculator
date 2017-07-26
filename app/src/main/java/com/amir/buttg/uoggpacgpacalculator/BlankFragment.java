package com.amir.buttg.uoggpacgpacalculator;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }

    EditText wattage, total, t_one, t_two, t_three, t_four, t_five, t_six, t_seven, o_one, o_two, o_three, o_four, o_five, o_six, o_seven;
    Button calculate;
    static float total_total =0, obtained_total=0;
    float wettege_value, obtained_value;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank2, container, false);
        wattage = (EditText) view.findViewById(R.id.wattage);
        total = (EditText) view.findViewById(R.id.total);
        t_one = (EditText) view.findViewById(R.id.t_one);
        t_two = (EditText) view.findViewById(R.id.t_two);
        t_three = (EditText) view.findViewById(R.id.t_three);
        t_four = (EditText) view.findViewById(R.id.t_four);
        t_five = (EditText) view.findViewById(R.id.t_five);
        t_six = (EditText) view.findViewById(R.id.t_six);
        t_seven = (EditText) view.findViewById(R.id.t_seven);
        o_one = (EditText) view.findViewById(R.id.o_one);
        o_two = (EditText) view.findViewById(R.id.o_two);
        o_three = (EditText) view.findViewById(R.id.o_three);
        o_four = (EditText) view.findViewById(R.id.o_four);
        o_five = (EditText) view.findViewById(R.id.o_five);
        o_six = (EditText) view.findViewById(R.id.o_six);
        o_seven = (EditText) view.findViewById(R.id.o_seven);
        calculate = (Button) view.findViewById(R.id.calculate);
//        o_one.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                if (t_one.getText().toString().isEmpty() || o_one.getText().toString().isEmpty()) {
//                    if (Float.parseFloat(t_one.getText().toString()) <= Float.parseFloat(o_one.getText().toString())) {
//                        o_one.setError("Obtained must be less then Total");
//                        calculate.setEnabled(false);
//                    } else {
//                        calculate.setEnabled(true);
//                    }
//                }
//            }
//        });
//        o_two.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                if (!t_two.getText().toString().isEmpty() || !o_two.getText().toString().isEmpty()) {
//                    if (Float.parseFloat(t_two.getText().toString()) <= Float.parseFloat(o_two.getText().toString())) {
//                        o_two.setError("Obtained must be less then Total");
//                        calculate.setEnabled(false);
//                    } else {
//                        calculate.setEnabled(true);
//                    }
//                }
//            }
//        });
//        o_three.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                if (!t_three.getText().toString().isEmpty() || !o_three.getText().toString().isEmpty()) {
//                    if (Float.parseFloat(t_three.getText().toString()) <= Float.parseFloat(o_three.getText().toString())) {
//                        o_three.setError("Obtained must be less then Total");
//                        calculate.setEnabled(false);
//                    } else {
//                        calculate.setEnabled(true);
//                    }
//                }
//            }
//        });
//        o_four.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                if (!t_four.getText().toString().isEmpty() || !o_four.getText().toString().isEmpty()) {
//                    if (Float.parseFloat(t_four.getText().toString()) <= Float.parseFloat(o_four.getText().toString())) {
//                        o_four.setError("Obtained must be less then Total");
//                        calculate.setEnabled(false);
//                    } else {
//                        calculate.setEnabled(true);
//                    }
//                }
//            }
//        });
//        o_five.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                if (!t_five.getText().toString().isEmpty() || !o_five.getText().toString().isEmpty()) {
//                    if (Float.parseFloat(t_five.getText().toString()) <= Float.parseFloat(o_five.getText().toString())) {
//                        o_five.setError("Obtained must be less then Total");
//                        calculate.setEnabled(false);
//                    } else {
//                        calculate.setEnabled(true);
//                    }
//                }
//            }
//        });
//        o_six.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                if (!t_six.getText().toString().isEmpty() || !o_six.getText().toString().isEmpty()) {
//                    if (Float.parseFloat(t_six.getText().toString()) <= Float.parseFloat(o_six.getText().toString())) {
//                        o_six.setError("Obtained must be less then Total");
//                        calculate.setEnabled(false);
//                    } else {
//                        calculate.setEnabled(true);
//                    }
//                }
//            }
//        });
//        o_seven.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                if (!t_seven.getText().toString().isEmpty() || !o_seven.getText().toString().isEmpty()) {
//                    if (Float.parseFloat(t_seven.getText().toString()) < Float.parseFloat(o_seven.getText().toString())) {
//                        o_seven.setError("Obtained must be less then Total");
//                        calculate.setEnabled(false);
//                    } else {
//                        calculate.setEnabled(true);
//                    }
//                }
//            }
//        });
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!wattage.getText().toString().equals(""))
                {
                    wettege_value = Float.parseFloat(wattage.getText().toString());
                    getTotalValues();
                    obtained_value = (obtained_total /total_total) * wettege_value;
                    if (obtained_value > 0) {
                        total.setText(setFormat(obtained_value));
                    }else
                        total.setText(String.valueOf("Null"));
                    total_total =0;
                    obtained_total=0;
                }
                else {
                    Toast.makeText(getContext(),"Please Enter Wattage",Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }
    private void getTotalValues()
    {

        if (!t_one.getText().toString().equals(""))
        {
            if (!o_one.getText().toString().equals("")){
                float o = Float.parseFloat(o_one.getText().toString());
                float t = Float.parseFloat(t_one.getText().toString());
                if (t < o)
                {
                    o_one.setError("!!Greater then Total");
                }else
                {
                    obtained_total +=o;
                    total_total +=t;
                }
            }
        }else
        {
            obtained_total +=0;
            total_total +=0;
        }
        if (!t_two.getText().toString().equals(""))
        {
            if (!o_two.getText().toString().equals("")){
                float o = Float.parseFloat(o_two.getText().toString());
                float t = Float.parseFloat(t_two.getText().toString());
                if (t < o)
                {
                    o_two.setError("!!Greater then Total");
                    Toast.makeText(getContext(),"Correct the Marks then calculate again",Toast.LENGTH_SHORT).show();
                }else
                {
                    obtained_total +=o;
                    total_total +=t;
                }
            }
        }else
        {
            obtained_total +=0;
            total_total += 0;
        }
        if (!t_three.getText().toString().equals(""))
        {
            if (!o_three.getText().toString().equals("")) {
                float o = Float.parseFloat(o_three.getText().toString());
                float t = Float.parseFloat(t_three.getText().toString());
                if (t < o)
                {
                    o_three.setError("!!Greater then Total");
                    Toast.makeText(getContext(),"Correct the Marks then calculate again",Toast.LENGTH_SHORT).show();
                }else
                {
                    obtained_total +=o;
                    total_total +=t;
                }
            }
        }else
        {
            obtained_total +=0;
            total_total += 0;
        }
        if (!t_four.getText().toString().equals(""))
        {
            if (!o_four.getText().toString().equals("")) {
                float o = Float.parseFloat(o_four.getText().toString());
                float t = Float.parseFloat(t_four.getText().toString());
                if (t < o)
                {
                    o_four.setError("!!Greater then Total");
                    Toast.makeText(getContext(),"Correct the Marks then calculate again",Toast.LENGTH_SHORT).show();
                }else
                {
                    obtained_total +=o;
                    total_total +=t;
                }
            }
        }else
        {
            obtained_total +=0;
            total_total += 0;
        }
        if (!t_five.getText().toString().equals(""))
        {
            if (!o_five.getText().toString().equals("")) {
                float o = Float.parseFloat(o_five.getText().toString());
                float t = Float.parseFloat(t_five.getText().toString());
                if (t < o)
                {
                    o_five.setError("!!Greater then Total");
                    Toast.makeText(getContext(),"Correct the Marks then calculate again",Toast.LENGTH_SHORT).show();
                }else
                {
                    obtained_total +=o;
                    total_total +=t;
                }
            }
        }else
        {
            obtained_total +=0;
            total_total += 0;
        }
        if (!t_six.getText().toString().equals(""))
        {
            if (!o_six.getText().toString().equals("")) {
                float o = Float.parseFloat(o_six.getText().toString());
                float t = Float.parseFloat(t_six.getText().toString());
                if (t < o)
                {
                    o_six.setError("!!Greater then Total");
                    Toast.makeText(getContext(),"Correct the Marks then calculate again",Toast.LENGTH_SHORT).show();
                }else
                {
                    obtained_total +=o;
                    total_total +=t;
                }
            }
        }else
        {
            obtained_total +=0;
            total_total += 0;
        }
        if (!t_seven.getText().toString().equals(""))
        {
            if (!o_seven.getText().toString().equals("")) {
                float o = Float.parseFloat(o_seven.getText().toString());
                float t = Float.parseFloat(t_seven.getText().toString());
                if (t < o)
                {
                    o_seven.setError("!!Greater then Total");
                    Toast.makeText(getContext(),"Correct the Marks then calculate again",Toast.LENGTH_SHORT).show();
                }else
                {
                    obtained_total +=o;
                    total_total +=t;
                }
            }
        }else
        {
            obtained_total +=0;
            total_total += 0;
        }
    }
    private String setFormat(float r)
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

}
