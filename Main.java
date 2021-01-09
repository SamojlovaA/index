public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 75;
        double growth = 1.7;
        double index = weight/(growth*growth);
        double Bmi = (double) service.calculate(index);
        System.out.println(Bmi);
    }
}
