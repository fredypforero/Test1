public class Main {
        public static void main(String[] args) {
            Cal calculator  = new Cal();
            while(calculator.var3!=5)
            {
                calculator.menu();
            switch (calculator.var3) {
                case 1:
                    calculator.numbers();
                    calculator.sum();
                    break;
                case 2:
                    calculator.numbers();
                    calculator.rest();
                    break;
                case 3:
                    calculator.numbers();
                    calculator.div();
                    break;
                case 4:
                    calculator.numbers();
                    calculator.mult();
                    break;
                case 5:
                    System.out.println("Gracias por usar nuestra calculadora");
                    break;
                default:
                    System.out.println("No existe operacion relacionada");
                    break;

            }
            }
    }

}
