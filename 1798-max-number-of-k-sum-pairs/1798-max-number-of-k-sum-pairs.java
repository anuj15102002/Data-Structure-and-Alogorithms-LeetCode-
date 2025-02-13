class Solution {
    public int maxOperations(int[] nums, int k) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int value : nums) {
            if (value < k) {
                int target = k - value;
                if (map.getOrDefault(target, 0) <= 0) {
                    map.put(value, map.getOrDefault(value, 0) + 1);
                } else {
                    count++;
                    map.put(target, map.getOrDefault(target, 0) - 1);
                }
            }
        }
        return count;
    }
}