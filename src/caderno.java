public class caderno {
    void main(){
        int e;
        int[]impares ={3,6,9,10};
        for (int i = 0; i < impares.length;i++){
            e = (impares[i]);
            if(e % 2 == 1){
                IO.println(e);
            }
        }
    }
}
