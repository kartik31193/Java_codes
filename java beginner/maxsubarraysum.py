class Solution:
    # @param A : tuple of integers
    # @return an integer
    def maxSubArray(self, A):
        sum=0
        m=A[0]
        for i in A:
            sum+=i
            m=max(sum,m)
            if sum<0:
                sum=0
        return m
                    
