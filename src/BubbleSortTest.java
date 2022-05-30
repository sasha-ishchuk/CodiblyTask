import java.util.ArrayList;
import java.util.List;

public class BubbleSortTest {

    BubbleSort bubbleSort = new BubbleSort();

    public void testCase1(){
        List<Comparable<? extends Number>> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(8);
        list1.add(3);
        list1.add(8);
        System.out.println(bubbleSort.sort(list1));
    }

    //test case 2
    public void testCase2(){
        List<Comparable<? extends Number>> list2 = new ArrayList<>();
        list2.add(-9.3);
        list2.add(0.2);
        list2.add(4);
        list2.add(0.1);
        list2.add(5);
        list2.add(9);
        System.out.println(bubbleSort.sort(list2));
    }

    //test case 3
    public void testCase3(){
        List<Comparable<? extends Number>> list3 = new ArrayList<>();
        System.out.println(bubbleSort.sort(list3));
    }

    //test case 4
    public void testCase4(){
        List<Comparable<? extends Number>> list4 = new ArrayList<>();
        list4.add(null);
        list4.add(5.0001);
        System.out.println(bubbleSort.sort(list4));
    }

    //test case 5
    public void testCase5(){
        System.out.println(bubbleSort.sort(null));
    }

    public static void main(String[] args){
        BubbleSortTest bubbleSortTest = new BubbleSortTest();
        bubbleSortTest.testCase1();
        bubbleSortTest.testCase2();
        bubbleSortTest.testCase3();
        bubbleSortTest.testCase4();
        bubbleSortTest.testCase5();
    }
}
