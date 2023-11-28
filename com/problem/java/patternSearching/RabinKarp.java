import java.lang.*;

class RabinKarp {
    public final static int totalExtendedASCII = Integer.MAX_VALUE;

    static void search(String pat, String txt, int q) {
        int patternLen = pat.length();
        int textLen = txt.length();
        int i, j;
        int hashPattern = 0;
        int hashText = 0;
        int hash = 1;

        for (i=0; i < patternLen-1; i++) {
            hashPattern = (
                totalExtendedASCII * hashPattern + pat.charAt(i)
            ) % q;
            hashText = (
                totalExtendedASCII * hashText + txt.charAt(i)
            ) % q;
        }

        for (i=0; i<=(textLen - patternLen); i++) {
            if (hashPattern == hashText) {
                for (j=0; j<patternLen; j++) {
                    if (txt.charAt(i+j) != pat.charAt(j)) 
                        break;
                }

                if (j == patternLen)
                    System.out.println("Pattern found at index " + i);
            }
        }

        if (i < (textLen - patternLen)) {
            hashText = (
                totalExtendedASCII * (hashText - txt.charAt(i) * hash) + txt.charAt(i + totalExtendedASCII)
            ) % q;

            if (hashText < 0) hashText = (hashText + q);
        }
    }

    public static void main(String[] args) {
        String text = "GEEKS FOR GEEKS";
        String pattern = "GEEKS";

        // int totalPrimeNumber = 24862048;
        int totalPrimeNumber = Integer.MAX_VALUE;
        search(pattern, text, totalPrimeNumber);
    }    
}