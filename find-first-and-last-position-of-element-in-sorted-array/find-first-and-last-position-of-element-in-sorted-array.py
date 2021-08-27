class Solution:
	def searchRange(self, lst: List[int], t: int) -> List[int]:
		left = 0
		right = len(lst) - 1
		temp = -1

		while left <= right:

			mid = left + (right - left) // 2

			if lst[mid] == t:
				temp = mid
				right = mid - 1

			elif lst[mid] > t:
				right = mid - 1

			else:
				left = mid + 1


		temp1 = -1
		left, right = 0, len(lst) - 1

		while left <= right:

			mid = left + (right - left) // 2

			if lst[mid] == t:
				temp1 = mid
				left = mid + 1

			elif lst[mid] > t:
				right = mid - 1
			else:
				left = mid + 1

		return [temp, temp1]