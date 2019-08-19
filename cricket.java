class cricket
{
   String name;
    String team;
    int age;
    
    cricket()
    {
        name="";
        team="";
        age=0;
    }
    cricket(String name,String team,int age)
    {
        this.name=name;
        this.team=team;
        this.age=age;
    }
    
    public String toString()
    {
        return "this is "+name+"of "+team;
    }
}
class test
{
    public static void main(String args[])
    {
        cricket c1=new cricket();
        cricket c2=new cricket("kholi","india",32);
        System.out.println(c2);
        System.out.println(c1);
    }
}