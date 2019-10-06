import java.util.Scanner;
public class IEH_main
{


    public static void main (String[] args)
    {
        Scanner input=new Scanner(System.in);
        CIT cit =new CIT();
        DIT dit =new DIT();
        Graphics graphics =new Graphics();
        WD wd =new WD();
        while(true)
        {

            System.out.println("\t\tHi! Welcome to IEH Computer Center information program" +
                    "\n\t\there You can get any kind of info you want" +
                    "\n\t\t Just choose any option :\t " +
                    "\n\t\t1. CIT" +
                    "\n\t\t2. DIT" +
                    "\n\t\t3. Graphics" +
                    "\n\t\t4. Web Designing\t\t");

            int option=input.nextInt();
            switch (option)
            {
                case (1):{

                    System.out.print("Choose any option you want info about\n" +
                            "\n1. Courses info" +
                            "\n2. Batch info\n" );
                    int Option = input.nextInt();
                    switch (Option)
                    {
                        case 1:
                        {
                            System.out.println("\n1. MS OFFICE");
                            cit.Office();
                            System.out.println("\n2. GRAPHICS");
                            cit.Graphics();
                            System.out.println("\n3. PROGRAMMING");
                            cit.Pro();
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Timings : 4pm to 5pm\n 6pm to 7pm");
                            break;
                        }
                        default:
                        {
                            System.out.println("Not a valid Entry");
                            break;
                        }
                    }
                    break;
                }
                case (2):{
                    System.out.print("Choose any option you want info about\n" +
                            "\n1. Courses info" +
                            "\n2. Batch info\n" );
                    int Option = input.nextInt();
                    switch (Option)
                    {
                        case 1:
                        {
                            System.out.println("\n1. MS OFFICE");
                            dit.Office();
                            System.out.println("\n2. GRAPHICS");
                            dit.Graphics();
                            System.out.println("\n3. PROGRAMMING");
                            dit.Pro();
                            System.out.println("\n4. ADVANCED PROGRAMMING");
                            dit.ProAdv();
                            System.out.println("\n5. WEB DESIGNING");
                            dit.WD();
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Timings : 5pm to 6pm\n 6pm to 7pm");
                            break;
                        }
                        default:
                        {
                            System.out.println("Not a valid Entry");
                            break;
                        }
                    }
                    break;
                }
                case (3):{
                    System.out.print("Choose any option you want info about\n" +
                            "\n1. Courses info" +
                            "\n2. Batch info\n");
                    int Option = input.nextInt();
                    switch (Option)
                    {
                        case 1:
                        {
                            System.out.println("\n1. PRINTMEDIA");
                            graphics.Printmedia();
                            System.out.println("\n2. ANIMATION");
                            graphics.Animation();
                            System.out.println("\n3. LANGUAGE");
                            graphics.Lang();
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Timings : 5pm to 6pm\n 7pm to 8pm\n 8pm to 9pm");
                            break;
                        }
                        default:
                        {
                            System.out.println("Not a valid Entry");
                            break;
                        }
                    }
                    break;

                }
                case (4):{
                    System.out.print("Choose any option you want info about\n" +
                            "\n1. Courses info" +
                            "\n2. Batch info\n");
                    int Option = input.nextInt();
                    switch (Option)
                    {
                        case 1:
                        {
                            System.out.println("\n1. PRINTMEDIA");
                            wd.Printmedia();
                            System.out.println("\n2. ANIMATION");
                            wd.Animation();
                            System.out.println("\n3. Web Designing");
                            wd.Web();
                            System.out.println("\n4. Web Development");
                            wd.Dev();
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Timings : 3pm to 4pm\n 7pm to 8pm\n 9pm to 10pm");
                            break;
                        }
                        default:
                        {
                            System.out.println("Not a valid Entry");
                            break;
                        }
                    }
                    break;

                }
                default:{
                    System.out.println("Invalid Entry");
                    break;
                }
            }






    }

}}
