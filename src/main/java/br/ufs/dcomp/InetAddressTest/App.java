package br.ufs.dcomp.InetAddressTest;

import java.net.*;

public class App 
{
    public static void main( String[] args )
    {
        try{
            
            String name = "www.google.com";
            InetAddress address = InetAddress.getByName(name); 
            System.out.println( "Name:      "+ name);
            for (int=0; int<address.lenght; int++){
            System.out.println( "Address:   "+ address.getHostAddress());
            }
        } catch (UnknownHostException e){
            System.out.println(e.getMessage());
        }                
    }
}
