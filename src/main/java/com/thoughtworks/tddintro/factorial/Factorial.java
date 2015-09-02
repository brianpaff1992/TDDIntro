package com.thoughtworks.tddintro.factorial;

public class Factorial {
    public Integer compute(int i) {

        if(i<0)
        {
            throw new IllegalArgumentException();
        }
        else if(i <= 1)
        {
            return 1;
        }
        else
        {
            int oneNumberSmaller = i -1;
            return i * compute(oneNumberSmaller);
        }
    }
}
