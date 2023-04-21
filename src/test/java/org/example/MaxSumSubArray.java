package org.example;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class MaxSumSubArray {

    @Test
    public void test(){
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        Assert.assertEquals(6,maxSum(nums));

    }

    private int maxSum(int[] nums) {
        int maxSum=nums[0], windowSum=nums[0];
        for (int i=1;i<nums.length;i++){
            windowSum=Math.max(nums[i],windowSum+nums[i]);
            maxSum=Math.max(maxSum,windowSum);
        }
        return maxSum;
    }
}
