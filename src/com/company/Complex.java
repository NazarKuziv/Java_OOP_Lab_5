package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Complex {
    private double x;
    private double y;

    public double Get_x()  { return x; }
    public double Get_y()  { return y; }
    public void Set_x(double value) { x = value; }
    public void Set_y(double value) { y = value; }
    public Complex(){x = 0;y = 0;}
    public Complex(double value_x, double value_y){this.x = value_x; this.y = value_y;}
    public Complex(Complex c){this.x = c.x;this.y = c.y;}

    public  Complex Subtraction(Complex a, Complex b)
    {
        return new Complex(a.x - b.x, a.y - b.y);
    }
    public  Complex Division(Complex a, Complex b)
    {
        double r1 = a.x;
        double i1 = a.y;
        double r2 = b.x;
        double i2 = b.y;
        Complex t = new Complex((r1 * r2 - i1 * i2) / (r2 * r2 + i2 * i2), (-r1 * i2 + i1 * r2) / (r2 * r2 + i2 * i2));
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        return t;
    }
    public  Complex Conj(Complex a)
    {
        return new Complex(a.x, a.y * -1);
    }
    public boolean Comparison1(Complex a, Complex b)
    {
        boolean test = false;
        if(a.x == b.x && a.y==b.y)
            test = true;

        return test;
    }
    public  Complex Add(Complex a, Complex b)
    {
        return new Complex(a.x + b.x, a.y + b.y);
    }
    public  Complex Multiply(Complex a, Complex b)
    {
        return new Complex(a.x * b.x - a.y * b.y, a.x * b.x + a.y * b.x);
    }
    public  Complex Pow(Complex a, int n)
    {
        var y = new Complex(1, 0);
        for (int i = 1; i <= n; i++)
            y = Multiply(y, a);
        return y;

    }

    public  Complex Increment(Complex a)
    {
        a.x++;
        a.y++;
        return a;
    }
    public  Complex Decrement(Complex a)
    {
        a.x--;
        a.y--;
        return a;
    }
    public String ToString() {
        NumberFormat myFormat = NumberFormat.getInstance();
        myFormat.setGroupingUsed(true);
        if (this.y < 0)
            return  myFormat.format(this.x) + " " + myFormat.format(this.y) + "і";
        else
            return myFormat.format(this.x) + "+" + myFormat.format(this.y) + "і";
    }



}
