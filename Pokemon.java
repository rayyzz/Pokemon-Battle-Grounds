
public class Pokemon{

    private String name;
    private int hp;
    private int attack;
    private int defense;
    private int special;
    private int damage;
  
      public void thePoke(String Name, int Hp, int Attack, int Defense, int Special){
          this.name = Name;
          this.hp = Hp;
          this.attack = Attack;
          this.defense = Defense;
          this.special = Special;
      }
    
    public String getName(){
      return this.name;
    }
    
    public int getDefense(){
      return this.defense;
    }
  
    public int getAttack(){
      return this.attack;
    }
  
    public int getHealthPoints(){
      return this.hp;
    }
  
    public int getSpecial(){
      return this.special;
    }
  
  
  }