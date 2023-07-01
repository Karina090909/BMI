public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        int weightInKg = 98;
        double heightInMeters = 1.86;
        int index = service.calculate(weightInKg, heightInMeters);
        System.out.println(index);
    }
}