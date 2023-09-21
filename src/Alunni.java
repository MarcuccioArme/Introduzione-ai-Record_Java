public class Alunni {
    public static void main(String[] args) {
        Persona p1 = new Persona("Flavio", "Abbinante", 18);
        Persona p2 = new Persona("Alessio", "Alessio", 17);

        System.out.print("\n");
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("\nIl nome della prima persona: " + p1.nome());

        if (p1.equals(p2)) {
            System.out.println("\nI due Record sono uguali.");
        } else {
            System.out.println("\nI due Record sono diversi.");
        }

        System.out.println("\nHashCode del primo record: " + p1.hashCode());
        System.out.println("HashCode del primo record: " + p2.hashCode());
    }
}