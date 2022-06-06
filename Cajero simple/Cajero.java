import java.util.Scanner;
public class Cajero {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        int Option , Codigo;
        int Balance = 5000;
        
        System.out.println("                                       Bienvenido Distingido Favor de introducir su codigo      \n\n");
        Codigo = b.nextInt();
        
        Balance = Balance + Codigo;
        System.out.println("                                               #Bienvenido Elija Una Opcion#     \n\n                                            1-Continuar             2-Cancelar\n");
        Option = scanner.nextInt();
        if (Option == 1){
            System.out.println("                                         Bienvenido al cajero la grasa el mejor cajero     \n\n                                            1-Retiro                2-Consulta\n                                            3-Deposito              4-Cancelar\n");
            Option = scanner.nextInt();
            
            switch (Option) {
                case 1:
                System.out.println("                                           Seleccione el monto que desea Retirar     \n\n                                            1-100                     2-500\n                                            3-1000                    4-2000\n\n                                            5-Otros Montos            6-Cancelar  ");
                Option = scanner.nextInt();
                
                switch (Option){
                    case 1: 
                    System.out.println("                                              Ingrese el valor seleccionado");
                    Option = scanner.nextInt();
                    Balance = Balance - Option;
    
                    if ( Option == 100){
                        System.out.println("                                        Gracias por utilizar nuestros servicios su balance actual es: " + Balance);
                    }
                   
                    else {
                        System.out.println("Monto Incorrecto");
                    }
                    break;
    
                    case 2:
                    System.out.println("                                              Ingrese el valor seleccionado");
                    Option = scanner.nextInt();
                    Balance = Balance - Option;
    
                    if (Option == 500){
                        System.out.println("                                        Gracias por utilizar nuestros servicios su balance actual es: " + Balance);
                    }
                    else {
                        System.out.println("Monto Incorrecto");
                    }
                    break;
    
                    case 3:
                    System.out.println("                                              Ingrese el valor seleccionado");
                    Option = scanner.nextInt();
                    Balance = Balance - Option;
    
                    if (Option == 1000){
                        System.out.println("                                        Gracias por utilizar nuestros servicios su balance actual es: " + Balance);
                    }
                    else {
                        System.out.println("Monto Incorrecto");
                    }
                    break;
    
                    case 4:
                    System.out.println("                                              Ingrese el valor seleccionado");
                    Option = scanner.nextInt();
                    Balance = Balance - Option;

                    if (Option == 2000){
                        System.out.println("                                        Gracias por utilizar nuestros servicios su balance actual es: " + Balance);
                    }
                    else {
                        System.out.println("Monto Incorrecto");
                    }
                    break;
    
                    case 5:
                    System.out.println("                                              Ingrese el monto a Retirar ");
                    Option = scanner.nextInt();
                    
                    if(Option < Balance){
                    Balance = Balance - Option;
                    System.out.println("                         Gracias por utilizar nuestros servicios su balance actual es: " + Balance);
                    }
                    else {
                        System.out.println("                            lo sentimos, el monto escrito es mas alto que su Balance: " + Balance);
                    }
                    break;
                
                    default:
                    System.out.println("                                        Gracias por utilizar nuestros servicios su balance actual es: " + Balance);
                    break;
    
                    }
                    break;
    
                    case 2:
                    System.out.println("                               Gracias por utilizar nuestros servicios su balance actual es: " + Balance);
                    break;
                    
                    case 3:
                    System.out.println("                                              Ingrese el monto a depositar ");
                    Option = scanner.nextInt();
                    Balance = Balance + Option;
                    System.out.println("                            Gracias por utilizar nuestros servicios su balance actual es: " + Balance);
                    break;
    
                    default:
                    System.out.println("                                            Gracias por utilizar nuestros servicios");
                    break;
    
                }       
            
            }
            
        else{
            System.out.println("                                              # (: Nos Vemos Vuelva Pronto :) #     ");
        }
    
    }
}
