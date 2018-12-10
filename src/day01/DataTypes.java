package day01;

public class DataTypes {
    public static void main(String[] args) {
        byte singleBite = 125;     //male cele cislo
        byte min = Byte.MIN_VALUE;
        byte max = Byte.MAX_VALUE;

        short shortMin = Short.MIN_VALUE;
        short shortMax = Short.MAX_VALUE;
        short numShort = 3454;        //male cele cisla

        int number = 19331;            //standardne pouzivane cele cisla
        int intMin = Integer.MIN_VALUE;
        int intMax = Integer.MAX_VALUE;

        long longNum = 1234567898;  //velke cele cisla
        long longMax = Long.MAX_VALUE;
        long longMin = Long.MIN_VALUE;

        float number32 =  3.14f;    //menej presne desatinne cisa
        float floatMin = Float.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;

        double number64 = 3.14159265359;    //presnejsie desatinne cisla, standardne pouzivane
        double doubleMin = Double.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;

        char c = 'A';       //samostatny znak

        String name = "Michal";             //retazec znakov
        String text = "Lorem Ipsum is" +
                " simply dummy text of the printing and typesetting" +
                " industry. Lorem Ipsum has been the industry's standard " +
                "dummy text ever since the 1500s, when an unknown printer " +
                "took a galley of type and scrambled it to make a type s" +
                "pecimen book. It has survived not only five centuries, " +
                "but also the leap into electronic typesetting, remaining " +
                "essentially unchanged. It was popularised in the 1960s with " +
                "the release of Letraset sheets containing Lorem Ipsum passages, " +
                "and more recently with desktop publishing software like Aldus PageMaker " +
                "including versions of Lorem Ipsum.";

        boolean state = true; // logicky "true" / "false"
    }
}
