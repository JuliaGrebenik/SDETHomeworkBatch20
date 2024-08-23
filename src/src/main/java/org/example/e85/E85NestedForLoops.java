package src.main.java.org.example.e85;

public class E85NestedForLoops {
    public static void main(String[] args) {
        int n=7;
        for(int i=1; i<=n; i++){
            for(int c=1; c<=i; c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            for(int c=1; c<=i; c++){
                System.out.print(c+" ");
            }
            System.out.println();
        }

    }
}
