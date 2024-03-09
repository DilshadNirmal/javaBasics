package Pojo;

public class CreateData {
    public static void main(String[] args) {
        PojoJson newData = new PojoJson();

        newData.setAdditionalProperty("dilshad", 22);
        System.out.println(newData.getData());
    }
}
