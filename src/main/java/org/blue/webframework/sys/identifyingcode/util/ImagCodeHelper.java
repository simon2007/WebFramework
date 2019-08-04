package org.blue.webframework.sys.identifyingcode.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.Random;

public class ImagCodeHelper {
	public static Image getImageyCode(String code) {
		// 创建图片缓冲区设置其大小 BufferedImage(int width, int height, int imageType)
		BufferedImage bImage = new BufferedImage(100, 30, BufferedImage.TYPE_3BYTE_BGR);
		// 在缓冲区上创建画布
		Graphics g = bImage.getGraphics();
		// 设置背景颜色
		g.setColor(Color.orange);
		// 创建画布矩形，位置（0，0）点，大小100，30
		g.fillRect(0, 0, 100, 30);
		Random r = new Random();
		// 循环产生四个字
		for (int i = 0; i < code.length(); i++) {

			// 设置随机颜色，
			g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
			// 设置文字的类型，大小
			g.setFont(new Font("", Font.BOLD, 20));
			/*
			 * 画字，将随机数字转换成十六进制Integer.toHexString(index),16)再转换字符(char)(Integer.parseInt，
			 * 在设置每个文字的位置
			 */
			g.drawString(code.substring(i, i), i * 22 + 4, 18);

		}
		return bImage;
	}
}
