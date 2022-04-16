package com.company;

public class Main {

    public static void main(String[] args) {
        var a = new Complex(1, -4);
        var b = new Complex(2, 5);
        var c = new Complex(a);
        System.out.println("Комплексні чмсла:");
        String cmd = a.ToString();
        System.out.println("a = " + cmd);
        cmd = b.ToString();
        System.out.println("b = " + cmd);
        cmd = c.ToString();
        System.out.println("c = " + cmd);
        System.out.println();
        Complex x = new Complex();
        x = x.Add(a, b);
        cmd = x.ToString();
        System.out.println("a + b = "+cmd);
        x = x.Subtraction(a, b);
        cmd = x.ToString();
        System.out.println("a - b = "+cmd);
        x = x.Multiply(a, b);
        cmd = x.ToString();
        System.out.println("a * b = "+cmd);
        x = x.Division(a, b);
        cmd = x.ToString();
        System.out.println("a / b = "+cmd);
        x = x.Pow(a, 2);
        cmd = x.ToString();
        System.out.println("a ^ 2 = "+cmd);
        x = x.Increment(a);
        cmd = x.ToString();
        System.out.println("a++ = "+cmd);
        x = x.Decrement(a);
        cmd = x.ToString();
        System.out.println("a++ = "+cmd);
        boolean test = x.Comparison1(a,b);
        System.out.println("a == b : " + test);
        test = x.Comparison1(a,c);
        System.out.println("a == c : " + test);

    }
}
