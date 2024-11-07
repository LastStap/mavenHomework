package dumshenko.daniil.maven;

class MySolution {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {

            return "";
        }

        int minLength = Integer.MAX_VALUE;

        for (String str : strs) {

            minLength = Math.min(minLength, str.length());
        }

        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < minLength; i++) {

            char currentChar = strs[0].charAt(i);

            for (String str : strs) {

                if (str.charAt(i) != currentChar) {

                    return prefix.toString();
                }
            }

            prefix.append(currentChar);
        }

        return prefix.toString();
    }
}
