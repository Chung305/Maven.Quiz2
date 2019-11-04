package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.*;

public class ListUtility {
    ArrayList<Integer> list = new ArrayList<>();

    public ListUtility(){

    }
    public Boolean add(int i) {
        list.add(i);

        return contains(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        Set<Integer> set = new HashSet<>();

        for(Integer each : list){
            set.add(each);
        }

        List<Integer> unique = new ArrayList<>();
        unique.addAll(set);

        return unique;
    }

    public String join() {
        String result = "";

        for(int i = 0; i < list.size(); i++ ){
            if(i == list.size()-1)
                result += list.get(i);
            else{
                result += list.get(i) + ", ";
            }
        }
        return result;
    }

    public Integer mostCommon() {
        Integer[] array = new Integer[list.size()];
        int count = 0;
        for(Integer each: list){
            array[count] = each;
            count++;
        }
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

    public Boolean contains(Integer valueToAdd) {

        for(Integer each : list){
            if(each.equals(valueToAdd))
                return true;
        }

        return false;
    }
}
