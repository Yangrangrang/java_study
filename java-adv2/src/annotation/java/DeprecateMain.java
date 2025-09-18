package annotation.java;

public class DeprecateMain {

    public static void main(String[] args) {
        System.out.println("DeprecateMain.main");
        DeprecatedClass dc = new DeprecatedClass();
        dc.call1();
        dc.call2(); // IDE 경고
        dc.call3(); // IDE 경고 (심각)
    }
}
