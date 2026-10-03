class Factorial{
public static void main(String []args){
myMethod();
}
static void myMethod(){
int a=5;
int fact=1;
for (int i=1;i<=a;i++){
fact=fact*i;
System.out.println("Factorial="+fact);
}
}
}  