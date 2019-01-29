package com.example.task_3;

public class Direction {

    public static int[] moves(int[] location, Directions directions) {
        switch (directions) {
            case UP:
                location[1]++;
                break;
            case RIGHT:
                location[0]++;
                break;
            case DOWN:
                location[1]--;
                break;
            case LEFT:
                location[0]--;
                break;
        }
        System.out.println(location[0] + " " + location[1]);
        return location;
    }

    public static void mov(Directions[] directionss, int n){
        int locat[] = {0, 0};
        for(int i = 0; i < n; i++){
            locat = moves(locat, directionss[i]);
        }
    }

    public static void main(String[] args) {
        int[] loc = {1, 3};
        moves(loc, Directions.RIGHT);
        Directions[] directionss = {Directions.UP, Directions.UP, Directions.LEFT, Directions.DOWN, Directions.LEFT, Directions.DOWN, Directions.DOWN, Directions.RIGHT, Directions.RIGHT, Directions.DOWN, Directions.RIGHT};
        mov(directionss, 11);

    }
}

enum Directions{
    UP,
    DOWN,
    LEFT,
    RIGHT
}
