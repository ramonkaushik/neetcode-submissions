class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        
        for(String str : strs) {
            sb.append(str.length() + "#" + str);
        }

        return sb.toString();

    }

    public List<String> decode(String str) {
        // declare output list
        List<String> strs = new ArrayList<String>();

        // declare index
        int i = 0;

        // iterate over length of string
        while(i < str.length()) { 
            // find # delimiter
            int indexOfDelimiter = str.indexOf('#', i);
            
            // extract the length of the word
            int length = Integer.parseInt(str.substring(i, indexOfDelimiter));

            // declare start of word in relation to delimiter
            int start = indexOfDelimiter + 1;

            // get the substrings using start and length
            String decodedWord = str.substring(start, start + length);

            // add word to output
            strs.add(decodedWord);

            // adjust index to next string with start and length
            i = start + length;
        }

        return strs;
        
    }
}
