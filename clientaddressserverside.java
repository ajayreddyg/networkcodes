Aim: Program to print client address at server side. 
Algorithm: SERVER STEP1: Create instances for socket and ServerSocket class.STEP2: Use 
the port 9000 for TCP.STEP3: Make the PrintStream object connect to the OuputStream 
using Socket.STEP4: Create an instance of the Date class and write it into the Socket.STEP5: 
Get the IP address of the client using the socket and getlnetAddress ().STEP6: Print the 
client's IPAddress. 
CLIENT STEPI: Create instances for socket class with the port number 9000.STEP2: Create 
an object of DatalnputStream and make it to get data from server through the socket. 
STEP3: Read the Date object.STEP4: Print the obtained date. 
Program.: 
Server: 
import java.net.*, 
import java.io.* 
class server4 
public static void main(String[] args) throws Exception 
ServerSocket s1 = new ServerSocket(8000); 
System.out.println("Server Running "); 
Socket s2=s1.accept); 
InetAddress a=InetAddress.getLocalHost): 
String add=a.getHostAddress(); 
BufferedReader in-new BufferedReader(new 
InputStreamReader(s2.getlnputStream0); 
PrintWriter out=new Print Writer(s2.getOutputStream),true); 
System.out.println("Client Connected"); 
System.out.println(s2): 
out.println(add); 
System.out.println("Client's IP is "): 
System.outprintln(in.readLine0); 
sl.close): 
s2.close); 
Client: 
import java.net."; import java.io.*; 
class client4 
public static void main(Stringl] args) throws Exception 
InetAddress a=InetAddress.getLocalHost): 
Socket s2 new Socket(a, 8000); 
String adda.getHostAddress); BufferedReader in=new BufferedReader (new 
InputStreamReader(s2.getlnputStream)); 
PrintWriter out=new Print Writer(new OutputStreamWriter(s2.getOutputStream(), true); 
System.out.println(in.readLine 0); out.println(add); 
s2.close); 
}
}
