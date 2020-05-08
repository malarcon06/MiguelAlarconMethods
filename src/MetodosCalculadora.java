import java.util.Scanner;

public class MetodosCalculadora {
    private char option;
    private String operation;

    public static void main(String[] args) {
        MetodosCalculadora calculadora = new MetodosCalculadora();
        System.out.println("String \"3\" es numerico: "+calculadora.isNumeric("3"));
        System.out.println("String \"32H\" es numerico: "+calculadora.isNumeric("32H"));
        calculadora.initiateCalculator();
    }

    private void initiateCalculator(){
        // Monta la calculadora, mostrando el menu y pidiendo una opcion (notar que la opcion devuelve
        // en formato char). Repite este proceso mientras la opcion no este entr 1 y 6 (respresentados
        // por 49 y 54 en el codigo ASCII) o si la opcion es igual a 'Y'(78 en ASCII).
        // Si la opcion es 'N' (89 en ASCII) sale del metodo.
        // Si se obtiene una opcion valida se llama al metodo operateWithOption() para haccer la
        // operacion correspondiente y se vuelve a armar la calculadora llamandose initiateCalculator()
        // a si mismo.



        do{
            //showMenu();
            getOption();
            if(option == 89){
                System.out.println("Calculadora finalizada...");
                return;
            }
        }while(option == 78 || option < 49 || option > 54);

        operateWithOption();
        initiateCalculator();
    }

    private void getOption(){
        // Obtiene la opcion referente al menu, que operacion elige el usuario. Valida la opcion.
        Scanner sc = new Scanner(System.in);
        String stringOption = sc.next();

        while(stringOption.length() > 1){
            stringOption = sc.next();
        }

        option = stringOption.charAt(0);
    }

    private void operateWithOption(){
        // Segun la operacion elegida por el usuario, se opera segun corresponda.
        switch(option){
            case '1':
                //sum();
                System.out.println("sum()");
                break;
            case '2':
                //substract();
                System.out.println("substract()");
                break;
            case '3':
                //multiply();
                System.out.println("multiply()");
                break;
            case '4':
                //divide();
                System.out.println("divide()");
                break;
            case '5':
                //powerNumber();
                System.out.println("powerNumber()");
                break;
            case '6':
                //greaterNumber();
                System.out.println("greaterNumber()");
                break;
        }
    }

    private boolean isNumeric(String number){
        // Metodo que comprueba si un string esta solo compuesto por numeros, viendo si cada
        // uno de los caracteres del string es un numero.
        for(int i = 0; i < number.length(); i++){
            if(!Character.isDigit(number.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
