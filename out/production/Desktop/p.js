const palindrome = (nums) => {
  let right = nums.length - 1;
  const half = Math.floor(nums.length / 2);
  for (let left = 0; left <= half; left++) {
    right -= left;
    let swap = nums[left];
    nums[left] = nums[right];
    nums[right] = swap;
  }
  return nums;
};

const res = palindrome([1, 2, 3, 4, 5]);
console.log(res);
