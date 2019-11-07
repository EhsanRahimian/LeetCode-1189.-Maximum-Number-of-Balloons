/**
 * Given a string text, you want to use the characters of text 
 * to form as many instances of the word "balloon" as possible.
 * You can use each character in text at most once. 
 * Return the maximum number of instances that can be formed.
 */
public class Solution {

   public static int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        
        for(char ch : text.toCharArray()){
            switch(ch){
                case 'b': ++b;
                        break;
                case 'a': ++a;
                        break;
                case 'l': ++l;
                        break;
                case 'o': ++o;
                        break;
                case 'n': ++n;
                        break;
            
            }
        }
        
        return Math.min(Math.min(o/2, l/2), Math.min(Math.min(b, a), n));
    }
    public static void main(String[] args) {
        String s1 = "loonbalxballpoon";
        String s2 = "leetcode";
        String s3 = "abtloclons";
        int res1 = maxNumberOfBalloons(s1);
        int res2 = maxNumberOfBalloons(s2);
        int res3 = maxNumberOfBalloons(s3);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(s3.toCharArray());
        
    }
    
}
