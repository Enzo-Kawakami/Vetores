public class Ex2 {
    void main(){
            int e;
            int num = 0;
            int num2 = 99;
            int[] numeros = {1,2,5,9,4,6};
            for (int i = 0; i <= 5; i++) {

                // i=0

                e = (numeros[i]);

                if(e > num){
                    num = e;
                }
                if (e < num2){
                    num2= e;
                }
            }
        IO.println(num);
        IO.println(num2);

        }
    }

