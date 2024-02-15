class LogicalOpExample
{
public static  void main(String []loe)               
{                                               
                                           
                   //  true    ||        true     ||      false     
System.out.println(true && true || true && true || true && false);//true

                  //    false    ||      true    ||        false
System.out.println(false && false || true && true || false && false);//true

                 //     false   ||       false   ||     true         
System.out.println(true && false || true && false || true && true);//true                  

System.out.println(false && false || false && false || true && false);//false

System.out.println(!true);//false
System.out.println(!false);//true

}


}