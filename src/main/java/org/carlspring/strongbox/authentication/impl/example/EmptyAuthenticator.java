package org.carlspring.strongbox.authentication.impl.example;

import org.carlspring.strongbox.authentication.api.AuthenticationSupplier;
import org.carlspring.strongbox.authentication.api.Authenticator;
import org.carlspring.strongbox.authentication.impl.example.EmptyAuthenticationProviderComponent.EmptyAuthenticationProviderQ;

import javax.annotation.Nonnull;
import javax.inject.Inject;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.stereotype.Component;

/**
 * @author Przemyslaw Fusik
 */
@Component
public class EmptyAuthenticator
        implements Authenticator
{

    @EmptyAuthenticationSupplierComponent.EmptyAuthenticationSupplierQ
    @Inject
    private AuthenticationSupplier authenticationSupplier;

    @EmptyAuthenticationProviderQ
    @Inject
    private AuthenticationProvider authenticationProvider;

    @Nonnull
    public AuthenticationProvider getAuthenticationProvider()
    {
        return authenticationProvider;
    }

    @Nonnull
    public AuthenticationSupplier getAuthenticationSupplier()
    {
        return authenticationSupplier;
    }
}
