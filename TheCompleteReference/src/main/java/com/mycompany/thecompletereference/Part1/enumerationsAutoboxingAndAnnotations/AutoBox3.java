package Part1.enumerationsAutoboxingAndAnnotations;

class AutoBox3 {
    public static void main(String[] args) {
        Integer iOb = 100;
        Double dOb = 98.6;

        dOb = dOb + iOb;
        System.out.println("dOb after expression : " + dOb);
    }
}
