package arrays;

public class LinearrSearch {
    public static int LinearSearch(int[] numbers, int key){

        for(int i = 0; i<numbers.length; i++) {
            if (numbers[i] == key){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
            int[] numbers = {32,54,65,76,34,74,26,23,53};
            int key = 74;

            int index = LinearSearch(numbers, key);
            if (index == -1){
                System.out.println(key + " not found");
            } else {
                System.out.println(key + " key is at index : " + index);
            }
    }
}
