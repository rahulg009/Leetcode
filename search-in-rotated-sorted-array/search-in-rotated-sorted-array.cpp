class Solution {
	public:
	int search(vector<int>& arr, int target) {
    
		int l=0, m,h;
		h = arr.size()-1;
    
		while(l<=h)
		{
			m = (l+h)/2;

			if(arr[m] == target)
			{
				return m;
			}

			else if(arr[l] <= arr[m])
			{
				if(arr[l] <= target && arr[m] >= target )
				{
					h = m-1;
				}
				else
				{
					l = m+1;
				}
			}

			else
			{
				if(arr[m] <= target && arr[h] >= target)
				{
						l= m+1;
				}
				else
				{
						h = m-1;
				}
			}
		}
		return -1;

	}
};