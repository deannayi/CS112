
public class rec1{    
    public static void main(String[] args){
        // runningSum()
    }


    public static void runningSum(String[] args) {
        int[] array = {1,2,3,4};
        int count = 0;

        // int[] newArray = new int[array.length];
        // for (int i = 0; i < array.length; i++){
        //     count += array[i];
        //     newArray[i] = count;

        // }
        // for (int i = 0; i < newArray.length; i++){
        //     System.out.println(newArray[i]);
        // }


        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + count + " ");
            count += array[i];
        }
    }

    public static void mergeSorted(int[] nums1, int[] nums2){
        int[] newArray = new int[nums1.length];
        int a = 0;
        int b = 0;
        if (nums1[a] < nums2[b]){
            
        }

        for (int i = 0; i < nums1.length - nums2.length; i++){
            if (nums2[b] > nums1[a]){
                
            }
        }

    }
}
