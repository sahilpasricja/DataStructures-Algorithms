import javax.sound.midi.SysexMessage;

public class BinarySearch {

    public static boolean binarySearchRecursive(int[] nums, int target, int left, int right){

        if (left>right){
            return false;
        }
        int mid = (left +right)/2;

        if (nums[mid] == target)
            return true;

        else if (nums[mid]>target) {
            return  binarySearchRecursive(nums,target,left,mid-1);
        }
        else
            return binarySearchRecursive(nums,target,mid+1,right);

    }

    public static boolean binarySearchIterative(int [] nums, int target){
        int left = 0;
        int right = nums.length-1;

        while (left<=right) {

            int mid = (left + right) / 2;

            if (nums[mid] == target)
                return true;

            else if (nums[mid] > target) {
                right =mid - 1;
            } else
                left =  mid + 1;
        }
        return false;
    }



    public static void main(String[] args){
        int[] nums = {1,3,5,7,9,11};
        System.out.println(binarySearchRecursive(nums,13, 0,nums.length-1));
        System.out.println(binarySearchIterative(nums,3));
    }

}
