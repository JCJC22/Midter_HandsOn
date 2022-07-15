import java.util.*;

public class app{
    private static void Retry() {
        System.out.println(" ");
        System.out.println("You want to convert more ?.....");
        System.out.println("Press [1] to try again");
        System.out.println("Press [0] to exit"); 
    }
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        double amo;
        int repeater=1;
        try {
            while (repeater==1) {
                System.out.println(" ::Currency Converter:: ");
    
                System.out.println("[1]:Convert your Peso to Dollar");
                System.out.println("[2]:Convert your Dollar to Peso");
                System.out.println("[3]:Convert your Euro to Peso");
                System.out.println("[4]:Convert your Peso to Euro");

                System.out.print("Please Select: ");
                int Currency = in.nextInt();
    
                switch(Currency){
                    
                    case 1 : System.out.print("Enter amount : ");
                                amo = in.nextDouble();
                            transfer pe1 = new transfer(amo);
                            pe1.PesotoDo();
                    break;
    
                    case 2 :
                            System.out.print("Enter amount : ");
                                amo = in.nextDouble();
                            transfer do1 = new transfer(amo);
                            do1.DollartoPe();
                    break;
    
                    case 3 :
                            System.out.print("Enter amount : ");
                                amo = in.nextDouble();
                            transfer eu1 = new transfer(amo);
                            eu1.EurotoPe();
                    break;
    
                    case 4:
                            System.out.print("Enter amount : ");
                                amo = in.nextDouble();
                            transfer pe2 = new transfer(amo);
                            pe2.PesotoEu();
                    break;

                    default:
                    System.out.println("invalid Input.");
                }
                Retry();
                repeater =in.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }  
    }
}