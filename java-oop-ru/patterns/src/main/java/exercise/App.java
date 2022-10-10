package exercise;

public class App {
    public static void main(String[] args) {
        TcpConnection connection = new TcpConnection("132.223.243.88", 2342);
        connection.connect();
        connection.getCurrentState(); // "connected"
        connection.write("data");
        connection.disconnect();
        connection.getCurrentState(); // "disconnected"
// Выводит на экран сообщение об ошибке
        connection.disconnect(); // => "Error! Connection already disconnected"
    }
}
