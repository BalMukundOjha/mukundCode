import java.util.HashSet;

public class Merge {
	
	// Prints union of arr1[0..m-1] and arr2[0..n-1] 
    static void printUnion(String arr1[], String arr2[]) 
    { 
        HashSet<String> hs = new HashSet<>(); 
          
        for (int i = 0; i < arr1.length; i++)  
            hs.add(arr1[i]);         
        for (int i = 0; i < arr2.length; i++)  
            hs.add(arr2[i]); 
        System.out.println(hs);         
    } 
    
    // Prints intersection of arr1[0..m-1] and arr2[0..n-1] 
    static void printIntersection(String arr1[], String arr2[]) 
    { 
        HashSet<String> hs = new HashSet<>(); 
        HashSet<String> hs1 = new HashSet<>(); 
          
        for (int i = 0; i < arr1.length; i++)  
            hs.add(arr1[i]); 
          
        for (int i = 0; i < arr2.length; i++)  
            if (hs.contains(arr2[i])) 
               System.out.print(arr2[i] + " "); 
    } 

	public static void main(String[] args) {
		

        String arr1[] = {"george", "jim", "Blakae", "Kevin", "michael"}; 
        String arr2[] = { }; 
  
        System.out.println("Union of two arrays is : "); 
        printUnion(arr1, arr2); 
          
        System.out.println("Intersection of two arrays is : "); 
        printIntersection(arr1, arr2); 
     
	}

}
