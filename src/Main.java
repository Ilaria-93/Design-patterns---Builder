/* Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter
Il costruttore accetterà un Builder in input
Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
Creare due oggetti Person e stamparli a video
*/

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFirstName("Ilaria");
        person1.setLastName("Rossi");
        person1.setAge(28);
        System.out.println("Person 1: " + person1);

        Person person2 = new Person();
        person2.setFirstName("Lorenzo");
        person2.setLastName("Bianchi");
        person2.setAge(30);
        person2.setAddress("Via Milano 21, Venezia, Italia");
        System.out.println("Person 2: " + person2);
    }
}