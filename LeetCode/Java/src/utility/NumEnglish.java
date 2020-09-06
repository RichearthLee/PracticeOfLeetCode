package utility;

public enum NumEnglish {
    twenty(20), thirty(30), forty(40), fifty(50), sixty(60), seventy(70), eighty(80), ninety(90),
    eleven(11), twelve(12), thirteen(13), fourteen(14), fifteen(15), sixteen(16), seventeen(17), eighteen(18), nineteen(19),
    one(1),two(2), three(3), four(4), five(5), six(6), seven(7), eight(8), nine(9), ten(10);

    private int num;

    NumEnglish(int num){
        this.num = num;
    }

    public static String getEnglish(int num){
        for (NumEnglish node : NumEnglish.values()) {
            if (node.num == num){
                return node.name();
            }
        }
        return "";
    }

}