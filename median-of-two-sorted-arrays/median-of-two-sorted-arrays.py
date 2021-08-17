class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        len1, len2 = len(nums1), len(nums2)
        len_total = len1 + len2
        middle = len_total // 2
        add_next = not bool(len_total % 2)
        i = j = 0
        while i + j < middle:
            if i < len1:
                if j < len2:
                    if nums1[i] <= nums2[j]:
                        i += 1
                    else:
                        j += 1
                else:
                    i += 1
            else:
                j += 1

        if add_next:
            if i < len1:
                if j < len2:
                    if i == 0:
                        if nums1[i] <= nums2[j]:
                            return (nums1[i] + nums2[j - 1]) / 2
                        return (nums2[j] + nums2[j - 1]) / 2
                    elif j == 0:
                        if nums2[j] <= nums1[i]:
                            return (nums1[i - 1] + nums2[j]) / 2
                        return (nums1[i] + nums1[i - 1]) / 2
                    return (min(nums1[i], nums2[j]) +
                            max(nums1[i - 1], nums2[j - 1])) / 2
                elif j == middle:
                    return (nums1[i] + nums2[j - 1]) / 2
                else:
                    if len2 == 0:
                        return (nums1[i] + nums1[i - 1]) / 2
                    return (nums1[i] + max(nums1[i - 1], nums2[j - 1])) / 2
            elif i == middle:
                return (nums1[i - 1] + nums2[j]) / 2
            else:
                if len1 == 0:
                    return (nums2[j] + nums2[j - 1]) / 2
                return (nums2[j] + max(nums2[j - 1], nums1[i - 1])) / 2
        else:
            if i < len1:
                if j < len2:
                    if nums1[i] <= nums2[j]:
                        return nums1[i]
                    else:
                        return nums2[j]
                else:
                    return nums1[i]
            else:
                return nums2[j]
        