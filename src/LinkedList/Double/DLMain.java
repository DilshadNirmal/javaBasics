package LinkedList.Double;

public class DLMain {
    public static void main(String[] args) {
        DlLinkedPerson<String> person = new DlLinkedPerson<String>();

        person.insert("null");
        person.insert("niraml");
        person.insert("dil");
        person.insert("null");

        System.out.println("Ascending");
        person.printAsc();
        System.out.println("Descending");
        person.printDes();

        DlLinkedPerson<Employee> dllObj = new DlLinkedPerson<Employee>();
        dllObj.insert(new Employee("dilshad nirmal", "001", "26-02-2002", "male", "9361761055", "TUP", "student"));
        dllObj.insert(new Employee("gokul", "002", "26-02-2002", "male", "9361761055", "TUP", "student"));
        dllObj.insert(new Employee("gowtham", "003", "26-02-2002", "male", "9361761055", "TUP", "student"));
        dllObj.insert(new Employee("chithapa vignesh", "004", "26-02-2002", "male", "9361761055", "TUP", "student"));
        dllObj.insert(new Employee("gymboy vignesh", "005", "26-02-2002", "male", "9361761055", "TUP", "student"));


        System.out.println("------object creation-------");
        DLPerson<Employee> cuPerson = dllObj.head;

        while(cuPerson != null) {
            System.out.println(cuPerson.data.getName() + "-" + cuPerson.data.getDob());
            cuPerson = cuPerson.nextPerson;
        }
    }
}
