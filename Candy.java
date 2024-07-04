import java.util.*;
//There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
//
//        You are giving candies to these children subjected to the following requirements:
//
//        Each child must have at least one candy.
//        Children with a higher rating get more candies than their neighbors.
//        Return the minimum number of candies you need to have to distribute the candies to the children.
public class Candy {

        public int candy(int[] a) {

            int n=a.length;
            if(n==1) return 1;

            int  c[]=new int[n];
            ArrayList<Integer>minima=new ArrayList<>();


            if(a[0]<a[1]){
                minima.add(0);
            }
            if(a[n-1]<a[n-2]){
                minima.add(n-1);
            }

            for(int i=1;i<n-1;i++){
                if(a[i-1]>=a[i]&&a[i]<a[i+1]){
                    minima.add(i);
                }
                else if(a[i-1]>a[i]&&a[i]<=a[i+1]){
                    minima.add(i);
                }
            }

            int size=minima.size();

            for(int i=0;i<size;i++){

                int index=minima.get(i);
                c[index]=1;


                while(index>0&&a[index]<a[index-1]){
                    c[index-1]=Math.max(c[index]+1,c[index-1]);
                    index--;
                }


                index=minima.get(i);

                while(index<n-1&&a[index]<a[index+1]){
                    c[index+1]=Math.max(c[index]+1,c[index+1]);
                    index++;
                }

            }

            int sum=0;
            for(int i=0;i<n;i++){
                if(c[i]==0){
                    sum+=1;

                }
                else sum+=c[i];
            }
            System.out.println(Arrays.toString(c));

            return sum;


        }

}
