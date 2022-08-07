package In_lecture;

public class Room {

	int roomNo;
	String roomType;
	String roomBuilding;
	public static void main(String[] args) {
		
		Room room = new Room();
		room.roomNo = 7405;
		room.roomType = "lab";
		room.roomBuilding = "North";
		System.out.println("Room number: " + room.roomNo);
		System.out.println("Room type: " + room.roomType);
		System.out.println("Room building: " + room.roomBuilding);

	}

}
