import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RoomTest {

    @Test
    public void room_should_be_occupied_and_dirty_CheckIn(){
        //arrange
        Room room = new Room(3, 400.00);

        room.checkIn();

        //act
        room.checkIn();

        //assert
       assertTrue(room.isOccupied() && room.isDirty());






    }
    @Test
    public void room_should_be_dirty_CheckOut(){

        //arrange
        Room room = new Room(1, 200.00);
        boolean isOccupied = false;
        boolean isDirty = true;
    }

}
