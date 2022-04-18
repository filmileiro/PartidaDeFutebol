import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class PartidaDeFutebol {

    private String LocalDoJogo;
    private String NomeDoTimeMandante;
    private String NomeDoTimeVisitante;
    private Integer QuantidadeDeJogadoresA;
    private Integer QuantidadeDeJogadoresB;
    private Integer GolTimeA = 0;
    private Integer GolTimeB = 0;

    Random ApitoDoJuiz = new Random();
    private Integer Acoes;

    public void dadosDaPartida(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o local da Partida: ");
        this.LocalDoJogo = sc.nextLine();
        System.out.print("Informe o nome do time Mandante: ");
        this.NomeDoTimeMandante = sc.nextLine();
        System.out.print("Informe o nome do time Visitante: ");
        this.NomeDoTimeVisitante = sc.nextLine();
        System.out.printf("Informe a quantidade de Jogadores do %s: ", NomeDoTimeMandante);
        this.QuantidadeDeJogadoresA = sc.nextInt();
        System.out.printf("Informe a quantidade de Jogadores do %s: ", NomeDoTimeVisitante);
        this.QuantidadeDeJogadoresB = sc.nextInt();

        sc.close();
    }
    public void verificaStatusDaPartida(){
        if (QuantidadeDeJogadoresA <= 7){
            System.out.printf("%nA regra é clara! Quando a quantidade de jogadores é 7 ou menos que 7 o " +
                    "juiz não altoriza o inicio do Jogo. então... O %s perde o jogo.%n", this.NomeDoTimeMandante);
        }else if(QuantidadeDeJogadoresB <= 7){
            System.out.printf("%nA regra é clara! Quando a quantidade de jogadores é 7 ou menos que 7 o " +
                    "juiz não altoriza o inicio do Jogo. então... O %s perde o jogo.%n", this.NomeDoTimeVisitante);
        }else{
            System.out.printf("%nTudo pronto para começar o Primeiro tempo%n");
            System.out.println();
            System.out.println("-------------//----------------");
        }
    }
    public void resumoDaPartida(){
        switch (Acoes){
            case 1:
                System.out.printf("GOOOOOOL!! DO %s !!!!", NomeDoTimeMandante.toUpperCase(Locale.ROOT));
                System.out.println();
                GolTimeA++;
                break;
            case 2:
                System.out.printf("GOOOOOOL!! DO %s !!!!", NomeDoTimeVisitante.toUpperCase(Locale.ROOT));
                System.out.println();
                GolTimeB++;
                break;
            case 3:
                System.out.printf("FALTA DO %s !!!!", NomeDoTimeMandante.toUpperCase(Locale.ROOT));
                System.out.println();
                break;
            case 4:
                System.out.printf("FALTA DO %s !!!!", NomeDoTimeVisitante.toUpperCase(Locale.ROOT));
                System.out.println();
                break;
            case 5:
                System.out.printf("LATERAL PARA O %s !!!!", NomeDoTimeMandante.toUpperCase(Locale.ROOT));
                System.out.println();
                break;
            case 6:
                System.out.printf("LATERAL PARA O %s !!!!", NomeDoTimeVisitante.toUpperCase(Locale.ROOT));
                System.out.println();
                break;
            case 7:
                System.out.printf("IMPEDIMENTO PARA O %s !!!!", NomeDoTimeMandante.toUpperCase(Locale.ROOT));
                System.out.println();
                break;
            case 8:
                System.out.printf("IMPEDIMENTO PARA O %s !!!!", NomeDoTimeVisitante.toUpperCase(Locale.ROOT));
                System.out.println();
                break;
            case 9:
                System.out.printf("CHUTOU PRA FORA! INACREDITAVEL FUTEBOL CLUBE!!");
                System.out.println();
                break;

            default:
                System.out.println("JUIZ VAI TER QUE VER NO VAR!!");
    }


    }
    public void iniarPrimeitoTempo(){
        if ((QuantidadeDeJogadoresA > 7 && QuantidadeDeJogadoresA<=11) && (QuantidadeDeJogadoresB > 7 && QuantidadeDeJogadoresB <= 11)){
            System.out.println();
            System.out.println("COMEÇA O PRIMEIRO TEMPO");
            for (int i = 0; i < 45 ; i+=3) {

                Acoes = ApitoDoJuiz.nextInt(10)+1;
                System.out.println();
                System.out.println( i + " MINUTOS DO PRIMEIRO TEMPO");

                if (i + 1 == 1){
                    System.out.println("COMEÇA O JOGO!!");
                }else {
                    resumoDaPartida();
                }
            }
            System.out.println("FIM DO PRIMEIRO TEMPO.");
        }


    }

    public String resumoDoJogo(){
        if (GolTimeA == GolTimeA) {
            return String.format("Tudo igual no %s, %s %d x %d %s", LocalDoJogo, NomeDoTimeMandante, GolTimeA, GolTimeB, NomeDoTimeVisitante);
        }else {
            return String.format("%n%nPLACAR ATUAL É: %s %d X %d %s%n", NomeDoTimeMandante.toUpperCase(Locale.ROOT), GolTimeA, GolTimeB, NomeDoTimeVisitante.toUpperCase(Locale.ROOT));
        }
    }

}
