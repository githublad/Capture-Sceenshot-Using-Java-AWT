package com.screenshot;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ScreenShotTaker 
{
	public static void main(String[] args) 
	{
		try {
			Robot robot=new Robot();
			Rectangle rect= new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			BufferedImage screenshot=robot.createScreenCapture(rect);
			ImageIO.write(screenshot, "JPG", new File("C:\\Users\\Admin\\Desktop\\screenshot.jpg"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
