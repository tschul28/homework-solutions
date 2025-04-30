# Explanation

## What is the static type of m1? What is its dynamic type?

- Static type: Message
- Dynamic type: Email

## Which method is called? Why?

- m1.getType() ruft die überschriebene getType() Methode der Email Klasse auf, da Java Polymorphismus für überschriebene Methoden nutzt

## Why can’t send() be called directly?

- send() ist nicht in der Klasse Message (dem statischen Typ von m1) definiert, so dass der Compiler den Aufruf über eine Message-Referenz nicht zulässt

## How could you safely call send() anyway (e.g. instanceof)?

- Dynamischen Typ mit instanceof überprüfen und casten:

```java
if (m1 instanceof Email) {
    ((Email) m1).send();
}
```
