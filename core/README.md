# core module

## What this module is

The **core** module contains the most basic and shared building blocks of RIRE.

It does not depend on Android UI, WebView, networking, or any platform-specific behavior.
This module defines the *common language* used internally by the rest of RIRE.

If something is needed by multiple modules and has **no side effects**, it likely belongs here.

---

## What lives here

* Core data models used across modules
* Error and result representations
* Identifiers and value objects
* Small utility abstractions that are pure and deterministic

---

## What must NOT live here

* Android framework code
* UI or rendering logic
* WebView or JavaScript-related code
* Security rules or policy decisions
* Network, storage, or filesystem access

---

## Why this module exists

Separating these fundamentals allows:

* Clear boundaries between concerns
* Easier testing and reasoning
* Long-term stability
* Future Kotlin Multiplatform (KMM) reuse

This module should change **slowly and carefully**.
