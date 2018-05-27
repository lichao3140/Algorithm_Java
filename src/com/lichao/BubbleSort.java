package com.lichao;

/**
 * @author ChaoLi
 * @date 2018年5月26日-上午8:14:13
 * @email 396229938@QQ.com
 * 冒泡排序
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] array = {1, 7, 3, 9, 8, 5, 4, 6};
        array = sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
	}
	
	public static int[] sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

}
