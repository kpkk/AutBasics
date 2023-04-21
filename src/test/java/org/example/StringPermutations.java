package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringPermutations {

    @Test
    public void test() {
        String s = "Grek";
        List<String> strings = permutationsStr(s);
        System.out.println(strings);
        System.out.println(strings.size());
    }

    private List<String> permutationsStr(String s) {
        ArrayList<String> list = new ArrayList<>();
        permute(s,0,s.length()-1,list);
        return list;
    }

    private void permute(String s, int startIndex, int endIndex, List<String> list){

        if (startIndex==endIndex){
            list.add(s);
        }
        for (int i=startIndex;i<=endIndex;i++){
            s=swap(s,startIndex,i);
            permute(s,startIndex+1,endIndex,list);
            s=swap(s,startIndex,i);
        }
    }

    private String swap(String s, int left, int right){
        char[]  ch = s.toCharArray();
        char temp=' ';
        temp=ch[left];
        ch[left]=ch[right];
        ch[right]=temp;

        return String.valueOf(ch);
    }
}
