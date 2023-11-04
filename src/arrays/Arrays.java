package arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;


        /*
            배열은 길이에 맞게 연속적인 메모리 주소들을 할당 받고
            그 모든 요소는 모두 같은 크기를 갖고 있기 때문에
            메모리 주소를 연산을 해서 알 수 있음

            그렇기 때문에 요소의 위치를 알고 있다면 시간 복잡도는 O(1)
         */

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        System.out.println();
        System.out.println();
        System.out.println();


        /*
            요소의 값은 감춰져 있고
            특정 값의 위치를 찾기 위해서 탐색을 해야 함

            예제를 보면 7은 4번째 요소로 존재
            하지만 최악의 경우인 마지막 요소일 경우도 있음

            4거나 7이거나 결국 n번 반복
            시간 복잡도는 O(n)
         */

        int index = -1;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 7) {
                index = i;
                break;
            }
        }

        System.out.println("index = " + index);
    }
}
