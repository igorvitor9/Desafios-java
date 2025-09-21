



public class Troll {

    /**
     * Este método remove todas as vogais (maiúsculas e minúsculas) de uma String.
     * @param Z A string de entrada.
     * @return A string sem nenhuma vogal.
     */
    public static String disemvowel(String Z) {
        return Z.replaceAll("(?i)[aeiou]", "");
    }

    /**
     * O método main é o ponto de entrada do programa.
     * Usamos ele para testar nosso método disemvowel.
     */
    public static void main(String[] args) {
        // 1. Define uma frase de exemplo para testar
        String fraseOriginal = "Este site é para perdedores LOL!";

        // 2. Chama o método disemvowel para remover as vogais da frase
        String fraseModificada = Troll.disemvowel(fraseOriginal);

        // 3. Mostra o resultado no console para comparar!
        System.out.println("Frase Original....: " + fraseOriginal);
        System.out.println("Frase sem vogais..: " + fraseModificada);

        System.out.println("--- Outro Exemplo ---");

        String outroExemplo = "QUE DIA LINDO PARA PROGRAMAR EM JAVA!";
        String resultadoExemplo = Troll.disemvowel(outroExemplo);

        System.out.println("Frase Original....: " + outroExemplo);
        System.out.println("Frase sem vogais..: " + resultadoExemplo);
    }
}