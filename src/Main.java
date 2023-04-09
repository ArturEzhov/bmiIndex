public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double weightInKg = 88.5;
        double heightInMeters = 1.76;

        int bmi = service.calculate(weightInKg, heightInMeters);

        System.out.println("Индекс массы тела: " + bmi);
    }
}