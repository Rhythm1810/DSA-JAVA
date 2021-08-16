import java.util.Scanner;

//1/ Area of A circle
//public class BasicJavaProgram {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Inser Radius : ");
//         float radius = in.nextFloat();
//
//         double area = 3.17*radius*radius;
//        System.out.println("Area of the circle is : " + area);
//
//
//
//    }
//}
//****************************************************************************************************************************************

//2. Area of a triangle
//public class BasicJavaProgram {
//  public static void main(String[] args) {
//      Scanner in = new Scanner(System.in);
//      System.out.println("Enter the base :");
//      float base = in.nextFloat();
//
//      System.out.println("Enter height ");
//      float height = in.nextFloat();
//
//      double area = (base*height)/2;
//      System.out.println("Area of the Triangle is : " + area);
//
//
//  }
//
//  }

//********************************************************************************************************************************************
//  3 Area of Rectangle

//public class BasicJavaProgram {
//      public static void main(String[] args) {
//          Scanner in = new Scanner(System.in);
//          System.out.println("Enter length : ");
//          float l = in.nextByte();
//          System.out.println("Enter Breadth : ");
//          float b = in.nextByte();
//
//          double area = l*b;
//          System.out.println("Area of the Rectangle : "+ area);
//      }
//  }

//********************************************************************************************************************************************
 //  4 ) Area of Isoceles Triangle

// public class BasicJavaProgram {
// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
// System.out.println("Enter height: ");
// float h = in.nextByte();
// System.out.println("Enter base : ");
// float b = in.nextByte();
//
// double area = (h*b)/2
// System.out.println("Area of the Rectangle : "+ area);
// }
// }

//********************************************************************************************************************************************
//  5) Area of  Paralellogram

//public class BasicJavaProgram {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter height: ");
//        float h = in.nextByte();
//        System.out.println("Enter base : ");
//        float b = in.nextByte();
//
//        double area = (h*b);
//        System.out.println("Area of the Rectangle : "+ area);
//    }
//}
//********************************************************************************************************************************************
 //  6) Area of  Rhombus

// public class BasicJavaProgram {
// public static void main(String[] args) {
// Scanner in = new Scanner(System.in);
// System.out.println("Enter 1st Diaogonal : ");
// float firstd = in.nextByte();
// System.out.println("Enter 2nd Diagonal : ");
// float secondd = in.nextByte();
//
// double area = (firstd * secondd);
// System.out.println("Area of the Rectangle : "+ area);
// }
// }
//****************************************************************************************************************************************************

// 7) Area of  Equilateal Triangle

//public class BasicJavaProgram {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter side : ");
//        float s = in.nextByte();
//
//
//        double area = (0.433*s*s);
//        System.out.println("Area of the Rectangle : "+ area);
//    }
//}
//****************************************************************************************************************************************************
//8):20 Similar questions
//*****************************************************************************************************************************************************************
//21 :Fibonacci Series
//public class BasicJavaProgram {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int num1  = 0 ;
//        int num2 = 1;
//        int counter  = 0 ;
//        System.out.println("Enter the number till which you want to create Fibonnaci Series : ");
//        int n = in.nextInt();
//        while (counter< n)
//        {
//
//            System.out.println(num1 + " ");
//            int num3 = num1 + num2;
//            num1 = num2;
//            num2 = num3;
//            counter ++;
//        }
//
//
//
//    }
//}

/* *************************************************************************************************************************************************
                    INTERMEDIATE JAVA PROGRAMS
************************************************************************************************************************************/
//1 Factorial Program in Java
//public class BasicJavaProgram {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number of Which you want the factorial : ");
//        int num = in.nextInt();
//
//        int result = 1;
//
//        while(num >0)
//        {
//            result = result  * num ;
//            num--;
//
//        }
//        System.out.println("The Factorial of the Given num is : " + result);
//    }
//}


//*********************************************************************************************************************************
//**********************************************************************************************************************************************
//2. Calculate the Electric Bill
/*
*
* 1 to 100 units – Rs. 10/unit
100 to 200 units – Rs. 15/unit
200 to 300 units – Rs. 20/unit
above 300 units – Rs. 25/unit
* */

//public class BasicJavaProgram {
//    public static void main(String[] args) {
//    Scanner in  = new Scanner(System.in);
//        System.out.println("Enter Units of Consumption : ");
//        double units = in.nextDouble();
//        if (units <= 100)
//        {
//            System.out.println("Electricity bill is "+ units*100);
//        }
//        else if (units <= 200)
//        {
//            System.out.println("Electicity bill is : "+ ((100 * 10) +
//                    (units - 100) * 15));
//        }
//        else if (units <= 300)
//        {
//            System.out.println("Electicity bill is : "+((100 * 10) +
//                    (100 * 15) +
//                    (units - 200) * 20));
//        }
//        else if (units > 300)
//        {
//            System.out.println("Electicity bill is : "+((100 * 10) +
//                    (100 * 15) +
//                    (100 * 20) +
//                    (units - 300) * 25));
//        }
//
//
//    }
//}

/* **********************************************************************************************************************************************************************************
*****************************************************************************************************************************************************************
 */

//Calculate Average of N Numbers
//public class BasicJavaProgram {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter first number : ");
//        int n1 = in.nextInt();
//        System.out.println("Enter second number : ");
//        int n2 = in.nextInt();
//        System.out.println("Enter third number : ");
//        int n3 = in.nextInt();
//        System.out.println("Enter fourth number : ");
//        int n4 = in.nextInt();
//        System.out.println("Enter fifth number : ");
//        int n5 = in.nextInt();
//
//        double average = (n1+ n2 + n3 + n4 + n5)/5;
//        System.out.println("Average is : "+ average);
//
//
//    }
//}

/* **********************************************************************************************************************************************************************************
 *****************************************************************************************************************************************************************
 */
//Calculate Discount of a Product

//public class BasicJavaProgram {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the list Price : ");
//        float lp = in.nextFloat();
//        System.out.println("Enter the Discount Rate : ");
//        float dr = in.nextFloat();
//
//        double discount = (lp * dr)/100;
//        System.out.println("Discount is : "+ discount + "%");
//    }
//}








