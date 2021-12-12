package fr.umlv.stream;

import fr.umlv.stream.Room;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static java.lang.Float.NaN;

public class Hotel {
    private final List<Room> listRooms;
    private final String name;

    public Hotel(String hotelName, List<Room> rooms) {
        Objects.requireNonNull(hotelName, "hotelName can't be null");
        listRooms = rooms;
        name = hotelName;
    }

    public String roomInfo() {
        var streamName = listRooms.stream().map(Room::name);

        return streamName.collect(Collectors.joining(", "));
    }

    public String roomInfoSortedByFloor() {
        var comparator = Comparator.comparingInt(Room::floor);
        var streamName = listRooms.stream().sorted(comparator).map(Room::name);

        return streamName.collect(Collectors.joining(", "));

    }

    public Double averagePrice() {
        LongStream streamPrice = listRooms.stream().mapToLong(Room::price);
        OptionalDouble average = streamPrice.average();

        return average.orElse(NaN);
    }

    public Optional<Room> roomForPrice1(float priceMax) {
        var comparator = Comparator.comparingDouble(Room::price).reversed();
        var streamSorted = listRooms.stream().filter(room -> room.price() < priceMax).sorted(comparator);

        return streamSorted.findFirst();
    }


    // Max ne ne demande pas de reverse le comparateur mais doit surement comparer chaques valeurs aux autres
    // roomForPrice1 est donc la meilleure implementation
    public Optional<Room> roomForPrice2(float priceMax) {
        var comparator = Comparator.comparingDouble(Room::price);
        var streamFiltered = listRooms.stream().filter(room -> room.price() < priceMax);

        return streamFiltered.max(comparator);

    }

    static public String  expensiveRoomNames(List<Hotel> hotels){
        var comparator = Comparator.comparingDouble(Room::price).reversed();
        var streamHotels = hotels.stream();

        var streamRoomNamesSorted = streamHotels.flatMap(hotel ->
            hotel.listRooms.stream().sorted(comparator).limit(2)
        ).map(Room::name);

        return streamRoomNamesSorted.collect(Collectors.joining(", "));
    }

    public Map<Integer, List<Room>> roomInfoGroupedByFloor(){
        var streamRooms = listRooms.stream();

        var mapRoomsFloor = streamRooms.collect(Collectors.groupingBy(Room::floor));

        return mapRoomsFloor;
    }

    public Map<Integer, List<Room>> roomInfoGroupedByFloorInOrder() {
        var comparator = Comparator.comparingInt(Room::floor);
        var streamRoomsSorted = listRooms.stream().sorted(comparator);

        var mapRoomsFloor = streamRoomsSorted.collect(Collectors.groupingBy(
                Room::floor, LinkedHashMap::new, Collectors.toList() ));

        return mapRoomsFloor;

    }
    public String getName() {
        return name;
    }

    public List<Room> getListRooms() {
        return listRooms;
    }
}