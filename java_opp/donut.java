public class donut {
    private String donutType;
    private double total;
    private double price;

    public void inputOrder(java.util.Scanner n){
        System.out.print("Enter your Donut type (Glaze, Choco Butternut, Starberry, Bavarian): ");
        donutType = n.next();
        System.out.print("Enter your quantity: ");
        n.nextInt();

    }

    public void total(){
      if (donutType.equals("Glaze")){
        price = 25;
      }
      else if (donutType.equals("Choco Butternut")){
        price = 25;
      }
      else if (donutType.equals("Strawberry")){
        price = 25;
      }
      else if (donutType.equals("Bavarian")){
        price = 25;
      }
      else {
        price = 25;
      }
       total = price; 
    }  
    
    public void displayOrder(){
        System.out.println("Donut Type: " + donutType);
        System.out.println("Total = " + total);

    }
    
   
}
