import java.util.Stack;
public class Inverso {
    public static String InverterPalavras(String input) {
        // Dividir a string em palavras usando espaço como delimitador
        String[] palavras = input.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palavra : palavras) {
            // Criar uma pilha vazia para armazenar as letras da palavra
            Stack<Character> pilha = new Stack<>();

            // Empilhar cada letra da palavra
            for (char letra : palavra.toCharArray()) {
                pilha.push(letra);
            }

            // Desempilhar as letras e adicionar ao resultado
            while (!pilha.isEmpty()) {
                resultado.append(pilha.pop());
            }

            // Adicionar um espaço após cada palavra invertida
            resultado.append(" ");
        }

        // Remover o espaço extra no final do resultado
        resultado.setLength(resultado.length() - 1);

        return resultado.toString();
    }
}
