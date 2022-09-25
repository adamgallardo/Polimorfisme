import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Figura[] figura = new Figura[4];

        figura[0] = new Cercle(6);
        figura[1] = new Quadrat(8);
        figura[2] = new Rectangle(6,8);
        figura[3] = new Triangle(5,5);

        double areaTotal=0;

        for (int i=0; i<4; i++){
            areaTotal = figura[i].area() + areaTotal;
    }
        System.out.println("L'area total es " + areaTotal);
    }
    }