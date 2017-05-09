package org.carlspring.strongbox.authentication.impl.example;

import org.carlspring.strongbox.authentication.api.AuthenticationSupplier;

import javax.annotation.Nonnull;
import javax.inject.Qualifier;
import javax.servlet.http.HttpServletRequest;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Przemyslaw Fusik
 */
@EmptyAuthenticationSupplierComponent.EmptyAuthenticationSupplierQ
@Component
public class EmptyAuthenticationSupplierComponent
        implements AuthenticationSupplier
{

    public Authentication supply(@Nonnull HttpServletRequest request)
    {
        return new EmptyAuthentication();
    }

    @Qualifier
    @Retention(RUNTIME)
    @Target({ TYPE,
              METHOD,
              FIELD,
              PARAMETER })
    public @interface EmptyAuthenticationSupplierQ
    {

    }
}
