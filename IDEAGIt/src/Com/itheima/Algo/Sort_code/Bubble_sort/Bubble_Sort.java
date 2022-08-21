package Com.itheima.Algo.Sort_code.Bubble_sort;

public class Bubble_Sort {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr ={3,5,6,4,9,1,10,33};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        //遍历数组输出
        for (int s:
             arr) {
            System.out.println(s);
        }

    }
}
