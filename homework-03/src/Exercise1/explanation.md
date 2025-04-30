# Explanation

## Zugriffe, die fehlschlagen und warum:

- balance (private): Nicht sichtbar außerhalb der Klasse, auch nicht für Unterklassen -> Zugriff schlägt überall außer in Account selbst fehl
- pin (protected): Nur in Unterklassen und im selben Paket zugreifbar -> Zugriff schlägt in ExternalAudit fehl
- internalNote (package-private): Nur im selben Paket sichtbar -> Zugriff schlägt in CompanyAccount und ExternalAudit fehl

## Alternativen

- Variablen private machen und über Getter/Setter zugänglich machen
- public double getBalance() { return balance; }
- protected String getInternalNote() { return internalNote; }

## Unterschied: protected vs. private + Getter

- Bei protected Variablen ist der Zugriff nur über die Unterklasse möglich, bei private + Getter ist der Zugriff nur über die Getter Methode zugänglich
