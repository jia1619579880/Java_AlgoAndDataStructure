package Com.itheima.Algo.search_code.BinarySearch;

public class BinarySearchDemo1 {
    public static void main(String[] args) {
        //二分查找/折半查找
        //核心:
        //每次排除一般的查找范围
        //
        //需求：定义一个方法利用二分查找，查询某个元素在数组中的索引
        //数据如下:{7,23,79,81,103,127,131,147}


        int[] arr = {7,23,79,81,103,127,131,147};
        System.out.println(binarySearch(arr, 7));


    }
    public static int binarySearch(int[] arr,int val){
        //1.定义两个变量记录
        int min = 0;
        int max = arr.length-1;

        while (true){
            if(min>max){
                return -1;
            }
            //3.找到min和max的中间位置
            int mid = (min+max)/2;
            //4.拿着mid指向的元素跟要
            if(arr[mid]>val){
                //numbr在mid的左边
                max = mid-1;
            } else if (arr[mid] < val) {
                min = mid+1;
            } else {
                return mid;
            }
        }
    }
}
