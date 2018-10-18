package com.company;


import java.util.ArrayList;
import java.util.Optional;

public class Main {

        public void reverseInPlace(final ArrayList<Integer> list) {
            int size = list.size();
        if (size==1) {
            return list;
        }
            if (size==0) {
                return list;
            }
        for(int i=0; i<size; i++){
            list.add(i,list.remove(list.size()-1));
        }
    return list;
        }
    }


    //b O(n- only touches element of the array once because it is an unsorted array so it has to look at all the elements of the array


    public static void main(String [] args){
        int array1[] = {1,2,3,4};
        reverseInPlace(array1);
        int array2[] = {4,3,2,1};
        reverseInPlace(array2);
        int array3[] = {};
        reverseInPlace(array3);
        int array4[] = {2};
        reverseInPlace(array4);


        }


