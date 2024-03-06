package LinkedList.Circular.CircularDouble;

public class DLLCircularPerson {
	String name;
	DLLCircularPerson connectNext=null;
	DLLCircularPerson connectPrev=null;
	public DLLCircularPerson(String name) {
		this.name=name;
	}
}
