class GenericsClass<T> {
    private T data;
    
    GenericsClass(T data){
        this.data = data;
    }
    
    public T getData(){
        return this.data;
    }
}

class Main{
    public static void main(String args[]){
        GenericsClass<Integer> obj = new GenericsClass<>(5);
        System.out.println("Generic Class Returns: "+obj.getData());
        
        GenericsClass<String> strObj = new GenericsClass<>("Java Programming");
        System.out.println("Generic Class Returns: "+strObj.getData());
    }
}
