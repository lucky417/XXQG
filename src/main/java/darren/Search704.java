package darren;

public class Search704 {
    public static void main(String[] args) {
        Search704 s = new Search704();
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        System.out.println(s.search(nums, 5));
    }

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            }
        }
        return -1;
    }
}
