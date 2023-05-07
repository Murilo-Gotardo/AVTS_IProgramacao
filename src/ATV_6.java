public class ATV_6 {
    public static void main(String[] args) {

        System.out.println("Quantidades de func");
        int func = Integer.parseInt(Main.input.nextLine());

        for (int i = 0; i < func; i++) {
            System.out.println("Qual o nome do felizardo: ");
            String nome = String.valueOf(Main.input.nextLine());

            System.out.printf("""
                Qual categoria %s se encaixa:
                Categoria A
                Categoria B 
                Categoria C
                Categoria D
                Categoria E 
                Categoria F 
                Categoria G 
                Categoria H 
                Categoria I 
                Categoria J
                """, nome);

            char categoria = Main.input.nextLine().toUpperCase().charAt(0);

            System.out.println("Qual o salario de " + nome);
            float salario = Float.parseFloat(Main.input.nextLine());

            float reajuste = calcularReajuste(categoria, salario);

            System.out.println("---------------");
            System.out.println(nome + ", da categoria " + categoria + ", com salario reajustado para R$" + reajuste);
            System.out.println("---------------");
        }
    }

    public static float calcularReajuste(char categoria , float salario){
        switch (categoria){
            case 'A': salario += (salario * .1);
            case 'B': salario += (salario * .12);
            case 'C': salario += (salario * .14);
            case 'D': salario += (salario * .16);
            case 'E': salario += (salario * .18);
            case 'F': salario += (salario * .2);
            case 'G': salario += (salario * .22);
            case 'H': salario += (salario * .24);
            case 'I': salario += (salario * .26);
            case 'J': salario += (salario * .28);
            default: salario += (salario * .3);
        }

        return salario;
    }
}
