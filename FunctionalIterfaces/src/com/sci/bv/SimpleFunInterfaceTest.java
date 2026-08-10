package com.sci.bv;

public class SimpleFunInterfaceTest {

    public static void main(String[] args) {
	carryOutWork(new SimpleFuncInterface(){
	    @Override
        public void doWork(){
            System.out.println("Do work...");
        }
    });
	carryOutWork(()-> System.out.println("Do work in lambda..."));
    }
    public static void carryOutWork(SimpleFuncInterface sfi){
        sfi.doWork();
    }
}
