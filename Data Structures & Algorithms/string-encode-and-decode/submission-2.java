class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        
        for(String str : strs) {
            sb.append(str.length() + "#" + str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();

        int i = 0;

        while(i < str.length()) {
            int indexOfDelimiter = str.indexOf('#', i);

            int length = Integer.parseInt(str.substring(i, indexOfDelimiter));

            int start = indexOfDelimiter + 1;

            String toOutput = str.substring(start, start + length);

            output.add(toOutput);

            i = start + length;
        }

        return output;
    }
}
