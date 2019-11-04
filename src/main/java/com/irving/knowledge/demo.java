package com.irving.knowledge;

import java.util.ArrayList;
import java.util.List;

public class demo {

    /**
     *
     * Z字型变换
     * @param s
     * @param numRows
     * @return
     */
    public static String convert(String s, int numRows) {
        if(numRows==1){
            return s ;
        }
        int a = numRows*2-2 ;  //每次的数量
        int length = s.length() ;//字符串长度 ;
        int time = length/a ;
        int yushu = length%a ;
        if(yushu > 0) {
            time = time + 1 ;
        }
        StringBuilder result =  new StringBuilder();
        for(int i = 0 ;i< numRows ; i++ ) {
            for(int j = 0 ;j< time ; j++){
                if(i==0){
                    result.append(s.substring(a*j,a*j+1))  ;
                }else{
                    if(i == numRows-1){
                        if(a*j+i < length) {
                            result.append(s.substring(a*j+i,a*j+i+1)) ;
                        }
                    }else {
                        if(a*j+i < length) {
                            result.append(s.substring(a*j+i,a*j+i+1)) ;
                        }
                        if(a*(j+1)-i < length) {
                            result.append(s.substring(a*(j+1)-i,a*(j+1)-i+1)) ;
                        }
                    }

                }

            }
        }
        return result.toString() ;
    }

    /***
     *
     */
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> resultList = new ArrayList<>();
        int length = nums.length ;
        boolean iszero = false ;
        for(int i = 0 ; i<length-2 ; i++) {
             for (int j = i+1 ; j < length-1; j ++) {
                 loop1 : for (int k = j+1; k<length ; k++){
                  if(nums[i]+nums[j]+nums[k] == 0){
                      List<Integer> result = new ArrayList<>();
                      result.add(nums[i]);
                      result.add(nums[j]);
                      result.add(nums[k]);
                      if(nums[i] ==0 && nums[j] ==0 ){
                          if(!iszero){
                              iszero = true ;
                              resultList.add(result);
                              break loop1;
                          }
                      }

                      if(resultList != null && resultList.size() >0) {
                          for(List<Integer> a : resultList){
                              if(a.contains(nums[i]) && a.contains(nums[j]) && a.contains(nums[k])){
                                 break loop1;
                              }
                          }
                          resultList.add(result);
                          break loop1;
                      }else {
                          resultList.add(result);
                          break loop1;
                      }
                  }
                 }
             }
        }
        return resultList ;
    }




    public static  void main(String[]argus){
//        int[]a = new int[]{-2,-2,0,-5,-1,-3,0,4,3,4,1,3,0,-1,0,3};
//        List<List<Integer>> b =   threeSum(a);
        String str6 ="a" + "b" + "c" ;

        String str16 = "d" ;
        String str7 = ("a" + "b" + "c"+ str16.replace(str16,"")).intern();

        System.out.println("str7 = str67 : "+ (str6 == str7));
    }
}
