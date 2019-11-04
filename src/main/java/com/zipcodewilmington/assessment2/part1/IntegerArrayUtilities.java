package com.zipcodewilmington.assessment2.part1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if(array.length % 2 == 0)
            return true;
        return false;
    }

    public Integer[] range(int start, int stop) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = start; i <= stop; i++)
            result.add(i);

        Integer[] array = new Integer[result.size()];
        for(int i = 0; i < result.size(); i++)
            array[i]=result.get(i);
        return array;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        Integer sum = array[0] + array[1];

        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {

        return array[array.length -1] * array[array.length - 2];
    }
}
