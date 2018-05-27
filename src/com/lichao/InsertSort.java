package com.lichao;

/**
 * @author ChaoLi
 * @date 2018年5月26日-上午8:42:37
 * @email 396229938@QQ.com
 * 插入排序
 */
public class InsertSort {

	public static void main(String[] args) {
		int[] array = {1, 7, 3, 9, 8, 5, 4, 6};
        array = sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
	}
	
	public static int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int in = i;
            while (in > 0 && array[in-1] >= temp) {
                array[in] = array[in-1];
                in--;
            }
            array[in] = temp;
        }
        return array;
    }

}
