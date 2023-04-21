package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PermutationsArray {

    @Test
    public void test(){
        int[] nums={1,2,3};
        List<List<Integer>> list = permutationsArray(nums);
        System.out.println(list);
    }

    private List<List<Integer>> permutationsArray(int[] nums) {
        List<List<Integer>> lists=new ArrayList<>();
        permute(0,nums,nums.length-1,lists);
        return lists;
    }

    public void permute(int startIndex, int[] nums, int endIndex, List<List<Integer>>lists){

        if (startIndex==endIndex) {
            ArrayList<Integer> integers = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                integers.add(nums[i]);
            }
            lists.add(integers);
        }
            for (int i=startIndex;i<=endIndex;i++){
                nums=swap(nums,startIndex,i);
                permute(startIndex+1,nums,endIndex,lists);
                nums=swap(nums,startIndex,i);
            }
        }
    public int[] swap(int[] nums, int left, int right){
        int temp=0;
       temp=nums[left];
       nums[left]=nums[right];
       nums[right]=temp;
       return nums;
    }
}
