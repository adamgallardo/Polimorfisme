public class Quadrat extends Figura{

    private double l1;

    public Quadrat(double costat){
        this.l1 = costat;
    }

    public double area(){
        return this.l1*this.l1;
    }
}
