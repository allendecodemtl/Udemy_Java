package L_03;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);

    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");

        for (int i=0; i<groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position > 0){
            groceryList.set(position,newItem);
            System.out.println("Grocery item " + (position+1) + " has been modified");
        }
    }

    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified");
    }

    public void removeGroveryItem(String newItem){
        int position = findItem(newItem);
        if(position > 0){
            groceryList.remove(position);
        }
    }

    private void removeGroveryItem(int position){
        groceryList.remove(position);
    }

    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public boolean onFiles(String searchItem){
        int position = findItem(searchItem);
        if (position >= 0){
            return true;
        }

        return false;
    }
}
