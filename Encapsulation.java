//code by: Dileep

public class Main{
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args){
        Main obj = new Main();
        obj.name = "Java";
        System.out.println(obj.getName());
    }
}
