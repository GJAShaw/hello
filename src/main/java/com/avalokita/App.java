package com.avalokita;

import java.net.InetAddress;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{

    private static final Logger LOG = LogManager.getLogger(App.class);
    
    public static void main( String[] args )
    {
    	String hostName;
    	try {
    		hostName = InetAddress.getLocalHost().getHostName();
    	} catch (Exception x) {
    		hostName = "<unknown hostname>";
    	}
        LOG.info( "Hello World, from " + hostName);
    }
}
