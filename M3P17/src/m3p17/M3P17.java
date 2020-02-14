/*
07/02/2020
 */
package m3p17;

import java.util.Scanner;
/**
 * @author xavieralcbar
 */
public class M3P17 {
//DECLARACIONES GLOBALES:
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Author: Alcaraz");
        double preu, tax, result;
        int euro;
        int option;
        do{
            userMenu();
            option = keyboard.nextInt();

            switch (option) {//init of switch
                case 1:
                    //preguntar euro
                    euro = keyboard.nextInt();
                    //convertir en $
                    result = conversor1(euro);
                    System.out.println(result);
                    //break
                    break;
                case 2:
                    //preguntar euro
                    euro = keyboard.nextInt();
                    //convertir en $
                    result = conversor2(euro);
                    System.out.println(result);
                    //break
                    break;
                case 3:
                    //preguntar euro
                    euro = keyboard.nextInt();
                    //convertir en $
                    result = conversor3(euro);
                    System.out.println(result);
                    //break
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    String result;
                    System.out.println("Insert €: ");
                    euro = keyboard.nextFloat();
                    result=Conversor
                    break;
                case 7:
                    System.out.print("Insert letter: ");
                    char letter = (keyboard.next()).charAt(0);
                    String letterBinary=Integer.toBinaryString(letter);
                    System.out.println(letter + "=" + letterBinary);
                    break;
                case 8:
                    System.out.println("Insert word: ");
                    String str = keyboard.next();
                    String strResult = StringToBinary(str);
                    System.out.println(strResult);
                    break;
                case 9:
                    
                    break;
                case 10:
     
                    break;
                case 0:
                    break;

                default:
                    System.out.println("Option no valid");
            }//end of switch
            //System.out.print("press any key to continue");
            //String key= keyboard.next();
        }while (option !=0);
        System.out.println("Press any key to continue");
        //end of bucle
    }//end of main
    
    private static void apart10(){
    System.out.println("---------");
    for(int i=0; i<255; i++){
        System.out.println(i +"\t"+ Integer.toString(i, 16)
        + "=" + (char)i );
    }
    }
    
    private static void charToBinary(char ch){
        String letterBinary=Integer.toBinaryString(ch);
        System.out.println(ch +"=" + letterBinary);
    }
    
    private static String StringToBinary(String str){
        String result="";
        String letterBinary;
        char ch=' ';
        for (int i=0; i<str.length(); i++){
            ch= str.charAt(i);
            result += Integer.toBinaryString(ch)+" "; 
        }
        Integer.toBinaryString(ch);
        return result;
    }
    
    //apartado1-funcion recibe en euro int, devuelve $ en float
    private static float conversor1(int euro){
        float result=0;
        //lo que hace:
        result = (float) euro / 0.91f;//cast
        //result = Float.valueOf(euro)/0.91f;
        return result;
        }
    
    private static double conversor2(int euro){
        double result=0;
        //lo que hace:
        //result = (double) euro / 0.91f;//cast
        result = Double.valueOf(euro)/0.91f;
        return result;
        }
    
    private static String conversorIntString(int euro){
        String result = "0";
        //lo que hace:
        //result = (String) euro / 0.91f;//cast
        result = String.valueOf(euro/0.91f);
        return result;
        }
    
    private static String conversorIntString2(int euro){
        return (new DecimalFormat(" 0.000")).format()
        }
    
    private static String conversorIntString3(Srting euro){
        int result = 0;
        //lo que hace;
        result = (int) (Integer.parseInt(euro) /0.91);
        return result;
        }
        
    private static int conversorCharInt(char letter){
        int result = 0;
        //lo que hace;
        result = (int) letter;
        return result;
        }  
    
    
    
        private static void userMenu() {
        System.out.println("Option1: (1):");
        System.out.println("Option2: (2):");
        System.out.println("Option3: (3):");
        System.out.println("Option4: (4):");
        System.out.println("Option5: (5):");
        System.out.println("Option6: (6):");
        System.out.println("Option7: (7):");
        System.out.println("Option8: (8):");
        System.out.println("Option9: (9):");
        System.out.println("Option10: (10):");
        System.out.println("Option10: (11):");
        System.out.println("Option0: (0) EXIT:");
        System.out.print("\nSelect number:");
    }
    
    private static void p1(){
        double precio=100;
        double taxa=21;
        double res = funtionXavi(precio, taxa);
        methodAitor(precio, taxa, res);
        System.out.println(ANSI_PURPLE + "Resultado: " + res + ANSI_PURPLE);
        //case1;
        //preguntar euro;
        int euro = 100;
        float result1 = conversorXavi(euro);
        System.out.println(result1);
        //break1;
    }
    //Funtion CalculatePVP
    private static double funtionXavi(double price, double iva) {
    double PVP=0; //declaration of the variable return
    PVP = price + price*(iva/100);
    return PVP; //
    }   
    public static void methodAitor(double price, double iva, double res) {
        System.out.println(ANSI_BLUE + "Precio inicial: " + price + " IVA: " +iva+ " Resultado: " +res+ ANSI_BLUE);
    }
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";

}



