package org.blue.webframework.sys.identifyingcode.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

public class ImagCodeHelper {
	public static BufferedImage getImageyCode(String code,int width,int height) {
		// 创建图片缓冲区设置其大小 BufferedImage(int width, int height, int imageType)
		BufferedImage bImage = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
		int fontSize=Math.min(width, height)*27/30;
		// 在缓冲区上创建画布
		Graphics g = bImage.getGraphics();
		// 设置背景颜色
		 g.setColor(Color.WHITE);  
	     g.setFont(new Font("Times New Roman",0,fontSize));  
	     g.fillRect(0, 0, width, height);
	     int y=fontSize;

		Random r = new Random();
		// 循环产生四个字
		for (int i = 0; i < code.length(); i++) {

			// 设置随机颜色，
			g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
			g.drawString( String.valueOf(code.charAt(i)), i * fontSize + 2, y);

		}
		g.dispose();
		return bImage;
	}
}
