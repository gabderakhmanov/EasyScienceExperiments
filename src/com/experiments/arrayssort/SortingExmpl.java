package com.experiments.arrayssort;

import java.util.Arrays;

public class SortingExmpl {
    
    public static void main(String[] agr){
        
        int[] nums = {6,3,9,3,1};
        String[] strgs = {"Artem", "artem", "artemka", "Artemka", "Lena", "Alex"};

        Arrays.sort(nums);
        Arrays.sort(strgs);

        for (int num : nums) {
            System.out.println(num + " ");
        }

        System.out.println();

        for (String strg : strgs) {
            System.out.println(strg + " ");
        }
    }
}
