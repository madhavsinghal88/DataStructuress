public class binarySearch {

    public static int binaryS(int[] binnum,int target){
        int start = 0;
        int end = binnum.length-1;

        while( start<=end){

            int mid = (start+end)/2;
                    if (binnum[mid]==target){
                        return mid;
        }
                    if(binnum[mid]<target){
                        start=mid+1;

                    } else {
                        end = mid -1 ;
                    }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] binnum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int target = 3;

        System.out.println("index for key is :" + binaryS(binnum,target));
    }
}
