package AdditionalTopics;

public class GenericsExample {
    public static void main(String[] args) {
        GenericsClass<Integer> genericsClass = new GenericsClass<>(5);
        System.out.println("Generic class returns " + genericsClass.getData());

        GenericsClass<String> genericsClass1 = new GenericsClass<>("Java Programming Language");
        System.out.println("Generic class returns " + genericsClass1.getData());
        System.out.println("------------------------------");

        GenericMethods genericMethods = new GenericMethods();
        genericMethods.<String>genericsMethod("Hello world!");
        genericMethods.<Integer>genericsMethod(5);

        GenericsClass1<Integer> genericsClass11 = new GenericsClass1<>();
        genericsClass11.display();
    }

}

class GenericsClass<T>{

    private T data;

    public GenericsClass(T data){
        this.data= data;
    }
    public T getData(){
        return this.data;
    }

}

class GenericMethods{
    public <E> void genericsMethod(E data){
        System.out.println("Generics method :");
        System.out.println("Data is : " + data);
    }
}

class GenericsClass1<T extends Number>{
    public void display(){
        System.out.println("This is a bounded type generics class.");
    }
}