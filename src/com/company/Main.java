package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    ArrayList<Integer> primeFactors(int n){

        ArrayList<Integer> nums = new ArrayList<Integer>();
        int i;
        for(i=2;i<=n;i++){
            if(n%i == 0){
                nums.add(i);
            while(n%i == 0) {
                n = n / i;
            }
            }
        }

        return nums;
    }


    public static void main(String[] args) {
	// write your code here
        Main m = new Main();
        ArrayList<Integer> nums;
        int n,length;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        System.out.print("Enter n : ");
        try{
            str = bf.readLine();
            }
        catch(Exception e){}
        n = Integer.parseInt(str);
        nums = m.primeFactors(n);
        length = nums.size();
        System.out.print("Factors of " + n + " : ");


        for(int i=0;i<length;i++){
            System.out.print(nums.get(i) + " ");
        }
    }
}
