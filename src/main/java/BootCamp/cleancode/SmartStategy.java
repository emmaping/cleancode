/********************************************************************
 * File Name:    SmartStategy.java
 *
 * Date Created: Jul 10, 2015
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2010 Symantec Corporation. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS --------------------------------------------------
package BootCamp.cleancode;

import java.util.List;

/**
 * TODO: Update with a detailed description of the interface/class.
 *
 */
public class SmartStategy implements ParkingStategy
{

  public ParkingLot getParkingLot(List<ParkingLot> parkingLots)
  {
    ParkingLot finalParkingLot = null;
    int maxCapabitity = 0;
    for (ParkingLot parkingLot : parkingLots)
    {
      if (parkingLot.getAvailableParkLot() > maxCapabitity)
      {
        finalParkingLot = parkingLot;
        maxCapabitity = parkingLot.getAvailableParkLot();
      }
    }
    return finalParkingLot;
  }

}
