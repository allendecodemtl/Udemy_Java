package L_03_InnerClass;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPRint = new Button("Print");

    public static void main(String[] args) {

//        class ClickListener implements Button.OnClickListener{
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//        btnPRint.setOnClickListener(new ClickListener());

        btnPRint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });

        listen();



//        Gearbox mcLaren = new Gearbox(6);
        //Gearbox.Gear second = new Gearbox.Gear(1,12.3);  // -> Compile Error
        //Gearbox.Gear third = new mcLaren.Gear(1,12.3);     // -> Compile Error

        // -> accessible if class is public but usually set to private
        //Gearbox.Gear first = mcLaren.new Gear(1,12.3); // -> Property syntax to create inner class obj when public
        //System.out.println(first.driveSpeed(1000));

//        mcLaren.addGear(1,5.3);
//        mcLaren.addGear(2,10.6);
//        mcLaren.addGear(3,15.9);
//
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));


    }

    private static void listen(){
        boolean quit = false;
        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPRint.onClick();
            }
        }
    }
}
