/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rizqu;

/**
 *
 * @author Acer
 */
public class tes {

    int speed;
    int direction;
    boolean isMoving;
    int maxSpeed;
    int health;

    public tes() {
        speed = 0;
        direction = 0;
        isMoving = false;
        maxSpeed = 100;
        health = 100;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= maxSpeed) {
            this.speed = speed;
            if (isMoving) {
                updateDirection();
            }
        }
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        if (direction >= 0 && direction <= 360) {
            this.direction = direction;
            if (isMoving) {
                updateDirection();
            }
        }
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void start() {
        isMoving = true;
        updateDirection();
    }

    public void stop() {
        isMoving = false;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void useNitrous() {
        if (speed < maxSpeed) {
            speed += 20;
            if (speed > maxSpeed) {
                System.out.println("Cannot use nitrous, speed has reached max speed");
                speed = maxSpeed;
            }
        }
        if (isMoving) {
            updateDirection();
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void reduceHealth(int damage) {
        health -= damage;
        if (health <= 0) {
            health = 0;
            stop();
            System.out.println("The car has stopped moving because it has no health left.");
        }
    }

    public void crash() {
        System.out.println("The car has crashed!");
        reduceHealth(90);
        
    }

    public void updateDirection() {
        if (speed == 0) {
            return;
        }
        int newDirection = direction + speed / 10;
        if (newDirection > 360) {
            newDirection = newDirection - 360;
        }
        direction = newDirection;
    }
}    
