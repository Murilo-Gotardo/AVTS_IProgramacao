public class ATV_9 {
    public static void main(String[] args) {

        int num;

        System.out.println("me de uns numero ai (digite 0 para parar)");
        num = Integer.parseInt(Main.input.nextLine());

        int maior = num;
        int menor = num;

        do {
            if (num != 0) {
                if (maior >= num) {
                    maior = num;
                } else if (menor <= num) {
                    menor = num;
                }
            }

            System.out.println("me de uns numero ai (digite 0 para parar)");
            num = Integer.parseInt(Main.input.nextLine());
        } while (num != 0 );

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
