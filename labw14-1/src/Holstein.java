// Test code for the decorator pattern.

public class Holstein {
 public static void main(String[] args) {
  Dessert chocolate = new Chocolate();
  
  System.out.println(chocolate.getDescription());
  System.out.println(chocolate.cost());
  
  // now decorate the chocolate with a cherry
  chocolate = new Cherry(chocolate);
  System.out.println(chocolate.getDescription());
  System.out.println(chocolate.cost());
  
  // now add a second cherry
  chocolate = new Cherry(chocolate);
  System.out.println(chocolate.getDescription());
  System.out.println(chocolate.cost());

  // we can also decorate an ice cream cone with
  // two cherries in a single step
  Dessert strawberry= new Strawberry();
  strawberry = new Cherry(new Cherry(strawberry));
  System.out.println(strawberry.getDescription());
  System.out.println(strawberry.cost());
  
  System.out.println("\nNew Tests:");
  // new tests
  chocolate = new WhippedCream(chocolate);
  System.out.println(chocolate.getDescription());
  System.out.println(chocolate.cost());
  
  strawberry = new HotFudge(new WhippedCream(strawberry));
  System.out.println(strawberry.getDescription());
  System.out.println(strawberry.cost());
  
  Dessert vanilla = new Vanilla();
  vanilla = new HotFudge(new WhippedCream(vanilla));
  System.out.println(vanilla.getDescription());
  System.out.println(vanilla.cost());
  
  Dessert strawberry2 = new Strawberry();
  strawberry2 = new Cherry(new HotFudge(strawberry2));
  System.out.println(strawberry2.getDescription());
  System.out.println(strawberry2.cost());
 }
}
