//public class Practise<T,U> {
//    private final T first;
//    private final U second;
//
//    public Practise (T first, U second)
//    {
//        this.first=first;
//        this.second=second;
//    }
//
//    public T getFirst()
//    {
//        return first;
//    }
//
//    public U getSecond()
//    {
//        return second;
//    }
//
//    public static void main(String[] args) {
//        Practise<String, Integer> pair1 = new Practise<>("foo",42);
//        Practise<String, Integer> pair2 = new Practise<>("bar",99);
//
//        Practise<Integer,Integer> sumPair = addPairs(pair1,pair2);
//        System.out.println(sumPair.getFirst() + sumPair.getSecond());
//    }
//
//    public static <T extends Number, U extends Number> Practise<T,U> addPairs(Practise<T,U> p1, Practise<T,U> p2)
//    {
//        T sum1 = p1.getFirst().intValue() + p2.getFirst().intValue();
//        U sum2 = p1.getSecond().intValue() + p2.getSecond().intValue();
//
//        return new Practise<>(sum1,sum2);
//    }
//}

