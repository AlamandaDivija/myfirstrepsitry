package com.div;

import java.util.Scanner;

import com.div.ass2.Umpire;

public class GamedDesign {

	public GamedDesign() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[])
	  {
	    Umpire u= new Umpire();
	    System.out.println("Welcome To GUESS FOR FUN GAME!!!!");
	    System.out.println("Test your luck!! Win Navin's KEYBOARD");
		u.collect();
		u.check();
	  }

}
