
package a1_builder;

public class Main {
    public static void main(String[] args) {
        Pacient Pacient1 = new Pacient.Builder()
                .CuPatRabatabil()
                .CuMicDejun()
                .Build();

        Pacient Pacient2 = new Pacient.Builder()
                .CuHalat()
                .CuPapuci()
                .Build();

        System.out.println(Pacient1);
        System.out.println(Pacient2);
    }
}