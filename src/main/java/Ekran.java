public class Ekran {
    
    public static void main(String[]args){
         
        System.out.print("!!!!");
        
        for(int i=1;i<5;i++){
            System.out.print(i + "!!!");
        }
        
        System.out.println();
        
        for(int i =1;i<6;i++){
            System.out.print("----");
        }
        
        System.out.println();
        
        for(int i = 1;i<6;i++){
            System.out.print(i + " > * * ");
            
            for(int j= 1; j<5;i++){
                if(j == 1){
                    System.out.println();
                }
            }
        }
    }
    
}
