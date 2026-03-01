package arrays;

public class PairsArrays {
    public static void ArPair(int[] numb){
        int totalAr = 0;
        for(int i = 0; i<numb.length; i++){
            int curr = numb[i];
            for(int j = i+1; j<numb.length; j++){
                System.out.print("(" + curr + "," + numb[j] + ")");
                totalAr++;
            }
            System.out.println();
        }
        System.out.println("Total Pair Value : "+totalAr);
    }
    public static void main(String[] args){
        int[] numb = {2,4,6,8,10,12};
        ArPair(numb);
    }


}
// TOTAL NUMBER OF PAIRS = n(n-1)/2 or sum of n-1
