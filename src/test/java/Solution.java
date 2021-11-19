/**
 * @author shaoYF
 * @title: Solution
 * @projectName ssmbuild
 * @description: TODO
 * @date 2021/11/18 13:59
 */
public class Solution {
    public static int removeDuplicates(int[] nums) {
        int arr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[arr] != nums[i]) {
                nums[arr + 1] = nums[i];
                arr++;
            }
        }
        return arr+1;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2};
        System.out.println(removeDuplicates(a));
    }
}
