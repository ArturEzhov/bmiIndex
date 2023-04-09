public class BmiService {
    public int calculate(double weightInKg, double heightInMeters) {
      double bmi = weightInKg / heightInMeters / heightInMeters;
        return (int) bmi;
    }
}
