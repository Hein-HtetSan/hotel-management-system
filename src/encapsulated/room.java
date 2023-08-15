/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulated;

/**
 *
 * @author acer
 */
public class room {

    /**
     * @return the roomID
     */
    public String getRoomID() {
        return roomID;
    }

    /**
     * @param roomID the roomID to set
     */
    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    /**
     * @return the roomType
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * @param roomType the roomType to set
     */
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    /**
     * @return the noOfBed
     */
    public int getNoOfBed() {
        return noOfBed;
    }

    /**
     * @param noOfBed the noOfBed to set
     */
    public void setNoOfBed(int noOfBed) {
        this.noOfBed = noOfBed;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the notes
     */
    public int getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(int notes) {
        this.notes = notes;
    }
    private String roomID;
    private String roomType;
    private int noOfBed;
    private int price;
    private int notes;
}
