package Pojo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Datum datum = new Datum();

        datum.setName("dilshad");
        datum.setAge(45);

        PojoJson pojoJson = new PojoJson();

        pojoJson.setData(List.of(datum));
        pojoJson.setAdditionalProperty("name", datum.getName());
        pojoJson.setAdditionalProperty("age", datum.getAge());

        System.out.println(pojoJson.getAdditionalProperties());
    }
}
