class Solution {

    public String encode(List<String> strs) {
        StringBuffer sb = new StringBuffer();

        for(String str : strs) {
            sb.append(str.length() + "#" + str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();

        int i = 0;

        while(i < str.length()) {
            int delimiterIndex = str.indexOf("#", i);

            int start = delimiterIndex + 1;

            // 
            int length = Integer.parseInt(str.substring(i, delimiterIndex));

            String currString = str.substring(start, start + length);

            strs.add(currString);

            i = start + length;
        }

        return strs;
    }
}
