package org.apereo.cas.mgmt;

import org.apereo.cas.services.ServicesManager;

import org.springframework.security.core.Authentication;

/**
 * Interface for factory to create instances services manager.
 *
 * @author Travis Schmidt
 * @param <T> - ServicesManager
 * @since 6.0
 */
public interface MgmtManagerFactory<T extends ServicesManager> {
    /**
     * Method will look up the CasUserProfile for the logged in user and the return the GitServicesManager for
     * that user.
     *
     * @param authentication - user authentication
     * @return - GitServicesManager for the logged in user
     */
    T from(Authentication authentication);

    /**
     * Returns the Master repository.
     *
     * @return GitServicesManager
     * @throws Exception - failed
     */
    T master() throws Exception;
}

