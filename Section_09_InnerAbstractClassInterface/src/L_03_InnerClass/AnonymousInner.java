package L_03_InnerClass;

class HelloWorld { // superclass
    void displayMessage() {
        System.out.println("Hello World");
    }
}


//class Tester {
//    public static void main(String args[]){
//        HelloWorld hw = new HelloWorld() {
//            void displayMessage() {
//                System.out.println("Hello Earth");
//            }
//        };
//        hw.displayMessage();
//    }
//}
//
//class Tester2 {
//    public static void main(String args[]){
//        HelloWorld hw = new HelloWorld() {
//            @Override
//            void displayMessage() {
//                System.out.println("Hello Earth");
//            }
//            void displayError() {
//                System.out.println("Don\'t create new methods in an anonymous inner class.");
//            }
//        };
//        hw.displayMessage();
//        //hw.displayError();
//    }
//}

class Tester3 {
    public static void main(String args[]){
        reallyStrange(new HelloWorld());  // -> Prints "Hello World" -> use original method
        reallyStrange(new HelloWorld(){   // -> Prints "Really strange stuff!" -> use overridden method
            @Override
            void displayMessage(){
                System.out.println("Really strange stuff!");
            }
        });
    }

    static void reallyStrange(HelloWorld hw){
        hw.displayMessage();
    }
}

//public class AnonymousInner {
//
//}
