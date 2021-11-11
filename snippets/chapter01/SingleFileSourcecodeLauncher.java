import hello.Hello;
public class SingleFileSourcecodeLauncher {
    public static void main(String[] args) {
        Hello h = new Hello(); // Need to compile hello/Hello.java first
        System.out.println(h.hello);
        System.out.println("java.lang package is included by default.");
    }
}