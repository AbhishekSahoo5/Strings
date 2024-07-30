public class stringBufferClass{
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("Abhishek");
        sb.append(" ");
        sb.append("Sahoo");
        System.out.println(sb);

        // append()
        StringBuffer ab=new StringBuffer("Virat ");
        ab.append("Kohli");
        ab.append(" The King");
        System.out.println(ab);            //Virat Kohli The King

        // insert()
        ab.insert(1," GOAT ");
        System.out.println(ab);           // V GOAT irat Kohli The King

        // replace()
        ab.replace(2, 6, "Legend");
        System.out.println(ab);           //V Legend irat Kohli The King

        // delete()
        ab.delete(2, 8);
        System.out.println(ab);           //V  irat Kohli The King

        //reverse()
        ab.reverse();
        System.out.println(ab);           // gniK ehT ilhoK tari  V

        // capacity()
        StringBuffer bc=new StringBuffer();
        System.out.println(bc.capacity());    //16(default)
        System.out.println(ab.capacity());    //46 =(22*2)+2  (22 is current capacity)

        

        





    }
}