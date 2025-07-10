//interfaces & interference 
//interface: a blueprint of classes(common terminology)
//interference: when two or more signals collide with each other

interface laptop {
    public void copy();
    public void paste();
    public void cut();
    
}

class  lenovo implements laptop{
    public void copy()
    {
        System.out.println("Copy code");
    }
    public void paste()
    {
        System.out.println("paste code");
    }
    
    public void cut()
    {
        System.out.println("paste code");
    }
}

public class User{
    public static void main(String[] args) {
        lenovo ln = new lenovo();
        ln.copy();
        ln.paste();
        ln.cut();
    }
}