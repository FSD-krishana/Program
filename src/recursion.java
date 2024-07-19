//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class recursion {
    int a=0;
    int b=1;


    void fun(int x){


        if(x==10)
            return;



        int num=a+b;



        System.out.print(num+" ");
        a=b;
        b=num;
        fun(x+1);

    }

    public static void main(String[] args) {

        recursion obj=new recursion();
        System.out.print(0+" ");
        System.out.print(1+" ");
        obj.fun(2);



     }
}
