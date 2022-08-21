package Com.itheima.Algo.search_code.BlockSearch;

public class BlockSearchDemo2 {
    public static void main(String[] args) {
        /**
         * 有一组数据
         * 27,22,30,40,36
         * 13,19,16,20
         * 7,10
         * 43,50,48
         */
        int[] arr = {
                27,22,30,40,36,
                13,19,16,20,
                7,10,
                43,50,48
        };
        //创建三个快的对象
        Block2 b1 = new Block2(40,22,0,4);
        Block2 b2 = new Block2(20,13,5,8);
        Block2 b3 = new Block2(10,7,9,10);
        Block2 b4 = new Block2(50,43,11,13);

        //定义数组用来管理三个快的对象
        Block2[] blockArr = {b1,b2,b3,b4};

        //定义一个变量用来记录要查找的元素
        int number=7;

        //调用方法，传递索引表，数组，要找的数据
        int index = getIndex(blockArr,arr,number);

        //打印结果
        System.out.println(index);
    }
    private static int getIndex(Block2[] blockArr,int[] arr,int number){
        //1.确定number是在哪一块当中
        int indexBlock = findIndexBlock(blockArr,number);
        if(indexBlock==-1){
            return -1;
        }
        int startIndex = blockArr[indexBlock].getStartIndex();
        int endIndex = blockArr[indexBlock].getEndIndex();

        //遍历
        for (int i = startIndex; i < endIndex; i++) {
            if(arr[i] == number){
                return i;
            }
        }
        return -1;
    }
    public static int findIndexBlock(Block2[] blockArr,int number){
        for (int i = 0; i < blockArr.length; i++) {
            if(number>=blockArr[i].getMin()&&number<=blockArr[i].getMax()){
                return i;
            }
        }
        //没有找到元素
        return -1;
    }
}
class Block2{
    private int max;
    private int min;
    private int startIndex;
    private int endIndex;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public Block2() {
    }

    public Block2(int max, int min, int startIndex, int endIndex) {
        this.max = max;
        this.min = min;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }
}