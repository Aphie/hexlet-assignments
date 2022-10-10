package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Connected implements Connection {
    private TcpConnection tcpConnection;

    public Connected (TcpConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }
    @Override
    public void connect() {
        System.out.println("Error: Connection is already established");
    }

    @Override
    public void disconnect() {
        System.out.println("Connection will be stopped");
        this.tcpConnection.switchConnection(new Disconnected(this.tcpConnection));

    }

    @Override
    public void write(String data) {
        System.out.println("Start to send data");
    }

    @Override
    public String getCurrentState() {
        return "connected";
    }
}
// END
