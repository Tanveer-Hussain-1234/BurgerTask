class Burger{
String TypeOfBeef;
Boolean cheese;
short prize;
 public Burger(String TypeOfBeef, Boolean cheese, short prize){
     this.TypeOfBeef = TypeOfBeef;
     this.cheese = cheese;
     this.prize = prize;
 }
public void makeBurger(){
    System.out.println("This is method of burger.");
      }

}
class ZingerBurger extends Burger{
Boolean fries;
public ZingerBurger(String TypeOfBeef, Boolean cheese, short prize, Boolean fries) {
    super(TypeOfBeef, cheese, prize);
    this.fries = fries;
}
    public void makeBurger(){
        System.out.println("This is a method of zinger burger.");
     }

  }
class BeefBurger extends Burger{
   Boolean pickles;
  public BeefBurger(String TypeOfBeef, Boolean cheese, short prize, Boolean pickles){
      super(TypeOfBeef,cheese,prize);
      this.pickles = pickles;
  }
   public void makeBurger(){
       System.out.println("This is method of Beef Burger.");
      }

}

public class BurgerHomework {
    public static void main(String[] args) {
        short prize = 1000;
    Burger refVar;
    ZingerBurger zingerBurger = new ZingerBurger("Buffalo Meat",true,prize,true);
   refVar = zingerBurger;
   refVar.makeBurger();
    refVar = new BeefBurger("Cow Beef",true,prize,true);
    refVar.makeBurger();


    }
}
