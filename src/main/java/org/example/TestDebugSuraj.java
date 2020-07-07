package org.example;

public class TestDebugSuraj {
    public static void main(String[] args) {
        int livingRoomArea=1050;
        int houseArea = livingRoomArea;

        int dinnerRoomArea=600;
        houseArea=houseArea+dinnerRoomArea;

        int bedroom=880;
        houseArea=houseArea+bedroom;

        System.out.println("Area of the house is: "+houseArea);

        for (int i=0;i<10;i++){
            System.out.println("i is: "+i);
        }

        DisplayNames displayNames = new DisplayNames();
        int sum=displayNames.sum(40,8);

    }
}
