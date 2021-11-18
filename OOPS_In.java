//codeby : Dileep
//Abstraction
abstract class oops {
    abstract void print();
}
class child extends oops {
    void print(){
        System.out.println("Printing Successfully");
    }
    public static void main(String args[]) {
        oops obj = new child();
        obj.print();
    }
}

//Class ans Object
class oops{
    String name;
    int Reg_no;
    public void getName(String nameofStudent){
        name = nameofStudent;
        System.out.println(name);
    }
    public void getRegNumber(int num){
        Reg_no = num;
        System.out.println(Reg_no);

    }
    public static void main(String args[]){
        oops obj = new oops();
        obj.getName("Ravi");
        obj.getRegNumber(1234);

    }
}


