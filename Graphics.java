public class Graphics
{
String Printmedia[]={"Adobe Photoshop","Adobe Illustrator"};
String Animation[]={"Adobe Flash"};
String Lang[]={"Inpage Urdu"};

void Printmedia ()
{
    for(int i=0; i<Printmedia.length;i++)
    {
        System.out.println("\t"+Printmedia[i]);
    }

}
void Animation ()
    {
        for(int i=0; i<Animation.length;i++)
        {
            System.out.println("\t"+Animation[i]);
        }

    }
    void Lang ()
    {
        for(int i=0; i<Lang.length;i++)
        {
            System.out.println("\t"+Lang[i]);
        }

    }
}
