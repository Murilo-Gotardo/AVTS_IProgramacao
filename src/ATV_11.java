import java.time.Instant;
import java.util.List;
import java.util.Map;

public class ATV_11 {
    public static void main(String[] args) {

        System.out.println("Quantos alunos temos");
        int num = Integer.parseInt(Main.input.nextLine());

        mostrarTudo(num);
    }

    public static boolean mostrarTudo(int num){
        float gastoTotal = 0;
        float alimentacaoRenda = 0;
        float mediaAluguel = 0;
        float somaAluguel = 0;
        float somaGastoTotal = 0;
        float mediaGastoTotal = 0;
        float aluguelRenda = 0;

        for (int i = 0; i < num; i++) {

            System.out.println("Qual o nome do aluno?");
            String nome = String.valueOf(Main.input.nextLine());

            System.out.println("Reda mensal da familia de " + nome);
            float rendaFamilia = Float.parseFloat(Main.input.nextLine());

            System.out.println("Gasto com alimentação de " + nome);
            float gastoAlimentacao = Float.parseFloat(Main.input.nextLine());

            System.out.println("Aluguel de " + nome);
            float gastoAluguel = Float.parseFloat(Main.input.nextLine());

            System.out.println("Outros gastos de " + nome);
            float outrosGastos = Float.parseFloat(Main.input.nextLine());

            gastoTotal = gastoAlimentacao + gastoAluguel + outrosGastos;
            alimentacaoRenda = rendaFamilia - gastoAlimentacao;
            aluguelRenda = rendaFamilia - gastoAluguel;

            System.out.println("---------------");
            System.out.println("Informaçoes do aluno " + nome + ":");
            System.out.println("Gasto total: " + gastoTotal);
            System.out.println("Alimentação X renda: " + alimentacaoRenda);
            System.out.println("Aluguel X renda: " + aluguelRenda);

            somaAluguel += gastoAluguel;
            mediaAluguel = somaAluguel / num;

            if (rendaFamilia > 2000) {
                somaGastoTotal += gastoTotal;
                mediaGastoTotal = somaGastoTotal / num;
            }
        }

        System.out.println("---------------");
        System.out.println("Gasto medio com aluguel: " + mediaAluguel);
        System.out.println("Gasto total medio: " + mediaGastoTotal);
    }
}