package oops;
class Team{
    String name;
    int players;
    int wins;
    Team(String n,int p,int w){
        name=n;
        players=p;
        wins=w;
        System.out.println("name:"+name+" players:"+players+" wins"+wins);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Team t1=new Team("mumbai indians",11,6);
    }
}
