import java.util.Scanner;
public class Tasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/* 
        // Eingabe: 2 Zahlen, Ausgabe: die kleinere Zahl
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("done");

        if (a > b) {
            System.out.println(b);
        } else {
            if (a == b) {
                System.out.println("beide sind" + b);
            } else {
                System.out.println(a);
            }
        }

        // Eingabe: 3 Zahlen, Ausgabe: die größte Zahl

        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        System.out.println("done");

        if (c>d) {
            if (c>e){
                System.out.println(c);
            }
            else {
                System.out.println(e);
            }
        }
        else {
            if (d>e){
                System.out.println(d);
            }
            else {
                System.out.println(e);
            }
        }


        // Aufg. 3 Eingabe: eine natürliche Zahl. Ausgabe: Summe von 1,2,3

        int f = sc.nextInt();
        System.out.println("done");
        int g =0;

        for (int i =1; i<= f; i++) {
            g= g+i;
        }
        System.out.println(g);


*/
        // Aufg. 4 Eingabe: Charakterkette + Zeichen Ausgabe: Stelle von Zeichen
    //System.out.println("Charakterkette eingeben bitte");
        
    //System.out.println("Danke! Jetzt bitte gewünschtes Zeichen eingeben");
        
    //System.out.println("Dankesehr!");
    String word = "Hello";
    String Zeichen = "l";
    char letter = Zeichen.charAt (0) ;
    for(int i  = 0; i<= word.length(); i++ ){
        char result = word.charAt(i);
        if (result == letter) {
            System.out.println(i+1);

        }
        else {}
    }
    char result = word.charAt(0);
    
    System.out.println(result);

    }
}
