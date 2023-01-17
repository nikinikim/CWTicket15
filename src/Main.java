public class Main {
    public static void main(String[] args) {
        exponentTask1(5);

    }

    public static double exponentTask1(double number) {
        double result = Math.pow(number, 3);
        System.out.println(result);
        return result;
    }

    public void changeObject(Car car) throws CloneNotSupportedException {
        Object temp = car.clone();
    }
    public void load(Car car) {
        try {
            changeObject(car);
        } catch (CloneNotSupportedException e) {
            String error = e.toString();
            System.err.println(error);
        }
    }





}