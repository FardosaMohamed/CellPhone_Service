public class CellPhoneApplication {
    public static void main(String[] args) {
     CellPhone c1 = new CellPhone();
     c1.serialNumber = 123456;
     c1.model = "Toyota";
     c1.phoneNumber = "1209867890";
     c1.carrier = "T-Mobile";
     c1.owner = "Fardosa Mohamed";
        System.out.println( "What is the serial number? " + c1.serialNumber);
        System.out.println( "What model is the phone? " + c1.model);
        System.out.println("What is the carrier? " + c1.carrier);
        System.out.println( "What is the phone number? " + c1.phoneNumber);
        System.out.println( "Who is the owner of the phone? " + c1.owner);
    }
}