public class delivery {
    double servicetype;
    double packageweight;
    double deliverycharge; 
    int total;

    delivery (double servicetype, double packageweight, double deliverycharge, int total){
        this.servicetype = servicetype;
        this.packageweight = packageweight;
        this.deliverycharge = deliverycharge;
        this.total = total;
    }

    public double getServiceType(){
        return servicetype;
    }
    public double getPackageWeight(){
        return packageweight;
    }
    public double getDeliveryCharge(){
        return deliverycharge;
    }
    public int getTotal(){
        return total;
    }

    public void checkPackage(){
        if (servicetype == 1){
            System.out.println("Letter Packages");
            System.out.println("___________________");
            System.out.println("Service Type                Charge");
            System.out.println("Next Day Priority           12.00");
            System.out.println("Next Day Standard           10.50");
            System.out.println();
        }
        else if (packageweight == 2){
            System.out.print("Box Packages");
            System.out.print("___________________");
            System.out.print("Service Type                Change Formola (Fixed base price per 1 unit)");
            System.out.print("Next Day Priority           15.75");
            System.out.print("Next Day Standard           13.75");
            System.out.print("2-day                       7.00");
            System.out.println();
        }
        else if (deliverycharge == 3){
            System.out.print("___________________");
            System.out.print("Service Type                Addtional Cost");
            System.out.print("Next Day Priority           1.25");
            System.out.print("Next Day Standard           1.00");
            System.out.print("2-day                       0.50");
            System.out.println();
        }
        else if (total == 4){
            total = (int) (servicetype + packageweight + deliverycharge);
        }
        
    }



}
