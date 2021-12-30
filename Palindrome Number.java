public class Pallimdrome {

    
    public static void main(String[] args) {
        int x= 121;
        boolean flag=true;
        String []str= new String[10];
        str=Integer.toString(x).split("(?!^)");
        int r=0;
        int l=str.length-1;
  
        for(int i=0; i <str.length; i++){
            if(str[r].equals(str[l])){
                
                flag=true;
                r++;
                l--;
            }
            else{
                flag=false;
            }
    }
        System.out.println(flag);
    }
}
