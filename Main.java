/*
* @author Raiyan Islam
*/

import java.util.*;

class Main {
  public static void main(String[] args) {
    

    Scanner input = new Scanner(System.in);

    String[] a = {"CaterPie", "Weedle", "Spearow"};
    String[] b = {"Raichu", "Pikachu", "Rattata"};


    ArrayList<String> player1pokes = new ArrayList<String>();
    ArrayList<String> player2pokes = new ArrayList<String>();


    for (String x : a){
      player1pokes.add(x);
    }

    for (String y : b){
      player2pokes.add(y);
    }


    System.out.println("Pokemon Unkown's Battle Grounds");
    System.out.println("---------------------");
    System.out.println("");

    ArrayList<String> pokes1 = new ArrayList<String>();
    ArrayList<String> pokes2 = new ArrayList<String>();

    for (int i=0; i<3; i++){
      System.out.println("\nPlayer 1, choose your character to battle : ");
      System.out.println("0. "+ player1pokes.get(0));
      System.out.println("1. "+ player1pokes.get(1));
      System.out.println("2. "+ player1pokes.get(2));
      for (int j = 1 ; j < 2; j++){
        int userchoice = input.nextInt();
        if ( userchoice < 3){
          System.out.println("Your player: " + player1pokes.get(userchoice));
          pokes1.add(player1pokes.get(userchoice));
        } else{
          System.out.println("Try again");
          j--; 
        }       
      }

      System.out.println("\nPlayer 2, choose your character to battle: ");
      System.out.println("0. "+ player2pokes.get(0));
      System.out.println("1. "+ player2pokes.get(1));
      System.out.println("2. "+ player2pokes.get(2));
      for (int j = 1 ; j < 2; j++){
        int userchoice = input.nextInt();
        if ( userchoice < 3){
          System.out.println("Your player: " + player2pokes.get(userchoice));
          pokes2.add(player2pokes.get(userchoice));
        } else{
          System.out.println("Try again");
          j--; 
        }       
      }

      System.out.println("\nBattle Begins!");
      Player P = new Player();

      P.Fight(pokes1.get(i), pokes2.get(i));
     
    }
  }

}