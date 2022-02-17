public class Desafio2 {
    public static void main(String[] args) {
        Desafio2 desafio2 = new Desafio2();
        desafio2.questao2("ya$2aaa");
    }

    public int questao2(String senha) {
        int carac = senha.length();
        carac = 6 - carac;

        if (carac <= 0) {
            System.out.println("Sua senha é forte");
        } else {
            System.out.println(carac);
        }
        return carac;

    }
}
