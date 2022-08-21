package Com.itheima.Test.CloneDemo;

import java.util.StringJoiner;

//Cloneable
//如果一个接口里面没有抽象方法
//表示当前接口是一个标记下接口

public class User implements Cloneable{
    int id;
    String userName;
    String passWord;
    String path;
    int[] data;

    public User() {
    }

    public User(int id, String userName, String passWord, String path, int[] data) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.path = path;
        this.data = data;
    }

    @Override
    public String toString() {
        return ("角色编号为:" + id + "," + "用户名" + userName + "," + "密码" + passWord + "," + "游戏图片" + path + "," + "游戏进度"+arrtoString());
    }
    public String  arrtoString(){
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i]+"");
        }
        return sj.toString();

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用弗雷中的clone方法
        //
        return super.clone();
    }
}
