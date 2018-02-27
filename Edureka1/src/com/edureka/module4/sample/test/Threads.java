package com.edureka.module4.sample.test;

public class Threads extends Thread {
			Threads()
			{		
				start();		
			}
			public void run()
			{
				try
				{
					int i;
					for (i = 1; i <= 10; ++i)
						System.out.println(5+" * "+i+" = "+i*5);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
			
			public static void main (String args[])
			{		
				new Threads();
				try
				{
					Thread.sleep(1000);
					for (int i = 0; i <= 40; i += 2)
					{
						System.out.println(i+" task of main thread\n");
						Thread.sleep(1000);
					}
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}
