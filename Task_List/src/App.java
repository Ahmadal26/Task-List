import java.util.ArrayList;
 import java.util.List; 

public class App {
    public static void main(String[] args) throws Exception {
        List<String> favorite = new ArrayList<String>(); 
        favorite.add("rich dad poor dad");
        favorite.add("one piece ");
        favorite.add("catch me if you can");
        favorite.add("One Hundred Years of Solitude");
        favorite.add("And Then There Were None");
        favorite.remove(2);
        for(String fav: favorite){

System.out.println(fav);
        }

    }
}
