package exercise;
import exercise.connections.Connected;
import exercise.connections.Connection;
import exercise.connections.Disconnected;

import java.util.List;
import java.util.ArrayList;

// BEGIN
public class TcpConnection implements Connection{
    private Connection connection;
    String ip;
    int port;

    public TcpConnection(String ip, int port) {
        this.ip = ip;
        this.port = port;
        this.connection = new Disconnected(this);
    }

    public void switchConnection(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void connect() {
        this.connection.connect();
    }

    @Override
    public void disconnect() {
        this.connection.disconnect();
    }

    @Override
    public void write(String data) {
        this.connection.write(data);

    }

    @Override
    public String getCurrentState() {
        return this.connection.getCurrentState();
    }
}
// END
