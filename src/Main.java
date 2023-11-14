
class Test<T>{
    T obj;
    Test (T obj)
    {
        this.obj = obj;
    }

    public T getObject()
    {
        return this.obj;
    }
}

public class Main {
    public static void main(String[] args) {
        //Generics Provides us with increased type safety
        //Because it provides us with compile time checking
        //Whereas the Object is the superclass of all other classes, and object reference can refer to any object.
        //and that's why object does runtime checking 

        Test<Integer> objInt = new Test<>(15);
        System.out.println(objInt.getObject());

        Test<String> objStr = new Test<>("GeeksForGeeks");
        System.out.println(objStr.getObject());

    }
}