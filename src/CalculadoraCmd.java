//Classes importadas
import java.io.PrintStream;
import java.util.Scanner;


public class CalculadoraCmd {
 
    public static void main(String[] calc) {

        //objetos das classes importadas criados
        Scanner scan = new Scanner(System.in);
        PrintStream show = new PrintStream(System.out);


            String nome;
            int num;
            int soma;
            int subtracao;
            int multiplicacao;
            float divisao;

        

            show.println(">Calculadora CMD iniciada<");
                    show.println("");
                    show.println("");
            show.println("Digite seu nome: ");
                 nome = scan.next();
                show.println("");
            show.println("Olá " + nome + " qual operação deseja realizar?");
                show.println("1-Soma");
                show.println("2-Subtração");
                show.println("3-Multiplicação");
                show.println("4-Divisão");
                show.println("");

                        num = scan.nextInt();
                
                    while (true) {
                    
                
                        switch (num) {
                            case 1: 
                                show.println();
                                    show.println("Soma escolhida! ");
                                        show.println("Digite os valores que deseja somar:");
                                            show.println(""); 
                                                int som1 = scan.nextInt();
                                            show.println(" + " ); 
                                                int som2 = scan.nextInt();                                                        
                                                soma = som1 + som2;
                                                show.println("");
                                show.println("Resultado é " + som1 + " + " + som2 + " = " + soma);
                                break;
                            case 2:
                                show.println();
                                    show.println("Subtração escolhida! ");
                                        show.println("Digite os valores que deseja subtrair:");
                                            show.println(""); 
                                                int sub1 = scan.nextInt();
                                            show.println(" - " ); 
                                                int sub2 = scan.nextInt();                                                        
                                                subtracao = sub1 - sub2;
                                                show.println("");
                                show.println("Resultado é " + sub1 + " - " + sub2 + " = " + subtracao);
                                break;
                            case 3:
                                show.println();
                                    show.println("Multiplicação escolhida! ");
                                        show.println("Digite os valores que deseja subtrair:");
                                            show.println(""); 
                                                int mult1 = scan.nextInt();
                                            show.println(" x " ); 
                                                int mult2 = scan.nextInt();                                                        
                                                multiplicacao = mult1 * mult2;
                                                show.println("");
                                show.println("Resultado de " + mult1 + " x " + mult2 + " = " + multiplicacao);
                                break;
                            case 4: 
                                show.println();
                                    show.println("Divisão escolhida! ");
                                        show.println("Digite os valores que deseja dividir:");
                                            show.println(""); 
                                                float div1 = scan.nextFloat();
                                            show.println(" / " ); 
                                                float div2 = scan.nextFloat();                                                        
                                                divisao = div1 / div2;
                                                show.println("");
                                show.println("Resultado de " + div1 + " x " + div2 + " = " + divisao);
                                break;
                            default:
                                show.println("Encerrando programa...Programa encerrado!");
                                scan.close();
                                break;


                            }
                    }    
    
            }

}
