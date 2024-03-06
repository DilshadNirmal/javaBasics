package LinkedList.Circular.CircularDouble;

public class DoubleCircularLL {
	DLLCircularPerson head;
	DLLCircularPerson tail;
	public void insert(String name) {
		DLLCircularPerson person = new DLLCircularPerson(name);
		if(head==null) {
			person.connectNext=head;
			head=person;
			tail=person;
		}
		else {
			person.connectPrev=tail;
			person.connectNext=head;
			tail.connectNext=person;
			tail=person;
		}
	}
    
	public void print() {
		DLLCircularPerson currentPerson=head;
		if(currentPerson!=null) {
		do {
			System.out.println(currentPerson.name);
			currentPerson=currentPerson.connectNext;
		}
		while(currentPerson!=head);
	}
	}
}
