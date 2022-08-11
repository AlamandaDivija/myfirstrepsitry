package com.div.ass2;

import java.util.Scanner;

public class Player {

	  int player_num()
	  {
		  System.out.println("Player guess a number");
		  int num;
		  Scanner sc=new Scanner(System.in);
		  num=sc.nextInt();
		  return num;
	  }
	}
