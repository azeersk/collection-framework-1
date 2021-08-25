public class GenericClass<A1,A2>{
    public void display(A1 var1,A2 var2){
        System.out.println("Name: "+ var1 + " " + "Id: "+ var2);
    }
    public static void main(String[] args){
        GenericClass<String,Integer> obj = new GenericClass<String,Integer>();
        obj.display("Azeer",118055);
    }
}
