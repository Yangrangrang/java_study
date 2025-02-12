package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {

    private static final int DEFAULT_CAPACITY = 5;  // 기본 용량

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        elementData[size] = e;
        size++;
    }

    public Object get(int index) {
        return elementData[index];
    }

    // 배열의 특정 위치에 값을 세팅
    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;    // 값은 교체하지만 예전 데이터 반환
    }

    // 오브젝트를 찾는거, 몇번째 index에 있나
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        // [1,2,3,null,null] // size=3
        // [1,2,3] // size = 3
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                " size = " + size + "capacity = " + elementData.length;
    }
}
