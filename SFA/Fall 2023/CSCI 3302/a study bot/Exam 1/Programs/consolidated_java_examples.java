import java.util.Arrays;

// Interface for ListADT
interface ListADT<E> {
    boolean isEmpty();
    int size();
    void add(int index, E element);
    E get(int index);
}

// Concrete class implementing ListADT interface
class MyList<E> implements ListADT<E> {
    private Object[] array = new Object[10];
    private int size = 0;
    
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    
    @Override
    public int size() {
        return size;
    }
    
    @Override
    public void add(int index, E element) {
        if(index > size || index < 0) throw new IndexOutOfBoundsException();
        if(size == array.length) array = Arrays.copyOf(array, size * 2);
        for(int i = size; i > index; i--) array[i] = array[i - 1];
        array[index] = element;
        size++;
    }
    
    @Override
    public E get(int index) {
        if(index >= size || index < 0) throw new IndexOutOfBoundsException();
        return (E) array[index];
    }
}

// Fibonacci class for recursion example
class Fibonacci {
    public static int calculate(int n) {
        if(n <= 1) return n;
        return calculate(n - 1) + calculate(n - 2);
    }
}

// Animal Interface
interface Animal {
    void eat();
    void sleep();
}

// Dog class implementing Animal interface
class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }
    
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }
}

// Class illustrating static variable and method
class Counter {
    static int count = 0;
    
    Counter() {
        count++;
    }
    
    static int cube(int x) {
        return x * x * x;
    }
}

// Main class to run examples
public class consolidated_java_examples {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(0, 1);
        System.out.println("List Size: " + myList.size());
        System.out.println("Element at Index 0: " + myList.get(0));
        
        System.out.println("Fibonacci of 5: " + Fibonacci.calculate(5));
        
        Animal dog = new Dog();
        dog.eat();
        dog.sleep();
        
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println("Count after creating two Counter objects: " + Counter.count);
        System.out.println("Cube of 3: " + Counter.cube(3));
    }
}
