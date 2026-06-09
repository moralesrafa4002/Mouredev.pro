import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class StructuresCorrections {

    public static void main(String[] args) {

        String[] fruits = { "manzana", "plátano", "naranja", "uva", "pera" };
        System.out.println("Array de frutas: " + java.util.Arrays.toString(fruits));
        System.out.println("Longitud del array: " + fruits.length);

        System.out.println("\nAntes de modificar:");
        System.out.println("Valor en índice 2: " + fruits[2]);

        fruits[2] = "melocotón";

        System.out.println("Después de modificar:");
        System.out.println("Valor en índice 2: " + fruits[2]);

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Madrid");
        cities.add("Barcelona");
        cities.add("Valencia");
        cities.add("Sevilla");
        cities.remove("Barcelona");

        HashSet<String> colors = new HashSet<>();
        colors.add("rojo");
        colors.add("azul");
        colors.add("rojo");
        colors.add("verde");
        colors.remove("azul");

        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Brais", "123-456-789");
        phoneBook.put("Moure", "987-654-321");
        phoneBook.put("MoureDev", "555-123-456");
        phoneBook.put("Brais", "111-222-333");
        phoneBook.remove("Moure");
    }
}
