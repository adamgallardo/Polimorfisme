public class Rectangle extends Figura {
    private double l1,l2;

    public Rectangle(double base, double altura){
        this.l1 = base;
        this.l2 = altura;
    }

    public double area(){
        return this.l1*this.l2;
    }
}
