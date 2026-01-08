package dev.rire.api

import dev.rire.security.SecurityPolicy

/**
 * Entry point for the RIRE framework.
 * Host apps interact only with this object.
 */
object Rire {

    /**
     * Initializes RIRE with a resolved security policy.
     * Fails fast if configuration is invalid.
     */
    fun initialize(policy: SecurityPolicy) {
        require(policy.allowedDomains.isNotEmpty()) {
            "RIRE requires at least one allowed domain"
        }
        // Real wiring will come next
    }
}
