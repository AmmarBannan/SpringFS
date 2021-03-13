import java.util.Set;
import java.util.HashMap;
public class Hash {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("machine", "I am machine");
        userMap.put("i walk alone", "i walk alone22");
        userMap.put("we found the love", "we found the love");
        // get the keys by using the keySet method
        String name = userMap.keySet("i walk alone");
        System.out.println("the name of this lyrics is :" + name);

        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));    
        }
        
    }
}