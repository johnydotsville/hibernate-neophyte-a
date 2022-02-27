package lev.johnydotsville;

import lev.johnydotsville.Entities.Actor;
import lev.johnydotsville.Work.ActorCRUD;

public class App 
{
    public static void main( String[] args )
    {
        Actor uma = new Actor();
        //uma.setId(322);
        uma.setFirstName("Uma");
        uma.setLastName("Turman");

        ActorCRUD acrud = new ActorCRUD();
        acrud.save(uma);

        //Actor actor = acrud.getById(322);
        //System.out.println(actor);

        acrud.delete(uma);

        System.out.println( "Hello hibernate!" );
    }
}
