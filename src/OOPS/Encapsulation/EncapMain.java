package OOPS.Encapsulation;

public class EncapMain {

    /**
     * Encapsulation - hiding the values or hiding the data
     */
    public static void main(String[] args) {
        
        Person person = new Person("dilshad", "nirmal");

        person.setSalutation("Mr");
        person.setGender("M");
        person.setSsn("883454354");
        person.setAddress("dubai kuruku santhu, dubai");
        person.setZip("783923");
        person.setDob("31-09-2009");
        person.setPhone("4938479348");
        person.setBloodGroup("O+ve");
        person.setAge("67");

        String name = person.getFirstName() + " " + person.getLastname();
        String address = person.getAddress() + "-" + person.getZip();

        System.out.println(name);
        System.out.println(address);
    }
}
