package com.dmc.demo.sort;

/**
 * @author xiaobianchen
 * @version 1.0 2016/3/16
 */
public class BubbleSort {

    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 -i; j++) {

                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }

            System.out.print("第" + (i + 1) + " 趟排序结果为:");

            for (int k = 0; k < a.length; k++) {
                System.out.print(a[k] + "\t");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[] a = {69, 60, 95, 80, 96, 40, 19, 10};
        bubbleSort(a);

        System.out.print("最终排序的结果为:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
