public class BalancedWordsCounterTest {

    BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();

    //test case 1
    public void testCase1(){
        System.out.println(balancedWordsCounter.count("aabbabcccba"));
    }

    //test case 2
    public void testCase2(){
        System.out.println(balancedWordsCounter.count(""));
    }

    //test case 3
    public void testCase3(){
        System.out.println(balancedWordsCounter.count("abababa1"));
    }

    //test case 4
    public void testCase4(){
        System.out.println(balancedWordsCounter.count(null));
    }

    public static void main(String[] args){
        BalancedWordsCounterTest b = new BalancedWordsCounterTest();
        b.testCase1();
        b.testCase2();
        b.testCase3();
        b.testCase4();
    }
}
