# Explanation

## Explain the difference between == and equals() when comparing String objects in Java. Provide a short example showing why == may not be reliable.

- ==: Vergleicht Referenzen
- equals(): Vergleicht Inhalt der Strings

Beispiel

```java
String a = new String("Hallo");
String b = new String("Hallo");

System.out.println(a == b);       // false
System.out.println(a.equals(b));  // true
```

## Consider the following code snipplet and explain why this comparison returns true.

```java
String string1 = "abc ";
String string2 = "abc ";
System.out. println ( string1 == string2 ); // true
```

- Beide Variablen verweisen auf dasselbe String-Objekt

## What happens if you create the second string using new String("abc") instead?

- false, da ein neues Objekt erzeugt wird und so die Referenzen auf unterschiedliche Objekte verweisen
