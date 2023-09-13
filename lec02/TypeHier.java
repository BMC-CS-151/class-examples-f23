// Adam Poliak
// 09/11/2023
// Type Hierachy including somethings that shouldnt work


class A {};
class B extends A {};
class C extends B {};

public class TypeHier {

public static void main(String[] args) {

A a1 = new B();
B b1 = new A();
A a2 = new C();
B b2 = new C();
C c1 = new B();
C c2 = new A();

}

}
