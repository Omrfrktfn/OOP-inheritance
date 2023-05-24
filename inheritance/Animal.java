package inheritancee.inheritance;

public class Animal {
    /*
    1 bir cok class'in kullanmasi gereken methodlari her class'a ayri ayri yazarsak;
        -tekrar yapmis oluruz, tekrar ideal kod'da olmamalidir.
        -tekrar tekrar yazmak zaman kaybidir.
        -tamiri cok zaman alir.
        -gelistirilmesi cok zaman alir.
        -tekrar yazmak atomik yapiya ters'tir.

     inheritane miras demek'tir. Kendisinde olmayani kendi gibi kullanma.
     paretn child iliskis yapmak lazim
     ideal kodlar atomik yapida olmalidir.
     bir method bir aksiyon yapmali ( Toplama cikarma carpma bolme )

     *private methodlar child class'lar tarafindan kullanilamazlar.
     *public olan yer private olarak degisirdigimiz de otomotik olarak cat clasindan kullanilamazlar.

     *default'lar ayni package'da public gibi davranir bu yuzden calisir.

     *java'da bir class'in sadece bir tane parent'i olabilir. Coklu paret'a multiple inherintance derler
     tekli paren'e single inheritance denir. Java single inheritance kullanir.
     */

    public void eat(){
        System.out.println("Animal eat .....");
    }

    public void drink(){
        System.out.println("Animal drink .....");
    }

}
