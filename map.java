import java.util.HashMap;
import java.util.Scanner;

public class map {
    public static void main(String args[]) {

        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        map.put("King", 1);
        map.put("Badshah", 2);
        map.put("Sidhu", 3);
        map.put("Karan", 4);
        map.put("Bella", 5);

        System.out.println(map);
        System.out.println(map.get("King"));
        map.remove("Bella");
        System.out.println(map);

    } 
}