package com.tikeda.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.net.InetAddress;
import java.net.UnknownHostException;

@Controller
@EnableAutoConfiguration
public class HelloController 
{
    @RequestMapping("/")
    @ResponseBody
    public String home() {
    	String buf = new String();
    	try {
    	      InetAddress addr = InetAddress.getLocalHost();
    	      buf = "Hello HPE -----v2------, Spring Boot Sample Application: IP Address :" + addr.getHostAddress();
    	    } catch (UnknownHostException e) {
    	      e.printStackTrace();
    	    }    	
        return buf;
    }
    
    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "Hello HPE -----v2-----, Spring Boot Sample Application(in /test) in OpenShift Demo";
    }
}
