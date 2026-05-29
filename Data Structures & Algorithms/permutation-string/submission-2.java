class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) {
            return false;
        }
        
        int[] s1Seen = new int[26];
        int[] s2Seen = new int[26];

        for(int i = 0; i < s1.length(); i++) {
            s1Seen[s1.charAt(i) - 'a']++;
            s2Seen[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(s1Seen, s2Seen)) {
            return true;
        }

        int left = 0;
        
        for(int right = s1.length(); right < s2.length(); right++) {
            s2Seen[s2.charAt(right) - 'a']++;
            s2Seen[s2.charAt(left) - 'a']--;
            left++;
            
            if(Arrays.equals(s1Seen, s2Seen)) {
                return true;
            }
        }

        return false;
    }
}
