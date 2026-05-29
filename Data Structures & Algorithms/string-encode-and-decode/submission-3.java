class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs) {
            sb.append(str.length() + "#" + str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<String>();
        
        int i = 0;

        while(i < str.length()) {
            int delimiterIndex = str.indexOf("#", i); 

            int start = delimiterIndex + 1;

            int length = Integer.parseInt(str.substring(i, delimiterIndex));

            String currStr = str.substring(start, start + length);

            strs.add(currStr);

            i = start + length;
        }

        return strs;
    }
}
