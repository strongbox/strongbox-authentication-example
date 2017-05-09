package org.carlspring.strongbox.authentication.impl.example;

import java.util.Collection;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

/**
 * @author Przemyslaw Fusik
 */
public class EmptyAuthentication
        implements Authentication
{

    public Collection<? extends GrantedAuthority> getAuthorities()
    {
        return null;
    }

    public Object getCredentials()
    {
        return new Object();
    }

    public Object getDetails()
    {
        return new Object();
    }

    public Object getPrincipal()
    {
        return new Object();
    }

    public boolean isAuthenticated()
    {
        return true;
    }

    public void setAuthenticated(boolean isAuthenticated)
            throws IllegalArgumentException
    {

    }

    public String getName()
    {
        return EmptyAuthentication.class.getSimpleName();
    }
}
