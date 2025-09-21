public class PigLatin {
    public static String pigIt(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) { // só mexe se for palavra
                result.append(word.substring(1))  // do segundo char até o fim
                      .append(word.charAt(0))    // adiciona a primeira letra no fim
                      .append("ay");
            } else {
                result.append(word); // mantém pontuação
            }
            result.append(" "); // adiciona espaço entre as palavras
        }

        return result.toString().trim();
    }
}
