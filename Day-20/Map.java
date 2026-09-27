import java.util.*;
public class JavaCollectionFrameworkPart3 {
    public static void main(String[] args){
        Map<String,String> maping = new HashMap<>();
        maping.put("in","India");
        maping.put("Un","united State");
        maping.put("en","England");

        System.out.println(maping);

        //Second Map
        Map<String,String> table = new HashMap<>();
        table.put("Br","brazil");
        System.out.println(table);

        //putAll--> it is used for addimg the All element
        table.putAll(maping);
        System.out.println("After take the attributes of maping in table" + table);

        //remove--> for deletion(key name)
        table.remove("Un");
        System.out.println("After deletion"+table);

        //.size--> for checking the size
        System.out.println("size "+table.size());

        //clear--> for clear all the key value
        //table.clear();
       // System.out.println("after clear all "+table);

        //putIfAbsent--> if the value is not in the key value then this will add in them
        table.putIfAbsent("is","indiassss");
        System.out.println(table);

        //.get--> to find the value of ("key")
        System.out.println(table.get("in"));

        //getOrDefault--> asking from the map if present then return there and if not send defult
        System.out.println(table.getOrDefault("in","None"));
        System.out.println(table.getOrDefault("Usa","None"));

        //.containsKey--> check Weather the key is presten or not
        System.out.println(table.containsKey("Un"));

        //.containsValue
        System.out.println(table.containsValue("India"));

        //.replace-->  to change the value of a key
        table.replace("in","indiaaaaaaaaaaa");
        System.out.println(table);

        //keyset--> set of the key
        Set<String> KeySet = table.keySet();
        System.out.println(KeySet);

        Collection<String> valuset = table.values();
        System.out.println(valuset);

        //get all the entry in map
       Set <Map.Entry<String,String>> st  = table.entrySet();
       System.out.println(st);
    }
}
