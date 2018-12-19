package com.example.java1;

import java.util.Scanner;

public class java1 {
    final static double a = 3.2;
    final static double b = 4.2;

    public static void main(String[] args) {
        double average = (a + b) / 2;
        System.out.print("This is average: " + average);
    }
}

class str {
    public static void main(String[] args) {
        String firstName = "One";
        String lastName = "End";
        System.out.print("Full name: [" + firstName + "] [" + lastName + "]");
    }
}

class fib {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(b + " ");
        for(int i = 0; i < 14; i++){
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}

class bubble {
    public static void main(String[] args) {
        int m[];
        m = new int[10];

        for (int i = 0; i < m.length; i++){
            Scanner in = new Scanner(System.in);
            m[i] = in.nextInt();
        }

        for(int i = m.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( m[j] > m[j+1] ){
                int tmp = m[j];
                m[j] = m[j+1];
                m[j+1] = tmp;
            }
        }
    }

        System.out.println();
        for (int i = 0; i < m.length; i++){
            System.out.print(m[i] + " ");
        }
    }
}

class fun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        String str = s.replaceAll("\\D+","");

        String str1 = s.replace(str, "");

        int n = Integer.parseInt(str);
        n = n + 1;

        String n1 = Integer.toString(n);

        String s_new = str1 + n1;

        System.out.print(s_new);
    }
}