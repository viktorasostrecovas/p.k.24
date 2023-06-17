public class uzduotis4 {
    public static void main(String[] args) {
        System.out.println(" arKvadratas(1,1,1,1) = " + arKvadratas(1, 1, 1, 1));
        System.out.println("arKvadratas(12.5,12.5,12.5,12.5) = " + arKvadratas(12.5, 12.5, 12.5, 12.5));
        System.out.println("arKvadratas(13.4,13.4,13.34,13.24) = " + arKvadratas(13.4, 13.4, 13.34, 13.24));
    }
    public static String arKvadratas(double a, double b, double c, double d) {
        if (a == b && b == c && c == d) {
            return "true";
        }
        else {
            return "false";
        }
    }
}
