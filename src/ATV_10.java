public class ATV_10 {

    public static void main(String[] args) {


        int op;
        do {
            System.out.println("""
                    1 – Inclusão de cliente
                    2 – Alteração de cliente
                    3 – Exclusão de cliente
                    4 – Visualização de cliente
                    5 – Sair
                    """);
            op = Integer.parseInt(Main.input.nextLine());

            if (op == 1) {
                System.out.println("Inclusao selecionada");
            } else if (op == 2) {
                System.out.println("Alteração selecionada");
            } else if (op == 3) {
                System.out.println("Exclusão selecionada");
            } else if (op == 4) {
                System.out.println("Visualização selecionada");
            } else {
                System.out.println("Opção invalida");
            }

        } while (op != 0);
    }
}
