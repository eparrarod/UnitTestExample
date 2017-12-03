package Model;

import java.util.ArrayList;

/**
 * Created by estebanparra on 12/3/17.
 */
public class Sequence {

    private ArrayList<Integer> elemArray;

    public Sequence() {
        this.elemArray = new ArrayList<>();
    }

    public Sequence(ArrayList<Integer> elemArray) {
        this.elemArray = elemArray;
    }

    public Integer search(Integer key) {
        Integer bottom = 0;
        Integer top = elemArray.size() - 1;
        Integer mid;
        Integer result = 0;//-1;
        while (bottom <= top) {
            mid = (top + bottom) / 2;
            if (elemArray.get(mid).equals(key)) { // element[middle] == key
                result = mid;
                return result;
            } else {
                if (elemArray.get(mid) < key)
                    bottom = mid + 1;
                else
                    top = mid - 1;
            }
        }
        return result;
    }


    public void sort() {
    // To implement
    }

}
