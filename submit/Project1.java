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

    /**
     * Sets the abstract list to the variable collection.
     * @param collection - a list of items
     * 
     */
    public Project1(AbstractList<E> collection) {
        this.collection = collection;
    }

    /**
     * Method to find the smallest value in collection.
     * @return an element E
     * 
     */
    public E findSmallest()
    {
        E smallest = collection.get(0);

        for (E value : collection) {
            if (smallest.compareTo(value) > 0) {
                smallest = value;
            }
        }
        return smallest;
    }
    
    /**
     * Method to find the largest value in the collection.
     * @return an element E
     */
    public E findLargest()
    {
        E largest = collection.get(0);
        
        for (E value : collection) {
            if (largest.compareTo(value) < 0) {
                largest = value;
            }
        }
        return largest;
    }

    /**
     * Checks to see if the collection has any duplicate values.
     * @return a boolean value
     */
    public boolean hasDuplicates()
    {
        
        for (int i = 0; i < collection.size(); i++) {
            for (int j = i + 1; j < collection.size(); j++) {
                if (collection.get(i).compareTo(collection.get(j)) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Returns the first element that satisfies the Predicate given.
     * @param p - Predicate argument
     * @return an element E
     */
    public E findOneThat(Predicate <E> p)
    {
        for (E item : collection) {
            if (p.test(item)) {
                return item;
            }
        }
        return null;
    }

    /**
     * @param p - Predicate arugment
     * @return an element E
     */
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


