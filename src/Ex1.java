public class Ex1 {
    void main() {
       int e;
        int[] numeros = {1,3,2,6,7,8,0};
        for (int i = 0; i <= 5; i++) {
           e = (numeros[i]);
            if(e % 2 == 0){
                IO.println(e);
            }
        }
    }
}