package lang.clazz;

public class ClassCreateMain {

    public static void main(String[] args) throws Exception {
        Class helloClass = Hello.class;
//        Class helloClass1 = Class.forName("lang.clazz.Hello");

        // getDeclaredConstructor : 생성자 선택
        // newInstance : 선택된 생성자를 기반으로 인스턴스를 생성
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
