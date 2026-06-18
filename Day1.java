public class Day1 {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs ";
        String merge = "";
        int length = word1.length() <= word2.length() ? word1.length() : word2.length();

        for (int i = 0; i < length; i++) {
            System.out.println();
            char w1 = word1.charAt(i);
            char w2 = word2.charAt(i);

            merge = merge + "" + w1;

            merge = merge + "" + w2;

        }
        if(word1.length()>word2.length()){
        merge=merge+word1.substring(length);
        }else{
            merge = merge +word2.substring(length);
        }
        System.out.println(merge);

    }

}
