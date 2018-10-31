import java.util.HashMap;
import java.util.Map;

/**
 * Created by 17080697 on 2018/10/18.
 */
public class Testmap {


    public static void main(String[] args) {

        Map<String, Object> param = new HashMap<>();
        param.put("name", "233");
        param.remove(new Object());

        //add element

//        public V put(K key, V value) {
//            if (table == EMPTY_TABLE) {
//                inflateTable(threshold);
//            }
//            if (key == null)
//                return putForNullKey(value);
//            int hash = hash(key);
//            int i = indexFor(hash, table.length);
//            for (HashMap.Entry<K,V> e = table[i]; e != null; e = e.next) {
//                Object k;
//                if (e.hash == hash && ((k = e.key) == key || key.equals(k))) {
//                    V oldValue = e.value;
//                    e.value = value;
//                    e.recordAccess(this);
//                    return oldValue;
//                }
//            }
//
//            modCount++;
//            addEntry(hash, key, value, i);
//            return null;
//        }
//
//        //remove
//
//        final HashMap.Entry<K,V> removeEntryForKey(Object key) {
//            if (size == 0) {
//                return null;
//            }
//            int hash = (key == null) ? 0 : hash(key);
//            int i = indexFor(hash, table.length);
//            HashMap.Entry<K,V> prev = table[i];
//            HashMap.Entry<K,V> e = prev;
//
//            while (e != null) {
//                HashMap.Entry<K,V> next = e.next;
//                Object k;
//                if (e.hash == hash &&
//                        ((k = e.key) == key || (key != null && key.equals(k)))) {
//                    modCount++;
//                    size--;
//                    if (prev == e)
//                        table[i] = next;
//                    else
//                        prev.next = next;
//                    e.recordRemoval(this);
//                    return e;
//                }
//                prev = e;
//                e = next;
//            }
//
//            return e;
//        }


        //resize()


    }
}
