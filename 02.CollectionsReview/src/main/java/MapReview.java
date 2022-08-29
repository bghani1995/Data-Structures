import java.util.HashMap;
import java.util.Map;

public class MapReview {

    public static void main(String[] args) {
        // Create HashMap
        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(1, "Jack");
        studentsMap.put(2, "Julia");




    }
    public static Character findFirstNonRepeating(String str){
        // create a map: this will cost me space complexity
        Map<Character, Integer> map = new HashMap<>();
        int count;

        // count the frequency of chars
        for(Character ch: str.toCharArray()){
            if(map.containsKey(ch)) {
                count=map.get(ch);
                map.put(ch, count+1);
            }
            else map.put(ch, 1);
        }

        // start from the beginning and check if there is a char with frequency 1
        for(Character ch: str.toCharArray()){
            if(map.get(ch)==1) return ch;
        }
        return null;
    }
}