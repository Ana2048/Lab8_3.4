import java.util.Arrays;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Persoana[] persoane = new Persoana[3];
        persoane[0] = new Persoana("Popescu", "Ion", 30);
        persoane[1] = new Persoana("Ionescu", "Vasile", 25);
        persoane[2] = new Persoana("Georgescu", "Mihai", 35);

        Arrays.sort(persoane);
       // System.out.println("Sortare după nume:");
        System.out.println("Sortare după varsta:");
        for (Persoana persoana : persoane) {
            System.out.println(persoana);
        }

    }
}