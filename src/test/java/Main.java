public class Main {
    public static void main(String[] args) {



        //Matrix test

        int[][] matrix = {
                {-27, 0,  -22, -21, 0},
                {-24, 0, -100, -94, 0},
                { 15, 0,   69, -38, 0},
                {-56, 0,    3, -68, 0},
                { 30, 0,  -92,  50, 0}};

        Matrix matrix1 = new Matrix();

        System.out.println("numberOfNonZeroValues:  " + matrix1.numberOfNonZeroValues(matrix));
        System.out.println("indexOfColumnsWithSameValues:  " + matrix1.indexOfColumnsWithSameValues(matrix));

        //Team test

        Team a = new Team();
        a.newMember("Ferenc", "Főnök");
        a.newMember("Péter", "Zsonglőr");
        a.newMember("Tibor", "Titkár");

        a.getMembers();

        a.leaveTeam("Péter");

        a.getMembers();

        //PositionChanges test


        PositionChanges b = new PositionChanges();
        b.newMember("Ferenc", "Főnök");
        b.newMember("Péter", "Zsonglőr");
        b.newMember("Tibor", "Titkár");
        b.promote("Főnök", "Főnők++");


    }
}
