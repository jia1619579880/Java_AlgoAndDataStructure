package Com.itheima.Algo.search_code.BasicSearch;

public class BasicSearchDemo2 {
    public static void main(String[] args) {
        int[] arr = {131,127,147,81,103,23,7,79};
        System.out.println(BasicSearch(arr, 81));
    }
    public static int BasicSearch(int[] arr,int val){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==val){
                return i;
            }
        }
        return -1;
    }
}
