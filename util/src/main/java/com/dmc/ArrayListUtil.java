package com.dmc;

import java.util.*;

/**
 * @author xiaobianchen
 * @version 1.0 2016/3/7
 */
public class ArrayListUtil {

    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<Integer>();
        List<Integer> arrayList = new ArrayList<Integer>();

        long start = new Date().getTime();

//        for (int m = 0; m < 20000; m++) {
//            linkedList.add(m);
//        }

        for (int m = 0; m < 20000; m++) {
            arrayList.add(m);
        }

        long end = new Date().getTime();

        System.out.println(end - start);

        Set set = new HashSet();
        Set treeSet = new TreeSet();
        Collections.synchronizedSet(set);
        Map map = new HashMap();
        Hashtable hashtable = new Hashtable();
    }
}
