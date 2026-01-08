# renderer module

## What this module is

The **renderer** module is the execution sandbox for remote UI.

It is responsible for running UI code safely and enforcing security rules continuously.
On Android, WebView will eventually live here as an internal detail.

---

## What lives here

* Renderer state machine
* Execution lifecycle management
* Enforcement of resolved security policies
* Platform-specific rendering internals

---

## What must NOT live here

* Public API surface
* App-level configuration
* Security policy decisions
* Direct access by host applications

---

## Key invariants

* The renderer never auto-starts
* All actions happen through explicit states
* Security rules are always enforced
* The host app never touches this module directly

This module is designed to be powerful, strict, and invisible to consumers.
