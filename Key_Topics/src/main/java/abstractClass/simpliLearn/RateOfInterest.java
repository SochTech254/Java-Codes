package Abstract.simpliLearn;

abstract class Loan {
    abstract int Interest();
}

class KCB extends Loan {
    @Override
    int Interest() {
        return 10;
    }
}

class StanChart extends Loan {
    @Override
    int Interest() {
        return 15;
    }
}

class IandM extends Loan {
    @Override
    int Interest() {
        return 5;
    }
}

class NCBA extends Loan {
    @Override
    int Interest() {
        return 7;
    }
}
public class RateOfInterest {
    public static void main(String[] args) {
        Loan loan;

        loan = new KCB();
        System.out.println("\nRate of Interest KCB is : \n" + loan.Interest() + "%");

        loan = new StanChart();
        System.out.println("\nRate of Interest StandardChartered is : \n" + loan.Interest() + "%");

        loan = new IandM();
        System.out.println("\nRate of Interest I & M is : \n" + loan.Interest() + "%");

        loan = new NCBA();
        System.out.println("\nRate of Interest NCBA is : \n" + loan.Interest() + "%");
    }
}
