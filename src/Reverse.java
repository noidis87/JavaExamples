public class Reverse {
    public static void main(String[] args) {
       String inputString = "Noidis";
        String outSt = "";
        for (int i = inputString.length() -1 ; i >=0 ; i--) {
            outSt = outSt + inputString.charAt(i);
        }

        System.out.println(outSt);
    }
}
