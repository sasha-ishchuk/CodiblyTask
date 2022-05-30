import java.util.*;

public class BalancedWordsCounter {

    public int count(String input){

        if(input == null){
            throw new NullPointerException("input is 'null'");
        }

        if(input.equals("")){
            return 0;
        }

        if(!(input.matches("[a-zA-Z]+"))){
            throw new RuntimeException("Illegal syntax");
        }

        int counter = 0;
        List<String> listOfSubWords = listSubWords(input);
        for(String word : listOfSubWords){
            if(isBalanced(word)){
                counter += 1;
            }
        }
        return counter;
    }

    private List<String> listSubWords(String str){
        char[] inputChars = str.toCharArray();
        int n = str.length();

        List<String> subWords = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= n - i; j++){
                int k = j + i - 1;
                StringBuilder s = new StringBuilder();
                for(int m = j; m <= k; m++){
                    s.append(inputChars[m]);
                }
                subWords.add(s.toString());
            }
        }
        return subWords;
    }

    private boolean isBalanced(String word){
        Map<Character, Integer> charCount = new HashMap<>();
        char[] chars = word.toCharArray();

        for(char ch : chars){
            if(charCount.containsKey(ch)){
                charCount.put(ch, charCount.get(ch) + 1);
            }
            else{
                charCount.put(ch, 1);
            }
        }
        Set<Integer> set = new HashSet<>(charCount.values());
        return set.size() == 1;
    }
}
