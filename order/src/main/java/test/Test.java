package test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2020/2/24.
 */
public class Test{

    public static void main(String[] args){


    List<String> stringArrayList = new ArrayList<String>();
    List<Integer> integerArrayList = new ArrayList<Integer>();

    Class classStringArrayList = stringArrayList.getClass();
    Class classIntegerArrayList = integerArrayList.getClass();

    if(classStringArrayList.equals(classIntegerArrayList)){
           System.out.println("泛型测试类型相同");
        }
        List<String> arrayList = new ArrayList();
        arrayList.add("aaaa");
        //arrayList.add(100);

        for(int i = 0; i< arrayList.size();i++){
            String item = (String)arrayList.get(i);
            System.out.println("泛型测试");
        }


    }

}
