class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=1;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //         if(nums[j-i]+nums[j] == target){
        //             return new int[]{j-i,j};
        //         }
        //     }
        // }
        // return nums;

        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n=target-nums[i];
            if(hs.containsKey(n)){
                return new int[]{hs.get(n),i};
            }
            hs.put(nums[i],i);
        }
        return new int[]{};
    }
}