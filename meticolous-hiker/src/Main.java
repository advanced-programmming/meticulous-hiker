public class Main {
    public static void main(String[] args) {
        //int steps = 8;
        int steps = 10;
        //String path = "UDDDUDUU";
        String path = "DUDDDUUDUU";
        int res = countingValleys(steps, path);
        System.out.printf(String.valueOf(res));

    }

    public static int countingValleys(int steps, String path) {
        if (steps != path.length()) return 0;
        boolean isValley = false;
        int res = 0;
        int sea = 0;

        for (char s: path.toCharArray() ) {
             sea = (s == 'U') ? (sea + 1) : (sea - 1);

            if (sea < 0 && !isValley){
                res++;
                isValley = true;
            } else if (sea >= 0 && isValley){
                isValley = false;
            }
        }
        return res;
    }
}