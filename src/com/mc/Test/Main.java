package com.mc.Test;

import java.io.*;
import java.net.*;

import javax.swing.JOptionPane;

public class Main
{
	// Choose a port outside of the range 1-1024:
	public static final int PORT = 6666;

	public static void main(String[] args) throws IOException,
			NullPointerException
	{
		ServerSocket s = null;
		Socket socket = null;
		try
		{
			s = new ServerSocket(PORT);
			JOptionPane.showMessageDialog(null, "远程关机程序(PC端)启动成功!");
		} catch (BindException e)
		{
			System.out.println("123");
		}
		System.out.println("Started: " + InetAddress.getLocalHost());
		try
		{
			socket = s.accept();
			socket.close();
			s.close();
			Runtime.getRuntime().exec("cmd.exe /c shutdown -s -t 30");

		} catch (NullPointerException e)
		{
			JOptionPane.showMessageDialog(null, "程序已经在运行了!");
		}

	}
}