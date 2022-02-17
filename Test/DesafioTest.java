import org.junit.Assert;
import org.junit.Test;

public class DesafioTest {
    @Test
    public void deveTestarQuestao1() {
        Desafio1 desafio1 = new Desafio1();
        Assert.assertEquals(6, desafio1.questao1(6).size());
    }

    @Test
    public void deveTestarQuestao2() {
        Desafio2 desafio2 = new Desafio2();
        Assert.assertEquals(2, desafio2.questao2("Ya$2"));
    }

    @Test
    public void deveTestarQuestao3() {
        Desafio3 desafio3 = new Desafio3();
        Assert.assertEquals(1, desafio3.questao3("ovo"));
    }
}
