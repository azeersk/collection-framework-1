public class Generics{
    public static <A> void printArray(A[] inputArray){
        for(A element : inputArray){
            System.out.printf("%s",element);
        }
        System.out.println(" ");
    }
    public static void main(String[] args){
        Integer[] intArray = {10,20,30,40,50,60,70};
        Character[] charArray = {'a','z','e','e','r',' ','H','e','l','l','o'};
        System.out.println("Array of integers collections: ");
        printArray(intArray);
        System.out.println("Array of characters collections: ");
        printArray(charArray);
    }
}
