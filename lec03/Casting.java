
class A {};
class B extends A {};
class C extends B {};

public class Casting {

  public static void main(String[] args) {

    B b1 = (B) new A();
    C c1 = (C) new B();
    C c2 = (C) new A();
    A a1 = new B();
    B b2 = (B) a1;
  }

}
