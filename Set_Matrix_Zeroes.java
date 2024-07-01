import java.util.*;
public class Set_Matrix_Zeroes {

        public void setZeroes(int[][] a) {


            Set<Integer>r=new HashSet<>();
            Set<Integer>c=new HashSet<>();
            int n=a.length;
            int m=a[0].length;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(a[i][j]==0){
                        r.add(i);
                        c.add(j);}
                }
            }

            for(int k:r){
                for(int i=0;i<m;i++) a[k][i]=0;
            }

            for(int k:c){
                for(int i=0;i<n;i++) a[i][k]=0;
            }


        }

}
