public class ATV_7 {
    public static void main(String[] args) {
        int count = 0;
        int soma = 0;
        int media = 0;

        for (;;) {
            System.out.println("me de uns numero ai (digite 0 para parar)");
            int num = Integer.parseInt(Main.input.nextLine());

            if (num == 0) {
                break;
            } else if (num != 0) {
                count++;
            }

            soma += num;

        }

        media = soma/count;

        System.out.println("--------------");
        System.out.println("Numeros digitados: " + count);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

    }
}
