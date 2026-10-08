import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("              QUIZ - TECNOLOGIA               ");
        System.out.println("==============================================");
        System.out.println("Faculdade: UNIFAN");
        System.out.println("Aluno: Israel Gadelha");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println("Tema: Tecnologia e Programação");
        System.out.println("==============================================");

        List<Questao> questoes = new ArrayList<>();

        // MODELO: complete e adapte até chegar a 15 questões.
        questoes.add(criarQuestao(
            "1. ESCREVA AQUI A PERGUNTA",
            "A) Primeira opção", "B) Segunda opção", "C) Terceira opção",
            "D) Quarta opção", "E) Quinta opção", "A"));

        // Adicione as questões 2 a 15 aqui.

        int acertos = 0;
        for (int i = 0; i < questoes.size(); i++) {
            System.out.println("----------------------------------------------");
            System.out.println("Questão " + (i + 1) + " de " + questoes.size());
            System.out.println("----------------------------------------------");
            Questao questao = questoes.get(i);
            questao.escrevaQuestao();
            if (questao.isCorreta(questao.leiaResposta())) acertos++;
        }

        if (!questoes.isEmpty()) {
            double porcentagem = (acertos * 100.0) / questoes.size();
            System.out.println("==============================================");
            System.out.println("                 RESULTADO FINAL");
            System.out.println("==============================================");
            System.out.println("Total de questões: " + questoes.size());
            System.out.println("Acertos: " + acertos);
            System.out.printf("Porcentagem de acertos: %.2f%%%n", porcentagem);
            System.out.println("Obrigado por participar do Quiz!");
        }
    }

    private static Questao criarQuestao(String pergunta, String opcaoA, String opcaoB,
            String opcaoC, String opcaoD, String opcaoE, String correta) {
        Questao q = new Questao();
        q.pergunta=pergunta; q.opcaoA=opcaoA; q.opcaoB=opcaoB;
        q.opcaoC=opcaoC; q.opcaoD=opcaoD; q.opcaoE=opcaoE; q.correta=correta;
        return q;
    }
}
