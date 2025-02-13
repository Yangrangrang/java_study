package collection.link;

public class Node {

    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    // IDE 생성 toString()
/*
    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
*/

    // [A -> B -> C]
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); // 루프에서 문자를 더 할 때는 StringBuilder를 쓰는게 좋다.
        Node x = this;
        sb.append("[");
        while (x != null) {
            sb.append(x.item);
            if (x.next != null) {
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");
        return sb.toString();   // StringBuilder 는 문자열 변경이 끝나면 안전한(불변) String 으로 변환
    }
}
