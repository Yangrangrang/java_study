package ref;

public class NullMain4 {

    public static void main(String[] args) {
        BigData bigdata = new BigData();
        bigdata.data = new Data();
        System.out.println("bigdata.count = " + bigdata.count);
        System.out.println("bigdata.data = " + bigdata.data);   // data = new Data()

        System.out.println("bigdata.data.value = " + bigdata.data.value);
    }
}
