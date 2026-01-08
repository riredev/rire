package dev.rire.core

sealed interface CoreResult {
    data object Success : CoreResult
    data class Failure(val reason: String) : CoreResult
}
