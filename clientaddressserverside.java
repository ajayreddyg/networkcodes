Aim : Design a socket program to print the client address at the server side
Algorithm
Server:
1. Import all the required io and net packages
2. Create a class Sip
3. Initialize the classes ServerSocket and Socket and their respective objects.
4. Initialize the class DataInputStream for reading the data from socket through
getInputStream() method.
5. Establish the connection with client system using the client IP and port number 8020
6. Read the IP address from the socket
7. Print the IP address at the server
Client:
1. Import all the required io and net packages
2. Create a class Cip
3. Initialize the classes Socket and their respective objects.
4. Initialize the class PrintStream Class for writing data into the socket through
getOutputStream() method.
5. Get the IP address of the system using InetAddress class with getLocalHost() method.
6. Establish the connection with server system using the IP address and port number 8020
7. Write the IP address into the socket
8. If any exception arise, print the error.
Program:
import java.io.*;
import java.net.*;
class Sip
{
public static void main(String args[])
{
ServerSocket ss;
Socket s;
DataInputStream dis;
String ip;
try
{
ss=new ServerSocket(8020);
while(true)
{
s=ss.accept();
dis=new DataInputStream(s.getInputStream());
ip=dis.readLine();
System.out.println("Ip address of the client system is"+ip);
}
}
catch(IOException e)
{
System.out.println("The exception is: "+e);
}
}
}
import java.io.*;
import java.net.*;
class Cip
{
public static void main(String args[])
{
Socket soc;
PrintStream ps;
try
{
InetAddress ia=InetAddress.getLocalHost();
soc=new Socket(ia,8020);
ps=new PrintStream(soc.getOutputStream());
ps.println(ia);
}
catch(IOException e)
{
System.out.println("The exception is: "+e);
}
}
}
Output
Server side Terminal