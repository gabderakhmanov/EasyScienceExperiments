package com.experiments.hashcode;

public class HashCodeTest {
    public static void main(String[] args) {

        MockObj mockObj1 = new MockObj(5,5);
        MockObj mockObj2 = new MockObj(5,5);

        System.out.println(mockObj1.equals(mockObj2));
        System.out.println(mockObj1.hashCode());
        System.out.println(mockObj2.hashCode());

        System.out.println("vishal".hashCode());
        System.out.println((int)"vishal".charAt(0));





    }

//    @Override
//    public int hashCode()
//    {
//        return (int)key.charAt(0);
//    }
}
