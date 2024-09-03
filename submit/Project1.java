import java.util.AbstractList;
import java.util.function.*;
import java.util.ArrayList;
/**
Project1 - class that take a collection (AbstractList) as 
argument and provides various operations on the content of that
collection.

@author  Tyler Thomas
@version 9/3/2024
*/
public class Project1<E extends Comparable<E>> 
    implements CollectionUtilities<E>
{
    AbstractList<E> collection;

    public Project1(AbstractList<E> collection)
    {
        this.collection = collection;
    }
}
