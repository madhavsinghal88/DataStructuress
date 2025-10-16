package Arrays;

public class ReverseArray {
    public static void reverseArray(int[] order){
        int first = 0;
        int last = order.length-1;

        while (first < last ) {

            int temp = order[last];
            order[last] = order[first];
            order[first] = temp;
            first++;
            last--;
        }

    }
    public static void main(String[] args){
        int[] order = {25,50,27,53,47};

        reverseArray(order);
        for(int i=0;i<order.length;i++){
            System.out.print(order[i]+" ");
        }
        System.out.println();



    }
}
