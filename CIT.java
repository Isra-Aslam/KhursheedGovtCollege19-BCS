public class CIT
{
    String [] Office={"Introduction to MS Windows","MS Word","MS Excel","MS Powerpoint"};
    String [] Graphics={"Adobe Photoshop","Macromedia Freehand","Adobe Illustrator"};
    String [] Pro={"Visual Basic"};
    void Office()
    {
        for(int i=0;i<Office.length;i++)
        {
            System.out.println("\t"+Office[i]);
        }
    }
    void Graphics()
    {
        for(int i=0;i<Graphics.length;i++)
        {
            System.out.println("\t"+Graphics[i]);
        }
    }
    void Pro()
    {
        for(int i=0;i<Pro.length;i++)
        {
            System.out.println("\t"+Pro[i]);
        }
    }


}
