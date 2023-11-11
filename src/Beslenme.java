import java.util.Scanner;

public class Beslenme {

    Depo depo = new Depo(22,12,44,24);

    public void Beslen(){
        Scanner scanner = new Scanner(System.in);

        String Options = "1. Fruit?\n" +
                "2. Water\n" +
                "3. Bread\n" +
                "4. Vegetables\n" +
                "To Exit : q";
        System.out.println("*******************************");
        System.out.println(Options);
        System.out.println("*******************************");





        while(true){

            if (depo.getFruit() == 0 && depo.getWatter() == 0 && depo.getBread() == 0 && depo.getVegetables() == 0){
                System.out.println("There is nothing left to consume");
                break;
            }
            System.out.println("Tüketeceğiniz besini seçiniz...");
            String besin = scanner.nextLine();

            if(besin.equals("q")){
                System.out.println("Take care with you...");
                break;
            }
            else if(besin.equals("Fruit")){
                System.out.println("How much do you want to consume?");
                int consume = scanner.nextInt();
                scanner.nextLine();
                depo.consumeFruit(consume);

            }
            else if (besin.equals("Water")) {
                System.out.println("How much do you want to consume?");
                int consume = scanner.nextInt();
                scanner.nextLine();
                depo.consumeWater(consume);

            }
            else if (besin.equals("Bread")){
                System.out.println("How much do you want to consume?");
                int consume = scanner.nextInt();
                scanner.nextLine();
                depo.consumeBread(consume);


            }
            else if(besin.equals("Vegetables")){
                System.out.println("How much do you want to consume?");
                int consume = scanner.nextInt();
                scanner.nextLine();
                depo.consumeVegetables(consume);

            }
            else{
                System.out.println("Please select a correct choose");
            }



              }





    }
}
