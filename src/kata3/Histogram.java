/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author abiam
 */
public class Histogram<T> {
    private final Map<T,Integer> map = new HashMap<>();

    public Integer get(T Key) {
        return map.get(Key);
    }
    public Set<T> ketSet(){
        return map.keySet();
    }
    public void increment(T Key){
        map.put(Key, map.containsKey(Key)? map.get(Key)+1:1);
    }
    
}
