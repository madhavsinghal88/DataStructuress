package arrays;

public class LinearString {
    public static int linearSearch(String[] menu,String key){
        for (int i=0; i<menu.length; i++){
            if (menu[i].equals(key)){
                return i;
            }

        }
        return -1;

    }

    public static void main(String[] args){
        String[] menu = {"fries", "burger", "rolls", "maggi"};
        String key = "rolls";

        int index = linearSearch(menu,key);
        if (index == -1){
            System.out.println("Invalid Input");
        } else {
            System.out.println("index " + index);
        }






        }
    }

