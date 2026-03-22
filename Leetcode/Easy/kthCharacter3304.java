//https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/description/

public class kthCharacter3304 {
    public static char kthCharacter(int k) {
        if(k == 1) {
            return 'a';
        }

        int powerOfTwo = 1;

        while(powerOfTwo * 2 < k) {
            powerOfTwo *= 2;
        }

        char originalChar = kthCharacter(k - powerOfTwo);

        char shiftedChar = (char) ('a' + (originalChar - 'a' + 1) % 26);

        return shiftedChar;
    }

    public static void main(String[] args) {
        int k = 7;
        char result = kthCharacter(k);
        System.out.println(result);
    }
}
