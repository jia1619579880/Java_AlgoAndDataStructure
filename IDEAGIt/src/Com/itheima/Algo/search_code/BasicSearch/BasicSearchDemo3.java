package Com.itheima.Algo.search_code.BasicSearch;

import java.util.ArrayList;

public class BasicSearchDemo3 {
    public static void main(String[] args) {
        int[] arr = {131,127,147,81,103,23,7,79,81};
        System.out.println(basicSearch(arr, 81));
    }
    public static ArrayList<Integer> basicSearch(int[] arr, int val){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==val){
                list.add(i);
            }
        }
        return list;
    }
}
