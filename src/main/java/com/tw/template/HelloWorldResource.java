package com.tw.template;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;

public class HelloWorldResource {
    @GET
    @Produces("text/plain")
    public String getClichedMessage() {
        // Return some cliched textual content
        return "Hello World";
    }

}
