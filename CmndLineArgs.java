public class CmndLineArgs {

    public static void main(String[] args) {

        if (args[0].charAt(0) == 'A' && args[0].charAt(1) == 'F') {
            if (args[0].length() == 5) {
                System.out.println("Welcome Back:" + args[0]);
            } else {
                System.out.println("length is not valid");
            }
        } else {
            System.out.println("Access Denied");
            System.out.println("ID should Start with 'A' -  'F'");
        }

    }
}
