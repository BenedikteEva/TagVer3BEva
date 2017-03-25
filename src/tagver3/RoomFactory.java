/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagver3;

/**
 *
 * @author Zack
 */
public class RoomFactory {

    public Room[][] createRooms() {

        // initalise room
        Room[][] roomMatrix = new Room[3][3];

        // initalise position for each room
        roomMatrix[0][0] = new Room(1, "You are in the entrance room.\n "
                + "You find some gold and pick it up \n"
                + "Suddenly you hear a large crash and see a lot of dust coming\n"
                + "out of the tunnel you just left. \n"
                + "There are two tunnels leading out of this room. One heading north\n"
                + "and one heading east.", 3);

        roomMatrix[0][1] = new Room(2, "Your enter a large room. It is so large\n"
                + "that you can hear the ecco of your breathing.\n"
                + "You find more some goldcoins and automatically pick them up.\n"
                + "There at two doors in this room.\n"
                + "One headed north and one headed west.", 6);

        roomMatrix[0][2] = new Room(3, "This a long, and narrow room. You can\n"
                + "choose an opening west or one south.", 8);

        roomMatrix[1][0] = new Room(4, "You are know entering a small room. It \n"
                + "has an opening to the east and one to the west.", 4);

        roomMatrix[1][1] = new Room(5, "In this room you see an old chair \n "
                + "and two openings. Choose south or east.", 9);

        roomMatrix[1][2] = new Room(6, "Now you find a room with a statue of an angel\n"
                + "There are 3 openings. Go east, north or south.", 7);

        roomMatrix[2][0] = new Room(7, "It looks as you have entered a tomb. \n"
                + "This room contains a large coffin. You can flee either to  \n"
                + "the north or the west.", 6);
        roomMatrix[2][1] = new Room(8, "In this room the walls are sloping. \n"
                + "You can choose between a south or a west opening.", 4);

        roomMatrix[2][2] = new Room(9, "You are almost blinded by the light of the outside world.", 5);

        // EXITS FOR EACH ROOM
        // DOOR 1
        roomMatrix[0][0].setNorth(roomMatrix[2][1]);
        roomMatrix[0][0].setEast(roomMatrix[0][1]);

        // DOOR 2
        roomMatrix[0][1].setNorth(roomMatrix[0][2]);
        roomMatrix[0][1].setWest(roomMatrix[0][0]);

        // DOOR 3
        roomMatrix[0][2].setWest(roomMatrix[1][0]);
        roomMatrix[0][2].setSouth(roomMatrix[0][1]);

        // door 4
        roomMatrix[1][0].setEast(roomMatrix[0][2]);
        roomMatrix[1][0].setWest(roomMatrix[1][1]);

        // door 5
        roomMatrix[1][1].setSouth(roomMatrix[1][2]);
        roomMatrix[1][1].setEast(roomMatrix[1][0]);

        // door 6
        roomMatrix[1][2].setEast(roomMatrix[2][1]);
        roomMatrix[1][2].setNorth(roomMatrix[1][1]);
        roomMatrix[1][2].setSouth(roomMatrix[2][0]);

        // door 7
        roomMatrix[2][0].setNorth(roomMatrix[1][2]);
        roomMatrix[2][0].setWest(roomMatrix[2][2]);

        // door 8
        roomMatrix[2][1].setSouth(roomMatrix[0][0]);
        roomMatrix[2][1].setWest(roomMatrix[1][2]);

        // door 9
        roomMatrix[2][2].setEast(roomMatrix[2][0]);
        // door west == victory ???;
        return roomMatrix;
    }
}
