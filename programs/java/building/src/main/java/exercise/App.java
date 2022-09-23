// BEGIN
package exercise;
import com.google.gson.Gson;

public class App {
 public static void main(String[] args) {
  System.out.println("Hello, World!");
  String[] fruits = {"apple", "pear", "lemon"};
  App.toJson(fruits); // => ["apple","pear","lemon"]

 }

 public static String toJson (String[] stringsInput) {
  Gson gson = new Gson();
  return gson.toJson(stringsInput);
 }
// END


}