public class MyList <T>{
    T[] arr;
    int capacity;

    MyList ()
    {

    }
    MyList (int capacity)
    {
        this.capacity = capacity;
    }

    public  int size()
    {
        int i = 0;
        for (T a : arr)
        {
            i++;
        }
            return i;
    }

    public void add(T data)
    {

    }




}


