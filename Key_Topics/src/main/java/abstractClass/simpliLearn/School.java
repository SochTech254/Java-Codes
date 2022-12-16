package Abstract.simpliLearn;

abstract class Student {
    abstract int getRank();
}

class Raju extends Student {
    private final int Rank;

    public Raju(int rank1) {
        Rank = rank1;
    }

    @Override
    public int getRank() {
        return Rank;
    }
}
class Pranita extends Student {
    private final int Rank;

    public Pranita(int rank2) {
        Rank = rank2;
    }

    @Override
    public int getRank() {
        return Rank;
    }
}
class Punith extends Student {
    private final int Rank;

    public Punith(int rank3) {
        Rank = rank3;
    }

    @Override
    public int getRank() {
        return Rank;
    }
}
public class School {

    public static void main(String[] args) {
        Raju rank1 = new Raju(1);
        Pranita rank2 = new Pranita(10);
        Punith rank3 = new Punith(21);

        int x, y, z;

        x = rank1.getRank();
        y = rank2.getRank();
        z = rank3.getRank();

        System.out.println("Rank of Raju : " + x);
        System.out.println("Rank of Pranita : " + y);
        System.out.println("Rank of Punith : " + z);
    }
}
