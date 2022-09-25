public class Triangle extends Figura{
    private double b,h;

    public Triangle(double base, double altura){
        this.b = base;
        this.h = altura;
    }

    public double area(){
        return (this.b*this.h)/2;
    }
}
