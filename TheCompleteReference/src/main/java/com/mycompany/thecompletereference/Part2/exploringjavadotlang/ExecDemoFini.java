package Part2.exploringjavadotlang;

// Wait, until notepad is terminated.
class ExecDemoFini {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("Text Editor");
            p.waitFor();
        } catch (Exception e) {
            assert p != null;
            System.out.println("Notepad returned " + p.exitValue());
        }
    }
}
