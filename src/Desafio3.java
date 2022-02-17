public class Desafio3 {
    public static void main(String[] args) {
        Desafio3 desafio3 = new Desafio3();
        desafio3.questao3("ifailuhkqq");
    }

    public int questao3(String palavra) {

        int size = palavra.length();
        int indexFinal = size - 1;
        int contador = 0;
        for (int i = 0; i < size; i++) {
            char letra = palavra.charAt(i);
            for (int a = (i + 1); a <= indexFinal; a++) {
                char checagem = palavra.charAt(a);
                if (letra == checagem) {
                    contador++;
                }
            }
        }
        System.out.println(contador);
        return contador;
    }
}

