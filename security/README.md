# security module

## What this module is

The **security** module is the single authority for deciding what is allowed inside RIRE.

It defines *rules and policies*, not runtime behavior.
No other module is allowed to weaken or override decisions made here.

---

## What lives here

* Security policy models
* Trust and permission definitions
* Allow / deny rules
* Validation logic for security-related configuration

---

## What must NOT live here

* WebView configuration
* Runtime execution logic
* Rendering or UI code
* Android framework dependencies

---

## Critical rule

Once a security policy is resolved, it becomes **immutable**.

This ensures:

* Fail-safe behavior
* No accidental privilege escalation
* Predictable runtime guarantees

The security module defines *what is allowed*, never *how it is executed*.
