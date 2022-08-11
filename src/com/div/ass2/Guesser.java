package com.div.ass2;

import java.util.Scanner;

public class Guesser {

	public Guesser() {
	}
	int num;
	  int guesser_num()
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Gusser guess a number");
		  num=sc.nextInt();
		  if(num <= 0 || num > 10){
			 return guesser_num();
		  }
		  else
			  return num;
	  }

}
