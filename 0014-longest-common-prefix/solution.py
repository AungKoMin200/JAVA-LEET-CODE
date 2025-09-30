

class Solution(object):
     def longestCommonPrefix(self, strs):
        if not strs:
            return ""

        # Sort the list alphabetically
        strs.sort()

        first_str = strs[0]
        last_str = strs[-1]
        
        common_prefix = ""
        # Find the common prefix between the first and last string
        for i in range(len(first_str)):
            if i < len(last_str) and first_str[i] ==last_str[i]:
                common_prefix += first_str[i]
            else:
                # Stop as soon as a mismatch is found
                break
        
        return common_prefix


