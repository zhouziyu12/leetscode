
public class Bubble {
    public static void main(String[] args) {
        int[] nums={1,56,88,5,43};
        dupple(nums);
        print(nums);
    }


    public static void  dupple(int[] nums){
        int temp = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {

                if (nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }

            }
        }

    }    static void print(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}





