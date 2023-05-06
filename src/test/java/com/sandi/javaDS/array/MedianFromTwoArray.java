package com.sandi.javaDS.array;

public class MedianFromTwoArray {

    public static void main(String...args){
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(median(nums1, nums2));
    }

    public static double median(int[] nums1, int[] nums2){
        int totalCount = nums1.length + nums2.length;
        int[] result = new int[totalCount];
        int i = 0, j = 0, k = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                result[k] = nums1[i];
                i++;
            }else{
                result[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i < nums1.length){
            result[k] = nums1[i];
            i++;
            k++;
        }

        while(j < nums2.length){
            result[k] = nums2[j];
            j++;
            k++;
        }

        if(totalCount%2 == 0){
            int index = totalCount/2;
            return (double)(result[index]+result[index-1])/2;
        }else{
            return result[totalCount/2];
        }
    }

}
