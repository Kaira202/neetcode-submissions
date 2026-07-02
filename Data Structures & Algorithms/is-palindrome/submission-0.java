class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        if(s.isEmpty()){
            return true;
        }
        int i=0; int j=n-1;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i))!= Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;    
    } 
}

