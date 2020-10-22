import java.util.*;
public class driver{
    public static void main(String [] args){
        HashMap<Integer,ArrayList<String>> token = populateMap(4);
        System.out.println(token);
        updateMap(token,"Ashton");
        System.out.println(token);
    }//main
    public static HashMap<Integer,ArrayList<String>> populateMap(int keys) {
        HashMap <Integer,ArrayList<String>> result = new HashMap<>();
        for(int i = 0; i < keys; i++){
            ArrayList<String> temp = new ArrayList<>();
            result.put(i,temp);
        }
        return result;
    }
    // TODO
    // Create a function that takes two args a map and a string
    // The function will loop through the map and for each entry in the map it will add that many(the key number) of the string to the keys value
    // Ex blah(token, “ashton”);

    // Token … {0=[],1=[],2[]}
    // After the function call 
    // Token …{0=[],1=[“ashton”],2=[“ashton”,”ashton”]}

    public static void updateMap(HashMap<Integer,ArrayList<String>> snowb, String str){
        for(Map.Entry<Integer,ArrayList<String>> candy: snowb.entrySet()) {
            for(int i = 0; i < candy.getKey(); i++){
                candy.getValue().add(str);
            }
        }
    }
}//class