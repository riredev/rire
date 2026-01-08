package dev.rire.security

data class SecurityPolicy(
    val allowJavaScript: Boolean,
    val allowedDomains: Set<String>
)
