import Model.Sequence;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 * Created by estebanparra on 12/3/17.
 */
public class SearchTest {


    Random rand = new Random();

    @Test
    public void testZeroValues(){
        Sequence numberSequence = new Sequence();
        Integer key = rand.nextInt();
        Integer elementIndex = numberSequence.search(key);
        assertEquals(new Integer(-1),elementIndex);
    }

    @Test
    public void testOneValueKeyNotInSequence(){
        Sequence numberSequence = new Sequence();
        Integer maxSequenceValue = 20;
        ArrayList<Integer> items = new ArrayList();

        items.add(rand.nextInt());

        Integer key = maxSequenceValue + rand.nextInt();
        Integer elementIndex = numberSequence.search(key);
        assertEquals(new Integer(-1),elementIndex);
    }

    @Test
    public void testOneValueKeyInSequence(){
        ArrayList<Integer> items = new ArrayList();
        Integer key = rand.nextInt();
        items.add(key);
        Sequence numberSequence = new Sequence(items);
        Integer elementIndex = numberSequence.search(key);
        assertEquals(new Integer(0),elementIndex);
    }

    @Test
    public void testMultipleValuesKeyNotInSequence(){
        Sequence numberSequence = new Sequence();
        Integer sequenceSize = 10;
        ArrayList<Integer> items = new ArrayList();
        for (int i = 0 ; i< sequenceSize; i++){
            items.add(rand.nextInt());
        }

        Integer key = items.remove(rand.nextInt(sequenceSize));
        Integer elementIndex = numberSequence.search(key);
        assertEquals(new Integer(-1),elementIndex);
    }

    @Test
    public void testMultipleValuesKeyInSequence(){
        Sequence numberSequence = new Sequence();
        Integer sequenceSize = 20;
        ArrayList<Integer> items = new ArrayList();
        for (int i = 0 ; i< sequenceSize; i++){
            items.add(rand.nextInt());
        }
        Integer index = rand.nextInt(20);
        Integer key = items.get(index);
        Integer elementIndex = numberSequence.search(key);
        assertEquals(index,elementIndex);
    }


    @Test
    public void testMultipleValuesKeyFirstInSequence(){
        Sequence numberSequence = new Sequence();
        Integer sequenceSize = 20;
        ArrayList<Integer> items = new ArrayList();
        for (int i = 0 ; i< sequenceSize; i++){
            items.add(rand.nextInt());
        }
        Integer index = 0;
        Integer key = items.get(index);
        Integer elementIndex = numberSequence.search(key);
        assertEquals(index,elementIndex);
    }


    @Test
    public void testMultipleValuesKeyLastInSequence(){
        Sequence numberSequence = new Sequence();
        Integer sequenceSize = 20;
        ArrayList<Integer> items = new ArrayList();
        for (int i = 0 ; i< sequenceSize; i++){
            items.add(rand.nextInt());
        }
        Integer index = items.size();
        Integer key = items.get(index-1);
        Integer elementIndex = numberSequence.search(key);
        assertEquals(index,elementIndex);
    }

}
