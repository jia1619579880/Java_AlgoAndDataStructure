package Com.itheima.Algo.search_code.BasicSearch;

public class BasicSearchDemo1 {
    public static void main(String[] args) {
        //基本查找/顺序查找
        //核心
        //从0开始
        int[] arr = {131,127,147,81,103,23,7,79};
        System.out.println(basicSearch(arr, 81));
    }
    public static boolean basicSearch(int[] arr,int val){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==val){
                return true;
            }
        }
        return false;
    }
}
