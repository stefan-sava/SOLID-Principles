SOLID

S
Single responsibility - every class must have a single, focused responsibility,
a single reason to change
EXAMPLE:
A class Invoice
This class should not do everything (keeping data about the invoice, printing it
and saving it in the database, this would make it hard to upkeep. If we change
the printing method, Invoice will also need to be modified, same will happen if
the database changes.)

O
open/closed principle - classes should be open for extension but closed for 
modification
EXAMPLE:
Discount Policy
We have the DiscountPolicy interface with the apply method. Implementing this
interface we can create different policies without disrupting the behaviour of
the program (In checkout service we use the interface instead of using directly
"NoDiscount" or "PercentageDiscount).

L
Liskov substitution - if class A is a subtype of class B, we should be able to
replace B with A without disrupting the behaviour of the program.
EXAMPLE:
We have the PaymentMethod interface, instead of using PaymentMethod both 
CardPayment and NullPayment can be used. It will not change the expected
behaviour.

I
Interface segregation - larger interfaces must be split into smaller ones so
classes only need to be concerned about the methods that are of interest to 
them.
EXAMPLE:
We split the interface into BearCleaner, BearFeeder and BearPetter. Doing this
will be able to implement just the interfaces that are of interest to the 
respective class: for BearCarer we implement BearCleaner and BearFeeder and 
for the CrazyPerson we'll implement BearPetter

D
Dependency inversion - high level modules should not depend on low level
modules, both need to depend on abstractions.
EXAMPLE:
In UserService we use the interface instead of MySqlDatabase or Postgres.
Because we are using abstraction, UserService depends on Database so we can
replace MySqlDatabase or Postgres.