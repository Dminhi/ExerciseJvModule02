package baitap00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountingWord {
    public static void main(String[] args) {
        String string = "Amidst the immense mountains and forests of Lam Dong province," +
                " Dalat, a beautiful town, captivates all those who have been there once." +
                " I am one of those. Dalat is often called the City of Eternal Spring." +
                " Flowers of all colors, with many species, the most numerous of which are orchids." +
                " More than anywhere else in Viet- nam, Dalat sees flowers vie with one another in blos soming in spring." +
                " I used to get up early in the morn- ing on fine days to welcome dawn on the highlands." +
                " Opening the windows, I had a breath-taking view of nature, and enjoyed the fragrance of wild flowers car- ried by the clouds," +
                " I felt relieved in my heart. In the late afternoons," +
                " I often reserved for visits to the Valley of Love and Sigh Lake covered with quiet pine forests." +
                " Twilight on Dalat also brought many pictures and sen- sations." +
                " The wind rustling through the pine forests, the roar of waterfalls," +
                " the chirping of birds and the clatter of horse ‘s hooves….all of these unforgettable memories always remain with me.";
//        ArrayList<String> arrayList = new ArrayList<>();
        int Counting = 0;
       String [] strings = string.split("\s");
       ArrayList<String>arrayList = new ArrayList<>();
       Collections.addAll(arrayList,strings);
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).toLowerCase().contains("the")){
                Counting++;
            }
        }
        System.out.println(Counting);
    }
}
