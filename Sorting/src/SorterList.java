import java.util.ArrayList;
import java.util.List;

public class SorterList<T extends Comparable<T>, T2 extends Sorter>
{
    public List<T> list;
    public T2 Sort;

    public SorterList(List t ,  T2 sorter)
    {
        list = t;
        Sort = sorter;
    }

    public List<T> sort()
    {
        List<T> sorted = Sort.sort(list);
        return sorted;
    }
}
