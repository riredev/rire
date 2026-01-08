# runtime module

## What this module is

The **runtime** module is the only entry point between the host app and RIRE internals.

It implements the public API and coordinates all internal modules.
If an app interacts with RIRE, it does so through this module.

---

## What lives here

* Public API implementation (`Rire`)
* Runtime initialization logic
* Configuration validation
* Wiring between core, security, and renderer modules

---

## What must NOT live here

* Rendering logic
* WebView or UI implementation
* Security rule definitions

---

## Key responsibilities

* Validate configuration explicitly and fail fast
* Initialize the runtime in a safe, deterministic order
* Enforce correct lifecycle usage
* Prevent access to internal modules

This module protects RIRE from misuse and keeps the public API small and safe.
