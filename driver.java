import java.util.*;
public class driver{
    public static void main(String [] args){
        HashMap<Integer,ArrayList<String>> token = populateMap(4);
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
}//class