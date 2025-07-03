class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;

for (int j = 0; j < nums.length; j++) {
    int num = nums[j];
    if (i < 2 || num > nums[i - 2])
        nums[i++] = num;
}

return i;
    }
}