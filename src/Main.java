// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    BmiService service = new BmiService();
    int myBmi= service.calculate (1.97, 56 );
    System.out.println(myBmi);
    }
}