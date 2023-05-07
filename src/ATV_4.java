public class ATV_4 {
    public static void main(String[] args) {
        for (;;) {
            System.out.println("Me de um numero");
            int num = Integer.parseInt(Main.input.nextLine());
            System.out.println("---------------");
            System.out.println("Tabuada do " + num);

            for (int i = 1; i <= 10; i++) {
                System.out.println(num + "x" + i + " = " + num * i);
            }

            System.out.println("---------------");
        }
    }
}
