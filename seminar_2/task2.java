public class task2 {
   public static void main(String[] args) {
      //int[] intArray = new int[8];
      int[] intArray = {1, 2, 3, 45, -4, 0, 7, 11, 0};
    try {
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
     } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
     }
     catch(IndexOutOfBoundsException e){
      System.out.println("Массив выходит за пределы своего размера!");
     }
    }  
}
