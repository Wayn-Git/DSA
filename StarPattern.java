// Right angle Traingle

// public class StarPattern {
//     public static void main(String[] args){
//         for(int i = 0; i < 6; i++ ){
//             for(int j = 0; j < i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// } 


// Inverted Traingle 


public class StarPattern {
    public static void main(String[] args){
        for(int i = 5; i > 0; i++ ){
            for(int j = 5; j > i; j--)
                System.out.print("*");
            }
            System.out.println();
        }
    }
