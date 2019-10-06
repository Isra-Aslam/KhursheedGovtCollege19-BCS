public class WD extends Graphics
{
    String [] Web={"HTML","CSS","Wordpress"};
    String [] Dev={"Joomla"};

    void Web ()
    {
        for(int i=0; i<Web.length;i++)
        {
            System.out.println("\t"+Web[i]);
        }

    }
    void Dev ()
    {
        for(int i=0; i<Dev.length;i++)
        {
            System.out.println("\t"+Dev[i]);
        }

    }

}
