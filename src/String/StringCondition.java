package String;

public class StringCondition {  
    public static void main(String[] args) {

        @SuppressWarnings("unused")
        String firstName = "gojo", lastName = "satoru", extra = null, specialExtra = "honoured one";

        // equals
        if (firstName.equals(lastName)) {
            System.out.println(firstName + " equals " + lastName);
        } else {
            System.out.println(firstName + " not equals " + lastName);
        }

        // contains
        // if (firstName != null && extra != null && firstName.contains(extra)) {
        //     System.out.println(firstName + " contains " + extra);
        // } else {
        //     System.out.println(firstName + " not contains " + extra);
        // }

        // equalsIgnoreCase
        if (firstName.equalsIgnoreCase(specialExtra)) {
            System.out.println(firstName + " equals ignore case " + specialExtra);
        } else {
            System.out.println(firstName + " not equals ignore case " + specialExtra);
        }

        // toUpperCase && toLowerCase
        String specialCase = firstName.toUpperCase() + " " + lastName.toUpperCase() + "\n throughtout the heaven and earth,\n he is the " + specialExtra.toUpperCase();
        System.out.println(specialCase);
    } 
}
