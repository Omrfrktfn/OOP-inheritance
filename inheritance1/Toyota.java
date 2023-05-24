package inheritancee.inheritance1;

public class Toyota extends Car{

    public void hybrid () {
        System.out.println("Toyota uses hybrid engine");
    }

    public Toyota (){ // parametresiz construction
        System.out.println("Toyota constructor 1");
    }

    public Toyota (String s){
        System.out.println("Toyota constructor 2");
    }




}
