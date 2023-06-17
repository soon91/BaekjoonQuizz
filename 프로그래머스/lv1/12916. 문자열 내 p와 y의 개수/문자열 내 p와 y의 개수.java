class Solution {
    boolean solution(String s) {
        // "pPoooyY"  = true
        // "Pyy"       = false

        // 개수를 확인하기 위한 준비
        int pCount = 0;
        int yCount = 0;

        // 실제로 y, p 갯수 세기
        for (int i = 0; i < s.length(); i++) {
            char input = s.charAt(i);
            if(input == 'p' || input ==  'P'){
                pCount++;
            } else if(input == 'y' || input == 'Y'){
                yCount++;
            }
        }
        if (pCount == yCount) {
            return true;
        } else {
            return false;
        }

    }
}