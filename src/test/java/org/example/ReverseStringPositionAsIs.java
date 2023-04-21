package org.example;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringPositionAsIs {

    @Test
    public void test(){
        String s="this is a test class";
        Assert.assertEquals("",reverse(s));
    }
    public String reverse(String s){
        int left=0, right=s.length()-1;
        char temp=' ';
        char[] ch = s.toCharArray();
        while (left<right){
            if (ch[left]==' ') left++;
            else if(ch[right]==' ')right--;
            temp=ch[left];
            ch[left++]=ch[right];
            ch[right--]=temp;
        }
      return String.valueOf(ch);
    }
}
