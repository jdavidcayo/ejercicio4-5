import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) throws Exception {
        
        int numeroIf = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero entero:"));

        if ( numeroIf < 0) System.out.println(numeroIf + ": Es un numero negativo.");
        else System.out.println(numeroIf + ": Es un numero positivo");

        System.out.println("-----------------------------------------------------------------------\n\n");        
        
        int numeroWhile = -1;

        while( numeroWhile < 3 ){
            System.out.println("Valor de numeroWhile: \t" + numeroWhile);
            numeroWhile++;
        } 
        
        System.out.println("-----------------------------------------------------------------------\n\n");        

        do{
            System.out.println("Valor de numeroWhile: \t" + numeroWhile);
            numeroWhile++;
        }while ( numeroWhile < 3 );


        System.out.println("-----------------------------------------------------------------------\n\n");        

        int numeroFor;;

        for(numeroFor = 0; numeroFor <= 3; numeroFor++) System.out.println("Valor de numeroFor: \t" + numeroFor);

        System.out.println("-----------------------------------------------------------------------\n\n");        


        int estacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero de estacion del 1-4:"));

        switch ( estacion ){
            case 1:
                System.out.println("Verano");
                break;
            
            case 2: 
                System.out.println("Otoño");
                break;
            
            case 3: 
                System.out.println("Invierno");
                break;
            
            case 4: 
                System.out.println("Primavera");
                break;
            
            default: 
                System.out.println("Numero de estacion invalida");
                break;
        }

    }
}
