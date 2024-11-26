import java.util.*;

/***
*****Simple arithematic and statistics calculator****
*/

interface SimpleOperations
{
    add();
    sub();
    mul();
    div();
    get_number();
}

interface Info_Interface
{
    get_order();
    maxNum();
    minNum();
    meanAvg();
    median();
    mode();
    get_other();  
}

class Arithematic implements SimpleOperations// class of Arithematic operations
{
    double result =0;
    Scanner ip = new Scanner(System.in);
   
public void get_number() // This method is called initially to get first number
    {
       double no =0;
        System.out.print("Enter number: ");
        try {
             no = ip.nextDouble();
        } catch (InputMismatchException t) {
            // To handle Input Mismatch Exception
            System.out.println("Please Enter correct number");
            try {
                 no = ip.nextDouble();
            } catch (InputMismatchException g) {
                // To handle Input Mismatch Exception
                System.out.println("Please Enter correct number");
                
            } 
        }
        this.result +=no; 

        System.out.println("Enter operator: ( + : - : x : / : = )"); // operator selection list
        char operator = ip.next().charAt(0);

        switch(operator) // operator selection 
        {
            case '+': // addition
                {
                    add(this.result);
                } break; 
            case '-': // Subtraction
                {
                        sub(this.result);
                } break;
            case 'x': // Multiplication
                {
                        mul(this.result);
                } break;
            case '/': // Division
                {
                        div(this.result);
                } break;
            case '=': // Equal to get final result
                {
                    System.out.println(this.result);
                    System.out.println("Press Enter to go Back");

                   // ip.nextLine();
                   // String j = ip.nextLine();
                } break;
            default :
                    System.out.println("Invalid Choice");
                    System.out.println(this.result);
        }

    }

    public void add(double resultbef) 
    {
       double no = 0;
        System.out.print("Enter number: ");
        try {
             no = ip.nextDouble();
        } catch (InputMismatchException t) {
            // To handle Input Mismatch Exception
            System.out.println("There is problem with your input");
            System.out.println("Select (+) again and Enter number correctly");
           no = 0;
           String e = ip.next();
        }
        
        
        this.result = no+resultbef;

        System.out.println("Enter operator: ( + : - : x : / : = )"); // operator selection list
        char operator = ip.next().charAt(0);

        switch(operator) // operator selection 
        {
            case '+': // addition
                {
                    add(this.result);
                } break; 
            case '-': // Subtraction
                {
                        sub(this.result);
                } break;
            case 'x': // Multiplication
                {
                        mul(this.result);
                } break;
            case '/': // Division
                {
                        div(this.result);
                } break;
            case '=': // Equal to get final result
                {
                    System.out.println(this.result);
                   // ip.nextLine();
                } break;
            default :
                    System.out.println("Invalid Choice");
                    System.out.println(this.result);
        }


    }

    public void sub(double resultbef) 
    {
        double no =0;
        System.out.print("Enter number: ");
        try {
             no = ip.nextDouble();
             } 
        catch (InputMismatchException t)
         {
            // To handle Input Mismatch Exception
            System.out.println("There is problem with your input");
            System.out.println("Select (-) again and Enter number correctly");
             no = 0; 
             String e = ip.next();
            } 
        
        this.result = resultbef - no;

        System.out.println("Enter operator: ( + : - : x : / : = )"); // operator selection list
        char operator = ip.next().charAt(0);

        switch(operator) // operator selection 
        {
            case '+': // addition
                {
                    add(this.result);
                } break; 
            case '-': // Subtraction
                {
                        sub(this.result);
                } break;
            case 'x': // Multiplication
                {
                        mul(this.result);
                } break;
            case '/': // Division
                {
                        div(this.result);
                } break;
            case '=': // Equal to get final result
                {
                    System.out.println(this.result);
                } break;
            default :
                    System.out.println("Invalid Choice");
                    System.out.println(this.result);
        }


    }

   public void mul(double resultbef) 
    {
        double no =0;
        System.out.print("Enter number: ");
        try {
            no = ip.nextDouble();
        } 
        catch (InputMismatchException t) 
        {
            // To handle Input Mismatch Exception
            System.out.println("There is problem with your input");
            System.out.println("Select (x) again and Enter number correctly");
            no = 1; // assigning 1 to retain record 

        } 
            String e = ip.next();       
        this.result = resultbef * no;

        System.out.println("Enter operator: ( + : - : x : / : = )"); // operator selection list
        char operator = ip.next().charAt(0);

        switch(operator) // operator selection 
        {
            case '+': // addition
                {
                    add(this.result);
                } break; 
            case '-': // Subtraction
                {
                        sub(this.result);
                } break;
            case 'x': // Multiplication
                {
                        mul(this.result);
                } break;
            case '/': // Division
                {
                        div(this.result);
                } break;
            case '=': // Equal to get final result
                {
                    System.out.println(this.result);
                } break;
            default :
                    System.out.println("Invalid Choice");
        }

    }

    public void div(double resultbef) 
    {
        double no = 0;
        System.out.print("Enter number: ");
        try {
             no = ip.nextDouble();
             }
         catch (InputMismatchException t)
          {
            // To handle Input Mismatch Exception
            System.out.println("There is problem with your input");
            System.out.println("Select (/) again and input number correctly");
            no = 1; // to retain result
          }
         catch (ArithmeticException m)
            {
                // To handle Arithematic Exception
            System.out.println("Please enter number other than zero");
            System.out.println("Otherwise, result is infinity or undefined");
            System.out.println("Select (/) again and input number correctly");
            no =1; // to retain
            } 
       
        this.result = resultbef / no;

        System.out.println("Enter operator: ( + : - : x : / : = )"); // operator selection list
        char operator = ip.next().charAt(0);

        switch(operator) // operator selection 
        {
            case '+': // addition
                {
                    add(this.result);
                } break; 
            case '-': // Subtraction
                {
                        sub(this.result);
                } break;
            case 'x': // Multiplication
                {
                        mul(this.result);
                } break;
            case '/': // Division
                {
                        div(this.result);
                } break;
            case '=': // Equal to get final result
                {
                    System.out.println(this.result);
                } break;
            default :
                    System.out.println("Invalid Choice");
                    System.out.println(this.result);
        }
ip.close();
    }
    
}

class Info_Handling implements Info_Interface// Information Handling
{
    double arr[];
    int size;
    //arr[] = new double[size];
    Scanner ip = new Scanner(System.in);
    InnerInfo info = new InnerInfo();
   /**
 * 
 */
public void get_order() // user operation selection method
   {
        System.out.println("Press :\n1. To sort elements  ");
        System.out.println("2. To find Maximum  ");
        System.out.println("3. To find Minimum  ");
        System.out.println("4. To find Average/Arithematic Mean  ");
        System.out.println("5. To find Median");
        System.out.println("6. To find Mode");
        System.out.println("7. To go back to main menu");
        System.out.println("0. To Exit");
       // System.out.println("6. To find Standard Deviation  ");
       // System.out.println("7. To find Variance  ");

        int t = ip.nextInt(); // User operation selection

        switch (t) 
        {
            case 1:
            {
                System.out.println("How many numbers you want to sort: ");
                size = ip.nextInt();
                arr = new double[size];
            
                for(int m=0;m<arr.length;m++)
                {
                    System.out.print("Enter number "+(m+1)+" : ");
                     arr[m] = ip.nextDouble();
                }

                Arrays.parallelSort(arr);

                System.out.println("1. Ascending Order\n2.Descending Order");
                int j = ip.nextInt(); // selecting order
                switch (j) 
                {
                    case 1:
                    {
                     for(int m=0;m<arr.length;m++)
                     {
                        System.out.print(arr[m]+"\t ");
                     }
                     info.provideMenu(arr,j);
                    }break;
                    case 2:
                    {
                     for(int m=(arr.length-1);m>=0;m--)
                      {
                       System.out.print(arr[m]+"\t ");
                     }
                     info.provideMenu();
                    }break;
                
                    default:
                    {
                            System.out.println("Please Enter number 1 or 2");
                            System.out.println("1. Ascending Order\n2.Descending Order");
                             int k = ip.nextInt(); // selecting order
                                switch (k)
                                {
                                  case 1:
                                    {
                                        for(int m=0;m<arr.length;m++)
                                           {
                                               System.out.print(arr[m]+"\t ");
                                                  arr[m] = ip.nextDouble();
                                            }
                                            info.provideMenu();
                                    }break;
                                 case 2:
                                 {
                                         for(int m=(arr.length-1);m>=0;m--)
                                           {
                                               System.out.print(arr[m]+"\t ");
                                                  arr[m] = ip.nextDouble();
                                             }
                                             info.provideMenu();
                                 }break;
                
                                 default:
                                 {
                                     System.out.println("Making wrong input again has reloaded Information Handling");
                                      get_order();
                                }

                                }break;
                            }    
                }

                

                
            }
                
                break;
            case 2:
            {
                System.out.println("How many numbers you want to enter, to find maximum number from those: ");
                size = ip.nextInt();
                arr = new double[size];
            
                for(int m=0;m<arr.length;m++)
                {
                    System.out.print("Enter number "+(m+1)+" : ");
                     arr[m] = ip.nextDouble();
                }
                Arrays.parallelSort(arr);
                System.out.println(maxNum(arr)); 
                info.provideMenu();
            }break;
            case 3:
            {
                System.out.println("How many numbers you want to enter, to find minimum number from those: ");
                size = ip.nextInt();
                arr = new double[size];
            
                for(int m=0;m<arr.length;m++)
                {
                    System.out.print("Enter number "+(m+1)+" : ");
                     arr[m] = ip.nextDouble();
                }
                Arrays.sort(arr);
                System.out.println("From Above numbers, "+minNum(arr)+" is minimum"); 
                info.provideMenu(arr);
            }break;
            case 4:
            {
                System.out.println("How many numbers you want to enter, of those you want to find average/arithematic mean: ");
                size = ip.nextInt();
                arr = new double[size];
            
                for(int m=0;m<arr.length;m++)
                {
                    System.out.print("Enter number "+(m+1)+" : ");
                     arr[m] = ip.nextDouble();
                }
                Arrays.parallelSort(arr);
                System.out.println(meanAvg(arr)); 
                info.provideMenu();
            }
                
                break;
            case 5:
            {
                System.out.println("How many numbers you want to enter, of those you want to find median mean: ");
                size = ip.nextInt();
                arr = new double[size];
            
                for(int m=0;m<arr.length;m++)
                {
                    System.out.print("Enter number "+(m+1)+" : ");
                     arr[m] = ip.nextDouble();
                }
                Arrays.parallelSort(arr);
                System.out.println(meanAvg(arr)); 
                info.provideMenu();
            }
                
                break;
             case 6:
             {
                System.out.println("How many numbers you want to enter, those of those you want to find average/arithematic mean: ");
                size = ip.nextInt();
                arr = new double[size];
            
                for(int m=0;m<arr.length;m++)
                {
                    System.out.print("Enter number "+(m+1)+" : ");
                     arr[m] = ip.nextDouble();
                }
                Arrays.parallelSort(arr);
                System.out.println(Mode(arr)); 
                info.provideMenu();
             }break;
            case 7:
                {

                }break;
            case 0:
                {
                    System.exit(0);
                }break;
             default:
            {
                System.out.println("Please select from the following:");
                get_order();
            }
                break;
        }
        ip.close();
   }
    // Sorting method for numbers only
//     double [] numSorter(double arr[] )
//    { 
//     for(int t=0;t<arr.length;t++)
//      for(int m=1;m<arr.length;m++)
//         {
//           if(arr[t]<arr[m])
//             {
//                 double temp = arr[t];
//                 arr[t] = arr[m];
//                 arr[m] = temp;

//             }
//         }
//             return arr;
//    }

//   void ascending(double arr[]) // array and size of array as parameter
//   {
//         for(int t=0;t<arr.length;t++)
//         {
//                 System.out.print(arr[t]);
//         }
//   }

  public double maxNum(double arr[])
  {
        return arr[arr.length-1];
  }

public double minNum(double arr[])
  {
        return arr[0];
  }

public  double meanAvg(double arr[])
  {
    double befAvg =0; // variable to sum all numbers in array for average
    for(int t=0;t<aar.length;t++)
    {
           befAvg = befAvg+arr[t];
    }
    return befAvg;
  }

 public double median(double[] arr)
  {
    Arrays.sort(arr);
    int t,m;
        if (arr.length%2 != 0) 
        {
             m = (arr.length-1)/2;
             return arr[m];
        }
        else
        {
            t = (arr.length/2);
            m = (arr.length-2/2);
            return (arr[m])+(arr[t]);
        }
    }

  public double Mode(double[] arr) 
    {
    Arrays.sort(numbers); // sort the array

    double mode = arr[0];
    int count = 1;
    int maxCount = 1;

    // loop through the sorted array, keeping track of the current number and its count
    for (int t = 1; t < numbers.length; t++) {
      if (arr[t] == arr[t-1]) {
        count++;
      } else {
        if (count > maxCount) {
          maxCount = count;
          mode = arr[t-1];
        }
        count = 1;
      }
    }

    // check if the last number in the array is the mode
    if (count > maxCount) {
      mode = arr[arr.length-1];
    }

    return mode;
  }

 public void getOther(double [] arr, int decite)
  {
        if(decite==2)
         System.out.println("Press :\n1. Ascending Order  ");
        if(decite==1)
         System.out.println("Press :\n1. Desscending Order  ");
        System.out.println("2. To find Maximum  ");
        System.out.println("3. To find Minimum  ");
        System.out.println("4. To find Average/Arithematic Mean  ");
        System.out.println("5. To find Median");
        System.out.println("6. To find Mode");
        System.out.println("7. To go back to main menu");
        System.out.println("0. To Exit");
       // System.out.println("6. To find Standard Deviation  ");
       // System.out.println("7. To find Variance  ");

        int t = ip.nextInt(); // User operation selection

        switch (t) 
        {
            case 1:
            {
                System.out.println("How many numbers you want to sort: ");
                size = ip.nextInt();
                arr = new double[size];
            
                for(int m=0;m<arr.length;m++)
                {
                    System.out.print("Enter number "+(m+1)+" : ");
                     arr[m] = ip.nextDouble();
                }

                Arrays.parallelSort(arr);

                System.out.println("1. Ascending Order\n2.Descending Order");
                int j = ip.nextInt(); // selecting order
                switch (j) 
                {
                    case 1:
                    {
                     for(int m=0;m<arr.length;m++)
                     {
                        System.out.print(arr[m]+"\t ");
                     }
                     info.provideMenu();
                    }break;
                    case 2:
                    {
                     for(int m=(arr.length-1);m>=0;m--)
                      {
                       System.out.print(arr[m]+"\t ");
                     }
                     info.provideMenu();
                    }break;
                
                    default:
                    {
                            System.out.println("Please Enter number 1 or 2");
                            System.out.println("1. Ascending Order\n2.Descending Order");
                             int k = ip.nextInt(); // selecting order
                                switch (k)
                                {
                                  case 1:
                                    {
                                        for(int m=0;m<arr.length;m++)
                                           {
                                               System.out.print(arr[m]+"\t ");
                                                  arr[m] = ip.nextDouble();
                                            }
                                            info.provideMenu();
                                    }break;
                                 case 2:
                                 {
                                         for(int m=(arr.length-1);m>=0;m--)
                                           {
                                               System.out.print(arr[m]+"\t ");
                                                  arr[m] = ip.nextDouble();
                                             }
                                             info.provideMenu();
                                 }break;
                
                                 default:
                                 {
                                     System.out.println("Making wrong input again has reloaded Information Handling");
                                      get_order();
                                }

                                }break;
                            }    
                }

                

                
            }
                
                break;
            case 2:
            {
                System.out.println("How many numbers you want to enter, to find maximum number from those: ");
                size = ip.nextInt();
                arr = new double[size];
            
                for(int m=0;m<arr.length;m++)
                {
                    System.out.print("Enter number "+(m+1)+" : ");
                     arr[m] = ip.nextDouble();
                }
                Arrays.parallelSort(arr);
                System.out.println(maxNum(arr)); 
                info.provideMenu();
            }break;
            case 3:
            {
                System.out.println("How many numbers you want to enter, to find minimum number from those: ");
                size = ip.nextInt();
                arr = new double[size];
            
                for(int m=0;m<arr.length;m++)
                {
                    System.out.print("Enter number "+(m+1)+" : ");
                     arr[m] = ip.nextDouble();
                }
                Arrays.parallelSort(arr);
                System.out.println(minNum(arr)); 
                info.provideMenu();
            }break;
            case 4:
            {
                System.out.println("How many numbers you want to enter, of those you want to find average/arithematic mean: ");
                size = ip.nextInt();
                arr = new double[size];
            
                for(int m=0;m<arr.length;m++)
                {
                    System.out.print("Enter number "+(m+1)+" : ");
                     arr[m] = ip.nextDouble();
                }
                Arrays.parallelSort(arr);
                System.out.println(meanAvg(arr)); 
                info.provideMenu();
            }
                
                break;
            case 5:
            {
                System.out.println("How many numbers you want to enter, of those you want to find median mean: ");
                size = ip.nextInt();
                arr = new double[size];
            
                for(int m=0;m<arr.length;m++)
                {
                    System.out.print("Enter number "+(m+1)+" : ");
                     arr[m] = ip.nextDouble();
                }
                Arrays.parallelSort(arr);
                System.out.println(meanAvg(arr)); 
                info.provideMenu();
            }
                
                break;
             case 6:
             {
                System.out.println("How many numbers you want to enter, those of those you want to find average/arithematic mean: ");
                size = ip.nextInt();
                arr = new double[size];
            
                for(int m=0;m<arr.length;m++)
                {
                    System.out.print("Enter number "+(m+1)+" : ");
                     arr[m] = ip.nextDouble();
                }
                Arrays.parallelSort(arr);
                System.out.println(Mode(arr)); 
                info.provideMenu();
             }break;
            case 7:
                {
                        get_order();
                }break;
            case 0:
                {
                    System.exit(0);
                }break;
             default:
            {
                System.out.println("Please select from the following:");
                get_order();
            }
                break;
        }
        ip.close();
  }

  /**
   * InnerMain
   */
  public class InnerInfo
  {
    void provideMenu(double[] arr,int n)
    {
        System.out.println("\n\n\n1. To perform Other operations on this Array");
                    System.out.println("2. To go back to Information Handling"); 
                    System.out.println("3. Main Menu");
                    System.out.println("0. Exit App ");
                    System.out.println("Wrong input will reload Information Handling");
                    
                     int s = ip.nextInt();

                     switch (s) 
                     {
                        case 1:
                        {
                            getOther(arr,n);
                        }break;

                        case 2:
                         {
                                get_order();
                         }break;

                        case 3:
                         {

                         }break;
                        case 0:
                         {
                                System.exit(0);
                         }break;
                            
                        default:
                                get_order();
                            break;
                     }
                     ip.close();
    }

  
    
  }
  

}

class UnitConverter
{

    Scanner ip = new Scanner(System.in);

    void farniteToC ()
    {   
        System.out.println("Please Enter the Fahrenheit value to convert it in Celcuis");
        double Fahrenheit=ip.nextDouble();
        double Celsius = (Fahrenheit - 32) / 1.8 ;

        
    System.out.println(Fahrenheit+" Fahrenheit is equal to  "+Celsius);
    }
}
class Main
{
    public static void main(String[] Taskeen)
     {
        Scanner ip = new Scanner(System.in);
        Arithematic operation = new Arithematic();
        Info_Handling info = new Info_Handling();

        // for(int i =0;i<200;i++)
        // {
        //    if(i==100)
        //    {
        //         System.out.println();
        //    } 
        //    System.out.print("*");

        // }
        // System.out.println();
        // System.out.println("All in One Calculations");

        // for(int i =0;i<50;i++)
        // {
        //    if(i==26)
        //    {
        //         System.out.println();
        //    } 
        //    System.out.print("*");

        // }
       

        System.out.println("Select related subject:");
        System.out.println("Press: ");
        System.out.println("1. For Arithematic Operations ");
        System.out.println("2. For Information Handling ");

        int subject = ip.nextInt();

        switch (subject)
         {
            case 1:
            {
                operation.get_number();
            }break;
            case 2:
            {
                info.get_order();
            }break;
       /*   case 3:
            {

            }break;
            case :
            {

            }break;
        */
            default:
                break;
        }
        
     }
}
