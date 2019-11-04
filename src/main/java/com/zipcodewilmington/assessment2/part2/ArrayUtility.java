package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        int length = array1.length + array2.length;
        Integer[] result = new Integer[length];
        int index = 0;
        for(Integer each : array1){
            result[index] = each;
            index++;
        }
        for(Integer each : array2){
            result[index] = each;
            index++;
        }

        return result;
    }

    public Integer[] rotate(Integer[] array, Integer index) {

        for(int i = 0; i < index; i++){
            int j;

            Integer first = array[0];

            for(j = 0; j < array.length-1; j++){
                array[j]=array[j+1];
                System.out.println(array[j]);
            }
            array[array.length-1] = first;
        }

        return array;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer[] newArray = merge(array1, array2);
        Integer count = 0;
        for(Integer each : newArray){
            if(each == valueToEvaluate)
                count++;
        }

        return count;
    }

    public Integer mostCommon(Integer[] array) {

        int max = 1;
        int current = 1;
        int popular = array[0];
        int temp = 0;

        for(int i = 0; i < array.length; i++) {

            temp = array[i];
            current = 0;
            for(int j = 1; j < array.length; j++){
                if(temp == array[j])
                    current++;

            }
            if(current > max){
                popular = temp;
                max = current;
            }

        }

        return popular;


    }
}
