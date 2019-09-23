/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Marko
 */

@Entity
@Table(name="game_spojnice")
public class SpojniceVariables implements Serializable{
    @Id
    String blue, red;
    int pointsBlue, pointsRed;
    boolean bluePlaying;
    boolean sidePlayerDone;
    String hitByBlue, hitByRed;
    String pairPosition;
    @OneToOne
    @JoinColumn(name="idWP")
    WordPairs pairs;

    public SpojniceVariables(String blue, String red, int[] pairPosition, WordPairs pairs){
        this.blue = blue;
        this.red = red;
        pointsBlue = pointsRed = 0;
        prepareNewGame(pairPosition, pairs, true);
    }
    
    public SpojniceVariables(){}
    
    final public void prepareNewGame(int[] pairPosition, WordPairs pairs, boolean bluePlaying){
        //TODO pair position
        this.pairs = pairs;
        this.bluePlaying = bluePlaying;
        sidePlayerDone = false;
        hitByBlue = hitByRed = "0 0 0 0 0 0 0 0 0 0";
        StringBuilder builder = new StringBuilder();
        builder.append(pairPosition[0]);
        for(int i=1; i<10; i++) builder.append(" ").append(pairPosition[i]);
        this.pairPosition = builder.toString();
    }
    
    public String getBlue() {
        return blue;
    }

    public void setBlue(String blue) {
        this.blue = blue;
    }

    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public int getPointsBlue() {
        return pointsBlue;
    }

    public void setPointsBlue(int pointsBlue) {
        this.pointsBlue = pointsBlue;
    }

    public int getPointsRed() {
        return pointsRed;
    }

    public void setPointsRed(int pointsRed) {
        this.pointsRed = pointsRed;
    }

    public boolean isBluePlaying() {
        return bluePlaying;
    }

    public void setBluePlaying(boolean bluePlaying) {
        this.bluePlaying = bluePlaying;
    }

    public String getHitByBlue() {
        return hitByBlue;
    }

    public void setHitByBlue(String hitByBlue) {
        this.hitByBlue = hitByBlue;
    }

    public String getHitByRed() {
        return hitByRed;
    }

    public void setHitByRed(String hitByRed) {
        this.hitByRed = hitByRed;
    }

    public String getPairPosition() {
        return pairPosition;
    }

    public void setPairPosition(String pairPosition) {
        this.pairPosition = pairPosition;
    }

    public WordPairs getPairs() {
        return pairs;
    }

    public void setPairs(WordPairs pairs) {
        this.pairs = pairs;
    }

    public boolean isSidePlayerDone() {
        return sidePlayerDone;
    }

    public void setSidePlayerDone(boolean sidePlayerDone) {
        this.sidePlayerDone = sidePlayerDone;
    }
    
}