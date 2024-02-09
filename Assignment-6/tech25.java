import java.util.*;

public class tech25 {

    public static int minOperations(int[] nums) {
        int minIndex = findMinIndex(nums);
        int operations = 0;

        while (true) {
            if (minIndex == 0) {
                nums = removeFirstElement(nums);
                operations++;
            } else {
                nums = moveFirstToEnd(nums);
                operations++;
            }

            if (nums.length == 0) {
                break;
            }

            minIndex = findMinIndex(nums);
        }

        return operations;
    }

    public static int[] removeFirstElement(int[] nums) {
        int[] newArr = new int[nums.length - 1];
        System.arraycopy(nums, 1, newArr, 0, nums.length - 1);
        return newArr;
    }

    public static int[] moveFirstToEnd(int[] nums) {
        int[] newArr = new int[nums.length];
        System.arraycopy(nums, 1, newArr, 0, nums.length - 1);
        newArr[nums.length - 1] = nums[0];
        return newArr;
    }

    public static int findMinIndex(int[] nums) {
        int minIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.print("Enter the elements : ");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Number of operations for nums1: " + minOperations(arr));
        sc.close();
    }
}
