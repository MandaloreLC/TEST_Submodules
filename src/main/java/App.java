import testPackage.SubmoduleObject;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Running root project" );
        SubmoduleObject smo = new SubmoduleObject();
        smo.printTwice( "Test" );
    }
}
