import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import jssc.SerialPort;
import jssc.SerialPortException;

public class SimpleRead {

public static void main(String[] args) throws SerialPortException {
	
    SerialPort serialPort = new SerialPort("COM4");
    try {
        serialPort.openPort();//Open serial port
        serialPort.setParams(50, 8, 1, 0);//Set params.
      while( true){
        byte[] buffer = serialPort.readBytes(1);//Read 10 bytes from serial port
        //for (int i = 0; i < buffer.lengtcccccccccccccccccccccch; i++) {
			System.out.println((char)buffer[0]);
			//if(i=buffer.length)
				
		//}
			
			try {
		        Robot robot = new Robot();

		        // Simulate a mouse click
		     
		        switch((char)buffer[0]){
		        case 'C' : robot.keyPress(KeyEvent.VK_C);break;
		        case 'D' : robot.keyPress(KeyEvent.VK_D);break;
		        case 'E' : robot.keyPress(KeyEvent.VK_E);break;
		        case 'F' : robot.keyPress(KeyEvent.VK_F);break;
		        case 'G' : robot.keyPress(KeyEvent.VK_G);break;
		        case 'A' : robot.keyPress(KeyEvent.VK_A);break;
		        case 'B' : robot.keyPress(KeyEvent.VK_B);break;
		        case 'U' : robot.keyPress(KeyEvent.VK_U);break;
		        case 'V' : robot.keyPress(KeyEvent.VK_V);break;
		        }
		        // Simulate a key press
		       
		   

		} catch (AWTException e) {
		        e.printStackTrace();
		}
        
      }
     //   serialPort.closePort();//Close serial port
    }
    catch (SerialPortException ex) {
    	//serialPort.closePort();
        System.out.println(ex);
    }
}
}