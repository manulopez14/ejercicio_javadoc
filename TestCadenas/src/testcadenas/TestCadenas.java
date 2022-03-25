/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcadenas;

/**
 *
 * @author Manuel
 */
public class TestCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        cadenaReves();
        cadenaMayus();
        cadenaSinEspacios();
        calculoLetraDni();
        cadenaRevesCodificada();
        System.out.println("Cuantas vocales hay: "+cuentaVocales("abcdea"));
        System.out.println("¿Es numérico? "+esNumerico('0'));
        System.out.println(calculoLetraDni2(23780327));
        System.out.println(esBuenDni("77892959L"));
//        
//        String nombre; //clase-objeto
//        
//        nombre = "JoseLuis";
//        
//        System.out.println("nombre: "+nombre);
//        
//        System.out.println("charAt 3: "+nombre.charAt(3));
//        
//        System.out.println("longitud: "+nombre.length());
//        
//        System.out.println("subcadena: "+nombre.substring(1, 5));
//        
//        cadenaReves();
//        
//    String cadena="";
//        for (int i = 0; i < 10; i++) {
//            cadena = cadena +1;
//            System.out.println("cadena: "+cadena);
//            
//        }
//        System.out.println("cadena: "+cadena);               
    }
    /**
     * @param
     * @throws
     * @see #esNumerico(char) 
     */
    public static void cadenaReves(){
        
        String cadena="Hola";
        String cadenaReves="";
        int longCadena;
        longCadena = cadena.length()-1;    
        for (int i = 0; i < cadena.length(); i++) {
            cadenaReves = cadenaReves + cadena.charAt(longCadena);
            longCadena--;
        }
        System.out.println("La palabra "+cadena+" al revés es: "+cadenaReves);
    
    }
    
    /**
     * Imprime en la consola el contenido de cadena pasado a mayusculas.
     */
    public static void cadenaMayus(){
        
        String cadena="Adios";
        System.out.println("La palabra "+cadena+" en mayúsculas es: "+cadena.toUpperCase());
    }
    
    /**
     * Imprime en la consola el contenido de cadena sin espacios
     */
    public static void cadenaSinEspacios(){
        
        
        String cadena="Buenas tardes señor";
        String cadenaSinEspacios = (cadena.replace(" ", ""));
        System.out.println("La cadena "+cadena+" sin espacios es: "+cadenaSinEspacios);
    }
    
    /**
     * Calcula la letra del dni introducido
     */
    public static void calculoLetraDni(){
        int dni=12345678;
        char letraDni='x';
            switch (dni%23){
                case 0: letraDni='T';
                break;
                case 1: letraDni='R';
                break;
                case 2: letraDni='W';
                break;
                case 3: letraDni='A';
                break;
                case 4: letraDni='G';
                break;
                case 5: letraDni='M';
                break;
                case 6: letraDni='Y';
                break;
                case 7: letraDni='F';
                break;
                case 8: letraDni='P';
                break;
                case 9: letraDni='D';
                break;
                case 10: letraDni='X';
                break;
                case 11: letraDni='B';
                break;
                case 12: letraDni='N';
                break;
                case 13: letraDni='J';
                break;
                case 14: letraDni='Z';
                break;
                case 15: letraDni='S';
                break;
                case 16: letraDni='Q';
                break;
                case 17: letraDni='V';
                break;
                case 18: letraDni='H';
                break;
                case 19: letraDni='L';
                break;
                case 20: letraDni='C';
                break;
                case 21: letraDni='K';
                break;
                case 22: letraDni='E';
                break;     
            }
            System.out.println("Al dni "+dni+" le corresponde la letra "+letraDni);
    }
    
    /**
     * Devuelve la cadena introducida al reves y codificada
     */
    public static void cadenaRevesCodificada(){
        
        String cadena="Hola";
        String cadenaReves="";
        int longCadena;
        longCadena = cadena.length()-1;
        for (int i = 0; i < cadena.length(); i++) {
            int codificador = (int)cadena.charAt(longCadena);
            codificador++;
            char decodificador = (char)codificador;
            cadenaReves = cadenaReves + decodificador;
            
            longCadena--;
        }
        System.out.println("La palabra "+cadena+" al revés y codificada es: "+cadenaReves);
    }
    
    /**
     * Cuenta las vocales de la cadena introducida
     * @param cadena
     * @return el numero de vocales
     */
    public static int cuentaVocales(String cadena){
        
        int contador=0;
        
        for(int i=0;i<cadena.length();i++){
         
            if("aeiouAEIOUáéíóúÁÉÍÓÚüÜ".contains(String.valueOf(cadena.charAt(i)))){
                contador++;
            }
        }
        return contador;
    }
    
    /**
     * Comprueba si el caracter introducido es numerico
     * @param c
     * @return 
     */
    public static boolean esNumerico(char c){
        
            return ("0123456789".contains(String.valueOf(c)));
        
    }
    public static char calculoLetraDni2 (int numeroDni){
        
        String letras= "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(numeroDni%23);
    }
    public static boolean esBuenDni(String dni){
       
        if (dni.length()==9 && Character.isAlphabetic(dni.charAt(8))){
            
            try{
                Integer.parseInt(dni.substring(0, 8));
            }catch (NumberFormatException ex){
                return false;
            }
            return true;          
            }else{
            return false;
        } 
        
    }
//            int longitudcadena=dni.length()-2;
//            for (int i = 0; i < longitudcadena; i++) {
//                Character.isDigit(dni.charAt(longitudcadena));
//                longitudcadena--;            
}
