public class ATV_5 {
    public static void main(String[] args) {

        int countIdade = 0;
        int countIdadeMaior = 0;
        int countAlturaMenor = 0;
        float mediaIdade = 0;
        float mediaAltura = 0;
        float totalMediaIdade = 0;
        float totalMediaAltura = 0;


        for (int i = 0; i < 5; i++) {
            System.out.println("Me de a idade do " + (i+1) + "° aluno");
            int idade = Integer.parseInt(Main.input.nextLine());

            if (idade < 18) {
                countIdade++;
            }

            System.out.println("Me de a altura do " + (i+1) + "° aluno");
            float altura = Float.parseFloat(Main.input.nextLine());

            if (altura < 1.70) {
                mediaIdade += idade;
                countAlturaMenor++;
            }

            if (idade > 20) {
                mediaAltura += altura;
                countIdadeMaior++;
            }

            System.out.println("---------------");
        }

        totalMediaIdade = mediaIdade /  countAlturaMenor;
        totalMediaAltura = mediaAltura / countIdadeMaior;

        System.out.println("---------------");

        System.out.println("Estes sao os alunos com menos de 18: " + countIdade);
        System.out.println("esta é a media das idades dos alunos com menos de 1.70 de altura: " + totalMediaIdade);
        System.out.println("esta é a media das altura dos alunos com menos de 20 anos: " + totalMediaAltura);
    }
}
