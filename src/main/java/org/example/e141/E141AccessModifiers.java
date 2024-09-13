package org.example.e141;

public class E141AccessModifiers {


        public int maxValue(int []nums) {

            int max=nums[0];
            for (int value: nums) {
                if (value>max){
                    max=value;
                }

            }
            return max;


        }
        public static void main(String[] args) {
            E141AccessModifiers a=new E141AccessModifiers();
            int[]nums={1,5,22,3,7};
            System.out.println(a.maxValue(nums));


    }
}
