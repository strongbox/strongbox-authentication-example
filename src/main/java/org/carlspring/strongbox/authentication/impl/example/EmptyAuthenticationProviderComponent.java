package org.carlspring.strongbox.authentication.impl.example;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Przemyslaw Fusik
 */
@EmptyAuthenticationProviderComponent.EmptyAuthenticationProviderQ
@Component
public class EmptyAuthenticationProviderComponent
        implements AuthenticationProvider
{

    public Authentication authenticate(Authentication authentication)
            throws AuthenticationException
    {
        return authentication;
    }

    public boolean supports(Class<?> authentication)
    {
        return authentication == EmptyAuthenticator.class;
    }

    @Qualifier
    @Retention(RUNTIME)
    @Target({ TYPE,
              METHOD,
              FIELD,
              PARAMETER })
    public @interface EmptyAuthenticationProviderQ
    {

    }
}
