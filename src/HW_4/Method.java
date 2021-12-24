package HW_4;

import java.util.HashMap;

public class Method {
    static HashMap<Integer,Integer> map = new HashMap<>();
    public static HashMap<Integer,Integer> method(MyArray<Integer> arr){
        for (Integer e: arr) {
            if(map.containsKey(e)){
                map.replace(e, map.get(e)+1);
            }
            else{
                map.put(e,1);
            }
        }
        return map;
    }

}
