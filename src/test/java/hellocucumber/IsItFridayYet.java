package hellocucumber;

public class IsItFridayYet {
    static String isItFriday(String today) {
        if (today.equals("Friday"))
            return "Yes";
        else
            return "Nope";
    }
}
