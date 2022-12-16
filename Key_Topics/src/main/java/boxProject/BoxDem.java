package boxProject;

class BoxDem {
    public static void main(String[] args) {
        // create boxes using the various constructors
        BoxWeight mybox1 = new BoxWeight(20, 15, 10, 34.3);
        BoxWeight mybox2 = new BoxWeight(4, 3, 2, 0.076);
        BoxWeight mybox3 = new BoxWeight();     // default
        BoxWeight mycube  = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);  // create copy of mybox1

        double vol;

        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Weight of mybox2 is " + mybox2.weight);
        System.out.println();

        // get volume of the box with no dimensions specified
        vol = mybox3.volume();
        System.out.println("Volume of mybox3 is " + vol);
        System.out.println("Weight of mybox3 is " + mybox3.weight);
        System.out.println();

        // get volume of cube
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
        System.out.println("Weight of mycube is " + mycube.weight);
        System.out.println();

        // get volume of clone
        vol = myclone.volume();
        System.out.println("Volume of clone is " + vol);
        System.out.println("Weight of myclone is " + myclone.weight);
        System.out.println();
    }
}
