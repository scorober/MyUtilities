public class StringManipulator {

    public static void main(String[] args) {
        System.out.println(sentenceReverse("Hey how you doin?"));

    }

    public static String sentenceReverse(final String theString) {

        StringBuilder sb = new StringBuilder(128);
        String[] words = theString.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) sb.append(" ");
        }

        return sb.toString();
    }

    public int triplets(final int[] arr) {
        int count = 0;
        int length = arr.length -1;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++ ) {
                    if (i < j && j % i == 0) {
                        if (j < k && k % j == 0) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
