interface CollectionOne {
    //lambda
    void show(String a);
}
class lambda{
    public static void main(String[] args){
        CollectionOne obj;
        obj = (String a) -> System.out.println("Hello"+" "+a);
        obj.show("azeer");
    }
}