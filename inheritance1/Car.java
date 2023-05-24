package inheritancee.inheritance1;

public class Car {

    /*
    olusturulan her bir class object'in cocugudur child'dir
    java default constructor'lari object parentin icine koyar class'a baktigimizda yok zannederiz
    esasinda onun arkasinda object'in icinde constructor vardir.

    constructor'lar obje olusturmak icindir.
    butun constructor'lar da gorunmez super vardir. ve o sayede bir onceki parent'a gider.
    konsolda once parent ve daha sonra child gorunmesinin sebebi bu
    object te calisti ama orada yazili olan bir sey olmadigi icin gorunmedi.
    constructor'lar inheritencede yukaridan asagiya dogru calisir.

    parent = super class
    child = sub clas

    this sizi ayni class icindeki constructerlar arasinda gezdirir.
    super parent class'taki variableleri cagirmak icin

     */

    public void move (){
        System.out.println("Cars move ....");
    }

    public void stop (){
        System.out.println("Cars break ....");
    }

    public void engine (){
        System.out.println("Cars have engine ....");
    }

    public String model = "Car"; //ortak variablelerde methoda konur.
    public int price = 0;

    public Car(){ //hem method hem variale hemde construction olusturulabilir. Construt'ta class ismiyle olur.
        System.out.println("Car constructor 1");
    }

    public Car (int i){
        System.out.println("Car constructor 2");
    }


}
