package inheritancee.inheritance1;

public class Honda extends Car{

    public void eco (){
        System.out.println("Honda enginees are so economic");
    }

    public String model = "Civic";
    public int price = 2000;

    public Honda (){
        System.out.println(this.model);
        System.out.println(super.model);
    }
}
