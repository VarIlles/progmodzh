public class PositionChanges extends Team {

    public void promote(String oldPosition, String newPosition){
        int index = super.teamPosition.indexOf(oldPosition);
        System.out.println(index);
        super.teamPosition.remove(index);
        super.teamPosition.add(index, newPosition);
        System.out.println("Promoted from   " + oldPosition + "   to:   " + teamPosition.get(index));
    }


}
