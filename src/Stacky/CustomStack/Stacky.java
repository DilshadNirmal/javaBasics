package Stacky.CustomStack;

public class Stacky {
    public static void main(String[] args) {
        
        HumanList list = new HumanList();

        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);
        
        System.out.println("before pop");
        list.display(list.head);
        
        System.out.println("after pop");
        list.pop();
        list.pop();
        list.pop();
        list.pop();
        list.pop();
        list.pop();
        list.pop();
        list.pop();

        list.display(list.head);

        System.out.println("let's peek");
        System.out.println(list.peek());

        System.out.println("size of stack: " + list.getSize());

    }
}
