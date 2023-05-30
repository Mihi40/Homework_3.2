public class BmiService {
    public int calculate(double heightInMetres, int weightInKg) {
        return (int) (weightInKg / (heightInMetres * heightInMetres));
    }
}