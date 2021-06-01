class A{
    void ml(){
        System.out.println("hello world");
    }
}

class B extends A{
    void ml(){
        System.out.println("Method B xtending A");
    }
}

class c extends A{

}

class D extends A{

}

class Test{
    public static void main(String args[]){


    }
}

// Interface is a mechanism. It helps to achieve multiple inheritance in java also it hepls us to achive extraction in java.
//  In order to create the interface we must have to write interface keyword. A interface always cosist a method name without a body.
// The access specifier, it consist only public, abstract and final only used in interface method declaration. 
// The class which need to implement the interface need to give the working functionality within the method.
// Interface cannot be instanciated.

interface IAnimal{
  public void color();  
}