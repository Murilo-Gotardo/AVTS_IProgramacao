public class ATV_8 {
    public static void main(String[] args) {
        int count = 0;
        int soma = 0;
        int media = 0;

        int num;

        do {
            System.out.println("me de uns numero ai (digite 0 para parar)");
            num = Integer.parseInt(Main.input.nextLine());

            if (num < 0 ) {
                System.out.println("Numero invalido, digite novamente");
            } else if (num != 0) {
                count++;
                soma += num;
            }

        } while (num != 0);

        media = soma / count;

        System.out.println("--------------");
        System.out.println("Numeros digitados: " + count);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
