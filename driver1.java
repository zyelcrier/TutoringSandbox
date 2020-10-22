
//2-D arrays
public class driver1{
    public static void main (String [] args){
        String[][] crawfish = new String[4][2];
        populate2D(crawfish);
        System.out.println(crawfish);
        for(int r = 0; r < crawfish.length; r++){
            for(int c = 0; c < crawfish[r].length; c++){
                System.out.println(crawfish[r][c]);
            }
        }
        String [][] names = {{"Anijahia" ,"Irons"},{"Delisha" ,"Grimes"},{"Ashton", "Smith"}};
        boolean juice = findName(names, "Abryhia");
        System.out.println(juice);
    }//main
    public static boolean findName(String[][]names,String namesToSearch){
            for(int f = 0; f < names.length; f++){
                for(int l = 0; l < names[f].length; l++){
                    if(names[f][l].equals(namesToSearch)){
                        return true;
                    }
                }
            }
            return false;
    }
    public static void populate2D(String[][] crawfish){
            for(int r = 0; r < crawfish.length; r++){
                for(int c = 0; c < crawfish[r].length; c++){
                    crawfish[r][c] = "Names of crawfish" +"\nRow: "+ r + " Column: " +c;
               
                }
            }
    }
}//class
