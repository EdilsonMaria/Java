class Calculadora {
   public static double somar(double a, double b) {
      return a + b;
   }

   public static double subtrair(double a, double b) {
      return a - b;
   }

   public static double multiplicar(double a, double b) {
      return a * b;
   }

   public static double dividir(double a, double b) {
      if (b == 0) {
         System.out.println("Erro: Divisão por zero.");
         return 0.0; // Retorna 0.0 em caso de divisão por zero
      }
      return a / b;
   }
}
