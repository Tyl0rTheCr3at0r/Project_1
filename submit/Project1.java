import java.util.AbstractList;
import java.util.ArrayList;
import java.util.function.Predicate;

/**
Project1 - class that take a collection (AbstractList) as 
argument and provides various operations on the content of that
collection.

@author  Tyler Thomas
@version 9/3/2024
@param <E>
*/
public class Project1<E extends Comparable<E>>
        implements CollectionUtilities<E> {
    private AbstractList<E> collection;

    public Project1(AbstractList<E> collection) {
        this.collection = collection;
    }

    public E findSmallest()
    {
        E smallest = collection.get(0);
        if (collection.equals(null)) {
            return null;
        }
        for (E value : collection) {
            if (smallest.compareTo(value) > 0) {
                smallest = value;
            }
        }
        return smallest;
    }
    
    public E findLargest()
    {
        E largest = collection.get(0);
        if(collection.equals(null))
        {
            return null;
        }
        for(E value : collection)
        {
            if (largest.compareTo(value) < 0) {
                largest = value;
            }
        }
        return largest;
    }

    public boolean hasDuplicates()
    {
        if(collection.equals(null))
        {
            return false;
        }
        for (int i = 0; i < collection.size(); i++)
        {
            for (int j = i + 1; j < collection.size(); j++) {
                if (collection.get(i).compareTo(collection.get(j)) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public E findOneThat(Predicate <E> p)
    {
        for(E item : collection)
        {
            if (p.test(item)) {
                return item;
            }
        }
        return null;
    }

    public AbstractList <E> filterList(Predicate <E> p)
    {
        ArrayList<E> allValues = new ArrayList<E>();
        for (E item : collection)
        {
            if(p.test(item))
            {
                allValues.add(item);
            }
        }

        return allValues;
    }
}


