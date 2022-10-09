import java.util.*;

public class Player{


  private Pokemon One = new Pokemon();

  private Pokemon Two = new Pokemon();

  Scanner input = new Scanner(System.in);

  public void Fight(String x, String y){
    
    if  (x == "CaterPie"){
      One.thePoke("CaterPie", 45, 30, 35, 20);
    } else if  (x == "Weedle"){
      One.thePoke("Weedle", 45, 35, 30, 20);
    } else if  (x == "Spearow"){
      One.thePoke("Spearow", 40, 60, 30 , 31);
    } else{
      System.out.println("Wrong");
    }

    if (y == "Raichu"){
      Two.thePoke("Raichu", 60, 60 ,55, 90);
    } else if (y == "Pikachu"){
      Two.thePoke("Pikachu", 35, 55, 30, 50);
    } else if (y == "Rattata"){
      Two.thePoke("Rattata", 20, 56, 35, 25);
    } else {
      System.out.println("Wrong");
    }
    System.out.println(One.getName() + " VS " + Two.getName());

    int round = 0;


    int player1hp = One.getHealthPoints();
    int player2hp = Two.getHealthPoints();

    while (player1hp >= 0 || player2hp >= 0){

      if (player1hp <= 0 && player2hp <= 0){
        System.out.println("No winner");
        break;
      }
      else if (player1hp <= 0 ){
        System.out.println("The winner of the battle is " + Two.getName());
        break;

      } else if (player2hp <= 0 ){
        System.out.println("The winner of the battle is " + One.getName());
        break;

      } 
      else {
        round += 1;
        System.out.println("Round " + round);
        System.out.println("Player 1 enter an option!");

        System.out.println("\nPress 1 to attack your enemy");
        System.out.println("Press 2 to use special ability against your enemy");
        int player1BattleChoice = input.nextInt();

        if (player1BattleChoice == 1){
          int damageattack = (One.getAttack() - Two.getDefense());
          if (damageattack > 0){
            player2hp -= damageattack;
          } else{
            System.out.println("No damage done");
          }
        }else if (player1BattleChoice == 2){
          int damageSpecial1 = (One.getAttack() - Two.getDefense());
          if (damageSpecial1 > 0){
            player2hp -= damageSpecial1;
          } else{
            System.out.println("No damage done");
          }
        }else {
          System.out.println("Error");
        }
        
        System.out.println("\nPress 1 to attack your enemy");
        System.out.println("Press 2 to use special ability against your enemy");
        int player2BattleChoice = input.nextInt();

        if (player2BattleChoice == 1){
          int damageattack = (Two.getAttack() - One.getDefense());
          if (damageattack > 0){
            player1hp -= damageattack;
          } else{
            System.out.println("No damage done");
          }
        }else if (player2BattleChoice == 2){
          int damageSpecial1 = (Two.getAttack() - One.getDefense());
          if (damageSpecial1 > 0){
            player1hp -= damageSpecial1;
          } else{
            System.out.println("No damage done");
          }
        }else {
          System.out.println("Error");
        }

      if (player1hp < 0 && player2hp < 0){
        player1hp = 0;
        player2hp = 0;
      } else if (player1hp < 0){
        player1hp = 0;
      } else if (player2hp < 0){
        player2hp = 0;
      }

      System.out.println("");
      System.out.println(One.getName() + "  " + player1hp + "/" + One.getHealthPoints() + "HP");
      System.out.println(Two.getName() + "  " + player2hp + "/" + Two.getHealthPoints() + "HP");
      }
    }
  }


}
