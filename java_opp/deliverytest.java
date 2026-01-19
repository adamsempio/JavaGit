public class deliverytest {
    public static void main(String[] args){
        delivery delivery1 = new delivery(1, 2, 1, 4);

        System.out.println("service type: " + delivery1.getServiceType());
        System.out.println("package weight: " + delivery1.getPackageWeight());
        System.out.println("delivery charge: " + delivery1.getDeliveryCharge());
        System.out.println("total: " + delivery1.getTotal());
        
      }  

}
