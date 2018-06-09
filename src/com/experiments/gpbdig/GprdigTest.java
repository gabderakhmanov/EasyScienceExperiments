package com.experiments.gpbdig;

import java.util.Arrays;

public class GprdigTest {

    public static void main(String[] args) {


        int[] outputArr = new int[] {1, 2, 0, 0, 1, 5, 0, 9, 0};

        for (int i = 0; i < outputArr.length; i++)
        {

            for (int j = i+1; j < outputArr.length; j++)
            {
                if(outputArr[i]==0 && outputArr[j]!=0){

                    int temp = outputArr[i];
                    outputArr[i] = outputArr[j];
                    outputArr[j] = temp;

                }

            }

        }

        System.out.println(Arrays.toString(outputArr));
    }
}
