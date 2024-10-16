package GenericArrayCreator;


import java.lang.reflect.Array;

class ArrayCreator {

    public static <T> T[] create (int length, T item){
        T[] array = (T[]) new Object [length];
        for ( int i = 0 ; i < array.length ; i++ ) {
            array[i] = item;
        }
        return array;
    }
    public static <T> T[] create (Class<T> class1,int length, T item){
        T[] array = (T[]) Array.newInstance(class1,length);
        for ( int i = 0 ; i < array.length ; i++ ) {
            array[i] = item;
        }
        return array;
    }
}
