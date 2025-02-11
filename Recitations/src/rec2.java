public class rec2 {
    public static void main(String[] args) {
        char[] s = {'g','o','o','d','b','y','e'};
        reverseString(s);
        reverseString2(s);
        System.out.print(s);

        int[] numbers = {1, 2, 3, 4};
        int target = 5;
        System.out.print(twoSum(numbers,target));
    }
    
    public static void reverseString(char[] s){
        char[] sReverse = new char[s.length];
        for (int i = 0; i < s.length; i++){
            char temp = s[i];
            sReverse[s.length - i - 1] = temp;
        }
        for (int j = 0; j < sReverse.length; j++){
            System.out.print(sReverse[j]);
        }
    }

    public static void reverseString2(char[] s){
        for (int i = 0; i < s.length / 2; i++){
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }

    public static int[] twoSum(int[] numbers, int target){
        int[] sol = new int[2];
        int i = numbers.length - 1;
        while (i >= 0){
            if (target < numbers[i] + numbers[i - 1]){
                i--;
            }
            else if (target == numbers[i] + numbers[i-1]){
                sol[0] = i;
                sol[1] = i-1;
            }
        }
        return sol;
    }
}
