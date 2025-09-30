class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        # We'll loop as long as we can keep simplifying the string.
        # We store the length before making replacements.
        previous_length = -1
        
        while previous_length != len(s):
            previous_length = len(s)
            # Replace all occurrences of valid pairs with an empty string.
            s = s.replace("()", "")
            s = s.replace("[]", "")
            s = s.replace("{}", "")
            
        # If the string is empty after all possible replacements, it was valid.
        return len(s) == 0
