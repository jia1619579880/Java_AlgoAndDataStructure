package Com.itheima.Algo.search_code.BlockSearch;

public class BlockSearchDemo {
    public static void main(String[] args) {
        int[] arr = {16,5,9,12,21,18,
                    32,23,37,26,45,34,
                    50,48,61,52,73,66};

        //创建三个块的对象
        Block1 b1 = new Block1(21,0,5);
        Block1 b2 = new Block1(45,6,11);
        Block1 b3 = new Block1(73,12,17);

        //定义数组用来管理三个块的对象
        Block1[] blockArr = {b1,b2,b3};

        //定义一个变量用来记录要查找的元素
        int number = 37;

        //调用方法，传递索引表，数组，要查找的元素
        int index = getIndex(blockArr,arr,number);

        //打印一下
        System.out.println(index);

    }
    private static int getIndex(Block1[] blockArr ,int[] arr,int number){
        //1.确定number是在那一块当中
        int indexBlock = findIndexBlock(blockArr, number);
        if(indexBlock==-1){
            //表示number不在数组当中
            return -1;
        }
        int startIndex = blockArr[indexBlock].getStartIndex();
        int endIndex = blockArr[indexBlock].getEndIndex();

        //3.遍历
        for (int i = startIndex; i < endIndex; i++) {
            if(arr[i] == number){
                return i;
            }
        }

        return -1;
    }
    //定义一个方法，用来确定number在那一块当中
    public static int findIndexBlock(Block1[] blockArr,int number){
        //从0索引开始遍历blockArr,如果number小于max，那么就表示number是在这一块当中的
        for (int i = 0; i < blockArr.length; i++) {
            if(number<= blockArr[i].getMax()){
                return i;
            }
        }
        return -1;
    }
}

class Block1{
    private int max;//最大值
    private int startIndex;//起始
    private int endIndex;//结束

    public Block1(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public Block1() {
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}