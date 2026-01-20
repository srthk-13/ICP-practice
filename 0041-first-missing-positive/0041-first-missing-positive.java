// class Solution {
//     public int firstMissingPositive(int[] nums) {
//         int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;
//         for (int i = 0; i < nums.length; i++) {
//             min = Math.min(min, nums[i]);
//             max = Math.max(max, nums[i]);
//         }
//         int sum = ((max * max + 1) / 2) + ((min * min - 1) / 2);
//         for (int i = 0; i < nums.length; i++) {
//             sum -= nums[i];
//         }
//         return sum;
//     }
// }


// class Solution {
//     public int firstMissingPositive(int[] nums) {
//         HashSet<Integer> set=new HashSet<>();
//         for(int i=0;i<nums.length;i++){
//             set.add(nums[i]);
//         }
//         int i=1;
//         while(true){
//             if(set.contains(i)){
//                 i++;
//             }
//             else return i;
//         }
//     }
// }


class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }
}
