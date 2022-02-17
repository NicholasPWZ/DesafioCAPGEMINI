import java.util.ArrayList;
import java.util.List;


public class Desafio1 {

    public Desafio1 desafio1;

    public static void main(String[] args) {
        Desafio1 desafio = new Desafio1();
        desafio.questao1(6);
    }


    public List<String> questao1(int n) {

        List<String> escada = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = n;
            char space = ' ';
            char caractere = '*';
            String atualizar = "";
            String atualizar2 = "";
            String resposta = "";
            num--;
            for (int a = 0; a <= num; a++) {
                atualizar = atualizar2 + space;
                atualizar2 = atualizar;
            }

            atualizar = " ";
            for (int b = 0; b <= i; b++) {
                atualizar = atualizar2 + caractere;
                atualizar2 = atualizar;
            }
            resposta = atualizar;

            System.out.println(resposta);
            escada.add(resposta);
        }
        return escada;
    }

    public List<String> getQuestao1(int n) {
        return questao1(n);
    }
}

