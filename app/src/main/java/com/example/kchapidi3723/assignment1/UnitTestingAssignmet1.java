package com.example.kchapidi3723.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class UnitTestingAssignmet1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_testing_assignmet1);
    }
    public double Division(double x, double y)
    {
        return (x/y);
    }
    public double Add(double x, double y)
    {
        return (x+y);
    }
    public double Sub(double x, double y)
    {
        return (x-y);
    }
    public double Mul(double x, double y)
    {
        return (x*y);
    }
}
