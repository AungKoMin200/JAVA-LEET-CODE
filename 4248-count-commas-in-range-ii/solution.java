class Solution {
    public long countCommas(long n) {
        long totalCommas = 0;
       
        if (n >= 1000L) {
            totalCommas += n - 999L;
        }
        
        if (n >= 1000000L) {
            totalCommas += n - 999999L;
        }
        
        if (n >= 1000000000L) {
            totalCommas += n - 999999999L;
        }
        
        if (n >= 1000000000000L) {
            totalCommas += n - 999999999999L;
        }
        
        if (n >= 1000000000000000L) {
            totalCommas += n - 999999999999999L;
        }
        
        return totalCommas;
    }

    }

