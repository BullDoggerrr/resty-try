package com.github.gwtboot.sample.basic.client.api;

import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

public interface ButtonService extends RestService {
    @GET
    @Path("/goodbye")
    void test1(MethodCallback<String> callback);
}
