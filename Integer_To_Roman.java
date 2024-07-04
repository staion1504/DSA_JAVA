public class Integer_To_Roman {

        public String intToRoman(int num) {

            String ans="";
            String n=num+"";
            int size=n.length();

            for(int c=size;c>=1;c--){

                int dig=n.charAt(size-c)-48;
                if(dig==0) continue;

                if(c==1){
                    if(dig==4){
                        ans+="IV";
                    }
                    else if(dig==9){
                        ans+="IX";
                    }
                    else if(dig<5){
                        for(int i=0;i<dig;i++) ans+="I";

                    }
                    else if(dig>=5){
                        ans+="V";
                        for(int i=0;i<dig-5;i++) ans+="I";
                    }
                }
                else if(c==2){

                    if(dig==4){
                        ans+="XL";
                    }
                    else if(dig==9){
                        ans+="XC";
                    }
                    else if(dig<5){
                        for(int i=0;i<dig;i++) ans+="X";

                    }
                    else if(dig>=5){
                        ans+="L";
                        for(int i=0;i<dig-5;i++) ans+="X";
                    }

                }
                else if(c==3){

                    if(dig==4){
                        ans+="CD";
                    }
                    else if(dig==9){
                        ans+="CM";
                    }
                    else if(dig<5){
                        for(int i=0;i<dig;i++) ans+="C";

                    }
                    else if(dig>=5){
                        ans+="D";
                        for(int i=0;i<dig-5;i++) ans+="C";
                    }


                }
                else{


                    for(int i=0;i<dig;i++) ans+="M";



                }



            }



            return ans;


        }

}
