import java.util.ArrayList;

public class Team {

    protected ArrayList<String> teamName = new ArrayList<>();
    protected ArrayList<String> teamPosition = new ArrayList<>();

    public void newMember(String name, String position) {
        this.teamName.add(name);
        this.teamPosition.add(position);
    }

    public void leaveTeam(String name) {
        int index = teamName.indexOf(name);
        teamName.remove(index);
        teamPosition.remove(index);
    }

    public void getMembers() {
        for (int i = 0; i < teamName.size(); i++) {
            System.out.println(teamName.get(i));
            System.out.println(teamPosition.get(i) + "\n");
        }
    }
}