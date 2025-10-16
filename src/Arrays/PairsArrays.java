package Arrays;

public class PairsArrays {
    public static void ArPair(int[] numb){
        for(int i = 0; i<numb.length; i++){
            int curr = numb[i];
            for(int j = i+1; j<numb.length; j++){
                System.out.print("(" + curr + "," + numb[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[] numb = {2,4,6,8,10,12};
        ArPair(numb);
    }


}
