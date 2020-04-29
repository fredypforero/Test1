import java.util.Scanner;
public class Cal{
        public int var1;
        public int var2;
        public int result;
        public int var3=0;

        public void numbers(){
            System.out.println("Welcome to the Sum");
            System.out.println("What it is yor first Number");
            Scanner in = new Scanner(System.in);
            this.var1 = in.nextInt();
            System.out.println("What it is yor Second Number");
            this.var2 = in.nextInt();
        }
            public void sum(){
            this.result=this.var1+this.var2;
            System.out.println("The Sum result is:"+this.result);
            }
            public void rest(){
             this.result=this.var1-this.var2;
            System.out.println("The Sum result is:"+this.result);
            }
            public void div(){
                this.result=this.var1/this.var2;
                System.out.println("The Div result is:"+this.result);
            }
            public void mult(){
                this.result=this.var1*this.var2;
                System.out.println("The Sum result is:"+this.result);
            }
            public void menu(){
                System.out.println("Cual Operacion quieres\n1-Suma\n2-Resta\n3-Division\n4-Multiplicacion\n5-Exit");
                Scanner in = new Scanner(System.in);
                this.var3 = in.nextInt();
            }
 }

