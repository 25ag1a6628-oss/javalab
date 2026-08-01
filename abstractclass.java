
abstract class student{
abstract void details(); 
  {

  } 
}
class college extends student
{
void details()
{
    int age =19;
    String name="Deepak";
    String branch="CSM";
    String campus="ACE";
    float cgpa=8.0f;
    System.out.println("My age is:"+age);
    System.out.println("My name is:"+name);
    System.out.println("My branch is:"+branch);
    System.out.println("My campus is:"+campus);
    System.out.println("My cgpa is:"+cgpa);
 }
}
class abstractclass
{
    public static void main(String[] args)
    {
        college c=new college();
        c.details();
    }
}

