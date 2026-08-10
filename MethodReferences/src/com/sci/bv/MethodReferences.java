package com.sci.bv;

        import java.util.Arrays;
        import java.util.List;

public class MethodReferences {


    public MethodReferences(String myCustomName) {
        this.myCustomName=myCustomName;
    }

    public void setMyCustomName(String myCustomName) {
        this.myCustomName = myCustomName;
    }

    private String myCustomName;

        public void printStuffStatic(String stuff){
            System.out.println("===   "+ stuff);
        }

    public  static void printStuffStatic(Object stuff){
        System.out.println("===   "+ stuff);
    }
    public static void main(String[] args) {
        List<String> names = Arrays.asList("brgbrebgjbjgbjd","fdfd","gfd");
        names.forEach(MethodReferences::printStuffStatic);

        MethodReferences instance = new MethodReferences("from...");
        names.forEach(instance::printStuffStatic);
    }
}
