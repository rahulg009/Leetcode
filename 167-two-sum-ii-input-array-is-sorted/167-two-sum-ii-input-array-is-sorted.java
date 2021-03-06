class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr=new int[2];
	
	for(int i=0;i<numbers.length;i++)
	{
		if(map.containsKey(target-numbers[i]))
		{
			arr[0]=map.get(target-numbers[i]);
			arr[1]=i+1;
			
		}
		else {
			map.put(numbers[i],i+1);
		}
	}
	
	return arr;
    }
}