import java.util.Scanner;

class array{
    int a[]=new int[20],n,k,l;
void accept(){
    int i;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no. of elements:");
    n=sc.nextInt();
    System.out.println("Enter the array of elements:");
    for(i=0;i<n;i++)
    a[i]=sc.nextInt();
    System.out.println("Enter value of k:");
    k=sc.nextInt();
    System.out.println(("enter 1 for kth largest and 0 for kth smallest:"));
    l=sc.nextInt();
}
void find(){
    int i,j,t;
    for(i=0;i<n;i++){
        for(j=0;j<n-i-1;j++)
    {
        if(a[j]>a[j+1]){
            t=a[j];
            a[j]=a[j+1];
            a[j+1]=t;

        }
  
    }
}
System.out.println("the sorted list:");
for(i=0;i<n;i++)
System.out.println((a[i]+" "));
if(l==1){
    for(i=n;i>=n-k;i--);
    System.out.println("\nThe" +k+ "th larget element is: "+a[i+1]);
}
else{
    for(i=0;i<k;i++);
    System.out.println("\nThe" +k+ "th smallest element is: "+a[i+1]);

}
}
public static void main(String[] args){
    array k=new array();
    k.accept();
    k.find();

}
}