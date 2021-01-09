public class BmiService {
    public long calculate(double Bmi){
        double weight = 75;
        double growth = 1.7;
        double index = weight/(growth*growth);
        return (long) index;
    }
}
