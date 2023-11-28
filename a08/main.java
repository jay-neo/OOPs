import java.util.Scanner; 
class Sorting { 
    int n;
    int arr[];;
    Scanner sc = new Scanner(System.in);
    void put(){
        System.out.print("Enter the number of elements : "); 
        n = sc.nextInt(); 
        arr = new int[n];
        System.out.println("Enter " + n + " elements : " ); 
        for(int i=0; i<n; ++i)  arr[i] = sc.nextInt(); 
    } 
    void get(){ 
        System.out.print("Current elements are : "); 
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" "); 
        }
        System.out.println();
    }
    void bubble_sort(){ 
        for(int i = 0; i<n-1; i++) { 
            for(int j=0; j<n-i-1; j++){ 
                if(arr[j] > arr[j+1]){ 
                    int t = arr[j]; 
                    arr[j]= arr[j+1]; 
                    arr[j+1] = t; 
                } 
                 
            } 
        }
    }
    void insertion_sort(){ 
        for(int i=1; i<n; i++) { 
            int t = arr[i]; 
            int j = i-1; 
            while(j>=0 && arr[j]>t){ 
                arr[j+1] = arr[j]; 
                j--; 
            } 
            arr[j=1] = t; 
        } 
    } 
     
} 
class Main { 
    public static void main(String[] args) { 
        Sorting s1 = new Sorting(); 
        s1.put(); 
        s1.bubble_sort(); 
        System.out.println("Using bubble sort : "); 
        s1.get();
        Sorting s2 = new Sorting(); 
        s2.put(); 
        s2.insertion_sort(); 
        System.out.println("Using insertion sort : "); 
        s2.get(); 

 

    } 
} 