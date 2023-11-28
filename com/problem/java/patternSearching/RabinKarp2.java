
class RabinKarp2 {
    private final static int totalExtendedASCII = Integer.MAX_VALUE;
    private final static int totalPrimeNumber = Integer.MAX_VALUE;

    static void search(String pat, String txt) {
        int patternLen = pat.length();
        int textLen = txt.length();
        int i, j;
        int hashPattern = 0;
        int hashText = 0;
        int hash = 1;

        // hash pattern and text
        for (i=0; i<patternLen-1; i++) {
            hashPattern = (
                totalExtendedASCII * hashPattern + pat.charAt(i)
            ) % totalPrimeNumber

            hashText = (
                totalExtendedASCII * hashPattern + txt.charAt(i)
            ) % totalPrimeNumber
        }

        // 10 - 2 = 8
        for (i=0; i<=(textLen - patternLen); i++) {
            if (hashPattern == hashText) {
                for (j=0; j<patternLen; j++) {
                    if (txt.charAt(i+j) != pat.charAt(j)) 
                        break;
                }

                if (j == paternLen)
                    System.out.println("Pattern found at index " + i);
            }
        }
    }

    public static void main(String[] args) {

    }
}