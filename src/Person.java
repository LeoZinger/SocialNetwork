import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by leo.zinger on 4/18/17.
 */
public class Person {
    public Integer _id;
    private String _name;
    protected ArrayList<Integer> _friends;

    Iterator itr = _friends.iterator();

    //constructor
    Person(Integer id, String name){
        _id = id;
        _name = name;
        }

    public Person addfriend(int fid, String name){
        Person person = new Person(fid, name);
        //_id = fid;
        // friends.add(id);
        return person;
    }
    /*
    Person findFriend(int fid){
        Iterator itr = _friends.iterator();

        while (itr.hasNext()){
            if(_id==fid){
                //return itr.next();
                return 1;
            }

        //id = fid;
        //_friends.add(id);
    }
    */
    int FindShortestPath (int id){
        while (itr.hasNext()){
            int friend_id = (int) itr.next();
            //int friend_id = itr.next());
            if(itr.next().equals(id)){
                System.out.println("Found a path to Person:" + id);
                return 1 + FindShortestPath((int) itr.next());
            }
            return 0;
        }

        return 0;
        //for (int id = friends)
    }

    public static void main(String s[]){
        Person rich = new Person(9, "Larry");
        rich.addfriend(2, "Matt");
        rich.addfriend(4, "Dyllon");
        rich.addfriend(8, "Brian");
        rich.addfriend(15, "Kevin");
        rich.addfriend(20, "Jason");

        //Kevin.addfriend(20, "Jason");
        rich.addfriend(20, "Jason");
        rich.addfriend(20, "Jason");

    }
}
