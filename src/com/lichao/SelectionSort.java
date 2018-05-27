package com.lichao;

/**
 * @author ChaoLi
 * @date 2018��5��26��-����8:36:26
 * @email 396229938@QQ.com
 * ѡ������
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] array = {1, 7, 3, 9, 8, 5, 4, 6};
        array = sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
	}
	
	public static int[] sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int temp = i;
			for (int j = i+1; j < array.length; j++) {
				if (array[temp] > array[j]) {
                    temp = j;
                }
			}
			int t = array[temp];
            array[temp] = array[i];
            array[i] = t;
		}
		return array;
	}
}
