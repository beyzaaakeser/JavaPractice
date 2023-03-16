package area_perimeter_calculation;

public class Square extends Shape {

    @Override
    public double alan(double r) {
        return r*r;
    }

    @Override
    public double cevre(double r) {
        return 4*r;

    }
}
