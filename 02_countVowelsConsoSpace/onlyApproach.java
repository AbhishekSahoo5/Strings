import java.util.ArrayList;

public class onlyApproach {

    public static ArrayList<Integer> count(String str)
    {
        int l=str.length();
        int vowels=0;
        int conso=0;
        int space=0;
        str=str.toLowerCase();
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowels++;
            }
            else if(ch==' '){
                space++;
            }
            else{
                conso++;
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        list.add(vowels);
        list.add(conso);
        list.add(space);
        return list;

    }

    public static void main(String[] args) {
        String str = "Take u forward is Awesome";
        ArrayList<Integer> list=count(str);
        System.out.println(list);
    }
    
}
