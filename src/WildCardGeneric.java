import java.util.ArrayList;
import java.util.Arrays;

public class WildCardGeneric {
    public void Student(){
        System.out.println("Name: Azeer");
    }
}

class WildCardGenericTwo extends WildCardGeneric{
    public void engineer(){
        System.out.println("work on Java" );
    }
}

class Test{
    public static void main(String[] args){
        ArrayList<?> obj1 = new ArrayList<>();
        ArrayList<WildCardGenericTwo> obj2 = new ArrayList<WildCardGenericTwo>();
        obj1 = obj2;
        System.out.println(obj1);
    }
}