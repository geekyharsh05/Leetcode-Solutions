function numIdenticalPairs(nums: number[]): number {
  let ans = 0;
  const count = new Array(101).fill(0);

  for (const num of nums) {
    ans += count[num]++;
  }

  return ans;
}
