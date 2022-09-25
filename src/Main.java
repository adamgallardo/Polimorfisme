import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Figura[] figura = new Figura[4];

        Figura[0] = new Cercle(6);
        Figura[1] = new Quadrat(8);
        Figura[2] = new Rectangle(6,8);
        Figura[3] = new Triangle(5,5);

        double areaTotal;

        for (int i=0; i<4; i++){
            areaTotal = figura[i].area() + areaTotal;
    }
        System.out.printIn("L'area total es " + areaTotal)
    }
    }

}