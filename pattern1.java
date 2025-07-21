public class Shopping{
    public static void main(String[] args){
        int N= 7;
        int nsp = N/2; //number of spaces
        int nst = 1; //number of stars

        for(int i=1 ; i<=N ; i++){
            //printing spaces
            for(int j=1; j<=nsp; j++){
                System.out.print(" ");
                //printing stars
            } for(int k=1; k<=nst; k++){
                System.out.print("*");
            }
            System.out.println();

            //update nst and nst
            if(i<=N/2){
                nsp--;
                nst +=2;
            }else{
                nsp++;
                nst -=2;
            }
        }
    }
}
