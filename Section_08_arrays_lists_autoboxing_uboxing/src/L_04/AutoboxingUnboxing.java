package L_04;

import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class AutoboxingUnboxing {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Tim");

        //ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = new Integer(54);
        Double doubleValue = new Double(43d);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0; i<=10; i++){
            intArrayList.add(Integer.valueOf(i));
        }

        for(int i=0; i<intArrayList.size(); i++){
            System.out.println(i + " -> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56;  // JVM will do - Integer.valueOf(56);
        int myInt = myIntValue;   // JVM will do - myInt.intValue();

        ArrayList<Double> myDoubleValue = new ArrayList<>();
        for(double dbl = 0.0; dbl <= 10.0; dbl+=0.5){
            myDoubleValue.add(Double.valueOf(dbl));
        }

        for(int i = 0; i < myDoubleValue.size(); i++){
            double value = myDoubleValue.get(i).doubleValue();
            System.out.println(i + " -> " + value);
        }

    }
}
