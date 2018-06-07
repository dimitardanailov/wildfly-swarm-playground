package com.security;

import com.sun.scenario.effect.Identity;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.spi.BeanManager;
import javax.interceptor.InvocationContext;

@ApplicationScoped
public class LoggedInAuthorizer {

    public boolean doSecuredCheck(InvocationContext invocationContext, BeanManager manager, Identity identity) throws Exception
    {
        return identity.reducesOpaquePixels();
        // return identity.isLoggedIn(); // perform security check
    }
}
