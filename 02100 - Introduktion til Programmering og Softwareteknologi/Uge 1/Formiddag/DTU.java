/* 
Opgave 6
*/

public class DTU {
    public static void main(String[] args) {
        HovedSætning64(); //Husk at ændre nummer
    }

      public static void HovedSætning1() {
      System.out.println("DTU - Det bli’r til noget");
      }

      public static void HovedSætning2() {
        HovedSætning1();
        HovedSætning1();
      }

      public static void HovedSætning4() {
        HovedSætning2();
        HovedSætning2();
      }

      public static void HovedSætning8() {
        HovedSætning4();
        HovedSætning4();
      }

      public static void HovedSætning16() {
        HovedSætning8();
        HovedSætning8();
      }

      public static void HovedSætning32() {
        HovedSætning16();
        HovedSætning16();
      }

      public static void HovedSætning64() {
        HovedSætning32();
        HovedSætning32();
      }
}