import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner leitor=new Scanner(System.in);
    int vetor[] = new int[5];
    for(int i=0;i<=4;i++){
      System.out.println("Digite um valor");
      vetor[i]=leitor.nextInt();
    } 
  }
}