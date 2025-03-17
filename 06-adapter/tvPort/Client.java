package tvPort;

import tvPort.adapters.HDMIToVGAAdapter;
import tvPort.devices.Computer;
import tvPort.devices.OldMonitor;
import tvPort.devices.TV;

public class Client {

	public static void main(String[] args) {
		Computer pc = new Computer();
		TV tv = new TV();
		pc.connectPort(tv);
		pc.sendImageAndSound("Filme de ação", "sonzão da hora");
		
		// System.out.println("------ Monitor ----------");
		
		 Computer pc2 = new Computer();
		 OldMonitor monitor = new OldMonitor();
		 //pc2.connectPort(monitor.getConnector());  //Sem adaptador não funciona
		 pc2.connectPort(new HDMIToVGAAdapter(monitor));
		 pc2.sendImageAndSound("Filme clássico", "cinema mudo");
		
	}
}
