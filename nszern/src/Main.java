import java.util.Random;
public class Main {

    public static void main(String[] args){
            int[][]palya=new int[][]{
            {0,1,1,0,0,0,1,0,1,0},
            {1,0,0,1,0,1,0,1,0,1},
            {0,1,1,1,0,1,0,1,0,1},
            {1,1,1,1,0,0,1,0,1,1},
            {0,1,1,1,0,0,0,1,0,1},
            {1,0,1,1,1,0,0,1,0,1},
            {1,1,0,1,0,1,0,0,1,0},
            {0,1,1,0,1,0,1,0,0,1},
            {1,1,1,1,1,1,1,1,0,1},
            {1,0,0,0,0,0,0,0,0,0},
        };
            int A_koordinata_sor=1;
            int A_koordinata_oszlop=1;
            int B_koordinata_sor=6;
            int Bkoordinata_oszlop=6;
            if(palya[A_koordinata_sor][A_koordinata_oszlop]==1){
                System.out.println("Az A szám nem 0");
            }
            if(palya [B_koordinata_sor][Bkoordinata_oszlop]==1){
                System.out.println("Ne szívasd mán szegény programot");
            }
            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    if(palya[A_koordinata_sor+1][A_koordinata_oszlop+1]==){

                    }
                }
            }

    }
}
