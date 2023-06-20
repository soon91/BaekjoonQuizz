class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
                
        int maxCnt = 0;
        int minCnt = 0;

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) maxCnt++;
            for (int j = 0; j < lottos.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    minCnt++;
                    maxCnt++;
                }

            }
        }

        int maxRank = 7-maxCnt;
        int minRank = 7-minCnt;
        if(minCnt == 0 && maxCnt == 0)  return new int[]{maxRank-1, minRank-1};
        if(minCnt == 0)  return new int[]{maxRank, minRank-1};
        return new int[]{maxRank, minRank};
    }
}