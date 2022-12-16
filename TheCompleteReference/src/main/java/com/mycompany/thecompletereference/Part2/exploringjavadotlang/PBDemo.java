package Part2.exploringjavadotlang;

class PBDemo {
    public static void main(String[] args) {
        try {
            ProcessBuilder proc = new ProcessBuilder("notepad", "testfile");
            proc.start();
        } catch (Exception e) {
            System.out.println("Error executing notepad.");
        }
    }
}
