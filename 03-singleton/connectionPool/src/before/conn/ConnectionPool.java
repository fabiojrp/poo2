package before.conn;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	private final static int POOL_SIZE = 2;
	private List<Connection> connectionsPool;
	
	public ConnectionPool() {
		System.out.println("Creating Connection Pool");
		connectionsPool = new ArrayList<Connection>();
		for(int i = 0; i < POOL_SIZE; i++) {
			connectionsPool.add(new Connection());
		}
	}
	
	public Connection getConnection() {
		Connection available = null;
		for(Connection conn: connectionsPool) {
			if(!conn.isInUse()) {
				available = conn;
				break;
			}
		}
		if(available == null) {
			System.out.println("No Connections available");
			return null;
		}
		available.setInUse(true);
		return available;
	}
	
	public void leaveConnection(Connection conn) {
		conn.setInUse(false);
	}
}
