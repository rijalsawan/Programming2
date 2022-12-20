import java.util.ArrayList;
/**
 * A team comprises several players
 */
public class Team
{
    private String teamName;
    private ArrayList<Player> members;
    public Team(String name)
    {
        teamName = name;
        members = new ArrayList();
    }

    public void addPlayer(Player p)
    {
        members.add(p);
    }

    public void display(){
        System.out.println(teamName);
        for (Player p: members)
            System.out.println(p.getName()
                    +" \t"+ p.getJerseyNumber()
                    +" \t"+ p.getPosition());
    }
}
