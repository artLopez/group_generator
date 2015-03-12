/**
 * Created by vagrant on 2/7/15.
 */
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String names = reader.nextLine();
        String yourName = null;
        int assigNum = 0;
        
        String[] groupMembers = names.split(",");
        
        String[] name = groupMembers[groupMembers.length - 1].split(" ");
        
        //[luis,tom,1]
        
        yourName = name[1];
        assigNum = Integer.parseInt(name[2]);
        groupMembers[groupMembers.length-1] = name[0];
        
        
        ArrayList<String> members = new ArrayList<String>(Arrays.asList(groupMembers));
        
        for(int x = 0; x < members.size();x++)
            System.out.print(members.get(x) + ", ");
        
        System.out.println("\n\n\n");
        
        
        String[] finalAr = makeGroup(yourName, assigNum, members);
        
        System.out.printf("[%s,%s,%s]",finalAr[0],finalAr[1],finalAr[2]);
    }
    
    public static String[] makeGroup(String name,int i, ArrayList<String> groupMembers)
    {
        
        Collections.shuffle(groupMembers, new Random(i));
        
        for(int x = 0; x < groupMembers.size();x++)
            System.out.print(groupMembers.get(x) + ", ");
        
        String[] firstGroup = {groupMembers.get(0), groupMembers.get(1),groupMembers.get(2)};
        String[] secondGroup = {groupMembers.get(3), groupMembers.get(4),groupMembers.get(5)};
        
        
        for(int x = 0; x <= 3;x++){
            if(firstGroup[x].equals(name))
                return firstGroup;
            else if(secondGroup[x].equals(name))
                return  secondGroup;
        }
        
        return null;
    }
}
