package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        // split()
        String[] splits = str.split(",");
        for (String split : splits) {
            System.out.println(split);
        }

        String joinStr = "";
        for (String string : splits) {
            joinStr += string + "-";
        }

//        for (int i = 0; i < splits.length; i++) {
//            String string = splits[i];
//            joinStr += string;
//            if (i != splits.length-1) {
//                joinStr += "-";
//            }
//        }

        System.out.println("joinStr = " + joinStr);
        // join()
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열 = " + joinedStr);

        //  문자열 배열 연결
        String result = String.join("-", splits);
        System.out.println("result = " + result);
    }
}
