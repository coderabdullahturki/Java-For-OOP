package VariablesAndDataType;

/**
 * @author Turky
 */

public class Variables {
    public static void main(String[] args) {
        // These are the Primitive data types
        
        // Integer Types
        
        // Byte data type can store numbers from -128 to 127
        byte myByteNum = 127;
        System.out.println("Byte num is "+ myByteNum);
        
        // Short data type can store numbers from -32,768 to 32,767
        short myShortNum = 32767;
        System.out.println("Short num is "+ myShortNum);
        
        // Int data type can store numbers from -2,147,483,648 to 2,147,483,647
        int myIntNum = 1000000;
        System.out.println("Int num is "+ myIntNum);
                
        // Long data type can store numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long myLongNum = 3720000000000L;
        System.out.println("Long num is "+ myLongNum);
        
        
        // Floating Point Types
        
        // Float can store fractional numbers from 3.4e−038 to 3.4e+038
        float myFloatNum = 34.9999f;
        System.out.println("Float num is "+myFloatNum);
        
        // Double can store fractional numbers from 1.7e−308 to 1.7e+308
        double myDoubleNum = 4.9765999d;
        System.out.println("Double num is "+myDoubleNum);
        
        
        // Boolean Data Types
        
        // Boolean data types can take two valus: "true" and "false"
        boolean birdsCanFly = true;
        boolean fishCanFly = false;
        
        System.out.println("Birds can fly : "+birdsCanFly);
        System.out.println("Fishes can fly : "+fishCanFly);
        
        // Character Data Types
        
        char classSection = 'A';// char must be surrounded by single quotes
        System.out.println("My class section is "+classSection);
        
        // String Data Types
        
        String someWords = "Java is Fun";// strings must be surrounded by double quotes
        System.out.println(someWords);
        
    }
}
