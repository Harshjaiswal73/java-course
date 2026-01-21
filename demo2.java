public class demo2 {
    public static void main(String[]args)
    {
          int a = 10;  // 4 bytes
          long b = a;  // 8 bytes
          float c = a; // 4 bytes

          double doubleValue = 123.456;
          float floatValue = (float) doubleValue; // Narrowing conversion from double to float
          long longValue = (long) floatValue;// Narrowing conversion from float to long
          int intValue = (int) longValue; // Narrowing conversion from long to int

          System.out.println(a);
          System.out.println(b);
          System.out.println(c);


          float f =1.7f;
          int g = (int) f; // widening conversion or automatic conversion from float to int
          System.out.println(g);

          byte byteValue = 10; // 1 byte
          short shortValue = byteValue; //2 bytes
          //int intValue = shortValue; // 4 bytes
          //long longValue = intValue; //8 bytes
          //float floatValue = longValue; //4 bytes
          //double doubleValue = floatValue; // 8 bytes

          System.out.println("int" + intValue);
          System.out.println("long" + longValue);
          System.out.println("float" + floatValue);
          System.out.println("double" + doubleValue);

    }
}