package com.div.ass2;

public class Umpire {
	  int guesser_num;
	  int player_num1;
	  int player_num2;
	  int player_num3;

	public Umpire() {
	}

	  Guesser g=new Guesser();
	  Player p=new Player();
	 public void collect()
	 {
	    guesser_num=g.guesser_num();
		player_num1=p.player_num();
		player_num2=p.player_num();
		player_num3=p.player_num();
	 }


 public void check()
 {
   //only player 1 guessed corectly
	if(guesser_num==player_num1)
		System.out.println("Player 1 won");
   //only player 2 guessed corectly
	if(guesser_num==player_num2)
		System.out.println("Player 2 won");
   //only player 3 guessed corectly
	if(guesser_num==player_num3)
		System.out.println("Player 3 won");
	//all players gueesed incorrectly
   if(guesser_num!=player_num1 && guesser_num!=player_num2 && guesser_num!=player_num3)
	   System.out.println("All players guessed incorrectly");
	//all players gueesed correctly
   if(guesser_num==player_num1 && guesser_num==player_num2 && guesser_num==player_num3)
   {
     System.out.println("All players guessed correctly. So all are tied."+"\n"+"you have one more chance.Good Luck guys");
	  collect();
	  check();
	}
	//player 1 and player2 tied
   if(guesser_num==player_num1 && guesser_num==player_num2 && guesser_num!=player_num3)
   {
    System.out.println("Player 1 and player2 are tied."+"\n" +"Both of you have one more chance"+"\n");
    guesser_num=g.guesser_num();
    player_num1=p.player_num();
    player_num2=p.player_num();
	 //only player 1 guessed corectly 2nd time
    if(guesser_num==player_num1)
    {
     System.out.println("Player 1 won 2nd time");
	 }
    //only player 2 guessed corectly 2nd time
	 if(guesser_num==player_num2)
    {
     System.out.println("Player 2 won 2nd time");
    }
    //both players again guessed correctly
    if(guesser_num==player_num1 && guesser_num==player_num2)
    {
      System.out.println("both are winners. CONGRATULATIONS");
    }
   //both players again guessed incorrectly
	if(guesser_num!=player_num1 && guesser_num!=player_num2)
   {
     System.out.println("both are guessed incorectly. BETTER LUCK FOR NEXT TIME");
   }
  }
 //player 2 and player 3 tied
   if(guesser_num==player_num2 && guesser_num==player_num3 && guesser_num!=player_num1)
   {
    System.out.println("Player 2 and player3 are tied."+"\n" +"Both of you have one more chance"+"\n");
    guesser_num=g.guesser_num();
    player_num2=p.player_num();
    player_num3=p.player_num();
	 //only player 2 guessed corectly 2nd time
    if(guesser_num==player_num2)
    {
     System.out.println("Player 2 won 2nd time");
	 }
    //only player 3 guessed corectly 2nd time
	 if(guesser_num==player_num3)
    {
     System.out.println("Player 3 won 2nd time");
    }
    //both players again guessed correctly
    if(guesser_num==player_num2 && guesser_num==player_num3)
    {
      System.out.println("both are winners. CONGRATULATIONS");
    }
   //both players again guessed incorrectly
	if(guesser_num!=player_num2 && guesser_num!=player_num3)
   {
     System.out.println("both are guessed incorectly. BETTER LUCK FOR NEXT TIME");
   }
  }
 //player 3 and player 1 tied
   if(guesser_num==player_num3 && guesser_num==player_num1 && guesser_num!=player_num2)
   {
    System.out.println("Player 1 and player3 are tied."+"\n" +"Both of you have one more chance"+"\n");
    guesser_num=g.guesser_num();
    player_num1=p.player_num();
    player_num3=p.player_num();
	 //only player 1 guessed corectly 2nd time
    if(guesser_num==player_num1)
    {
     System.out.println("Player 1 won 2nd time");
	 }
    //only player 3 guessed corectly 2nd time
	 if(guesser_num==player_num3)
    {
     System.out.println("Player 3 won 2nd time");
    }
    //both players again guessed correctly
    if(guesser_num==player_num1 && guesser_num==player_num3)
    {
      System.out.println("both are winners. CONGRATULATIONS");
    }
   //both players again guessed incorrectly
	if(guesser_num!=player_num1 && guesser_num!=player_num3)
   {
     System.out.println("both are guessed incorectly. BETTER LUCK FOR NEXT TIME");
   }

 }
 }


}
