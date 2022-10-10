package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Disconnected implements Connection{
    private TcpConnection tcpConnection;

    public Disconnected(TcpConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public void connect() {
        System.out.println("Connection will be established");
        this.tcpConnection.switchConnection(new Connected(this.tcpConnection));
    }

    @Override
    public void disconnect() {
        System.out.println("Error: connection is already dicsonnected");

    }

    @Override
    public void write(String data) {
        System.out.println("Error: no connection to send data");

    }

    @Override
    public String getCurrentState() {
        return "disconnected";
    }
}
// END
