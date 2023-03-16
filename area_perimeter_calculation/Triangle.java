package area_perimeter_calculation;

public class Triangle extends Shape {

    public double ucgenCevre (double a , double b , double c){
        return a+b+c;
    }


    public double ucgenAlan(double a, double b , double c ){
        double y = (a+b+c)/2;
        return Math.sqrt(y*(y-a)*(y-b)*(y-b));
    }





}
