package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Max3Values {

    @Test
    public void test(){
        int[] nums={3,5,8,1,2,0,-10,-20};
        Assert.assertArrayEquals(maxNumbers(nums),new int[]{-20,-10,8});
    }

    private int[] maxNumbers(int[] nums) {
        int fMax=nums[0]>(nums[1]>nums[2]?nums[1]:nums[2])?nums[0]:(nums[1]>nums[2]?nums[1]:nums[2]);
        int tMax=nums[0]<(nums[1]<nums[2]?nums[1]:nums[2])?nums[0]:(nums[1]<nums[2]?nums[1]:nums[2]);
        int sMax=0;
        for (int i=0;i<3;i++){
            if (nums[i]!=fMax && nums[i]!=tMax)
                sMax=nums[i];
        }

        for (int i=3;i<nums.length;i++){
            if (Math.abs(nums[i])>=fMax){
                tMax=sMax;
                sMax=fMax;
                fMax=nums[i];
            }
            else if(Math.abs(nums[i])>sMax && Math.abs(nums[i])<fMax){
                tMax=sMax;
                sMax=nums[i];
            }else if(Math.abs(nums[i])>tMax && Math.abs(nums[i])<sMax &&Math.abs(nums[i])<fMax){
                tMax=nums[i];
            }
        }
        return new int[]{fMax,sMax,tMax};
    }
}
