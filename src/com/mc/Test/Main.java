package com.mc.Test;

import java.io.*;
import java.net.*;

import javax.swing.JOptionPane;

public class Main
{
	// Choose a port outside of the range 1-1024:
	public static final int PORT = 6666;
	public static void main(String[] args) throws IOException
	{
		JOptionPane.showMessageDialog(null, "远程关机程序(PC端)启动成功!");
		ServerSocket s = new ServerSocket(PORT);
		System.out.println("Started: " + InetAddress.getLocalHost());
		Socket socket = s.accept();
		Runtime.getRuntime().exec("cmd.exe /c shutdown -s -t 30");
		System.out.println("closing...");
		socket.close();
		s.close();
	}
} 