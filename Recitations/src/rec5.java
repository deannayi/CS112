public class rec5{
    public int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int mid = (high + low) / 2;
        while (low < high){
            if (arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < target){
                low = mid;
                mid = (high + low) / 2;
            }
            else{
                high = mid;
                mid = (high + low) / 2;
            }
        }
        return mid;
    }
}