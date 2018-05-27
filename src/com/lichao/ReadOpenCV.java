package com.lichao;

import java.io.File;

/**
 * @author ChaoLi
 * @date 2018年5月27日-上午11:43:07
 * @email 396229938@QQ.com
 * 读取OpenCV文件目录
 */
public class ReadOpenCV {

	public static void main(String[] args) {
		File dir = new File("E:\\lichao\\study\\opencv\\opencv3.4\\opencv\\newbuild\\install\\x64\\vc14\\lib");
		File[] files = dir.listFiles();
		for (File f : files) {
			if (f.getName().endsWith(".lib")) {
				System.out.println(f.getName());
			}
		}
	}
}
