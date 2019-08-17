import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class RoverTests {

    @Test
   public void VectorInitializesWithGivenPoints(){
        Vector r = new Vector(10,10,'N');
        assertEquals(r.x,10);
        assertEquals(r.y,10);
        assertEquals(r.direction,'N');
    }

    @Test
    public void vectorCanRotateLeftFromNorth(){
        Vector r = new Vector(10,10,'N');
        Vector newVector = r.TurnLeft();
        assertEquals('W',newVector.direction);
    }

    @Test
    public void VectorCanRotateLeftFromWest(){
        Vector r = new Vector(10,10,'W');
        Vector newVector = r.TurnLeft();
        assertEquals('S',newVector.direction);
    }

    @Test
    public void VectorCanRotateLeftFromSouth(){
        Vector r = new Vector(10,10,'S');
        Vector newVector = r.TurnLeft();
        assertEquals('E',newVector.direction);
    }

    @Test
    public void VectorCanRotateLeftFromEast(){
        Vector r = new Vector(10,10,'E');
        Vector newVector = r.TurnLeft();
        assertEquals('N',newVector.direction);
    }

    @Test
    public void vectorCanRotateRightFromNorth(){
        Vector r = new Vector(10,10,'N');
        Vector newVector = r.TurnRight();
        assertEquals('E',newVector.direction);
    }

    @Test
    public void VectorCanRotateRightFromWest(){
        Vector r = new Vector(10,10,'W');
        Vector newVector = r.TurnRight();
        assertEquals('N',newVector.direction);
    }

    @Test
    public void VectorCanRotateRightFromSouth(){
        Vector r = new Vector(10,10,'S');
        Vector newVector = r.TurnRight();
        assertEquals('W',newVector.direction);
    }

    @Test
   public void VectorCanRotateRightFromEast(){
        Vector r = new Vector(10,10,'E');
        Vector newVector = r.TurnRight();
        assertEquals('S',newVector.direction);
    }

    @Test
    public void NextVectorInNorth(){
        Vector r = new Vector(10,10,'N');
        Vector newVector = r.GetNextVector();
        assertEquals(11,newVector.y);
        assertEquals(10,newVector.x);
    }

    @Test
    public void NextVectorInWest(){
        Vector r = new Vector(10,10,'W');
        Vector newVector = r.GetNextVector();
        assertEquals(9,newVector.x);
        assertEquals(10,newVector.y);
    }

    @Test
    public void NextVectorInSouth(){
        Vector r = new Vector(10,10,'S');
        Vector newVector = r.GetNextVector();
        assertEquals(9,newVector.y);
        assertEquals(10,newVector.x);
    }

    @Test
    public void NextVectorInEast(){
        Vector r = new Vector(10,10,'E');
        Vector newVector = r.GetNextVector();
        assertEquals(11,newVector.x);
        assertEquals(10,newVector.y);
    }

    @Test
    public void VectorMoveAndRotate(){
        Vector newVector = new Vector(10,10,'S');
        newVector.TurnLeft();
        newVector.GetNextVector();
        newVector.GetNextVector();
        newVector.TurnLeft();
        newVector.GetNextVector();
        assertEquals(11,10,'N');

    }



}
