package ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigdata = new BigData();
        System.out.println("bigdata.count = " + bigdata.count);
        System.out.println("bigdata.data = " + bigdata.data);   // data = null(참조형)

        // NullPointerException
        System.out.println("bigdata.data.value = " + bigdata.data.value);
    }
}
