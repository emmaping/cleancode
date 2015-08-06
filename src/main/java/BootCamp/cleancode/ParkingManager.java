/********************************************************************
 * File Name:    ParkingManager.java
 *
 * Date Created: Jul 13, 2015
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package BootCamp.cleancode;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class ParkingManager
{
  List<ParkingLot> parkingLots = new ArrayList<ParkingLot>();
  List<ParkingBoy> parkingBoys = new ArrayList<ParkingBoy>();
  private String name = null;

  public ParkingManager(int i, String name)
  {
    this.name = name;
    for (int j = 0; j < i; j++)
    {
      ParkingLot parkingLot = new ParkingLot(50, "parkingLot" + (j + 1));
      parkingLots.add(parkingLot);
    }
  }

  public void HireParkingBoy(ParkingBoy parkingBoy)
  {
    parkingBoys.add(parkingBoy);
  }

  public void FireParkingBoy(ParkingBoy parkingBoy)
  {
    parkingBoys.remove(parkingBoy);
  }

  public void BalanceParkingLot(ParkingBoy parkingBoy, ParkingLot parkingLot)
  {
    parkingBoy.addParkingLot(parkingLot);
    parkingLots.remove(parkingLot);
  }

  public ParkingLot getParkingLot(String name)
  {
    for (ParkingLot parkingLot : parkingLots)
    {
      if (parkingLot.getName().equals(name))
      {
        return parkingLot;
      }
    }
    return null;
  }

  public String printParkinglots()
  {
    StringBuilder ret = new StringBuilder();
    System.out.println(this.name);
    ret.append(this.name);

    for (ParkingBoy parkingBoy : parkingBoys)
    {
      ret.append(parkingBoy.printParkinglots());
    }
    return ret.toString();
  }

}
